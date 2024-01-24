insert into paciente(idade, cpf, nome) values (30, 1234567899, 'Jose da Silva');
insert into paciente(idade, cpf, nome) values (22, 4564567899, 'Marcia da Silva');
insert into paciente(idade, cpf, nome) values (35, 7894567899, 'Reginaldo Rossi');
insert into paciente(idade, cpf, nome) values (17, 0004567899, 'Anthony Kiedis');

insert into exame (nome) values ('hemograma');
insert into exame (nome) values ('Glicemia');
insert into exame (nome) values ('Colesterol');

insert into agendamento(data, paciente_id, situacao) values ('2024-01-24',1,'PENDENTE');
insert into agendamento(data, paciente_id, situacao) values ('2024-01-15',2,'PENDENTE');
insert into agendamento(data, paciente_id, situacao) values ('2024-01-05',3,'PENDENTE');
insert into agendamento(data, paciente_id, situacao) values ('2024-02-08',4,'PENDENTE');

insert into agendamento_exames(agendamento_id, exames_id) values(1, 1);
insert into agendamento_exames(agendamento_id, exames_id) values(1, 2);
insert into agendamento_exames(agendamento_id, exames_id) values(2, 2);
insert into agendamento_exames(agendamento_id, exames_id) values(3, 3);
insert into agendamento_exames(agendamento_id, exames_id) values(4, 1);




