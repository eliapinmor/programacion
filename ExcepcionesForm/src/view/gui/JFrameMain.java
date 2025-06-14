/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.gui;

import model.validations.UserDataValidations;
import ficheros.ClassFichero;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.exceptions.AgeException;
import model.exceptions.IdFormatException;

/**
 *
 * @author eliapinmor
 */
public class JFrameMain extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() {
        initComponents();
        initConfig();
    }

    private void initConfig() {
        jButtonValidar.setEnabled(true);
        jButtonClear.setEnabled(true);
        jButtonCSV.setEnabled(false);
        setLocationRelativeTo(null);
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
        jLabelTitle = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelErrorName = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jLabelNIF = new javax.swing.JLabel();
        jTextFieldNIF = new javax.swing.JTextField();
        jLabelErrorNIF = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelErrorEmail = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelBornDate = new javax.swing.JLabel();
        jTextFieldBornDate = new javax.swing.JTextField();
        jLabelErrorBornDate = new javax.swing.JLabel();
        jLabelPostalCode = new javax.swing.JLabel();
        jTextFieldPostalCode = new javax.swing.JTextField();
        jLabelErrorPostalCode = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jButtonClear = new javax.swing.JButton();
        jButtonCSV = new javax.swing.JButton();
        jLabelErrorAge = new javax.swing.JLabel();
        jLabelCSVMessage = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTitle.setText("FORMULARIO");
        jLabelTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/media/monlau.png"))); // NOI18N

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelName.setText("Nombre:");

        jTextFieldName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jLabelErrorName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelErrorName.setForeground(new java.awt.Color(255, 0, 0));

        jButtonValidar.setBackground(new java.awt.Color(51, 51, 255));
        jButtonValidar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonValidar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jLabelNIF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNIF.setText("NIF:");

        jTextFieldNIF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jLabelErrorNIF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelErrorNIF.setForeground(new java.awt.Color(255, 0, 0));

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jLabelErrorEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelErrorEmail.setForeground(new java.awt.Color(255, 0, 0));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail.setText("Email");

        jLabelBornDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBornDate.setText("Fecha de nacimiento:");

        jTextFieldBornDate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jLabelErrorBornDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelErrorBornDate.setForeground(new java.awt.Color(255, 0, 0));

        jLabelPostalCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPostalCode.setText("Codigo postal:");

        jTextFieldPostalCode.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jLabelErrorPostalCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelErrorPostalCode.setForeground(new java.awt.Color(255, 0, 0));

        jTextFieldAge.setEditable(false);
        jTextFieldAge.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jButtonClear.setBackground(new java.awt.Color(51, 51, 255));
        jButtonClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonCSV.setBackground(new java.awt.Color(51, 51, 255));
        jButtonCSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCSV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCSV.setText("CSV");
        jButtonCSV.setEnabled(false);
        jButtonCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCSVActionPerformed(evt);
            }
        });

        jLabelCSVMessage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCSVMessage.setForeground(new java.awt.Color(0, 153, 0));
        jLabelCSVMessage.setToolTipText("");

        jLabelAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAge.setText("Edad calculada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabelTitle)
                        .addGap(239, 239, 239)
                        .addComponent(jLabelLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNIF)
                    .addComponent(jLabelName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelErrorNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldBornDate, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelBornDate)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelAge)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelPostalCode)
                                            .addGap(308, 308, 308))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelErrorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelErrorBornDate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCSVMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabelErrorPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232)))))
                .addContainerGap(5, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTitle)
                        .addGap(75, 75, 75)
                        .addComponent(jLabelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorName))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNIF))
                    .addComponent(jLabelLogo))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorNIF))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEmail)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabelErrorEmail))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelErrorBornDate)
                                .addGap(8, 8, 8)
                                .addComponent(jLabelErrorAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(jLabelErrorPostalCode)
                                .addGap(364, 364, 364))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBornDate)
                                    .addComponent(jLabelAge, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldBornDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPostalCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonValidar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClear)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonCSV)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCSVMessage)
                        .addContainerGap())))
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

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        // TODO add your handling code here:
        Boolean entryCorrect = true;

        String name = jTextFieldName.getText();
        if (!UserDataValidations.checkName(name)) {
            jLabelErrorName.setText("Nombre incorrecto");
            entryCorrect = false;
        } else {
            jLabelErrorName.setText("");
        }
        String NIF = jTextFieldNIF.getText();

//        if (!UserDataValidations.checkId(1, NIF)) {
//            jLabelErrorNIF.setText("NIF incorrecto");
//            entryCorrect = false;
//        } else {
//            jLabelErrorNIF.setText("");
//        }
        try {
            UserDataValidations.checkId(1, NIF);
            jLabelErrorNIF.setText("");
        } catch (IdFormatException ex) {
            jLabelErrorNIF.setText(ex.getMessage());
            entryCorrect = false;
        }
        String email = jTextFieldEmail.getText();
        if (!UserDataValidations.checkEmail(email)) {
            jLabelErrorEmail.setText("email incorrecto");
            entryCorrect = false;
        } else {
            jLabelErrorEmail.setText("");
        }
        String bornDate = jTextFieldBornDate.getText();

//        if (age == -1) {
//            jLabelErrorBornDate.setText("fecha incorrecta");
//            jLabelErrorAge.setText("no se puede calcular la edad");
//            entryCorrect = false;
//        } else {
//            jTextFieldAge.setText("" + age);
//            jLabelErrorBornDate.setText("");
//            jLabelErrorAge.setText("");
//        }
        try {
            int age = UserDataValidations.calculateAge(bornDate);
            jTextFieldAge.setText("" + age);
            jLabelErrorBornDate.setText("");
            jLabelErrorAge.setText("");
        } catch (AgeException ex) {
            jLabelErrorBornDate.setText("fecha incorrecta");
            jLabelErrorAge.setText("no se puede calcular la edad");
            entryCorrect = false;

        }

        String postalCode = jTextFieldPostalCode.getText();
        if (UserDataValidations.checkPostalCode(postalCode) == false) {
            jLabelErrorPostalCode.setText("codigo postal incorrecto");
            entryCorrect = false;
        } else {
            jLabelErrorPostalCode.setText("");
        }

        if (entryCorrect) {
            jTextFieldName.setEditable(false);
            jTextFieldNIF.setEditable(false);
            jTextFieldEmail.setEditable(false);
            jTextFieldBornDate.setEditable(false);
            jTextFieldAge.setEditable(false);
            jTextFieldPostalCode.setEditable(false);
            jButtonValidar.setEnabled(false);
            jButtonCSV.setEnabled(true);

        }

    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jButtonValidar.setEnabled(true);
        jButtonClear.setEnabled(true);
        jButtonCSV.setEnabled(false);

        jTextFieldName.setEditable(true);
        jTextFieldNIF.setEditable(true);
        jTextFieldEmail.setEditable(true);
        jTextFieldBornDate.setEditable(true);
        jTextFieldAge.setEditable(false);
        jTextFieldPostalCode.setEditable(true);

        jLabelErrorName.setText("");
        jLabelErrorNIF.setText("");
        jLabelErrorEmail.setText("");
        jLabelErrorBornDate.setText("");
        jLabelErrorAge.setText("");
        jLabelErrorPostalCode.setText("");

        jTextFieldName.setText("");
        jTextFieldNIF.setText("");
        jTextFieldEmail.setText("");
        jTextFieldBornDate.setText("");
        jTextFieldAge.setText("");
        jTextFieldPostalCode.setText("");

        jLabelCSVMessage.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCSVActionPerformed
        // TODO add your handling code here:
        String line = jTextFieldName.getText() + ";" + jTextFieldNIF.getText() + ";" + jTextFieldEmail.getText() + ";" + jTextFieldBornDate.getText() + ";" + jTextFieldPostalCode.getText() + "\n";
        System.out.println(line);
        ClassFichero.writeFile(line);
        jLabelCSVMessage.setText("Datos exportados correctamente");
        jButtonCSV.setEnabled(false);
    }//GEN-LAST:event_jButtonCSVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {

        ClassFichero.createFile("user_data_EPM.csv");
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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCSV;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelBornDate;
    private javax.swing.JLabel jLabelCSVMessage;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelErrorAge;
    private javax.swing.JLabel jLabelErrorBornDate;
    private javax.swing.JLabel jLabelErrorEmail;
    private javax.swing.JLabel jLabelErrorNIF;
    private javax.swing.JLabel jLabelErrorName;
    private javax.swing.JLabel jLabelErrorPostalCode;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNIF;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPostalCode;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldBornDate;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPostalCode;
    // End of variables declaration//GEN-END:variables
}
