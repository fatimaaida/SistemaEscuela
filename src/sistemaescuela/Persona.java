//
package sistemaescuela;

// FATIMA AIDA LEON REBOLLO
abstract class Persona {

    private String identificacion;
    String nombre;
    private String correo;

    public Persona(String identificacion, String nombre, String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String identificacion() {
        //Boolean docente=null;
        return nombre;
    }
}
