use bk82ii3zmnfm4ydaqj0c;

insert into Ninja (Nombre, Rango, Aldea) values 
('Ninja 1', 'Aprendiz', 'Aldea 1'),
('Ninja 2', 'Hokage', 'Aldea 2'),
('Ninja 3', 'Avazado', 'Aldea 1'),
('Ninja 4', 'Intermedio', 'Aldea 2'),
('Ninja 5', 'Aprendiz', 'Aldea 3');

insert into Mision (Descripcion, Rango, Recompensa) values 
('Recoleccion de 50 moras azules', 'E', '5 monedas de oro'),
('Recoleccion de 20 hojas medicinales', 'D', '15 monedas de oro'),
('Recolectar 10 KG de carne de tigre', 'C', '25 monedas de oro'),
('Cazar 5 aguilas', 'B', '35 monedas de oro'),
('Cazar 20 oso polares ', 'A', '45 monedas de oro');

insert into MisionNinja (ID_Ninja, ID_Mision, Fecha_inicio, Fecha_fin) values 
(1, 1, '2025-03-01', '2025-06-01'),
(2, 5, '2025-03-01', '2025-06-01'),
(3, 4, '2025-03-01', '2025-06-01'),
(4, 3, '2025-03-01', '2025-06-01'),
(5, 2, '2025-03-01', '2025-06-01');

insert into Habilidad (ID_Ninja, Nombre, Descripcion) values 
(1, 'Conjuro de agua', 'Lanza un muro de agua de alta presion'),
(2, 'Jutsu bola de fuego', 'Crea una bola de fuego quemando todo a su paso'),
(3, 'Conjuro de fuego', 'Crea un muro de fuego que impide el paso a cualquier ser vivo'),
(4, 'jutsu bola de agua', 'crea una bola de agua destruyendo todo hacia la direccion lanzada'),
(5, 'Conjuro de viento', 'crea una ventisca de aire de aproximadamente 80 km/h arrasando todo a su paso');

SELECT N.ID, N.Nombre AS Nombre_Ninja, N.Rango AS Rango_Ninja, N.Aldea AS Nombre_Aldea, H.Nombre AS Habilidad, H.Descripcion AS Descripcion_Habilidad
FROM Ninja N INNER JOIN Habilidad H;

select * from Habilidad;
select * from Ninja;