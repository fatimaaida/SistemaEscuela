//
package sistemaescuela;
//LIBRERIAS
import java.awt.HeadlessException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class FrmAgregarCurso extends javax.swing.JFrame {

    // FATIMA AIDA LEON REBOLLO
    public FrmAgregarCurso() {
        initComponents();
        setLocationRelativeTo(this);
        cargarDocentes();
        txtCodigo.setText(GestionEscuela.listaCursos.size()+"");
    }
    //Obtiene los docentes a partir de la lista y los agrega en el combo
    private void cargarDocentes(){
        int cantidad = GestionEscuela.listaDocentes.size();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cbDocente.getModel();      
        for(int i =0; i<cantidad;i++){
            modelo.addElement(GestionEscuela.listaDocentes.get(i));            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnColor = new javax.swing.JPanel();
        lbAggCurso = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbNombreC = new javax.swing.JLabel();
        lbDuracion = new javax.swing.JLabel();
        lbDocente = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        cbDocente = new javax.swing.JComboBox<>();
        txtNumeroHoras = new javax.swing.JTextField();
        txtNombreCurso = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnColor.setBackground(new java.awt.Color(153, 153, 255));

        lbAggCurso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbAggCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAggCurso.setText("AGREGAR CURSO");

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbAggCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAggCurso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbCodigo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbCodigo.setText("Código del Curso:");

        lbNombreC.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbNombreC.setText("Nombre Curso:");

        lbDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbDuracion.setText("Duración(Horas):");

        lbDocente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbDocente.setText("Docente:");

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(153, 153, 255));
        btnAgregar.setLabel("AGREGAR");
        btnAgregar.setMaximumSize(new java.awt.Dimension(101, 25));
        btnAgregar.setMinimumSize(new java.awt.Dimension(101, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(153, 153, 255));
        btnRegresar.setLabel("REGRESAR");
        btnRegresar.setMaximumSize(new java.awt.Dimension(101, 25));
        btnRegresar.setMinimumSize(new java.awt.Dimension(101, 25));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        cbDocente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbDocente.setForeground(new java.awt.Color(153, 153, 255));

        txtNumeroHoras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumeroHoras.setForeground(new java.awt.Color(153, 153, 255));

        txtNombreCurso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombreCurso.setForeground(new java.awt.Color(153, 153, 255));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo)
                            .addComponent(lbNombreC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDuracion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDocente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(txtNumeroHoras)
                            .addComponent(txtCodigo)
                            .addComponent(cbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombreC))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDuracion))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDocente)
                    .addComponent(cbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método que agrega un curso a la lista de cursos
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (!txtCodigo.getText().isEmpty() && !txtNombreCurso.getText().isEmpty() 
                && !txtNumeroHoras.getText().isEmpty()){
            try{
                    String codigoCurso = txtCodigo.getText().trim();
                    String nombre = txtNombreCurso.getText().trim();
                    boolean existeCurso = GestionEscuela.existeCurso(codigoCurso);
                    if(!existeCurso){
                        int horas = Integer.parseInt(txtNumeroHoras.getText().trim());
                        Docente unDocente = (Docente)cbDocente.getSelectedItem();
                        Curso unCurso = new Curso(codigoCurso,nombre,horas,unDocente);
                        GestionEscuela.agregarCurso(unCurso);
                        JOptionPane.showMessageDialog(null, "Curso Agregado Correctamente");
                        txtCodigo.setText("");
                        txtNombreCurso.setText("");
                        txtNumeroHoras.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya existe curso con ese código");
                    }
                }catch(NumberFormatException | HeadlessException ex){
                    JOptionPane.showMessageDialog(null, "No cumple el formato " + ex.getMessage());
                }
            
        }else{
            JOptionPane.showMessageDialog(null, "Faltan datos, verificar..");
        } 
    }//GEN-LAST:event_btnAgregarActionPerformed

    //BOTON REGRESAR
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
            java.util.logging.Logger.getLogger(FrmAgregarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbDocente;
    private javax.swing.JLabel lbAggCurso;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDocente;
    private javax.swing.JLabel lbDuracion;
    private javax.swing.JLabel lbNombreC;
    private javax.swing.JPanel pnColor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtNumeroHoras;
    // End of variables declaration//GEN-END:variables
}
