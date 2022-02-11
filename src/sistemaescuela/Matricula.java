/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaescuela;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Matricula {
    private Curso unCurso;
    private Alumno unAlumno;
    private Date fecha;

    public Matricula(Curso unCurso, Alumno unAlumno, Date fecha) {
        this.unCurso = unCurso;
        this.unAlumno = unAlumno;
        this.fecha = fecha;
    }

    public Curso getUnCurso() {
        return unCurso;
    }

    public void setUnCurso(Curso unCurso) {
        this.unCurso = unCurso;
    }

    public Alumno getUnAlumno() {
        return unAlumno;
    }

    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Matricula{" + "unCurso=" + unCurso + ", unAlumno=" + unAlumno + ", fecha=" + fecha + '}';
    }
}
