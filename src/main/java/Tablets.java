import java.util.ArrayList;

public class Tablets extends ObjTec{
    private String resolucion_pantalla;
    private String accesorio;

    public String getResolucion_pantalla() {
        return resolucion_pantalla;
    }

    public void setResolucion_pantalla(String resolucion_pantalla) {
        this.resolucion_pantalla = resolucion_pantalla;
    }



    public Tablets(String marca, String RAM, String almacenamiento, String procesador, String modelo, int year, int precio, int stock, String resolucion_pantalla, String accesorio) {
        super(marca, RAM, almacenamiento, procesador, modelo, year, precio, stock);
        this.resolucion_pantalla = resolucion_pantalla;
        this.accesorio = accesorio;
    }
}
