create database if not exists CIVA;
use CIVA;

create table marca_bus(
id_marca bigint auto_increment primary key,
marca_bus varchar(50) not null
);

create table bus(
id bigint auto_increment primary key,
numero_bus int not null,
placa varchar(30) not null,
fecha_creacion date,
caracteristicas varchar(500),
id_marca bigint,
activo boolean,
foreign key (id_marca) references MarcaBus(id_marca)
);

insert into marca_bus (marca_bus) values ('Mercedes-Benz'), ('Volvo'), ('Scania'), ('Hyundai'), ('Isuzu');
insert into bus (numero_bus, placa, fecha_creacion, caracteristicas, id_marca, activo) values
(101, 'ABC-123', '2022-01-10', 'Bus con aire acondicionado y WiFi', 1, true),
(102, 'DEF-456', '2021-03-15', 'Bus doble piso, TV a bordo', 2, true),
(103, 'GHI-789', '2020-05-20', 'Asientos reclinables y USB en cada asiento', 3, true),
(104, 'JKL-012', '2023-07-01', 'Bus híbrido, ecológico', 4, true),
(105, 'MNO-345', '2022-08-25', 'Con baño y sistema de entretenimiento', 5, true),
(106, 'PQR-678', '2019-10-30', 'Bus escolar adaptado', 1, false),
(107, 'STU-901', '2020-11-11', 'Bus turístico panorámico', 2, true),
(108, 'VWX-234', '2021-06-17', 'Accesible para personas con movilidad reducida', 3, true),
(109, 'YZA-567', '2022-02-05', 'Bus nocturno con luces interiores tenues', 4, true),
(110, 'BCD-890', '2023-01-19', 'Bus con pantallas táctiles individuales', 5, true),
(111, 'EFG-321', '2020-04-04', 'Ideal para rutas largas', 1, false),
(112, 'HIJ-654', '2018-09-09', 'Bus interprovincial de lujo', 2, true),
(113, 'KLM-987', '2021-12-12', 'Bus con panel solar', 3, true),
(114, 'NOP-210', '2022-11-11', 'Con sistema de navegación GPS', 4, true),
(115, 'QRS-543', '2023-03-03', 'Bus escolar con cámaras de seguridad', 5, true),
(116, 'TUV-876', '2021-01-01', 'Bus para transporte urbano', 1, true),
(117, 'WXY-109', '2019-07-07', 'Mini bus para 20 pasajeros', 2, false),
(118, 'ZAB-432', '2023-04-04', 'Bus turístico con techo descubierto', 3, true),
(119, 'CDE-765', '2022-06-06', 'Bus de carga y pasajeros', 4, true),
(120, 'FGH-098', '2020-08-08', 'Bus articulado de gran capacidad', 5, true);
select * from bus;


