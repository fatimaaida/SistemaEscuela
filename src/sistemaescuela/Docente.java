package sistemaescuela;

// FATIMA AIDA LEON REBOLLO
public class Docente extends Persona{
    private String Profesion;
    // METODOS PARA LA CLASE DOCENTE
    public Docente(String Profesion, String identificacion, 
            String nombre, String correo) {
        super(identificacion, nombre, correo);
        this.Profesion = Profesion;
    }

    public String getProfesion() {
        return Profesion;
    }
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    @Override
    public String toString() {
        return this.getNombre() + " " + this.getProfesion();
    }

    @Override
    public String nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
