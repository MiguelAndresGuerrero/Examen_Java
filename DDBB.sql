use bk82ii3zmnfm4ydaqj0c;

create table Ninja (
	ID int auto_increment primary key,
    Nombre varchar(100),
    Rango varchar(100),
    Aldea varchar(100)
);

create table Mision (
	ID int auto_increment primary key,
    Descripcion varchar(200),
    Rango varchar(100),
    Recompensa varchar(100)
);

create table MisionNinja (
	ID int auto_increment primary key,
	ID_Ninja int, -- Llave foranea
    ID_Mision int, -- Llave foranea
    Fecha_inicio varchar(20),
    Fecha_fin varchar(20),
    Foreign key (ID_Ninja) references Ninja(ID),
    Foreign key (ID_Mision) references Mision(ID)
);

create table Habilidad (
	ID int auto_increment primary key,
    ID_Ninja int, -- Llave foranea
    Nombre varchar(100),
    Descripcion varchar(100),
    foreign key (ID_Ninja) references Ninja(ID)
);