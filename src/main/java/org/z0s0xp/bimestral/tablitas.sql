
create table direccion(id integer primary key auto_increment,numero integer,calle varchar(40),cp integer,municipio
varchar(40));

select * from sala_Cine;






create table SalaCine (id_sala integer primary key,titulo_pelicula varchar(80),clasificacion varchar(80),
num_asientos integer);

drop table boleto;

create table Boleto(id_boleto integer auto_increment primary key , id_sala integer,costoBoleto float,
foreign key(id_sala) references SalaCine(id_sala));

describe SalaCine;
describe Boleto;

create table auto(id_auto integer primary key,num_placa integer,marca varchar(20),tipo_auto varchar(20));

insert into auto values(1223,3330,'chevy','sedan');
 select * from auto;