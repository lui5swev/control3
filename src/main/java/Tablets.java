import java.util.ArrayList;

public class Tablets extends ObjTec{
    private String resolucion_pantalla;
    private ArrayList<String> accesorios = new ArrayList<String>();

    public String getResolucion_pantalla() {
        return resolucion_pantalla;
    }

    public void setResolucion_pantalla(String resolucion_pantalla) {
        this.resolucion_pantalla = resolucion_pantalla;
    }

    public ArrayList<String> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<String> accesorios) {
        this.accesorios = accesorios;
    }

    public Tablets(String marca, String RAM, String alamcenamiento, String procesador, String modelo, int year, int precio, int stock, String resolucion_pantalla, ArrayList<String> accesorios) {
        super(marca, RAM, alamcenamiento, procesador, modelo, year, precio, stock);
        this.resolucion_pantalla = resolucion_pantalla;
        this.accesorios = accesorios;
    }
}
