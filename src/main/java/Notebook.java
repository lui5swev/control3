public class Notebook extends ObjTec{
    private String teclado;
    private String bateria;
    private String resolucion_pantalla;

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getResolucion_pantalla() {
        return resolucion_pantalla;
    }

    public void setResolucion_pantalla(String resolucion_pantalla) {
        this.resolucion_pantalla = resolucion_pantalla;
    }

    public Notebook(String marca, String RAM, String alamcenamiento, String procesador, String modelo, int year, int precio, int stock, String teclado, String bateria, String resolucion_pantalla) {
        super(marca, RAM, alamcenamiento, procesador, modelo, year, precio, stock);
        this.teclado = teclado;
        this.bateria = bateria;
        this.resolucion_pantalla = resolucion_pantalla;
    }
}

