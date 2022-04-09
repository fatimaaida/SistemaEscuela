/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaescuela;
// FATIMA AIDA LEON REBOLLO

public class Alumno extends Persona {

    private String Genero;

    public Alumno(String Genero, String identificacion, String nombre, String correo) {
        super(identificacion, nombre, correo);
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    
    public String identificacion(){
    //Boolean docente=null;
    return nombre+" alumno";
}
}
