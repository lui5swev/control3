public class Computador extends ObjTec{
    private String tarj_video;
    private String fuente_poder;
    private String chasis;
    private Pantalla pantalla;

    public String getTarj_video() {
        return tarj_video;
    }

    public void setTarj_video(String tarj_video) {
        this.tarj_video = tarj_video;
    }

    public String getFuente_poder() {
        return fuente_poder;
    }

    public void setFuente_poder(String fuente_poder) {
        this.fuente_poder = fuente_poder;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Computador(String marca, String RAM, String alamcenamiento, String procesador, String modelo, int year, int precio, int stock, String tarj_video, String fuente_poder, String chasis, Pantalla pantalla) {
        super(marca, RAM, alamcenamiento, procesador, modelo, year, precio, stock);
        this.tarj_video = tarj_video;
        this.fuente_poder = fuente_poder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }
}
