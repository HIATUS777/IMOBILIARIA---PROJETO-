
package projeto.view;

import javax.swing.JOptionPane;
import projeto.model.Produto;

public class ExibirCondominio extends javax.swing.JFrame {

    public ExibirCondominio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantb = new javax.swing.JComboBox<>();
        quants = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        quantq = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        JTFVOLTARR = new javax.swing.JButton();
        JTFPRECOS = new javax.swing.JButton();
        JTFFINALIZAR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        JTFALTC = new javax.swing.JButton();
        JTFTOTAL = new javax.swing.JButton();
        JTFCOMPRAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pretensao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        painel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/Condomínio.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Quartos:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/ilgner (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Suítes:");

        quantb.setBackground(new java.awt.Color(0, 0, 0));
        quantb.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        quantb.setForeground(new java.awt.Color(102, 102, 102));
        quantb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        quantb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantbActionPerformed(evt);
            }
        });

        quants.setBackground(new java.awt.Color(0, 0, 0));
        quants.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        quants.setForeground(new java.awt.Color(102, 102, 102));
        quants.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        quants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Banheiros:");

        quantq.setBackground(new java.awt.Color(0, 0, 0));
        quantq.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        quantq.setForeground(new java.awt.Color(102, 102, 102));
        quantq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        quantq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantqActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Estado:");

        estado.setBackground(new java.awt.Color(1, 1, 1));
        estado.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 102, 102));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CE", "RJ", "MG", "PA", "SC", "RN", "BA", "SP", "PE", "ES" }));

        JTFVOLTARR.setBackground(new java.awt.Color(1, 1, 1));
        JTFVOLTARR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFVOLTARR.setForeground(new java.awt.Color(254, 254, 254));
        JTFVOLTARR.setText("x");
        JTFVOLTARR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFVOLTARRActionPerformed(evt);
            }
        });

        JTFPRECOS.setBackground(new java.awt.Color(1, 1, 1));
        JTFPRECOS.setFont(new java.awt.Font("Noto Serif", 2, 24)); // NOI18N
        JTFPRECOS.setForeground(new java.awt.Color(254, 254, 254));
        JTFPRECOS.setText("CONFERIR PREÇOS");
        JTFPRECOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPRECOSActionPerformed(evt);
            }
        });

        JTFFINALIZAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFFINALIZAR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFFINALIZAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFFINALIZAR.setText("FINALIZAR");
        JTFFINALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFINALIZARActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("VALOR TOTAL");

        total.setEditable(false);
        total.setBackground(new java.awt.Color(1, 1, 1));
        total.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(254, 254, 254));

        JTFALTC.setBackground(new java.awt.Color(1, 1, 1));
        JTFALTC.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFALTC.setForeground(new java.awt.Color(254, 254, 254));
        JTFALTC.setText("ALTERAR COMPRA");
        JTFALTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFALTCActionPerformed(evt);
            }
        });

        JTFTOTAL.setBackground(new java.awt.Color(1, 1, 1));
        JTFTOTAL.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFTOTAL.setForeground(new java.awt.Color(254, 254, 254));
        JTFTOTAL.setText("VER TOTAL");
        JTFTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTOTALActionPerformed(evt);
            }
        });

        JTFCOMPRAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFCOMPRAR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFCOMPRAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFCOMPRAR.setText("COMPRAR");
        JTFCOMPRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCOMPRARActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Pretensão:");

        pretensao.setBackground(new java.awt.Color(1, 1, 1));
        pretensao.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        pretensao.setForeground(new java.awt.Color(254, 254, 254));
        pretensao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Comprar", "Alugar" }));
        pretensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretensaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(quantb, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8))
                                        .addGap(24, 24, 24)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pretensao, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantq, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quants, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFVOLTARR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(total)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addComponent(JTFPRECOS)
                                .addGap(71, 71, 71))))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTFALTC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFCOMPRAR)
                        .addGap(18, 18, 18)
                        .addComponent(JTFTOTAL)
                        .addGap(17, 17, 17)
                        .addComponent(JTFFINALIZAR)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pretensao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(quantq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(quants, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(JTFVOLTARR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(JTFPRECOS))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(quantb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFTOTAL)
                            .addComponent(JTFFINALIZAR)
                            .addComponent(JTFCOMPRAR)
                            .addComponent(JTFALTC))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(painel);
        painel.setBounds(0, 0, 779, 622);

        setBounds(0, 0, 795, 661);
    }// </editor-fold>//GEN-END:initComponents

    private void quantbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantbActionPerformed

    private void quantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantsActionPerformed

    private void quantqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantqActionPerformed

    private void JTFVOLTARRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFVOLTARRActionPerformed
        TelaCompra tlc = new TelaCompra();
        tlc.setVisible(true);
        dispose();
    }//GEN-LAST:event_JTFVOLTARRActionPerformed

    private void JTFPRECOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPRECOSActionPerformed
        if(evt.getSource() == JTFPRECOS){
            JOptionPane.showMessageDialog(null, "COMPRAR"+

"\nDuplex:R$ 100 000"+

"\nCondominio:R$ 500 000"+

"\nMansão:R$ 1000.0000 - um milhão"+

"\nCobertura:R$ 200 000"+

"\nKitnet:R$ 50 000"+

"\nPredio:R$ 250 000"+

"\nApartamento:R$ 120 000"+
"\n"+
"\nALUGAR"+

"\nDuplex:R$ 1000"+

"\nCondominio:R$ 5000"+

"\nMansão:R$ 10000"+

"\nCobertura:R$ 2000"+

"\nKitnet:R$ 500"+

"\nPredio:R$ 2500"+

"\nApartamento:R$ 400"



);
        }
    }//GEN-LAST:event_JTFPRECOSActionPerformed

    private void JTFFINALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFINALIZARActionPerformed

        
        JOptionPane.showMessageDialog(null,"Obrigado por compra na Imobiliaria Igner!");
         JOptionPane.showMessageDialog(null,"QUALQUER IMPREVISTO NOS CONTATE:"+"\n 99345-5455");
     int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe-nos sua nota para o nosso aplicativo (1 Á 10)"));
      JOptionPane.showMessageDialog(null,"SUA NOTA FOI: "+nota+"\n OBRIGADO POR COMPRA NA NOSSA IMOBILIARIA AONDE O SEU SONHO E CONSTRUIDO!");
      System.exit(0);
    }//GEN-LAST:event_JTFFINALIZARActionPerformed

    private void JTFALTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFALTCActionPerformed
        quantq.setEnabled(true);
        quants.setEnabled(true);
        quantb.setEnabled(true);
        estado.setEnabled(true);
        pretensao.setEnabled(true);
        JTFFINALIZAR.setEnabled(true);
    }//GEN-LAST:event_JTFALTCActionPerformed

    private void JTFTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTOTALActionPerformed
  if(quantb.getSelectedItem().equals(0)|| quants.getSelectedItem().equals(0)||quantq.getSelectedItem().equals(0)||pretensao.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null,"INFORME OS VALORES");
        }
  else if(pretensao.getSelectedItem().equals("Comprar")){
       Produto pf = new Produto();
       pf.setEstado("Condominio");
       pf.setQuant_q((Integer.parseInt((String)quantq.getSelectedItem())));
       pf.setQuant_b((Integer.parseInt((String)quantb.getSelectedItem())));
        pf.setQuant_s(Integer.parseInt((String)quants.getSelectedItem()));
     pf.CalcTotal();
     total.setText(""+pf.getTotal());
  }
  else if(pretensao.getSelectedItem().equals("Alugar")){
       Produto pf = new Produto();
       pf.setEstado("Condominio");
       pf.setQuant_q((Integer.parseInt((String)quantq.getSelectedItem())));
       pf.setQuant_b((Integer.parseInt((String)quantb.getSelectedItem())));
        pf.setQuant_s(Integer.parseInt((String)quants.getSelectedItem()));
     pf.CalcAlugar();
     total.setText(""+pf.getTotal());
  }

    }//GEN-LAST:event_JTFTOTALActionPerformed

    private void JTFCOMPRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCOMPRARActionPerformed
        if(evt.getSource() == JTFCOMPRAR){
            JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!"
                + "\nObrigado por fazer negócio conosco, a Ilgner Imobiliária agradece!"
                + "\nEm caso de dúvida ligue para (85)98745-8972"
                + "\nOu acesse nosso site ilgnerimobiliaria@gmail.com");
        pretensao.setEnabled(false);
        quantq.setEnabled(false);
        quants.setEnabled(false);
        quantb.setEnabled(false);
        estado.setEnabled(false);
        JTFFINALIZAR.setEnabled(true);
        }
    }//GEN-LAST:event_JTFCOMPRARActionPerformed

    private void pretensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretensaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pretensaoActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirCondominio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JTFALTC;
    private javax.swing.JButton JTFCOMPRAR;
    private javax.swing.JButton JTFFINALIZAR;
    private javax.swing.JButton JTFPRECOS;
    private javax.swing.JButton JTFTOTAL;
    private javax.swing.JButton JTFVOLTARR;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel painel;
    private javax.swing.JComboBox<String> pretensao;
    private javax.swing.JComboBox<String> quantb;
    private javax.swing.JComboBox<String> quantq;
    private javax.swing.JComboBox<String> quants;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
