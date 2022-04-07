/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package sistemaescuela;
//LIBRERIAS
import java.awt.Color;
import java.util.Date;
//import javafx.scene.control.ComboBox
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
//FATIMA AIDA LEON REBOLLO

public class FrmMatricula extends javax.swing.JFrame {

    /** Creates new form FrmMatricula */
    public FrmMatricula() {
        initComponents();
        setLocationRelativeTo(this);        
        mostrarDatos();
    }
    private void mostrarDatos(){
        //ComboBox<>
        int cantidadAlumnos = GestionEscuela.listaAlumnos.size();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbAlumno.getModel();
        cbAlumno.setModel(modelo);
        for(int i=0;i<cantidadAlumnos;i++){
            modelo.addElement(GestionEscuela.listaAlumnos.get(i));
        }
        
        int cantidadCursos = GestionEscuela.listaCursos.size();
        DefaultComboBoxModel modelo2= (DefaultComboBoxModel) cbCursos.getModel();
        
        for(int i=0;i<cantidadCursos;i++){
            modelo2.addElement(GestionEscuela.listaCursos.get(i));
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnColor = new javax.swing.JPanel();
        lbMatricula = new javax.swing.JLabel();
        lbSelectCurso = new javax.swing.JLabel();
        lbSelectAlum = new javax.swing.JLabel();
        cbAlumno = new javax.swing.JComboBox<>();
        cbCursos = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnColor.setBackground(new java.awt.Color(153, 153, 255));

        lbMatricula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbMatricula.setText("MATRICULA");

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(lbMatricula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnColorLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lbMatricula)
                .addContainerGap())
        );

        lbSelectCurso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbSelectCurso.setText("Seleccione Curso:");

        lbSelectAlum.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbSelectAlum.setText("Seleccione Alumno:");

        cbAlumno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbAlumno.setForeground(new java.awt.Color(153, 153, 255));

        cbCursos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbCursos.setForeground(new java.awt.Color(153, 153, 255));

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(153, 153, 255));
        btnAgregar.setLabel("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(153, 153, 255));
        btnRegresar.setLabel("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSelectAlum)
                    .addComponent(lbSelectCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(37, 37, 37)
                .addComponent(btnRegresar)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSelectCurso)
                    .addComponent(cbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSelectAlum)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON DE AGREGAR
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Curso unCurso = (Curso)cbCursos.getSelectedItem();
        Alumno unAlumno = (Alumno) cbAlumno.getSelectedItem();
        Date fecha = new Date();
        Matricula unaMatricula = new Matricula(unCurso, unAlumno, fecha);
        //primero se pregunta si ya está matriculado
        if (!GestionEscuela.estaMatriculado(unaMatricula)){
            GestionEscuela.agregarMatricula(unaMatricula);
            JOptionPane.showMessageDialog(null, "Matricula Agregada");
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe el mismo alumno matriculado en el mismo curso");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    //BOTON DE REGRESAR
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbAlumno;
    private javax.swing.JComboBox<String> cbCursos;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbSelectAlum;
    private javax.swing.JLabel lbSelectCurso;
    private javax.swing.JPanel pnColor;
    // End of variables declaration//GEN-END:variables

}
