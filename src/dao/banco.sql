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
