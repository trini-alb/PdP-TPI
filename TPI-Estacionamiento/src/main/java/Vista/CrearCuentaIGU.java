/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import Modelo.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CrearCuentaIGU extends javax.swing.JFrame {

    public CrearCuentaIGU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTipoCuenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCrearCuenta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAgregarSaldo = new javax.swing.JTextField();
        btnSumarSaldo = new javax.swing.JButton();
        btnHomeIGU = new javax.swing.JButton();
        txtDocumentoSaldo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMensajeCreacion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtSaldoConsulta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnConsultarSaldo = new javax.swing.JButton();
        txtDocumentoConsultarSaldo = new javax.swing.JTextField();
        txtMensajeSaldo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        btnRegistrarInvitado = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtDocumentoInvitado = new javax.swing.JTextField();
        txtInvitacionExitosa = new javax.swing.JTextField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTACIONAMIENTO");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel1.setName(""); // NOI18N

        jLabel2.setText("CREACION DE CUENTA");

        jLabel3.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido:");

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        jLabel5.setText("Documento:");

        txtTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCuentaActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo cuenta: ");

        txtTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo usuario:");

        btnCrearCuenta.setText("CREAR CUENTA");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        jLabel8.setText("CONSULTAR SALDO");

        jLabel9.setText("Agregar saldo:");

        txtAgregarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarSaldoActionPerformed(evt);
            }
        });

        btnSumarSaldo.setText("SUMAR SALDO");
        btnSumarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarSaldoActionPerformed(evt);
            }
        });

        btnHomeIGU.setText("HOME");
        btnHomeIGU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeIGUActionPerformed(evt);
            }
        });

        txtDocumentoSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoSaldoActionPerformed(evt);
            }
        });

        jLabel10.setText("Documento:");

        // 1. Establece la opacidad a false para que el fondo se vea a través
        txtMensajeCreacion.setOpaque(false);

        // 2. Elimina el borde visible (la línea negra)
        txtMensajeCreacion.setBorder(null);
        txtMensajeCreacion.setEditable(false);
        txtMensajeCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeCreacionActionPerformed(evt);
            }
        });

        jLabel11.setText("AGREGAR SALDO");

        // 1. Establece la opacidad a false para que el fondo se vea a través
        txtSaldoConsulta.setOpaque(false);

        // 2. Elimina el borde visible (la línea negra)
        txtSaldoConsulta.setBorder(null);
        txtSaldoConsulta.setEditable(false);
        txtSaldoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoConsultaActionPerformed(evt);
            }
        });

        jLabel12.setText("Documento:");

        btnConsultarSaldo.setText("CONSULTAR");
        btnConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSaldoActionPerformed(evt);
            }
        });

        txtDocumentoConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoConsultarSaldoActionPerformed(evt);
            }
        });

        // 1. Establece la opacidad a false para que el fondo se vea a través
        txtMensajeSaldo.setOpaque(false);

        // 2. Elimina el borde visible (la línea negra)
        txtMensajeSaldo.setBorder(null);
        txtMensajeSaldo.setEditable(false);
        txtMensajeSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeSaldoActionPerformed(evt);
            }
        });

        jLabel13.setText("CREAR INVITACION");

        btnRegistrarInvitado.setText("CREAR INV.");
        btnRegistrarInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarInvitadoActionPerformed(evt);
            }
        });

        jLabel14.setText("Documento del invitado");

        txtDocumentoInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoInvitadoActionPerformed(evt);
            }
        });

        // 1. Establece la opacidad a false para que el fondo se vea a través
        txtInvitacionExitosa.setOpaque(false);

        // 2. Elimina el borde visible (la línea negra)
        txtInvitacionExitosa.setBorder(null);
        txtInvitacionExitosa.setEditable(false);
        txtInvitacionExitosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvitacionExitosaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                .addGap(276, 276, 276))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMensajeCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDocumentoInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegistrarInvitado)
                                .addGap(18, 18, 18)
                                .addComponent(txtInvitacionExitosa, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAgregarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDocumentoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSumarSaldo))
                                    .addComponent(txtMensajeSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDocumentoConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnConsultarSaldo)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtSaldoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHomeIGU, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCuenta)
                    .addComponent(txtMensajeCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDocumentoInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarInvitado)
                    .addComponent(txtInvitacionExitosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSaldoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarSaldo)
                    .addComponent(txtDocumentoConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHomeIGU, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtDocumentoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSumarSaldo))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtAgregarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMensajeSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Controlador controller = new Controlador();
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoCuentaActionPerformed

    private void txtTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoUsuarioActionPerformed

    private void txtAgregarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgregarSaldoActionPerformed

    private void btnHomeIGUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeIGUActionPerformed
        HomeIGU ventanaPlazas = new HomeIGU();
        ventanaPlazas.setVisible(true);
        ventanaPlazas.setLocationRelativeTo(null);
        //cerramos la ventana actual y abrimos la nueva
        this.dispose(); //this se refiere a la ventana actual.
    }//GEN-LAST:event_btnHomeIGUActionPerformed

    private void txtDocumentoSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoSaldoActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed

       String txtN = txtNombre.getText();
       String txtA = txtApellido.getText();
       String txtD = txtDocumento.getText();
       String txtTC = txtTipoCuenta.getText();
       String txtTU = txtTipoUsuario.getText();
       String mensaje = controller.crearCuenta(txtN, txtA, txtD, txtTC, txtTU);
       txtMensajeCreacion.setText(mensaje);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void txtMensajeCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeCreacionActionPerformed
        
    }//GEN-LAST:event_txtMensajeCreacionActionPerformed

    private void txtSaldoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoConsultaActionPerformed

    private void txtDocumentoConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoConsultarSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoConsultarSaldoActionPerformed

    private void btnConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSaldoActionPerformed
        String documentoAConsultar = txtDocumentoConsultarSaldo.getText();
        String mensaje = controller.consultarSaldo(documentoAConsultar);
        txtSaldoConsulta.setText(mensaje);
        
        
    }//GEN-LAST:event_btnConsultarSaldoActionPerformed

    private void btnSumarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarSaldoActionPerformed
        String montoTexto = txtAgregarSaldo.getText();
        String documento = txtDocumentoSaldo.getText();
        String mensaje = controller.sumSaldo(montoTexto, documento);
        txtMensajeSaldo.setText(mensaje);
        
    }//GEN-LAST:event_btnSumarSaldoActionPerformed

    private void txtMensajeSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensajeSaldoActionPerformed

    private void btnRegistrarInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarInvitadoActionPerformed
        String documento = txtDocumentoInvitado.getText();
        
        String mensaje = controller.crearInvitacion(documento);
        txtInvitacionExitosa.setText(mensaje);
        
    }//GEN-LAST:event_btnRegistrarInvitadoActionPerformed

    private void txtDocumentoInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoInvitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoInvitadoActionPerformed

    private void txtInvitacionExitosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvitacionExitosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvitacionExitosaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarSaldo;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnHomeIGU;
    private javax.swing.JButton btnRegistrarInvitado;
    private javax.swing.JButton btnSumarSaldo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtAgregarSaldo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtDocumentoConsultarSaldo;
    private javax.swing.JTextField txtDocumentoInvitado;
    private javax.swing.JTextField txtDocumentoSaldo;
    private javax.swing.JTextField txtInvitacionExitosa;
    private javax.swing.JTextField txtMensajeCreacion;
    private javax.swing.JTextField txtMensajeSaldo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldoConsulta;
    private javax.swing.JTextField txtTipoCuenta;
    private javax.swing.JTextField txtTipoUsuario;
    // End of variables declaration//GEN-END:variables
}
