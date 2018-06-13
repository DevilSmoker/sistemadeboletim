# sistemadeboletim
projetinho maroto pra faturar 3 pontos 

drop SCHEMA BOLETIM;
CREATE SCHEMA BOLETIM;

USE BOLETIM;


CREATE TABLE PROFESSOR
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NOME VARCHAR(100) NOT NULL
);



CREATE TABLE curso
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    	NOME VARCHAR(100) NOT NULL
);


CREATE TABLE turma
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	fk_curso INTEGER not null, 
   	ano INTEGER NOT NULL,
	semestre INTEGER NOT NULL,
	turno INTEGER NOT NULL,
	foreign key (fk_curso) references curso(ID)
);


CREATE TABLE ALUNO
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NOME VARCHAR(100) NOT NULL,
	turma INTEGER,
	foreign key (turma) references turma(ID)
);

CREATE TABLE Disciplina
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);



CREATE TABLE DisciplinaTurma
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	fk_professor INTEGER,
	fk_turma INTEGER,
	fk_disciplina INTEGER,
	foreign key (fk_professor) references professor(ID),
	foreign key (fk_turma) references turma(ID),
	foreign key (fk_disciplina) references disciplina(ID)
);


CREATE TABLE AULA
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    DT_AULA DATE NOT NULL,
    FK_DisciplinaTurma INTEGER NOT NULL,

    FOREIGN KEY(FK_DisciplinaTurma) REFERENCES DisciplinaTurma(ID)
);



CREATE TABLE FREQUENCIA
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	FK_AULA INTEGER NOT NULL,
    FK_ALUNO INTEGER NOT NULL,
    PRESENTE BIT NOT NULL,
    
    FOREIGN KEY(FK_AULA) REFERENCES AULA(ID),
    FOREIGN KEY(FK_ALUNO) REFERENCES ALUNO(ID)
);

CREATE TABLE NOTA
(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	FK_ALUNO INTEGER NOT NULL,
    FK_MATERIA INTEGER NOT NULL,
    NOTA1 FLOAT,
    PESO1 FLOAT,
    NOTA2 FLOAT,
    PESO2 FLOAT,
    MEDIA FLOAT,
    NOTAF FLOAT,
    MEDIAF FLOAT,
    
    FOREIGN KEY(FK_ALUNO) REFERENCES ALUNO(ID),
    FOREIGN KEY(FK_MATERIA) REFERENCES DisciplinaTurma(ID)
);

-- dados iniciais

insert into professor (nome) values ("Daniel");

insert into curso (nome) values ("ADS");



insert into turma (fk_curso,ano,semestre,turno) values (1,2017,1,1);

insert into aluno (nome,turma) values("Aluno 1",1);


insert into disciplina (nome) values ("BD1");
insert into disciplina (nome) values ("LP2");

insert into DisciplinaTurma (fk_professor,fk_turma,fk_disciplina) values(1,1,1);
insert into DisciplinaTurma (fk_professor,fk_turma,fk_disciplina) values(1,1,2);

