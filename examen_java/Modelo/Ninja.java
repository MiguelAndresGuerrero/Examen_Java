package examen_java.Modelo;

public class Ninja {
    private int id;
    private String nombre;
    private String rango;
    private String aldea;
    private String habilidad;
    private String descripcion;
    
    public Ninja(int id, String nombre, String rango, String aldea, String Habilidad, String Descripcion ) {
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
        this.habilidad = Habilidad;
        this.descripcion = Descripcion;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getRango() {return rango;}
    public void setRango(String rango) {this.rango = rango;}

    public String getAldea() {return aldea;}
    public void setAldea(String Aldea) {this.aldea = Aldea;}

    public String getHabilidad() {return habilidad;}
    public void setHabilidad(String Habilidad) {this.habilidad = Habilidad;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    @Override
    public String toString(){
        return String.format(
            " ID: " + id +
            " Nombre: " + nombre +
            " Rango: " + rango +
            " Aldea: " + aldea +
            " Habilidad: " + habilidad +
            " Descripcion: " + descripcion
        );
    }
}