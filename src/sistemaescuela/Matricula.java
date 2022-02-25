//
package sistemaescuela;

import java.awt.Color;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

// FATIMA AIDA LEON REBOLLO
public class Matricula {
    private Curso unCurso;
    private Alumno unAlumno;
    private Date fecha;

    //METODOS DE 
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
