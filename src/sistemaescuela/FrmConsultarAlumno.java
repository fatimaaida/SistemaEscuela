//
package sistemaescuela;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmConsultarAlumno extends javax.swing.JFrame {
// FATIMA AIDA LEON REBOLLO

    /**
     * Creates new form FrmConsultarAlumno
     */
    public FrmConsultarAlumno() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        lbIdentificacion = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelAlumno = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbCorreo = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        lbGenero = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        pnColor = new javax.swing.JPanel();
        lbConsultarAlum = new javax.swing.JLabel();
        lbNombre1 = new javax.swing.JLabel();
        txtNombrebusqueda = new javax.swing.JTextField();
        btnConsultar1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AGREGAR ALUMNOS");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGREGAR ALUMNOS");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("AGREGAR ALUMNOS");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        lbIdentificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbIdentificacion.setText("Identificaci??n:");

        btnConsultar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(153, 153, 255));
        btnConsultar.setToolTipText("Clic para Consultar");
        btnConsultar.setLabel("BUSCAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 255));
        jButton1.setLabel("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelAlumno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAlumno.setEnabled(false);

        lbNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbNombre.setText("Nombre:");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 255));

        lbCorreo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbCorreo.setText("Correo:");

        txtGenero.setEditable(false);
        txtGenero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(153, 153, 255));

        lbGenero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbGenero.setText("Genero:");

        txtCorreo.setEditable(false);
        txtCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout panelAlumnoLayout = new javax.swing.GroupLayout(panelAlumno);
        panelAlumno.setLayout(panelAlumnoLayout);
        panelAlumnoLayout.setHorizontalGroup(
            panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addGap(34, 34, 34)
                        .addComponent(txtNombre))
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addComponent(lbCorreo)
                        .addGap(42, 42, 42)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addComponent(lbGenero)
                        .addGap(40, 40, 40)
                        .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAlumnoLayout.setVerticalGroup(
            panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre))
                .addGap(24, 24, 24)
                .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAlumnoLayout.createSequentialGroup()
                        .addGroup(panelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(lbGenero))
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnColor.setBackground(new java.awt.Color(153, 153, 255));

        lbConsultarAlum.setBackground(new java.awt.Color(0, 0, 0));
        lbConsultarAlum.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbConsultarAlum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConsultarAlum.setText("CONSULTA DE ALUMNOS");
        lbConsultarAlum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lbConsultarAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnColorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbConsultarAlum)
                .addContainerGap())
        );

        lbNombre1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbNombre1.setText("Nombre:");

        txtNombrebusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombrebusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrebusquedaActionPerformed(evt);
            }
        });

        btnConsultar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnConsultar1.setForeground(new java.awt.Color(153, 153, 255));
        btnConsultar1.setToolTipText("Clic para Consultar");
        btnConsultar1.setLabel("BUSCAR");
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(141, 141, 141)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombrebusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdentificacion)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre1)
                    .addComponent(txtNombrebusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(panelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    // METODO DE CONSULTAR EN BOTON DE BUSCAR
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        panelAlumno.setEnabled(true);
        txtNombre.setText("");
        txtCorreo.setText("");
        txtGenero.setText("");
        txtNombrebusqueda.setText("");
        int cantidadAlumnos = GestionEscuela.listaAlumnos.size();

        int[] datos = new int[cantidadAlumnos];
        //String[] datosS = new String[cantidadAlumnos *4];
        int i = 0;
        int contador = 0;
        for (i = 0; i < cantidadAlumnos; i++) {
            datos[i] = Integer.parseInt(GestionEscuela.listaAlumnos.get(contador).getIdentificacion());
            //datos[i + 1] = GestionEscuela.listaAlumnos.get(contador).getNombre();
            //datos[i + 2] = GestionEscuela.listaAlumnos.get(contador).getCorreo();
            //datos[i + 3] = GestionEscuela.listaAlumnos.get(contador).getGenero();
            //i = i + 3;
            contador++;
        }
        for (int j = 0; j < datos.length; j++) {
            System.out.println("" + datos[j]);
        }
        if (!txtIdentificacion.getText().isEmpty()) {
            try {
                int identifica = Integer.parseInt(txtIdentificacion.getText());
                int indice = buscar(datos, identifica);
                if (indice < 0) {
                    JOptionPane.showMessageDialog(null, "No existe Alumno con dicha Identificaci??n");
                } else {
                    Alumno unAlumno = GestionEscuela.obtenerAlumnoPorIdentificacion(indice + "");
                    if (unAlumno != null) {
                        txtNombre.setText(unAlumno.getNombre());
                        txtCorreo.setText(unAlumno.getCorreo());
                        txtGenero.setText(unAlumno.getGenero());
                    }
                }
            } catch (NumberFormatException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un n??mero v??lido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Ingresar la identificaci??n del Alumno a Consultar");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    public static int buscar(int[] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (arreglo[pos] == dato) {
                return pos;
            } else if (arreglo[pos] < dato) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
            }
        }
        return -1;
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

    //BOTON DE REGRESAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombrebusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrebusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrebusquedaActionPerformed

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtCorreo.setText("");
        txtGenero.setText("");
        txtIdentificacion.setText("");
        int cantidadAlumnos = GestionEscuela.listaAlumnos.size();

        String[] datos = new String[cantidadAlumnos * 4];
        String[] datos2 = new String[cantidadAlumnos * 4];

        int i = 0;
        int contador = 0;
        for (i = 0; i < datos.length; i++) {
            datos2[i] = GestionEscuela.listaAlumnos.get(contador).getIdentificacion();
            datos[i] = "";
            datos[i + 1] = GestionEscuela.listaAlumnos.get(contador).getNombre();
            datos2[i + 1] = GestionEscuela.listaAlumnos.get(contador).getNombre();
            datos[i + 2] = "";
            datos2[i + 2] = GestionEscuela.listaAlumnos.get(contador).getCorreo();
            datos[i + 3] = "";
            datos2[i + 3] = GestionEscuela.listaAlumnos.get(contador).getGenero();
            i = i + 3;
            contador++;
        }

        if (!txtNombrebusqueda.getText().isEmpty()) {
            try {
                String identifica = txtNombrebusqueda.getText();
                int indice = busquedaSecuencial(datos, identifica);
                if (indice < 0) {
                    JOptionPane.showMessageDialog(null, "No existe Alumno con dicho nombre");
                } else {
                    txtNombre.setText(datos[indice]);
                    txtCorreo.setText(datos2[indice + 1]);
                    txtGenero.setText(datos2[indice + 2]);
                }
            } catch (NumberFormatException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un n??mero v??lido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Ingresar la identificaci??n del Alumno a Consultar");
        }

    }//GEN-LAST:event_btnConsultar1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConsultarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbConsultarAlum;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbIdentificacion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JPanel panelAlumno;
    private javax.swing.JPanel pnColor;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombrebusqueda;
    // End of variables declaration//GEN-END:variables
}
