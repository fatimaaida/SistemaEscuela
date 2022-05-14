//
package sistemaescuela;

import java.awt.HeadlessException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//NESTOR ANTONIO SANDOVAL SANTOS
public class FrmListaCurso extends javax.swing.JFrame {

    /**
     * Creates new form FrmListaCurso
     */
    public FrmListaCurso() {
        initComponents();
        setLocationRelativeTo(this);
        listarCursos();
    }

    // METODO DE LISTAR LOS CURSOS
    public void listarCursos() {
        int cantidad = GestionEscuela.listaCursos.size();
        DefaultTableModel modelo = (DefaultTableModel) tblCursos.getModel();
        tblCursos.setModel(modelo);
        String[] datos = new String[4];
        for (int i = 0; i < cantidad; i++) {
            datos[0] = GestionEscuela.listaCursos.get(i).getCodigo();
            datos[1] = GestionEscuela.listaCursos.get(i).getNombre();
            datos[2] = Integer.toString(GestionEscuela.listaCursos.get(i).getHoras());
            datos[3] = GestionEscuela.listaCursos.get(i).getUnDocente().getNombre();
            modelo.addRow(datos);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbNombreC = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        lbDuracion = new javax.swing.JLabel();
        txtNumeroHoras = new javax.swing.JTextField();
        lbDocente = new javax.swing.JLabel();
        cbDocente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(571, 539));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("LISTAR CURSOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tblCursos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblCursos.setForeground(new java.awt.Color(153, 153, 255));
        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Curso", "Nombre", "Duraciópn(Horas)", "Docente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCursos.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tblCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCursos);

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(153, 153, 255));
        btnRegresar.setLabel("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(153, 153, 255));
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(153, 153, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(153, 153, 255));
        btnEliminar.setLabel("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lbCodigo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbCodigo.setText("Código del Curso:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(153, 153, 255));

        lbNombreC.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbNombreC.setText("Nombre Curso:");

        txtNombreCurso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombreCurso.setForeground(new java.awt.Color(153, 153, 255));

        lbDuracion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbDuracion.setText("Duración(Horas):");

        txtNumeroHoras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumeroHoras.setForeground(new java.awt.Color(153, 153, 255));

        lbDocente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbDocente.setText("Docente:");

        cbDocente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbDocente.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo)
                    .addComponent(lbNombreC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDuracion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDocente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreCurso)
                    .addComponent(txtNumeroHoras)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombreC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDuracion)
                    .addComponent(txtNumeroHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDocente)
                    .addComponent(cbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        int cantidadCursos = GestionEscuela.listaCursos.size();
        DefaultTableModel modelo = (DefaultTableModel) tblCursos.getModel();
        String[] datos = new String[cantidadCursos * 4];

        int i = 0;
        int contador = 0;
        for (i = 0; i < datos.length; i++) {
            datos[i] = GestionEscuela.listaCursos.get(contador).getCodigo();
            datos[i + 1] = GestionEscuela.listaCursos.get(contador).getNombre();
            datos[i + 2] = GestionEscuela.listaCursos.get(contador).getHoras()+"";
            datos[i + 3] = GestionEscuela.listaCursos.get(contador).getUnDocente()+"";
            i = i + 3;
            contador++;
        }

        String codigo;
        String nombre;
        String correo;
        String genero;
        int contador1 = 1, contador2 = 5;

        for (i = 0; i < ((datos.length) / 4); i++) {
            contador1 = 1;
            contador2 = 5;
            for (int j = 0; j < ((datos.length) / 4) - 1; j++) {
                if (datos[contador1].compareTo(datos[contador2]) > 0) {

                    nombre = datos[contador1];
                    datos[contador1] = datos[contador2];
                    datos[contador2] = nombre;

                    codigo = datos[contador1 - 1];
                    datos[contador1 - 1] = datos[contador2 - 1];
                    datos[contador2 - 1] = codigo;

                    correo = datos[contador1 + 1];
                    datos[contador1 + 1] = datos[contador2 + 1];
                    datos[contador2 + 1] = correo;

                    genero = datos[contador1 + 2];
                    datos[contador1 + 2] = datos[contador2 + 2];
                    datos[contador2 + 2] = genero;

                }
                contador1 = contador1 + 4;
                contador2 = contador2 + 4;

                if (contador2 >= datos.length) {
                    j = 100;
                }
            }

        }

        //System.out.println(""+datos[1]);
        int fila = tblCursos.getRowCount();
        for (i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        String[] info = new String[cantidadCursos * 4];
        //System.out.println(""+datos.length/4);
        for (i = 0; i < datos.length; i++) {
            info[0] = datos[i];
            info[1] = datos[i + 1];
            info[2] = datos[i + 2];
            info[3] = datos[i + 3];
            modelo.addRow(info);
            i = i + 3;
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int fila = tblCursos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblCursos.getModel();
        if (fila >= 0) {
            GestionEscuela.eliminarCurso(hola(txtCodigo.getText()));
            modelo.removeRow(fila);
            int identifica = Integer.parseInt(txtCodigo.getText().trim());
            String nombre = txtNombreCurso.getText();
            String correo = txtNumeroHoras.getText();
            Docente unDocente = (Docente) cbDocente.getSelectedItem();
            Curso unCurso = new Curso(nombre, txtCodigo.getText().trim(), Integer.parseInt(correo), unDocente);
            GestionEscuela.agregarCurso(unCurso);
            JOptionPane.showMessageDialog(null, "Curso Actualizado");
            txtNombreCurso.setText("");
            txtCodigo.setText("");
            txtNumeroHoras.setText("");
            fila = tblCursos.getRowCount();
            for (int i = fila - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            listarCursos();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }

    }//GEN-LAST:event_btnEditarActionPerformed
    public int hola(String buscar) {
        int cantidadCursos = GestionEscuela.listaCursos.size();

        String[] datos = new String[cantidadCursos * 4];

        int i = 0;
        int contador = 0;
        for (i = 0; i < datos.length; i++) {
            datos[i] = GestionEscuela.listaCursos.get(contador).getCodigo();
            datos[i + 1] = GestionEscuela.listaCursos.get(contador).getNombre();
            datos[i + 2] = GestionEscuela.listaCursos.get(contador).getHoras() + "";
            datos[i + 3] = GestionEscuela.listaCursos.get(contador).getUnDocente() + "";
            i = i + 3;
            contador++;
        }

        if (!buscar.isEmpty()) {
            try {
                String identifica = buscar;
                int indice = busquedaSecuencial(datos, identifica);
                if (indice < 0) {
                    JOptionPane.showMessageDialog(null, "No existe el docente con dicha Identificación");
                } else {
                    if (indice <= 0) {
                        return 0;
                    } else {
                        indice = indice / 4;
                        return indice;
                    }
                }
            } catch (NumberFormatException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Ingresar la identificación del docente a Consultar");
        }
        return 0;
    }

    public int busquedaSecuencial(String[] arreglo, String dato) {
        int posicion = -1;
        for (int i = 0; i < arreglo.length; i++) {//recorremos todo el arreglo
            if (dato.equals(arreglo[i])) {//comparamos el elemento en el arreglo con el buscado
                posicion = i;//Si es verdadero guardamos la posicion
                break;//Para el ciclo
            }
        }
        return posicion;
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = tblCursos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblCursos.getModel();
        if (fila >= 0) {

            GestionEscuela.eliminarCurso(hola(txtCodigo.getText()));
            modelo.removeRow(fila);
            listarCursos();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCursosMouseClicked
        // TODO add your handling code here:
        int seleccionar = tblCursos.rowAtPoint(evt.getPoint());
        txtCodigo.setText(String.valueOf(tblCursos.getValueAt(seleccionar, 0)));
        txtNombreCurso.setText(String.valueOf(tblCursos.getValueAt(seleccionar, 1)));
        txtNumeroHoras.setText(String.valueOf(tblCursos.getValueAt(seleccionar, 2)));
    }//GEN-LAST:event_tblCursosMouseClicked

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
            java.util.logging.Logger.getLogger(FrmListaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListaCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDocente;
    private javax.swing.JLabel lbDuracion;
    private javax.swing.JLabel lbNombreC;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtNumeroHoras;
    // End of variables declaration//GEN-END:variables
}
