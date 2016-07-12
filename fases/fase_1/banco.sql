create table if not exists curso(
       idCurso integer auto_increment not null,
       idNivel integer not null,
       idInstituicao integer not null,
       idRegime integer not null,

       nomeCurso varchar(50),
       qtdPeriodos integer,
       cidade varchar(60),

       primary key (idCurso),
--TODO
       foreign key(idNivel) references nivel(idNivel),
       foreign key(idInstituicao) references instituicao(idInstituicao),
 );

create table if not exists periodo(
       idPeriodo integer auto_increment not null,
       idCurso integer,
       idRegime integer not null,
       dataInicio date,
       dataTermino date,

       primary key( idPeriodo ),
       foreign key( idCurso ) references curso(idCurso)
);

create table if not exists instituicao(
       idInstituicao integer auto_increment,
       nomeInstituicao varchar(50),

       primary key( idInstituicao )
);

create table if not exists professor(
       idProfessor integer auto_increment,
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
       idAula integer auto_increment,
       idMateria integer,
       horaInicial date,
       horaFinal date,
       local varchar(100),

       primary key (idAula),
       foreign key (idMateria) references materia(idMateria)
);

create table if not exists evento(
       idEvento integer auto_increment,
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
 
