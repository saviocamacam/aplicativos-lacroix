drop table if exists instituicao;
drop table if exists curso;

create table if not exists instituicao(
       idInstituicao serial,
       nomeInstituicao varchar(50),
       primary key(idInstituicao)
);
create table if not exists curso(
       idCurso serial,
       nivel varchar(50),
       regime integer not null,
       idInstituicao integer not null,
       
       nomeCurso varchar(50),
       qtdPeriodos integer,
       cidade varchar(60),
       constraint pk_curso primary key (idCurso),
       constraint fk_curso_instituicao foreign key(idInstituicao) references instituicao(idInstituicao)
);
create table if not exists periodo(
       idPeriodo serial,
       idCurso integer,
       dataInicio date,
       dataTermino date,

       primary key(idPeriodo),
       constraint fk_periodo_curso foreign key(idCurso) references curso(idCurso)
);



create table if not exists professor(
       idProfessor integer serial,
       idInstituicao integer,
       nomeProfessor varchar(40),
       email varhcar(40),

       primary key ( idProfessor ),
       foreign key (idInstituicao) references instituicao(idInstituicao)
);

create table if not exists materia(
       idMateria integer auto_increment,
       idEstado integer,
       nomeMateria varchar(60),
       periodoAssociado integer,

       primary key(idMateria),
       foreign key (idCurso) references curso(idCurso)
);

create table if not exists aula(
       idAula integer serial,
       idMateria integer,
       horaInicial date,
       horaFinal date,
       local varchar(100),

       primary key (idAula),
       foreign key (idMateria) references materia(idMateria)
);

create table if not exists evento(
       idEvento integer serial,
       tipoEvento integer,
       idMateria integer,
       dataEvento date,
       descricao varchar(140),
       detalhes varchar(140),
       valorNota real,
       notaRecebida real,
       localEvento varchar(80),

       primary key (idEvento),
       foreign key (idMateria) references materia(idMateria)
);       
 
