/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaescuela;

/**
 *
 * @author Usuario
 */
public class Docente extends Persona{
    private String Profesion;
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
}
