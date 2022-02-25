//
package sistemaescuela;

import java.util.ArrayList;

// FATIMA AIDA LEON REBOLLO
public class GestionEscuela {
    public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    public static ArrayList<Docente> listaDocentes = new ArrayList<>();
    public static ArrayList<Curso> listaCursos = new ArrayList<>();
    public static ArrayList<Matricula> listaMatriculas = new ArrayList<>();
    
     //Agrega un alumno a la lista de Alumno
     
    public static void agregarAlumno(Alumno unAlumno){
        listaAlumnos.add(unAlumno);
    }
    
    // Agrega un docente a la lista de docentes

    public static void agregarDocente(Docente unDocente){
        listaDocentes.add(unDocente);
    }
    
    public static void agregarCurso(Curso unCurso){
        listaCursos.add(unCurso);
    }
    
    public static void agregarMatricula(Matricula unaMatricula){
        listaMatriculas.add(unaMatricula);
    }
    
    /**Método que verifica si existe un alumno dada la
    identificación**/
    public static boolean existeAlumno(String identificacion){
        boolean existe=false;
        int tamaLista = listaAlumnos.size();
        for (int i=0;i<tamaLista;i++){
            if (listaAlumnos.get(i).getIdentificacion().equals(identificacion)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
     //método que verifica si ya existe un docente con dicha identificación
    
    public static boolean existeDocente(String identificacion){
        boolean existe=false;
        for (int i=0;i<listaDocentes.size();i++){
            if (listaDocentes.get(i).getIdentificacion().equals(identificacion)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
     //Obtener alumno por Identificación
   
     public static Alumno obtenerAlumnoPorIdentificacion(String identificacion){
        Alumno unAlumno=null;
        for (int i=0;i<listaAlumnos.size();i++){
            if (listaAlumnos.get(i).getIdentificacion().equals(identificacion)){
               unAlumno=listaAlumnos.get(i);
               break;
            }
        }
        return unAlumno;
    }
     
    
      //Método que verifica si existe curso con determinado código
      
     public static boolean existeCurso(String codigo){
         boolean existe=false;
         for(int i=0;i<listaCursos.size();i++){
             if(listaCursos.get(i).getCodigo().equals(codigo)){
                 existe=true;
                 break;
             }
         }
         return existe;
     }
     
      /**Método que verifica si un alumno ya está matriculado
      en determinado curso**/
     
     public static boolean estaMatriculado(Matricula unaMatricula){
         boolean existe=false;
         String identificacion = unaMatricula.getUnAlumno().getIdentificacion();
         String codigoCurso = unaMatricula.getUnCurso().getCodigo();
         for(int i=0;i<listaMatriculas.size();i++){
             if(listaMatriculas.get(i).getUnAlumno().getIdentificacion().equals(identificacion)
                     && listaMatriculas.get(i).getUnCurso().getCodigo().equals(codigoCurso)){
                 existe=true;
                 break;
             }
         }
         return existe;
     }
     
     /** Actualiza un docente en la listadocente con los datos a actualizar **/
     public static void actualizarDocente(Docente unDocente){
         int posicion=0;
         String identificacion = unDocente.getIdentificacion();
         for(int i=0;i<listaDocentes.size();i++){
             if(listaDocentes.get(i).getIdentificacion().equals(identificacion)){
                 posicion = i;
                 break;
             }
         }        
         listaDocentes.set(posicion, unDocente);
     }
    
}
