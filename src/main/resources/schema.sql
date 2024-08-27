CREATE TABLE funcionario (
  id BIGINT AUTO_INCREMENT NOT NULL,
   nome VARCHAR(255) NOT NULL,
   idade INT NOT NULL,
   numero_animais_recebidos INT NULL,
   CONSTRAINT pk_funcionario PRIMARY KEY (id)
);

CREATE TABLE animal (
  id BIGINT AUTO_INCREMENT NOT NULL,
   nome_provisorio VARCHAR(255) NOT NULL,
   idade_estimada INT NOT NULL,
   raca SMALLINT NOT NULL,
   data_entrada date NOT NULL,
   data_adocao date NULL,
   condicoes_chegada VARCHAR(255) NOT NULL,
   funcionario_id BIGINT NOT NULL,
   data_obito date NULL,
   porte VARCHAR(255) NOT NULL,
   CONSTRAINT pk_animal PRIMARY KEY (id)
);

ALTER TABLE animal ADD CONSTRAINT FK_ANIMAL_ON_FUNCIONARIO FOREIGN KEY (funcionario_id) REFERENCES funcionario (id);