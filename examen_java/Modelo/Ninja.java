package examen_java.Modelo;

public class Ninja {
    private int ID;
    private String Nombre;
    private String Rango;
    private String Aldea;
    private String Habilidad;
    private String Descripcion;
    
        public Ninja(int ID, String Nombre, String Rango, String Aldea, String Habilidad, String Descripcion ) {
            this.ID = ID;
            this.Nombre = Nombre;
            this.Rango = Rango;
            this.Aldea = Aldea;
            this.Habilidad = Habilidad;
            this.Descripcion = Descripcion;
        }
        
        public int getID() {return ID;}
        public void setID(int ID) {this.ID = ID;}
        
        public String getNombre() {return Nombre;}
        public void setNombre(String Nombre) {this.Nombre = Nombre;}
        
        public String getRango() {return Rango;}
        public void setRango(String Rango) {this.Rango = Rango;}
        
        public String getAldea() {return Aldea;}
        public void setAldea(String Aldea) {this.Aldea = Aldea;}
        
        public String getHabilidad() {return Habilidad;}
        public void setHabilidad(String Habilidad) {this.Habilidad = Habilidad;}
        
        public String getDescripcion() {return Descripcion;}
        public void setDescripcion(String Descripcion) {this.Descripcion = Descripcion;}
        
        @Override
        public String toString(){
            return "Ninja{" +
                "id=" + ID +
                ", Nombre=" + Nombre +
                ", Rango='" + Rango + '\'' +
                ", Aldea=" + Aldea +
                ", Habilidad=" + Habilidad +
                ", Descripcion=" + Descripcion +
                '}';
        }
}