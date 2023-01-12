/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Proveedor;

import WebServices.Proveedores;
import WebServices.WebServices;
import WebServices.WebServices_Service;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mdeodanes
 */
public class frmProveedor extends javax.swing.JFrame {

    /**
     * Creates new form frmEmpleado
     */
    public frmProveedor() {
        initComponents();
        setIconImage(getIconImage());

        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image IconImage = Toolkit
                .getDefaultToolkit()
                .getImage(ClassLoader.getSystemResource("img/IconImage.png"));
        return IconImage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtIdProveedor = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtGiro = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNit = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        chkTodos = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Proveedores");
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Empresa");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("ID");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Giro");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("NIT");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Dirección");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtIdProveedor.setEditable(false);

        txtEmpresa.setEditable(false);

        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusCycleRoot(true);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtGiro.setEditable(false);

        txtCorreo.setEditable(false);

        txtNombre.setEditable(false);

        txtNit.setEditable(false);

        txtTelefono.setEditable(false);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtDireccion.setEditable(false);

        txtApellido.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setText("Apellido");

        chkTodos.setText("Activo / Inactivos /Todos");
        chkTodos.setContentAreaFilled(false);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setText("Ciudad");

        txtCiudad.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setText("Pais");

        txtPais.setEditable(false);

        btnCerrar.setText("Close");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkTodos)
                                .addGap(245, 245, 245))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTodos))
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    WebServices_Service service = new WebServices_Service();
    WebServices Data = service.getWebServicesPort();
    Proveedores prov;
    //Privilegios priv;
    List<Proveedores> lProveedor;

    int Id_Proveedor;
    String Empresa, Nombre, Apellido, Nit, Giro, Correo, Telefono, Direccion, Ciudad, Pais, Estado;
    boolean nuevo = false, editar = false;

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      // TODO add your handling code here:
      if (txtIdProveedor.getText().trim().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Sin registros para eliminar");
      } else {
          try {
              int confirmarEliminar = JOptionPane.showConfirmDialog(
                      this,
                      "Estas seguro de eliminar este registro?",
                      "Advertencia",
                      JOptionPane.YES_NO_OPTION
              );
              if (confirmarEliminar == JOptionPane.OK_OPTION) {
                  Id_Proveedor = Integer.parseInt(txtIdProveedor.getText());
                  int r = Data.eliminarProveedor(Id_Proveedor);

                  if (r == 1) {
                      JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
                      LimpiarTexbox();
                  } else {
                      JOptionPane.showMessageDialog(null, "Error al eliminar registro");
                  }
              } else {
              }
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
          }
      }
  }//GEN-LAST:event_btnEliminarActionPerformed

  private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      // TODO add your handling code here:

      try {
          if (!txtIdProveedor.isEditable()) {
              HabilitarTexbox(true);
              btnBuscar.setEnabled(true);
              btnEliminar.setEnabled(true);
              return;
          }

          if (txtIdProveedor.getText().trim().isEmpty()) {

              JOptionPane.showMessageDialog(this, "Campo de busqueda vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);

          } else if (txtIdProveedor.getText().trim().length() == 0) {
              Id_Proveedor = 0;
          } else {
              Id_Proveedor = Integer.parseInt(txtIdProveedor.getText());
          }
          Empresa = txtEmpresa.getText();
          Nombre = txtEmpresa.getText();
          Apellido = txtNombre.getText();
          
          lProveedor
                  = Data.buscarProveedor(
                          Id_Proveedor,
                          Empresa,
                          Nombre,
                          Apellido,
                          Nit,
                          Giro,
                          Correo,
                          Direccion,
                          Telefono,
                          Ciudad,
                          Pais,
                          Estado
                  );

          if (lProveedor.isEmpty()) {
              JOptionPane.showMessageDialog(null, "Registro no encontrado");
              return;
          }

          for (int i = 0; i < lProveedor.size(); i++) {
              txtIdProveedor.setText(
                      String.valueOf(lProveedor.get(i).getIdProveedor())
              );
              txtEmpresa.setText(lProveedor.get(i).getEmpresa());
              txtNombre.setText(lProveedor.get(i).getNombre());
              txtApellido.setText(lProveedor.get(i).getApellido());
              txtNit.setText(lProveedor.get(i).getNit());
              txtGiro.setText(lProveedor.get(i).getGiro());
              txtCorreo.setText(lProveedor.get(i).getCorreo());
              txtDireccion.setText(lProveedor.get(i).getDireccion());
              txtTelefono.setText(lProveedor.get(i).getTelefono());
              txtCiudad.setText(lProveedor.get(i).getCiudad());
              txtPais.setText(lProveedor.get(i).getPais());

              
          }

      } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
      }
  }//GEN-LAST:event_btnBuscarActionPerformed

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      // TODO add your handling code here:

      try {
          if (btnEditar.getText().equals("Editar")) {
              HabilitarTexbox(true);
              txtEmpresa.requestFocus();

              btnNuevo.setText("Guardar");
              btnEditar.setText("Cancelar");

              txtIdProveedor.setEditable(false);

              btnEliminar.setEnabled(false);

              nuevo = false;
              editar = true;
          } else {
              nuevo = false;
              editar = false;
              HabilitarTexbox(false);
              btnNuevo.setText("Nuevo");
              btnEditar.setText("Editar");
              btnEliminar.setEnabled(true);
          }
      } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
      }
  }//GEN-LAST:event_btnEditarActionPerformed

  private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      // TODO add your handling code here:
      try {
          if (btnNuevo.getText().equals("Nuevo")) {
              LimpiarTexbox();
              HabilitarTexbox(true);
              txtEmpresa.requestFocus();

              btnNuevo.setText("Guardar");
              btnEditar.setText("Cancelar");
              btnBuscar.setEnabled(false);
              btnEliminar.setEnabled(false);

              txtIdProveedor.setEditable(false);

              nuevo = true;
              editar = false;
          } else {
              Empresa = txtEmpresa.getText();
              Nombre = txtNombre.getText();
              Apellido = txtApellido.getText();
              Nit = txtNit.getText();
              Giro = txtGiro.getText();
              Correo = txtCorreo.getText();
              Telefono = txtTelefono.getText();
              Direccion = txtDireccion.getText();
              Ciudad = txtCiudad.getText();
              Pais = txtPais.getText();

              if (txtNombre.getText().trim().isEmpty()) {
                  JOptionPane.showMessageDialog(
                          this,
                          "No dejar campos vacios",
                          "Advertencia",
                          JOptionPane.WARNING_MESSAGE
                  );
              } else {
                  if (nuevo) {
                      int r = Data.agregarProveedor(
                              Empresa,
                              Nombre,
                              Apellido,
                              Nit,
                              Giro,
                              Correo,
                              Telefono,
                              Direccion,
                              Ciudad,
                              Pais
                      );

                      if (r > 0) {
                          JOptionPane.showMessageDialog(
                                  null,
                                  "Registrado con exito ID: " + r
                          );
                          LimpiarTexbox();
                          HabilitarTexbox(false);
                      } else {
                          JOptionPane.showMessageDialog(null, "Error. Error de registro!");
                      }
                  } else if (editar) {
                      int r = Data.modificarProveedor(
                              Id_Proveedor,
                              Empresa,
                              Nombre,
                              Apellido,
                              Nit,
                              Giro,
                              Correo,
                              Telefono,
                              Direccion,
                              Ciudad,
                              Pais
                      //chkEstado.isSelected()
                      );

                      if (r == 1) {
                          JOptionPane.showMessageDialog(null, "Modificado con exito!");
                          LimpiarTexbox();
                          HabilitarTexbox(false);
                      } else {
                          JOptionPane.showMessageDialog(null, "Error al modificar!");
                      }
                  }
              }

              nuevo = false;
              editar = false;
              HabilitarTexbox(false);
              btnNuevo.setText("Nuevo");
              btnEditar.setText("Editar");
          }
      } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
      }
  }//GEN-LAST:event_btnNuevoActionPerformed

  private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      // TODO add your handling code here:

      dispose();
  }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger
                    .getLogger(frmProveedor.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger
                    .getLogger(frmProveedor.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger
                    .getLogger(frmProveedor.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger
                    .getLogger(frmProveedor.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                new Runnable() {
            public void run() {
                //new frmEmpleado().setVisible(true);
            }
        }
        );
    }

    private void HabilitarTexbox(boolean editar) {
        txtIdProveedor.setEditable(editar);
        txtEmpresa.setEditable(editar);
        txtNombre.setEditable(editar);
        txtApellido.setEditable(editar);
        txtNit.setEditable(editar);
        txtGiro.setEditable(editar);
        txtCorreo.setEditable(editar);
        txtTelefono.setEditable(editar);
        txtDireccion.setEditable(editar);
        txtCiudad.setEditable(editar);
        txtPais.setEditable(editar);
    }

    private void LimpiarTexbox() {
        txtIdProveedor.setText("");
        txtEmpresa.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtNit.setText("");
        txtGiro.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtDireccion.setText("");
        txtCiudad.setText("");
        txtPais.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chkTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtGiro;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
