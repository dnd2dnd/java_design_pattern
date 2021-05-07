/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Cal;

import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class PaymentJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PaymentJFrame
     */
    public PaymentJFrame() {
        initComponents();
    }
    
     // 패널 변경에 있어 우선 설정해야하는 것들
    public void switchPanels(JPanel panel) { 
        jLayeredPane_Payment.removeAll();
        jLayeredPane_Payment.add(panel);
        jLayeredPane_Payment.repaint();
        jLayeredPane_Payment.revalidate();
    }
   
    // 주문 , 가격, 지불금액 을 라벨에 표시 
    String orderString = "테스트123"; 
    int priceNum = 0; 
    int paymentNum = 0;
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        jLayeredPane_Payment = new javax.swing.JLayeredPane();
        cash_Panel = new javax.swing.JPanel();
        title_cash = new javax.swing.JLabel();
        order_cash = new javax.swing.JLabel();
        price_cash = new javax.swing.JLabel();
        payment_cash = new javax.swing.JLabel();
        btn_50000 = new javax.swing.JButton();
        btn_10000 = new javax.swing.JButton();
        btn_5000 = new javax.swing.JButton();
        btn_1000 = new javax.swing.JButton();
        btn_500 = new javax.swing.JButton();
        btn_100 = new javax.swing.JButton();
        btn_pay_cash = new javax.swing.JButton();
        order_cash_Label = new javax.swing.JLabel();
        price_cash_Label = new javax.swing.JLabel();
        payment_cash_Field = new javax.swing.JTextField();
        credit_card_Panel = new javax.swing.JPanel();
        title_credit_card = new javax.swing.JLabel();
        payment_credit_card = new javax.swing.JLabel();
        price_credit_card = new javax.swing.JLabel();
        order_credit_card = new javax.swing.JLabel();
        btn_card_reader = new javax.swing.JButton();
        btn_pay_credit_card = new javax.swing.JButton();
        order_credit_card_Label = new javax.swing.JLabel();
        price_credit_card_Label = new javax.swing.JLabel();
        payment_credit_card_Field = new javax.swing.JTextField();
        btn_cash = new javax.swing.JButton();
        btn_credit_card = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cash_Panel.setBackground(new java.awt.Color(255, 255, 255));
        cash_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cash_Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        title_cash.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        title_cash.setText("CASH");

        order_cash.setText("주문내용:");

        price_cash.setText("가격:");

        payment_cash.setText("지불금액:");

        btn_50000.setText("50000");
        btn_50000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_50000MouseClicked(evt);
            }
        });
        btn_50000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_50000ActionPerformed(evt);
            }
        });

        btn_10000.setText("10000");
        btn_10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10000ActionPerformed(evt);
            }
        });

        btn_5000.setText("5000");
        btn_5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5000ActionPerformed(evt);
            }
        });

        btn_1000.setText("1000");
        btn_1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1000ActionPerformed(evt);
            }
        });

        btn_500.setText("500");
        btn_500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_500ActionPerformed(evt);
            }
        });

        btn_100.setText("100");
        btn_100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_100ActionPerformed(evt);
            }
        });

        btn_pay_cash.setText("결제");
        btn_pay_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_cashActionPerformed(evt);
            }
        });

        order_cash_Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        order_cash_Label.setText(orderString);

        price_cash_Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        price_cash_Label.setText(Integer.toString(priceNum));

        payment_cash_Field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout cash_PanelLayout = new javax.swing.GroupLayout(cash_Panel);
        cash_Panel.setLayout(cash_PanelLayout);
        cash_PanelLayout.setHorizontalGroup(
            cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cash_PanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cash_PanelLayout.createSequentialGroup()
                            .addComponent(order_cash)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(order_cash_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cash_PanelLayout.createSequentialGroup()
                            .addComponent(price_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(price_cash_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cash_PanelLayout.createSequentialGroup()
                        .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cash_PanelLayout.createSequentialGroup()
                                .addComponent(payment_cash)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payment_cash_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_pay_cash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(cash_PanelLayout.createSequentialGroup()
                                .addComponent(btn_50000, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_10000, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_5000, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_1000, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_500, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_100, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        cash_PanelLayout.setVerticalGroup(
            cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cash_PanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(title_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(order_cash)
                    .addComponent(order_cash_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price_cash)
                    .addComponent(price_cash_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment_cash)
                    .addComponent(btn_pay_cash)
                    .addComponent(payment_cash_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cash_PanelLayout.createSequentialGroup()
                        .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_5000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_10000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addGroup(cash_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_50000, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_1000, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_500, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_100, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        credit_card_Panel.setBackground(new java.awt.Color(255, 255, 255));
        credit_card_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        title_credit_card.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        title_credit_card.setText("CREDIT CARD");

        payment_credit_card.setText("지불금액:");

        price_credit_card.setText("가격:");

        order_credit_card.setText("주문내용:");

        btn_card_reader.setText("Credit_Crad_Reader");
        btn_card_reader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_card_readerActionPerformed(evt);
            }
        });

        btn_pay_credit_card.setText("결제");
        btn_pay_credit_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_credit_cardActionPerformed(evt);
            }
        });

        order_credit_card_Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        order_credit_card_Label.setText(orderString);

        price_credit_card_Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        price_credit_card_Label.setText(Integer.toString(priceNum));

        payment_credit_card_Field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout credit_card_PanelLayout = new javax.swing.GroupLayout(credit_card_Panel);
        credit_card_Panel.setLayout(credit_card_PanelLayout);
        credit_card_PanelLayout.setHorizontalGroup(
            credit_card_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credit_card_PanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(credit_card_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(credit_card_PanelLayout.createSequentialGroup()
                        .addGroup(credit_card_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(order_credit_card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payment_credit_card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(price_credit_card, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(credit_card_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(price_credit_card_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(order_credit_card_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payment_credit_card_Field))
                        .addGap(18, 18, 18)
                        .addComponent(btn_pay_credit_card, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(title_credit_card))
                .addGap(262, 262, 262))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credit_card_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_card_reader, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );
        credit_card_PanelLayout.setVerticalGroup(
            credit_card_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credit_card_PanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(title_credit_card)
                .addGap(18, 18, 18)
                .addGroup(credit_card_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(order_credit_card)
                    .addComponent(order_credit_card_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(credit_card_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price_credit_card, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_credit_card_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(credit_card_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment_credit_card)
                    .addComponent(btn_pay_credit_card)
                    .addComponent(payment_credit_card_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btn_card_reader, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jLayeredPane_Payment.setLayer(cash_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_Payment.setLayer(credit_card_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane_PaymentLayout = new javax.swing.GroupLayout(jLayeredPane_Payment);
        jLayeredPane_Payment.setLayout(jLayeredPane_PaymentLayout);
        jLayeredPane_PaymentLayout.setHorizontalGroup(
            jLayeredPane_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
            .addGroup(jLayeredPane_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cash_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(credit_card_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane_PaymentLayout.setVerticalGroup(
            jLayeredPane_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jLayeredPane_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cash_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane_PaymentLayout.createSequentialGroup()
                    .addComponent(credit_card_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btn_cash.setText("Cash");
        btn_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cashActionPerformed(evt);
            }
        });

        btn_credit_card.setText("Credit Card");
        btn_credit_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_credit_cardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(btn_cash)
                .addGap(138, 138, 138)
                .addComponent(btn_credit_card)
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane_Payment)
                    .addContainerGap()))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cash)
                    .addComponent(btn_credit_card))
                .addGap(27, 27, 27))
            .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cashActionPerformed
        switchPanels(cash_Panel); // cash 버튼을 누르면 cash 패널로 전환 ( 기본적으로 cash 패널이 보여짐 )
    }//GEN-LAST:event_btn_cashActionPerformed

    private void btn_credit_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_credit_cardActionPerformed
        switchPanels(credit_card_Panel); // credit_card 버튼을 누르면 credit_card 패널로 전환 
    }//GEN-LAST:event_btn_credit_cardActionPerformed

    private void btn_100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_100ActionPerformed
        paymentNum += 100;  
        payment_cash_Field.setText(""+paymentNum);
    }//GEN-LAST:event_btn_100ActionPerformed

    private void btn_50000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_50000ActionPerformed
        paymentNum += 50000;  
        payment_cash_Field.setText(""+paymentNum);
    }//GEN-LAST:event_btn_50000ActionPerformed

    private void btn_pay_credit_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_credit_cardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pay_credit_cardActionPerformed

    private void btn_pay_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pay_cashActionPerformed

    private void btn_50000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_50000MouseClicked
        
    }//GEN-LAST:event_btn_50000MouseClicked

    private void btn_10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10000ActionPerformed
        paymentNum += 10000;  
        payment_cash_Field.setText(""+paymentNum);
    }//GEN-LAST:event_btn_10000ActionPerformed

    private void btn_5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5000ActionPerformed
        paymentNum += 5000;  
        payment_cash_Field.setText(""+paymentNum);
    }//GEN-LAST:event_btn_5000ActionPerformed

    private void btn_1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1000ActionPerformed
        paymentNum += 1000;  
        payment_cash_Field.setText(""+paymentNum);
    }//GEN-LAST:event_btn_1000ActionPerformed

    private void btn_500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_500ActionPerformed
        paymentNum += 500;  
        payment_cash_Field.setText(""+paymentNum);
    }//GEN-LAST:event_btn_500ActionPerformed

    private void btn_card_readerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_card_readerActionPerformed
        paymentNum = priceNum;
        payment_credit_card_Field.setText(""+paymentNum);
    }//GEN-LAST:event_btn_card_readerActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(PaymentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PaymentJFrame f = new PaymentJFrame();
                f.setVisible(true);
                f.setResizable(false); // 사이즈 고정  
            }
        });
        
        Payment cash = new Cash();
        Payment card = new Card();
        
        cash.setPaymentStrategy(new CashStrategy());
        card.setPaymentStrategy(new CardStrategy());
        
        cash.pay();
        card.pay();
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_100;
    private javax.swing.JButton btn_1000;
    private javax.swing.JButton btn_10000;
    private javax.swing.JButton btn_500;
    private javax.swing.JButton btn_5000;
    private javax.swing.JButton btn_50000;
    private javax.swing.JButton btn_card_reader;
    private javax.swing.JButton btn_cash;
    private javax.swing.JButton btn_credit_card;
    private javax.swing.JButton btn_pay_cash;
    private javax.swing.JButton btn_pay_credit_card;
    private javax.swing.JPanel cash_Panel;
    private javax.swing.JPanel contentPane;
    private javax.swing.JPanel credit_card_Panel;
    private javax.swing.JLayeredPane jLayeredPane_Payment;
    private javax.swing.JLabel order_cash;
    private javax.swing.JLabel order_cash_Label;
    private javax.swing.JLabel order_credit_card;
    private javax.swing.JLabel order_credit_card_Label;
    private javax.swing.JLabel payment_cash;
    private javax.swing.JTextField payment_cash_Field;
    private javax.swing.JLabel payment_credit_card;
    private javax.swing.JTextField payment_credit_card_Field;
    private javax.swing.JLabel price_cash;
    private javax.swing.JLabel price_cash_Label;
    private javax.swing.JLabel price_credit_card;
    private javax.swing.JLabel price_credit_card_Label;
    private javax.swing.JLabel title_cash;
    private javax.swing.JLabel title_credit_card;
    // End of variables declaration//GEN-END:variables
}
