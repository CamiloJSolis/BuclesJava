/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

/**
 *
 * @author Armando J. López L.
 */
public class Aritmeticos extends javax.swing.JInternalFrame {
    OpAritmeticos operaciones = new OpAritmeticos();

    /**
     * Creates new form Aritmeticos
     */
    public Aritmeticos() {
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

        lEjer1 = new javax.swing.JLabel();
        tfNum1 = new javax.swing.JTextField();
        lvs1 = new javax.swing.JLabel();
        tfNum2 = new javax.swing.JTextField();
        bVerificar1 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        tfNum3 = new javax.swing.JTextField();
        lsuma2 = new javax.swing.JLabel();
        tfNum4 = new javax.swing.JTextField();
        bCalcular4 = new javax.swing.JButton();
        lresta2 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        lmulti2 = new javax.swing.JLabel();
        tfNum6 = new javax.swing.JTextField();
        lDiv2 = new javax.swing.JLabel();
        tfNum7 = new javax.swing.JTextField();
        lEjer3 = new javax.swing.JLabel();
        tfNum8 = new javax.swing.JTextField();
        lSuma3 = new javax.swing.JLabel();
        tfNum9 = new javax.swing.JTextField();
        lMulti3 = new javax.swing.JLabel();
        tfNum10 = new javax.swing.JTextField();
        lResta3 = new javax.swing.JLabel();
        tfNum11 = new javax.swing.JTextField();
        lDiv3 = new javax.swing.JLabel();
        tfNum12 = new javax.swing.JTextField();
        bCalcular3 = new javax.swing.JButton();
        lParen31 = new javax.swing.JLabel();
        lParen32 = new javax.swing.JLabel();
        lParen33 = new javax.swing.JLabel();
        lParen34 = new javax.swing.JLabel();
        lEjer4 = new javax.swing.JLabel();
        lEjer41 = new javax.swing.JLabel();
        tfNum13 = new javax.swing.JTextField();
        tfNum14 = new javax.swing.JTextField();
        lx4 = new javax.swing.JLabel();
        la4 = new javax.swing.JLabel();
        bCalcular2 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        lx5 = new javax.swing.JLabel();
        tfNum15 = new javax.swing.JTextField();
        la5 = new javax.swing.JLabel();
        tfNum16 = new javax.swing.JTextField();
        bCalcular5 = new javax.swing.JButton();
        lEjer51 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        tfNum17 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Operadores Aritméticos de Java");

        lEjer1.setText("1. Verificar si un número es múltiplo del otro");

        tfNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNum1ActionPerformed(evt);
            }
        });

        lvs1.setText("vs.");

        tfNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNum2ActionPerformed(evt);
            }
        });

        bVerificar1.setText("Verificar");
        bVerificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Calcular el resultado de la expresión");

        lsuma2.setText("+");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        lresta2.setText("-");

        lmulti2.setText("*");

        lDiv2.setText("/");

        lEjer3.setText("3. Calcular el resultado de la expresión");

        lSuma3.setText("+");

        lMulti3.setText("*");

        lResta3.setText("-");

        lDiv3.setText("/");

        bCalcular3.setText("Calcular");
        bCalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular3ActionPerformed(evt);
            }
        });

        lParen31.setText("(");

        lParen32.setText(")");

        lParen33.setText("(");

        lParen34.setText(")");

        lEjer4.setText("4. Calcular el resultado de la expresión: x^a");

        lx4.setText("x=");

        la4.setText("a=");

        bCalcular2.setText("Calcular");
        bCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular2ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Calcular el resultado de la expresión: x^a * a/b");

        lx5.setText("x=");

        la5.setText("a=");

        bCalcular5.setText("Calcular");
        bCalcular5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular5ActionPerformed(evt);
            }
        });

        lb5.setText("b=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lx5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(la5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lb5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular5))
                    .addComponent(lEjer1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvs1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bVerificar1))
                    .addComponent(lEjer2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lsuma2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lresta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lmulti2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lDiv2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular2))
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lParen31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lSuma3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lParen32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMulti3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lResta3)
                        .addGap(4, 4, 4)
                        .addComponent(lParen33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lDiv3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lParen34, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer41))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lEjer5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lEjer51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lx4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(la4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bCalcular4))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEjer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvs1)
                    .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerificar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsuma2)
                    .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lresta2)
                    .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lmulti2)
                    .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDiv2)
                    .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSuma3)
                            .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular3)
                            .addComponent(lMulti3)
                            .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lResta3)
                            .addComponent(tfNum11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lDiv3)
                            .addComponent(tfNum12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lParen31)
                            .addComponent(lParen32)
                            .addComponent(lParen33)
                            .addComponent(lParen34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lEjer4))
                    .addComponent(lEjer41, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lx4)
                    .addComponent(tfNum14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(la4)
                    .addComponent(bCalcular4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lEjer5)
                    .addComponent(lEjer51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lx5)
                    .addComponent(tfNum16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(la5)
                    .addComponent(bCalcular5)
                    .addComponent(tfNum17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNum1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfNum1ActionPerformed

    private void tfNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNum2ActionPerformed

    private void bVerificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar1ActionPerformed
        // TODO add your handling code here:
        float n1 = 0;
        float n2 = 0;
        n1 = Float.parseFloat(tfNum1.getText());
        n2 = Float.parseFloat(tfNum2.getText());
        
        operaciones.verificarMult(n1, n2);
        bVerificar1.setText(String.valueOf(operaciones.verificarMult(n1, n2)));
        
    }//GEN-LAST:event_bVerificar1ActionPerformed

    private void bCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular2ActionPerformed
        // TODO add your handling code here:
        float n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0;
        
        n3 = Float.parseFloat(tfNum3.getText());
        n4 = Float.parseFloat(tfNum4.getText());
        n5 = Float.parseFloat(tfNum5.getText());
        n6 = Float.parseFloat(tfNum6.getText());
        n7 = Float.parseFloat(tfNum7.getText());
        
        operaciones.calcularResp(n3, n4, n5, n6, n7);
        bCalcular2.setText(String.valueOf(operaciones.result));
        
    }//GEN-LAST:event_bCalcular2ActionPerformed

    private void bCalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular3ActionPerformed
        // TODO add your handling code here:
        
        float n8, n9, n10, n11, n12;
        
        n8 = Float.parseFloat(tfNum8.getText());
        n9 = Float.parseFloat(tfNum9.getText());
        n10 = Float.parseFloat(tfNum10.getText());
        n11 = Float.parseFloat(tfNum11.getText());
        n12 = Float.parseFloat(tfNum12.getText());
        
        operaciones.clacExpresion(n8, n9, n10, n11, n12);
        bCalcular3.setText(String.valueOf(operaciones.resp));
    }//GEN-LAST:event_bCalcular3ActionPerformed

    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed
        // TODO add your handling code here:
        float n13, n14;
        
        n13 = Float.parseFloat(tfNum13.getText());
        n14 = Float.parseFloat(tfNum14.getText());
        
        operaciones.calcPot(n13, n14);
        bCalcular4.setText(String.valueOf(operaciones.potencia));
    }//GEN-LAST:event_bCalcular4ActionPerformed

    private void bCalcular5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular5ActionPerformed
        // TODO add your handling code here:
        float n15 = 0, n16 = 0, n17 = 0;
        
        n15 = Float.parseFloat(tfNum15.getText());
        n16 = Float.parseFloat(tfNum16. getText());
        n17 = Float.parseFloat(tfNum17.getText());
        
        operaciones.calcExpr(n15, n16, n17);
        bCalcular5.setText(String.valueOf(operaciones.ans));
    }//GEN-LAST:event_bCalcular5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular2;
    private javax.swing.JButton bCalcular3;
    private javax.swing.JButton bCalcular4;
    private javax.swing.JButton bCalcular5;
    private javax.swing.JButton bVerificar1;
    private javax.swing.JLabel lDiv2;
    private javax.swing.JLabel lDiv3;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer41;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer51;
    private javax.swing.JLabel lMulti3;
    private javax.swing.JLabel lParen31;
    private javax.swing.JLabel lParen32;
    private javax.swing.JLabel lParen33;
    private javax.swing.JLabel lParen34;
    private javax.swing.JLabel lResta3;
    private javax.swing.JLabel lSuma3;
    private javax.swing.JLabel la4;
    private javax.swing.JLabel la5;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lmulti2;
    private javax.swing.JLabel lresta2;
    private javax.swing.JLabel lsuma2;
    private javax.swing.JLabel lvs1;
    private javax.swing.JLabel lx4;
    private javax.swing.JLabel lx5;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum10;
    private javax.swing.JTextField tfNum11;
    private javax.swing.JTextField tfNum12;
    private javax.swing.JTextField tfNum13;
    private javax.swing.JTextField tfNum14;
    private javax.swing.JTextField tfNum15;
    private javax.swing.JTextField tfNum16;
    private javax.swing.JTextField tfNum17;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfNum4;
    private javax.swing.JTextField tfNum5;
    private javax.swing.JTextField tfNum6;
    private javax.swing.JTextField tfNum7;
    private javax.swing.JTextField tfNum8;
    private javax.swing.JTextField tfNum9;
    // End of variables declaration//GEN-END:variables
}