/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaescuela;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemaescuela.*;

//NESTOR ANTONIO SANDOVAL SANTOS
public class FrmListaAlumno extends javax.swing.JFrame {

    /**
     * Creates new form FrmListaAlumno
     */
    public FrmListaAlumno() {
        initComponents();
        setLocationRelativeTo(this);
        listarAlumnos();
    }

    /**
     * Obtiene la lista de Alumnos y los agrega en la tabla del formulario
     */
    //METODO PARA LISTAR A LOS ALUMNOS
    public void listarAlumnos() {

        int cantidadAlumnos = GestionEscuela.listaAlumnos.size();
        DefaultTableModel modelo = (DefaultTableModel) tblAlumnos.getModel();
        String[] datos = new String[4];
        int fila = tblAlumnos.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        for (int i = 0; i < cantidadAlumnos; i++) {
            datos[0] = GestionEscuela.listaAlumnos.get(i).getIdentificacion();
            datos[1] = GestionEscuela.listaAlumnos.get(i).getNombre();
            datos[2] = GestionEscuela.listaAlumnos.get(i).getCorreo();
            datos[3] = GestionEscuela.listaAlumnos.get(i).getGenero();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        pnColor = new javax.swing.JPanel();
        lbListarAlum = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        txtIdentificacion = new javax.swing.JTextField();
        lbIdentificacion = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lbGenero = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        btnContar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AGREGAR CURSO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tblAlumnos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblAlumnos.setForeground(new java.awt.Color(153, 153, 255));
        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificaci??n", "Nombre", "Correo", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAlumnos.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(153, 153, 255));
        btnRegresar.setLabel("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        pnColor.setBackground(new java.awt.Color(153, 153, 255));

        lbListarAlum.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbListarAlum.setText("LISTAR ALUMNOS");

        javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
        pnColor.setLayout(pnColorLayout);
        pnColorLayout.setHorizontalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lbListarAlum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnColorLayout.setVerticalGroup(
            pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnColorLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lbListarAlum)
                .addContainerGap())
        );

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(153, 153, 255));
        btnEliminar.setLabel("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(153, 153, 255));
        btnEditar.setText("GUARDAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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

        txtIdentificacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(153, 153, 255));
        txtIdentificacion.setEnabled(false);

        lbIdentificacion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbIdentificacion.setText("Identificacion:");

        lbNombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 255));

        lbCorreo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbCorreo.setText("Correo:");

        txtCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(153, 153, 255));

        lbGenero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbGenero.setText("Genero:");

        cbGenero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbGenero.setForeground(new java.awt.Color(153, 153, 255));
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Otro" }));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroActionPerformed(evt);
            }
        });

        btnContar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnContar.setForeground(new java.awt.Color(153, 153, 255));
        btnContar.setText("CONTADOR");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnContar)
                        .addGap(50, 50, 50)
                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCorreo)
                            .addComponent(lbGenero))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIdentificacion)
                        .addComponent(txtNombre)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdentificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGenero)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON DE REGRESAR
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    // BOTON DE ELIMINAR
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = tblAlumnos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblAlumnos.getModel();
        if (fila >= 0) {

            GestionEscuela.eliminarAlumno(hola(txtIdentificacion.getText()));
            modelo.removeRow(fila);
            listarAlumnos();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //BOTON DE EDITAR
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if (!txtCorreo.getText().isEmpty() && !txtIdentificacion.getText().isEmpty()
                && !txtNombre.getText().isEmpty()){  
        int fila = tblAlumnos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblAlumnos.getModel();
        if (fila >= 0) {
            GestionEscuela.eliminarAlumno(hola(txtIdentificacion.getText()));
            modelo.removeRow(fila);
            int identifica = Integer.parseInt(txtIdentificacion.getText().trim());
            String nombre = txtNombre.getText();
            String correo = txtCorreo.getText();
            String genero = cbGenero.getSelectedItem().toString();
            Alumno unAlumno = new Alumno(genero, txtIdentificacion.getText().trim(), nombre, correo);
            GestionEscuela.agregarAlumno(unAlumno);
            JOptionPane.showMessageDialog(null, "Alumno Actualizado");
            txtCorreo.setText("");
            txtIdentificacion.setText("");
            txtNombre.setText("");
            fila = tblAlumnos.getRowCount();
            for (int i = fila - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            listarAlumnos();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Faltan datos");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:

        int cantidadAlumnos = GestionEscuela.listaAlumnos.size();
        DefaultTableModel modelo = (DefaultTableModel) tblAlumnos.getModel();
        String[] datos = new String[cantidadAlumnos * 4];

        int i = 0;
        int contador = 0;
        for (i = 0; i < datos.length; i++) {
            datos[i] = GestionEscuela.listaAlumnos.get(contador).getIdentificacion();
            datos[i + 1] = GestionEscuela.listaAlumnos.get(contador).getNombre();
            datos[i + 2] = GestionEscuela.listaAlumnos.get(contador).getCorreo();
            datos[i + 3] = GestionEscuela.listaAlumnos.get(contador).getGenero();
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
        int fila = tblAlumnos.getRowCount();
        for (i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        String[] info = new String[cantidadAlumnos * 4];
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

    private void cbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroActionPerformed

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        // TODO add your handling code here:
        int seleccionar = tblAlumnos.rowAtPoint(evt.getPoint());
        txtIdentificacion.setText(String.valueOf(tblAlumnos.getValueAt(seleccionar, 0)));
        txtNombre.setText(String.valueOf(tblAlumnos.getValueAt(seleccionar, 1)));
        txtCorreo.setText(String.valueOf(tblAlumnos.getValueAt(seleccionar, 2)));
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        // TODO add your handling code here:
        ArrayList<Persona> listapersonas = new ArrayList<>();
        int cantidadAlumnos = GestionEscuela.listaAlumnos.size();
        String[] datos = new String[cantidadAlumnos * 4];

        int i = 0;
        int contador = 0;
        for (i = 0; i < datos.length; i++) {
            datos[i] = GestionEscuela.listaAlumnos.get(contador).getIdentificacion();
            datos[i + 1] = GestionEscuela.listaAlumnos.get(contador).getNombre();
            datos[i + 2] = GestionEscuela.listaAlumnos.get(contador).getCorreo();
            datos[i + 3] = GestionEscuela.listaAlumnos.get(contador).getGenero();
            listapersonas.add(new Alumno(datos[i + 3], datos[i], datos[i + 1], datos[i + 2]));
            i = i + 3;
            contador++;
            
        }
        
        int cantidadDocentes = GestionEscuela.listaDocentes.size();
        //DefaultTableModel modelo = (DefaultTableModel) tblDocentes.getModel();
        String[] datos2 = new String[cantidadDocentes * 4];

         i = 0;
         contador = 0;
        for (i = 0; i < datos2.length; i++) {
            datos2[i] = GestionEscuela.listaDocentes.get(contador).getIdentificacion();
            datos2[i + 1] = GestionEscuela.listaDocentes.get(contador).getNombre();
            datos2[i + 2] = GestionEscuela.listaDocentes.get(contador).getCorreo();
            datos2[i + 3] = GestionEscuela.listaDocentes.get(contador).getProfesion();
            listapersonas.add(new Docente(datos2[i + 3], datos2[i], datos2[i + 1], datos2[i + 2]));
            i = i + 3;
            contador++;
        }
        contador=0;
        int alumnos=0;
        int docentes=0;
        String ultimoD="";
        String ultimoA="";
        for (int t = 0; t< listapersonas.size();t++) {
            contador=contador+1;
            if (listapersonas.get(t).getClass().getSimpleName().equals("Alumno")) {
                alumnos=alumnos+1;
                Persona convertidorAlumno = (Alumno)listapersonas.get(t);
                ultimoA= convertidorAlumno.getNombre();
            } else {
                docentes=docentes+1;
                Persona convertidorDocente = (Docente)listapersonas.get(t);
                ultimoD= convertidorDocente.getNombre();
            }
            
        }

        JOptionPane.showMessageDialog(null, "Estadisticas de el Programa\n"
                +"Cantidad de registros "+contador+"\n"
                +"Cantidad de alumnos "+alumnos+"\n"
                +"Cantidad de docentes "+docentes+"\n"
                +"Ultimo Alumno inscrito "+ultimoA+"\n"
                +"Ultimo Docente Contratado "+ultimoD);
        
    }//GEN-LAST:event_btnContarActionPerformed

    public int hola(String buscar) {
        int cantidadAlumnos = GestionEscuela.listaAlumnos.size();

        String[] datos = new String[cantidadAlumnos * 4];

        int i = 0;
        int contador = 0;
        for (i = 0; i < datos.length; i++) {
            datos[i] = GestionEscuela.listaAlumnos.get(contador).getIdentificacion();
            datos[i + 1] = GestionEscuela.listaAlumnos.get(contador).getNombre();
            datos[i + 2] = GestionEscuela.listaAlumnos.get(contador).getCorreo();
            datos[i + 3] = GestionEscuela.listaAlumnos.get(contador).getGenero();
            i = i + 3;
            contador++;
        }

        if (!buscar.isEmpty()) {
            try {
                String identifica = buscar;
                int indice = busquedaSecuencial(datos, identifica);
                if (indice < 0) {
                    JOptionPane.showMessageDialog(null, "No existe Alumno con dicha Identificaci??n");
                } else {
                    if (indice <= 0) {
                        return 0;
                    } else {
                        indice = indice / 4;
                        return indice;
                    }
                }
            } catch (NumberFormatException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un n??mero v??lido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Ingresar la identificaci??n del Alumno a Consultar");
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

    public int contaralumnos(){
        int cantidadAlumnos = GestionEscuela.listaAlumnos.size();

        String[] datos = new String[cantidadAlumnos * 4];

        int i = 0;
        int contador = 0;
        for (i = 0; i < datos.length; i++) {
            datos[i] = GestionEscuela.listaAlumnos.get(contador).getIdentificacion();
            datos[i + 1] = GestionEscuela.listaAlumnos.get(contador).getNombre();
            datos[i + 2] = GestionEscuela.listaAlumnos.get(contador).getCorreo();
            datos[i + 3] = GestionEscuela.listaAlumnos.get(contador).getGenero();
            i = i + 3;
            contador++;
        }
        return 0;
    }
    
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
            java.util.logging.Logger.getLogger(FrmListaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbIdentificacion;
    private javax.swing.JLabel lbListarAlum;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel pnColor;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
