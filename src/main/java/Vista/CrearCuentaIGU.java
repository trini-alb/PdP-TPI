/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

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
        txtVehiculo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCrearCuenta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAgregarSaldo = new javax.swing.JTextField();
        btnSumarSaldo = new javax.swing.JButton();
        btnSigPaguina = new javax.swing.JButton();
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

        txtVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehiculoActionPerformed(evt);
            }
        });

        jLabel6.setText("Vehiculo:");

        txtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatenteActionPerformed(evt);
            }
        });

        jLabel7.setText("Patente:");

        btnCrearCuenta.setText("Crear Cuenta");
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

        btnSigPaguina.setText("PLAZAS DISPONIBLES ->");
        btnSigPaguina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigPaguinaActionPerformed(evt);
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
        txtMensajeCreacion.setOpaque(false);

        // 2. Elimina el borde visible (la línea negra)
        txtMensajeCreacion.setBorder(null);
        txtMensajeSaldo.setEditable(false);
        txtMensajeSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGap(282, 282, 282))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(txtVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMensajeCreacion)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDocumentoConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btnConsultarSaldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaldoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel11)
                            .addComponent(txtMensajeSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(401, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSigPaguina)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCuenta)
                    .addComponent(txtMensajeCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSaldoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarSaldo)
                    .addComponent(txtDocumentoConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnSigPaguina))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehiculoActionPerformed

    private void txtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatenteActionPerformed

    private void txtAgregarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgregarSaldoActionPerformed

    private void btnSigPaguinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigPaguinaActionPerformed
        PlazasDisponiblesIGU ventanaPlazas = new PlazasDisponiblesIGU();
        ventanaPlazas.setVisible(true);
        ventanaPlazas.setLocationRelativeTo(null);
        //cerramos la ventana actual y abrimos la nueva
        this.dispose(); //this se refiere a la ventana actual.
    }//GEN-LAST:event_btnSigPaguinaActionPerformed

    private void txtDocumentoSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoSaldoActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
 
       String txtN = txtNombre.getText();
       String txtA = txtApellido.getText();
       String txtD = txtDocumento.getText();
       String txtV = txtVehiculo.getText();
       String txtP = txtPatente.getText();
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
        if(documentoAConsultar.isEmpty()){
            txtDocumentoConsultarSaldo.setText("¡Ingrese Documento!");
        }else{
            try {
                // 1. Llama al método estático del Modelo para buscar el saldo.
                Double saldoEncontrado = CuentaUsuario.consultarSaldo(documentoAConsultar);
                // 2. Evalúa el resultado.
                if (saldoEncontrado != null) {
                    // Convierte el Double a String y lo muestra.
                    txtSaldoConsulta.setText(String.valueOf(saldoEncontrado));
                } else {
                    txtSaldoConsulta.setText("No encontrado");
        }
            } catch (IOException e) {
                // Atrapa errores de lectura (archivo inexistente, permisos, etc.)
                txtSaldoConsulta.setText("Error I/O");
                System.err.println("Error al consultar saldo: " + e.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnConsultarSaldoActionPerformed

    private void btnSumarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarSaldoActionPerformed
        String montoTexto = txtAgregarSaldo.getText();
        String documento = txtDocumentoSaldo.getText();
        // 1. Validación de campos vacíos
        if (documento.trim().isEmpty() || montoTexto.trim().isEmpty()) {
            // Asumo que tienes un campo para mensajes de error, si no, usa System.out.println
            // Por ejemplo, usando tu campo de creación de cuenta
            txtMensajeSaldo.setText("⚠️ Debe ingresar el Documento y el Monto.");
            return;
        }

        double montoAAgregar;
        try {
            // 2. Validación de formato numérico
            montoAAgregar = Double.parseDouble(montoTexto);

            if (montoAAgregar <= 0) {
                txtMensajeSaldo.setText("⚠️ El monto a sumar debe ser mayor a cero.");
                return;
            }

            // 3. Llamada al Modelo para actualizar el saldo
            boolean exito = CuentaUsuario.recargarSaldo(documento, montoAAgregar);

            // 4. Actualización de la Vista (Mensaje de resultado)
            if (exito) {
                txtMensajeSaldo.setText("✅ Saldo agregado con éxito al Documento: " + documento);
                // Opcional: limpiar los campos después del éxito
                txtDocumentoSaldo.setText("");
                txtAgregarSaldo.setText("");
            } else {
                // El Modelo retornó 'false' (Cuenta no encontrada)
                txtMensajeSaldo.setText("❌ Error: No se encontró la cuenta con el Documento ingresado.");
            }

        } catch (NumberFormatException e) {
            // Error capturado si el texto en txtAgregarSaldo no es un Double válido
            txtMensajeSaldo.setText("❌ Error: Ingrese un monto numérico válido.");

        } catch (java.io.IOException e) {
            // Error capturado si falla la lectura/escritura del archivo
            txtMensajeSaldo.setText("❌ ERROR I/O: Fallo al guardar en el archivo. Revise la ruta y permisos.");
            System.err.println("Error I/O al actualizar el saldo: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSumarSaldoActionPerformed

    private void txtMensajeSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensajeSaldoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarSaldo;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnSigPaguina;
    private javax.swing.JButton btnSumarSaldo;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtAgregarSaldo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtDocumentoConsultarSaldo;
    private javax.swing.JTextField txtDocumentoSaldo;
    private javax.swing.JTextField txtMensajeCreacion;
    private javax.swing.JTextField txtMensajeSaldo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtSaldoConsulta;
    private javax.swing.JTextField txtVehiculo;
    // End of variables declaration//GEN-END:variables
}
