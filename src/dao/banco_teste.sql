drop table if exists usuario cascade;
drop table if exists instituicao cascade;
drop table if exists curso cascade;
drop table if exists periodo cascade;
drop table if exists professor cascade;
drop table if exists materia cascade;
drop table if exists aula cascade;
drop table if exists evento cascade;
drop table if exists professorMateria cascade;
drop table if exists professorPeriodo cascade;
drop table if exists materiaPeriodo cascade;

create table if not exists usuario(
    idUsuario serial,
    nomeUsuario varchar(50),
    registro integer,
    dataNascimento date,
    constraint pk_usuario primary key(idUsuario)
);

create table if not exists instituicao(
    idInstituicao serial,
    nomeInstituicao varchar(50),
    cidade varchar(50),
    constraint pk_instituicao primary key(idInstituicao)
);
create table if not exists curso(
    idCurso serial,
    idInstituicao serial not null,
    idUsuario integer not null,
    nivel varchar(50),
    regime varchar(50),
    nomeCurso varchar(50),
    qtdPeriodos integer,
    
    constraint pk_curso primary key (idCurso),
    constraint fk_curso_usuario foreign key (idUsuario) references usuario(idUsuario),
    constraint fk_curso_instituicao foreign key(idInstituicao) references instituicao(idInstituicao)
);

create table if not exists periodo(
    idPeriodo serial,
    nomePeriodo varchar(50),
    idCurso integer not null,
    dataInicio date,
    dataTermino date,

    primary key(idPeriodo),
    constraint fk_periodo_curso foreign key(idCurso) references curso(idCurso)
);

create table if not exists professor(
    idProfessor serial,
    nomeProfessor varchar(40),
    email varchar(40),

    constraint pk_professor primary key(idProfessor)
);

create table if not exists materia(
    idMateria serial,
    nomeProfessor varchar(40),
    idCurso integer not null,
    nomeMateria varchar(60),
    periodoAssociado integer,
    cargaHoraria integer,
    cursadaUltimaVez varchar(60),

    constraint pk_materia primary key(idMateria),
    constraint fk_materia_curso foreign key (idCurso) references curso(idCurso)
);

create table if not exists aula(
    idAula serial,
    idMateria integer not null,
    nomeMateria varchar(50),
    idPeriodo integer not null,
    diaSemana varchar(15),
    horaInicial time,
    horaFinal time,
    sala varchar(50),

    constraint pk_aula primary key (idAula),
    constraint fk_aula_materia foreign key (idMateria) references materia(idMateria),
    constraint fk_aula_periodo foreign key (idPeriodo) references periodo(idPeriodo)
);

create table if not exists evento(
    idEvento serial,
    idMateria integer not null,
    tipoEvento varchar(50),
    dataEvento date,
    descricao varchar(140),
    detalhes varchar(140),
    valorNota real,
    notaRecebida real,
    localEvento varchar(80),

    primary key (idEvento),
    foreign key (idMateria) references materia(idMateria)
);

create table if not exists professorMateria(
    idProfessor integer,
    idMateria integer,
    
    constraint pk_professorMateria primary key(idProfessor, idMateria),
    constraint fk_professorMateria_professor foreign key(idProfessor) references professor(idProfessor),
    constraint fk_professorMateria_materia foreign key(idMateria) references materia(idMateria)
);

create table if not exists professorPeriodo(
    idProfessor integer,
    idPeriodo integer,
    
    constraint pk_professorPeriodo primary key(idProfessor, idPeriodo),
    constraint fk_professorPeriodo_professor foreign key(idProfessor) references professor(idProfessor),
    constraint fk_professorPeriodo_periodo foreign key(idPeriodo) references periodo(idPeriodo)
);

create table if not exists materiaPeriodo(
    idMateria integer,
    idPeriodo integer,
    nota real,
    estadoMateria varchar(40),
    
    constraint pk_materiaPeriodo primary key(idPeriodo, idMateria),
    constraint fk_materiaPeriodo_materia foreign key(idMateria) references materia(idMateria),
    constraint fk_materiaPeriodo_periodo foreign key(idPeriodo) references periodo(idPeriodo)
);

INSERT INTO usuario(nomeUsuario, registro, dataNascimento) VALUES ('Savio Camacam', 1648160, '21-01-1995');
INSERT INTO instituicao(nomeInstituicao, cidade) VALUES ('UTFPR', 'Campo Mourao');
INSERT INTO curso(idInstituicao, idUsuario, nivel, regime, nomeCurso, qtdPeriodos) VALUES(1, 1, 'Graduacao', 'SEMESTRAL', 'Bacharelado em Ciencia da Computacao', 8);

INSERT INTO periodo(idCurso, nomePeriodo, dataInicio, dataTermino) VALUES(1, '2014.2', '15-09-2014', '20-12-2014');
INSERT INTO periodo(idCurso, nomePeriodo, dataInicio, dataTermino) VALUES(1, '2015.1', '9-03-2015', '18-7-2015');
INSERT INTO periodo(idCurso, nomePeriodo, dataInicio, dataTermino) VALUES(1, '2015.2', '17-8-2015', '17-12-2015');
INSERT INTO periodo(idCurso, nomePeriodo, dataInicio, dataTermino) VALUES(1, '2016.1', '28-02-2016', '7-7-2016');

INSERT INTO professor(nomeProfessor, email) VALUES('Juliano Foleiss', 'julianofoleiss@gmail.com');
INSERT INTO professor(nomeProfessor, email) VALUES('Igor Wiese', 'igorwiese@gmail.com');
INSERT INTO professor(nomeProfessor, email) VALUES('Andre Luiz', 'andreluiz@gmail.com');

INSERT INTO materia(nomeProfessor, idCurso, nomeMateria, periodoAssociado, cargaHoraria, cursadaUltimaVez) VALUES('Juliano Foleiss', 1, 'Logica Matematica', 1, 4, '2014.2');
INSERT INTO materia(nomeProfessor, idCurso, nomeMateria, periodoAssociado, cargaHoraria, cursadaUltimaVez) VALUES('Juliano Foleiss', 1, 'Analise de Algoritmos', 4, 4, '2016.1');
INSERT INTO materia(nomeProfessor, idCurso, nomeMateria, periodoAssociado, cargaHoraria, cursadaUltimaVez) VALUES('Igor Wiese', 1, 'Programacao de Aplicativos', 4, 4, '2016.1');
INSERT INTO materia(nomeProfessor, idCurso, nomeMateria, periodoAssociado, cargaHoraria, cursadaUltimaVez) VALUES('Andre Luiz', 1, 'Banco de Dados 2', 4, 4, '2016.1');

INSERT INTO aula(idMateria, nomeMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES(3,'Programacao de Aplicativos',1,'segunda-feira', '19:30', '21:10', 'E101');
INSERT INTO aula(idMateria, nomeMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES(3,'Programacao de Aplicativos',1,'quinta-feira', '13:50', '15:30', 'E105');
INSERT INTO aula(idMateria, nomeMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES(2,'Analise de Algoritmos',1,'terça-feira', '19:30', '21:10', 'D104');
INSERT INTO aula(idMateria, nomeMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES(2,'Analise de Algoritmos',1,'quarta-feira', '19:30', '21:10', 'E003');
INSERT INTO aula(idMateria, nomeMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES(4,'Banco de Dados 2',1,'terça-feira', '13:50', '15:30', 'E105');
INSERT INTO aula(idMateria, nomeMateria, idPeriodo, diaSemana, horaInicial, horaFinal, sala) VALUES(4,'Banco de Dados 2',1,'quinta-feira', '19:30', '21:10', 'E102');

INSERT INTO professorMateria VALUES(1,1);
INSERT INTO professorMateria VALUES(1,2);
INSERT INTO professorMateria VALUES(2,3);
INSERT INTO professorMateria VALUES(3,4);

INSERT INTO professorPeriodo VALUES(1,1);
INSERT INTO professorPeriodo VALUES(1,4);
INSERT INTO professorPeriodo VALUES(2,4);
INSERT INTO professorPeriodo VALUES(3,4);

INSERT INTO materiaPeriodo VALUES(1,1, 6.4, 'Aprovada');
INSERT INTO materiaPeriodo VALUES(2,3, 0.0, 'Pendente');
INSERT INTO materiaPeriodo VALUES(2,4, 0.0, 'Dependente');
INSERT INTO materiaPeriodo VALUES(3,4, 0.0, 'Pendente');
INSERT INTO materiaPeriodo VALUES(4,4, 0.0, 'Pendente');

INSERT INTO evento(idMateria, tipoEvento, dataEvento, descricao, detalhes, valorNota, localEvento) VALUES (2, 'Prova', '28-06-2016', 'Prova 2', 'MaxHeapFy', 10.0, 'D104');
INSERT INTO evento(idMateria, tipoEvento, dataEvento, descricao, detalhes, valorNota, localEvento) VALUES (3, 'Trabalho', '06-06-2016', 'Previa Lacroix', 'Apresentacao casos de uso basicos', 10.0, 'E101');
INSERT INTO evento(idMateria, tipoEvento, dataEvento, descricao, detalhes, valorNota, localEvento) VALUES (3, 'Trabalho', '13-06-2016', 'Trabalho 4', 'Simulador de Armazenamento Arquivos', 10.0, 'E102');

INSERT INTO usuario(nomeUsuario, registro) VALUES ('Mercia', 1648000);
INSERT INTO usuario(nomeUsuario, registro) VALUES ('Mercia', 1648160);
INSERT INTO usuario(nomeUsuario, registro, dataNascimento) VALUES ('Mercia', 1648160, '21-01-1995');
INSERT INTO usuario(nomeUsuario, registro, dataNascimento) VALUES ('Savio', 1648160, '21-01-1995');
INSERT INTO usuario(nomeUsuario, registro, dataNascimento) VALUES ('Savio Camacam', 1648160, '21-01-1995');