/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Equipo;

import WebServices.TipoEquipo;
import WebServices.TipoEquipoGT;
import WebServices.Equipos;
import WebServices.WebServices;
import WebServices.WebServices_Service;
import java.awt.Image;
import java.awt.Toolkit;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author mdeodanes
 */
public class frmEquipo extends javax.swing.JFrame {

    /**
     * Creates new form frmEquipo
     */
    public frmEquipo() {
        initComponents();
        setIconImage(getIconImage());

        this.setLocationRelativeTo(null);

        try {
            List<TipoEquipoGT> lTipo = Data.tipoEquipo();
            cbTipoEquipo.removeAllItems();

            for (int i = 0; i < lTipo.size(); i++) {
                cbTipoEquipo.addItem(lTipo.get(i).getIdTipoEquipo() + "-" + lTipo.get(i).getEquipo());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public Image getIconImage() {

        Image IconImage = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/IconImage.png"));
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
        btnBuscar = new javax.swing.JButton();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCaracteristicas = new javax.swing.JTextArea();
        txtIdEquipo = new javax.swing.JTextField();
        cbTipoEquipo = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de equipos");
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtModelo.setEditable(false);

        txtMarca.setEditable(false);

        txtSerie.setEditable(false);

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtStock.setEditable(false);
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Serie");

        chkEstado.setBackground(new java.awt.Color(255, 255, 255));
        chkEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        chkEstado.setText("Activo");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Caracteristicas");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Estado");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Stock");

        txtFecha.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Fecha");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Tipo");

        txtCaracteristicas.setEditable(false);
        txtCaracteristicas.setColumns(20);
        txtCaracteristicas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCaracteristicas.setRows(5);
        txtCaracteristicas.setFocusTraversalPolicyProvider(true);
        jScrollPane1.setViewportView(txtCaracteristicas);

        txtIdEquipo.setEditable(false);

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
                .addGap(156, 156, 156)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(172, 172, 172)
                                    .addComponent(chkEstado))
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(txtSerie))))
                        .addGap(111, 111, 111)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbTipoEquipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel5)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 133, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(txtMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(txtSerie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbTipoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtFecha))
                .addGap(31, 31, 31)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(chkEstado))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    WebServices_Service service = new WebServices_Service();
    WebServices Data = service.getWebServicesPort();

    Equipos equ;
    TipoEquipo Equi;

    List<Equipos> lEquipo;

    int Id_Equipo, IdTipoEquipo;
    String Marca, Modelo, Serie, Caracteristicas, Stock, Estado, Equipo;
    boolean nuevo = false, editar = false;

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        if (txtIdEquipo.getText().trim().isEmpty()) {
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
                    Id_Equipo = Integer.parseInt(txtIdEquipo.getText());
                    int r = Data.eliminarEquipo(Id_Equipo);

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

            if (!txtIdEquipo.isEditable()) {
                HabilitarTexbox(true);
                txtIdEquipo.requestFocus();

                btnBuscar.setEnabled(true);
                btnEliminar.setEnabled(true);
                return;
            }

            if (txtIdEquipo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo de busqueda vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);

            } else if (txtIdEquipo.getText().trim().length() == 0) {
                Id_Equipo = 0;
            } else {
                Id_Equipo = Integer.parseInt(txtIdEquipo.getText());
            }

            Modelo = txtModelo.getText();
            Serie = txtSerie.getText();

            String valorCB = (String) cbTipoEquipo.getSelectedItem();
            IdTipoEquipo = Integer.parseInt(valorCB.split("-")[0]);

            lEquipo = Data.buscarEquipo(Id_Equipo, Modelo, Serie, IdTipoEquipo, Estado);

            if (lEquipo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
                return;
            }

            for (int i = 0; i < lEquipo.size(); i++) {

                txtIdEquipo.setText(String.valueOf(lEquipo.get(i).getIdEquipo()));
                txtMarca.setText(lEquipo.get(i).getMarca());
                txtModelo.setText(lEquipo.get(i).getModelo());
                txtSerie.setText(lEquipo.get(i).getSerie());
                txtCaracteristicas.setText(lEquipo.get(i).getCaracteristicas());
                txtStock.setText(String.valueOf(lEquipo.get(i).getStock()));
                txtFecha.setText(lEquipo.get(i).getFechaRegistro());

                Equipo = String.valueOf(lEquipo.get(i).getIdTipoEquipo()) + "-" + lEquipo.get(i).getEquipo();
                cbTipoEquipo.setSelectedItem(Equipo);

                if (lEquipo.get(i).getEstado() == 1) {
                    chkEstado.setSelected(true);
                } else {
                    chkEstado.setSelected(false);
                }

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

                btnNuevo.setText("Guardar");
                btnEditar.setText("Cancelar");

                txtFecha.setEditable(false);
                txtIdEquipo.setEditable(false);

                nuevo = false;
                editar = true;
            } else {
                nuevo = false;
                editar = false;
                HabilitarTexbox(false);
                btnNuevo.setText("Nuevo");
                btnEditar.setText("Editar");
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

                txtMarca.requestFocus();
                txtIdEquipo.setEditable(false);
                txtFecha.setEditable(false);

                btnNuevo.setText("Guardar");
                btnEditar.setText("Cancelar");

                nuevo = true;
                editar = false;
            } else {

                Marca = txtMarca.getText();
                Modelo = txtModelo.getText();
                Serie = txtSerie.getText();
                Caracteristicas = txtCaracteristicas.getText();
                
                String valorCB = (String) cbTipoEquipo.getSelectedItem();
                IdTipoEquipo = Integer.parseInt(valorCB.split("-")[0]);
                
                Stock = txtStock.getText();

                if (txtSerie.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(this, "No dejar campos vacios", "Advertencia", JOptionPane.WARNING_MESSAGE);

                } else {

                    if (nuevo) {
                        int r = Data.agregarEquipo(Marca, Modelo, Serie, Caracteristicas, Stock, chkEstado.isSelected(), IdTipoEquipo);

                        if (r > 0) {
                            JOptionPane.showMessageDialog(null, "Registrado con exito : " + r);

                            LimpiarTexbox();
                            HabilitarTexbox(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error de registro");

                        }

                    } else if (editar) {
                        int r = Data.modificarEquipo(Id_Equipo, Marca, Modelo, Serie, Caracteristicas, Stock, chkEstado.isSelected(), IdTipoEquipo);

                        if (r == 1) {
                            JOptionPane.showMessageDialog(null, "Modificado con exito");

                            LimpiarTexbox();
                            HabilitarTexbox(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error de Modificacion");

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

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_txtStockKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void HabilitarTexbox(boolean editar) {
        txtIdEquipo.setEditable(editar);
        txtMarca.setEditable(editar);
        txtModelo.setEditable(editar);
        txtSerie.setEditable(editar);
        txtCaracteristicas.setEditable(editar);
        cbTipoEquipo.setEditable(editar);
        txtStock.setEditable(editar);
        //txtFecha.setEditable(editar);

        btnBuscar.setEnabled(!editar);
        btnEliminar.setEnabled(!editar);
    }

    private void LimpiarTexbox() {
        txtIdEquipo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtSerie.setText("");
        txtCaracteristicas.setText("");
        txtStock.setText("");
        txtFecha.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbTipoEquipo;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCaracteristicas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
