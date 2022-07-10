
package projeto.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class JfLogin extends javax.swing.JFrame {

    public JfLogin() {
        initComponents();
      
      Date dt = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
    data.setText(formato.format(dt));
    
    Timer timer = new Timer(1000,new hora());
    timer.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFSUSUARIO = new javax.swing.JTextField();
        JTFSENHA = new javax.swing.JPasswordField();
        JTFENTRAR = new javax.swing.JButton();
        JTFSAIR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 1, 1));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Noto Serif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Usuário:");

        jLabel3.setFont(new java.awt.Font("Noto Serif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Senha:");

        JTFSUSUARIO.setBackground(new java.awt.Color(1, 1, 1));
        JTFSUSUARIO.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        JTFSUSUARIO.setForeground(new java.awt.Color(254, 254, 254));

        JTFSENHA.setBackground(new java.awt.Color(1, 1, 1));
        JTFSENHA.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        JTFSENHA.setForeground(new java.awt.Color(254, 254, 254));

        JTFENTRAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFENTRAR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFENTRAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFENTRAR.setText("Entrar");
        JTFENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFENTRARActionPerformed(evt);
            }
        });

        JTFSAIR.setBackground(new java.awt.Color(1, 1, 1));
        JTFSAIR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFSAIR.setForeground(new java.awt.Color(254, 254, 254));
        JTFSAIR.setText("Sair");
        JTFSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFSAIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFSUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFENTRAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFSAIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFENTRAR)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFSUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTFSAIR)))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 350, 650, 190);

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));
        jPanel1.setLayout(null);

        hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(hora);
        hora.setBounds(490, 0, 90, 30);

        data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(data);
        data.setBounds(490, 30, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/fundologin.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(51, 0, 500, 350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 350);

        setBounds(0, 0, 592, 571);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFSAIRActionPerformed
      System.exit(0);
      
    }//GEN-LAST:event_JTFSAIRActionPerformed

    private void JTFENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFENTRARActionPerformed
       String usuario = JTFSUSUARIO.getText();
       String senha = new String (JTFSENHA.getPassword());
       if (senha.equals("") || usuario.equals("")){
           JOptionPane.showMessageDialog(null, "Preencha os campos abaixo"  );
           
           
       }else{
           if (usuario.equals("Lourenço" ) &&  senha.equals("598114")){
               CadastroCliente cadcli = new CadastroCliente();
               cadcli.setVisible(true);
               dispose();
           } else {
               JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
           }
       }
       JTFSUSUARIO.setText("");
       JTFSENHA.setText("");
    }//GEN-LAST:event_JTFENTRARActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JTFENTRAR;
    private javax.swing.JButton JTFSAIR;
    private javax.swing.JPasswordField JTFSENHA;
    private javax.swing.JTextField JTFSUSUARIO;
    private javax.swing.JLabel data;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        Calendar car = Calendar.getInstance();
        hora.setText(String.format("%1$tH:%1$tM",car));
        }
        
    }

}
