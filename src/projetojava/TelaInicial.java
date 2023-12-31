/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojava;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author João
 */
public class TelaInicial extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        txtSaldo.setText("100 R$");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtRecebeUsuario = new javax.swing.JTextField();
        txtNumeroConta = new javax.swing.JTextField();
        txtRecebeTipoConta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btnEncerrar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtRecebeUsuario.setEditable(false);

        txtNumeroConta.setEditable(false);

        txtRecebeTipoConta.setEditable(false);

        jLabel1.setText("Usuario:");

        jLabel2.setText("ID da conta:");

        jLabel3.setText("Tipo de conta:");

        jLabel4.setText("Saldo atual:");

        txtSaldo.setEditable(false);

        btnEncerrar.setText("Encerrar");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        btnHistorico.setText("<html>Historico da conta</html>");
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRecebeTipoConta)
                            .addComponent(txtRecebeUsuario)
                            .addComponent(txtNumeroConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecebeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecebeTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnDepositar)
                .addGap(11, 11, 11)
                .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEncerrar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
       dispose();
       JOptionPane.showMessageDialog(null, "Encerrado!");
    }//GEN-LAST:event_btnEncerrarActionPerformed
    //Declarei essa variavel para manipular melhor os valores e para não precisar ficar pegando o valor da caixa de texto
    double conta=100;
    String historico="";
    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
       try{
            String s;
            s =  javax.swing.JOptionPane.showInputDialog("Qual o valor do saque ?");
            //Aqui peguei "s" que é uma String,e converti para double
            double saque=Double.parseDouble(s);
            if(saque<=conta && saque > 0){
             double saldoatual = conta - saque;
            txtSaldo.setText(Double.toString(saldoatual));
            //Aqui estou atribuindo o valor do resultado para a conta
            conta=saldoatual;
            //Aqui vou pegar a data do dia atual e exibir junto do historico
            Date data= new Date();
            SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formatada.format(data);
            historico += "\nSaque de "+saque+"R$ feito com sucesso em  "+dataFormatada;
            JOptionPane.showMessageDialog(null, "Saque de "+saque+"R$ feito com sucesso!");
            }
            else if(saque <= 0){
            JOptionPane.showMessageDialog(null, "Valor invalido!");
            }
            else{
            JOptionPane.showMessageDialog(null, "Você não tem dinheiro suficiente na sua conta para esse saque");
            }      
       }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um numero!");
       }
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        try{
            String d;
            d =  javax.swing.JOptionPane.showInputDialog("Qual o valor do deposito ?");
            //Aqui peguei "d" que é uma String,e converti para double
            double deposito = Double.parseDouble(d);
            if(deposito > 0){
            double saldoatual = deposito+conta;
            txtSaldo.setText(Double.toString(saldoatual));
            //Aqui estou atribuindo o valor do resultado para a conta
            conta = saldoatual;
            //Aqui vou pegar a data do dia atual e exibir junto do historico
            Date data= new Date();
            SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formatada.format(data);
            historico += "\nDesposito de "+deposito+"R$ feito com sucesso em "+dataFormatada;
            JOptionPane.showMessageDialog(null, "Desposito de "+deposito+"R$ feito com sucesso!");
            
            }
            else{
            JOptionPane.showMessageDialog(null, "Valor invalido!");

            }
        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Digite um numero!");
        }

    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        if(!historico.equals("")){
            JOptionPane.showMessageDialog(null, "--------------------------------Historico-------------------------------------"+historico);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não tem nada no historico");
        }
    }//GEN-LAST:event_btnHistoricoActionPerformed
    //metodos que foi utilizado para passar as informações
    public void contaUsuario(String usuario){
        txtRecebeUsuario.setText(usuario);
    }
    public void contaTipo(String tipoConta){
        txtRecebeTipoConta.setText(tipoConta);
    }
    public void contaID(String n){
         txtNumeroConta.setText(n);
     }
 

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtNumeroConta;
    private javax.swing.JTextField txtRecebeTipoConta;
    private javax.swing.JTextField txtRecebeUsuario;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
