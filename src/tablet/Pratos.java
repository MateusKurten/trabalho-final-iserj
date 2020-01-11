/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablet;

/**
 *
 * @author aluno
 */
public class Pratos extends javax.swing.JFrame {

    /**
     * Creates new form Pratos
     */
    public Pratos() {
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

        prato4 = new javax.swing.JLabel();
        prato3 = new javax.swing.JLabel();
        prato1 = new javax.swing.JLabel();
        prato2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESCOLHA SEU PRATO");
        setPreferredSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        prato4.setBackground(new java.awt.Color(255, 0, 0));
        prato4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/hamburguerMenu.jpg"))); // NOI18N
        prato4.setToolTipText("<html>MESTRE DOS MAGOS - HAMBÚRGUER DA CASA: Não saia sem experimentar a receita especial da casa.<br> Saborei o FANTÁSTICO Mestre dos Magos, com nosso molho especial secreto.</html>");
        prato4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prato4.setOpaque(true);
        getContentPane().add(prato4);
        prato4.setBounds(540, 390, 325, 257);

        prato3.setBackground(new java.awt.Color(0, 204, 255));
        prato3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Pizza.jpg"))); // NOI18N
        prato3.setToolTipText("<html>PIZZA DO CHEFE: Pizzas de diversos sabores, com opções de bordas recheadas<br>\ne de tamanhos diversos. Monte sua própria pizza ou experimente a especial do chefe!</html>");
        prato3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prato3.setOpaque(true);
        getContentPane().add(prato3);
        prato3.setBounds(150, 390, 325, 257);

        prato1.setBackground(new java.awt.Color(0, 204, 255));
        prato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Batata-Frita.jpg"))); // NOI18N
        prato1.setToolTipText("<html>BATATA FRITA DA CASA:\n\nBatata frita com opções de queijo, bacon, orégano, linguiça, <br>\nentre outros acompanhamentos.\n</html>");
        prato1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prato1.setOpaque(true);
        getContentPane().add(prato1);
        prato1.setBounds(150, 110, 325, 257);

        prato2.setBackground(new java.awt.Color(255, 0, 0));
        prato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/ComidaJaponesa.jpg"))); // NOI18N
        prato2.setToolTipText("<html>COMIDA JAPONESA: Sushis, sashimis, rolinho primavera, uramakis, <br>\nmakimonos, arroz doce, curry, yakisoba entre outros.</html>");
        prato2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prato2.setOpaque(true);
        getContentPane().add(prato2);
        prato2.setBounds(540, 110, 325, 257);

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 220, 60, 270);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESCOLHA SEU PRATO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 40, 330, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel prato1;
    private javax.swing.JLabel prato2;
    private javax.swing.JLabel prato3;
    private javax.swing.JLabel prato4;
    // End of variables declaration//GEN-END:variables
}
