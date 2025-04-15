package views;

public class MenuPrincipalView extends javax.swing.JFrame {

    public MenuPrincipalView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 625));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(1000, 625));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 625));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 1000));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zoologico");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 30, 490, 120);

        jButton2.setText("Ver animales");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 200, 390, 60);

        jButton1.setText("Ingresar un animal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 300, 390, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\Desktop\\3ro\\desarrollo de software\\Ejericios\\Ejercicio-3\\dsw2025ej1\\images\\ingresar_animal.jpg")); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1200, 1000));
        jLabel3.setMinimumSize(new java.awt.Dimension(1200, 1000));
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 1000));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1120, 590);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 584);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IngresarAnimalView view = new IngresarAnimalView();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        //     view.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ListarAnimalesView view = new ListarAnimalesView();
               

        view.setVisible(true);
        
        view.setLocationRelativeTo(null);
        this.dispose();

        //    view.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
