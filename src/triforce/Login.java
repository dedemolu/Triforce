/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triforce;

;

/**
 *
 * @author angelo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        lbl_User = new javax.swing.JLabel();
        lbl_Senha = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        psd_Senha = new javax.swing.JPasswordField();
        lbl_Titulo = new javax.swing.JLabel();
        btn_Entrar = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_User.setText("Usuário:");

        lbl_Senha.setText("Senha:");

        txt_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserActionPerformed(evt);
            }
        });

        psd_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psd_SenhaActionPerformed(evt);
            }
        });

        lbl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_Titulo.setText("Triforce");

        btn_Entrar.setText("Entrar");
        btn_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EntrarMouseClicked(evt);
            }
        });

        btn_Sair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_User)
                            .addComponent(lbl_Senha))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Entrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Sair))
                            .addComponent(txt_User)
                            .addComponent(psd_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lbl_Titulo)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_User)
                    .addComponent(txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Senha)
                    .addComponent(psd_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Sair)
                    .addComponent(btn_Entrar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserActionPerformed

    private void psd_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psd_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psd_SenhaActionPerformed

    private void btn_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EntrarMouseClicked
        Principal p = new Principal();
        p.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btn_EntrarMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JPasswordField psd_Senha;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
