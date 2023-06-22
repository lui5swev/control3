public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String estado_civil;
    private String ciudad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Cliente(String nombre, String apellido, String correo, String telefono, String estado_civil, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.estado_civil = estado_civil;
        this.ciudad = ciudad;
    }
}
