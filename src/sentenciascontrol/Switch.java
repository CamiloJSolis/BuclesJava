/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando J. López L.
 */
public class Switch extends javax.swing.JInternalFrame {

    OpSwitch operaciones = new OpSwitch();

    /**
     * Creates new form Switch
     */
    public Switch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taEjer1 = new javax.swing.JTextArea();
        tfMes1 = new javax.swing.JTextField();
        bMostrar1 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        tfMes2 = new javax.swing.JTextField();
        bMostrar2 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        tfMes3 = new javax.swing.JTextField();
        bMostrar3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        pEstadoCivil = new javax.swing.JPanel();
        rbCalcNum = new javax.swing.JRadioButton();
        rbCalcDiv = new javax.swing.JRadioButton();
        rbMostrarNum = new javax.swing.JRadioButton();
        bCalcular4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        bDeterminar5 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sentencia de Bifurcación switch de Java");

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        taEjer1.setEditable(false);
        taEjer1.setBackground(new java.awt.Color(240, 240, 240));
        taEjer1.setColumns(20);
        taEjer1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taEjer1.setLineWrap(true);
        taEjer1.setRows(5);
        taEjer1.setText("1. De acuerdo con el nombre del mes digitado, muestre si pertenece al grupo de 28 días, 29 días, 30 días o 31 días");
        taEjer1.setToolTipText("");
        taEjer1.setAutoscrolls(false);
        taEjer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(taEjer1);

        tfMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMes1ActionPerformed(evt);
            }
        });

        bMostrar1.setText("Mostar");
        bMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Según el número del mes, determine la época del año");

        bMostrar2.setText("Mostar");
        bMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar2ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Según el número del mes, determine el número de días");

        tfMes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMes3ActionPerformed(evt);
            }
        });

        bMostrar3.setText("Mostar");
        bMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Realice la tarea que indica la selección");

        pEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú"));

        rbCalcNum.setText("Calcular la raíz de un número");
        rbCalcNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCalcNumActionPerformed(evt);
            }
        });

        rbCalcDiv.setText("Calcular el residuo de una división entera");

        rbMostrarNum.setText("Mostrar el menor de N números");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoCivilLayout = new javax.swing.GroupLayout(pEstadoCivil);
        pEstadoCivil.setLayout(pEstadoCivilLayout);
        pEstadoCivilLayout.setHorizontalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstadoCivilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCalcDiv)
                            .addComponent(rbMostrarNum)
                            .addComponent(rbCalcNum)))
                    .addGroup(pEstadoCivilLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(bCalcular4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEstadoCivilLayout.setVerticalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addComponent(rbCalcNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCalcDiv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMostrarNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalcular4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lEjer5.setText("5. Determinar si el número entero es par o impar");

        bDeterminar5.setText("Determinar");
        bDeterminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeterminar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar2))
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar3))
                    .addComponent(lEjer4)
                    .addComponent(lEjer2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEjer5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDeterminar5)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeterminar5)
                    .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMes1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfMes1ActionPerformed

    private void bMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar1ActionPerformed
        // TODO add your handling code here:
        String mes;
        mes = String.format(tfMes1.getText());

        operaciones.verificarMes(mes);
        bMostrar1.setText(String.valueOf(operaciones.resp));
    }//GEN-LAST:event_bMostrar1ActionPerformed

    private void bMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar2ActionPerformed
        // TODO add your handling code here:
        int num;
        num = Integer.parseInt(tfMes2.getText());

        operaciones.estacionAño(num);
        bMostrar2.setText(String.valueOf(operaciones.est));
    }//GEN-LAST:event_bMostrar2ActionPerformed

    private void bMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar3ActionPerformed
        // TODO add your handling code here:
        int number;
        number = Integer.parseInt(tfMes3.getText());

        operaciones.verificarNumMes(number);
        bMostrar3.setText(String.valueOf(operaciones.nMes));
    }//GEN-LAST:event_bMostrar3ActionPerformed

    private void bDeterminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeterminar5ActionPerformed
        // TODO add your handling code here:
        int num1;
        num1 = Integer.parseInt(tfNum5.getText());

        operaciones.verificarNum(num1);
        bDeterminar5.setText(String.valueOf(operaciones.vNum));
    }//GEN-LAST:event_bDeterminar5ActionPerformed

    private void tfMes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMes3ActionPerformed

    private void rbCalcNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCalcNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCalcNumActionPerformed

   
    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed
        // TODO add your handling code here:
        double number = 0, number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;

        if (rbCalcNum.isSelected()) {
            number = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero: "));
            JOptionPane.showMessageDialog(this, ("La raiz de " + number + " es: "  + operaciones.calcRaiz(number)), "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        } else if (rbCalcDiv.isSelected()) {
            number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero: "));
            number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite otro numero: "));
            JOptionPane.showMessageDialog(this, ("El residuo de " + number1 + " y " + number2 + " es: " + operaciones.calcResiduo(number1, number2)), "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        } else if (rbMostrarNum.isSelected()) {
            number3 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero: "));
            number4 = Double.parseDouble(JOptionPane.showInputDialog("Digite segundo numero: "));
            number5 = Double.parseDouble(JOptionPane.showInputDialog("Digite tercer numero: "));
            JOptionPane.showMessageDialog(this, ("El menor de " + number3 + ", " + number4 + " y " + number5 + " es: " + operaciones.calcMenor(number3, number4, number5)) , "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular4;
    private javax.swing.JButton bDeterminar5;
    private javax.swing.JButton bMostrar1;
    private javax.swing.JButton bMostrar2;
    private javax.swing.JButton bMostrar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JPanel pEstadoCivil;
    private javax.swing.JRadioButton rbCalcDiv;
    private javax.swing.JRadioButton rbCalcNum;
    private javax.swing.JRadioButton rbMostrarNum;
    private javax.swing.JTextArea taEjer1;
    private javax.swing.JTextField tfMes1;
    private javax.swing.JTextField tfMes2;
    private javax.swing.JTextField tfMes3;
    private javax.swing.JTextField tfNum5;
    // End of variables declaration//GEN-END:variables

}
