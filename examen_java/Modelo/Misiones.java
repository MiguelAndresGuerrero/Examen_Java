package examen_java.Modelo;

public class Misiones {
    private int ID;
    private int ID_Ninja;
    private int ID_Mision;
    private String Fecha_inicio;
    private String Fecha_fin;

    public Misiones(int ID, int ID_Ninja, int ID_Mision, String Fecha_inicio, String Fecha_fin) {
        this.ID = ID;
        this.ID_Ninja = ID_Ninja;
        this.ID_Mision = ID_Mision;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
    }

    public int getId() {return ID;}
    public void setId(int ID) {this.ID = ID;}

    public int getID_Ninja() {return ID_Ninja;}
    public void setID_Ninja(int ID_Ninja) {this.ID_Ninja = ID_Ninja;}

    public int getID_Mision() {return ID_Mision;}
    public void setID_Mision(int ID_Mision) {this.ID_Mision = ID_Mision;}

    public String getFecha_inicio() {return Fecha_inicio;}
    public void setFecha_inicio(String Aldea) {this.Fecha_inicio = Aldea;}

    public String getFecha_fin() {return Fecha_fin;}
    public void setFecha_fin(String Fecha_fin) {this.Fecha_fin = this.Fecha_fin;}

    @Override
    public String toString(){
        return String.format(
                " ID: " + ID +
                        " ID_Ninja: " + ID_Ninja +
                        " ID_Mision: " + ID_Mision +
                        " Fecha_Inicio: " + Fecha_inicio +
                        " Fecha_Fin: " + Fecha_fin
        );
    }
}