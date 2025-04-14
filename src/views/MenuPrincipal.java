package views;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() 
    {
        initComponents();
        setTitle("Menu Principal");
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelmenuPrincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AgregarButton = new javax.swing.JToggleButton();
        ListarButton = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SalirButton = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelmenuPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        labelmenuPrincipal.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        labelmenuPrincipal.setForeground(new java.awt.Color(255, 255, 0));
        labelmenuPrincipal.setText("MENÚ PRINCIPAL");
        jPanel1.add(labelmenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 110));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setForeground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarButton.setBackground(new java.awt.Color(0, 51, 102));
        AgregarButton.setForeground(new java.awt.Color(255, 255, 0));
        AgregarButton.setText("AGREGAR ANIMALES");
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 184, 49));

        ListarButton.setBackground(new java.awt.Color(0, 51, 102));
        ListarButton.setForeground(new java.awt.Color(255, 255, 0));
        ListarButton.setText("LISTAR ANIMALES");
        ListarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ListarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 180, 49));

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText(">");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 20, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("---seleccione una opcion---");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 170, -1));

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText(">");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 20, -1));

        SalirButton.setBackground(new java.awt.Color(0, 51, 102));
        SalirButton.setForeground(new java.awt.Color(255, 255, 0));
        SalirButton.setText("SALIR");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SalirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, 49));

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText(">");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 20, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed
        dispose();
        AgregarAnimal alta = new AgregarAnimal();
        alta.setVisible(true);
    }//GEN-LAST:event_AgregarButtonActionPerformed

    private void ListarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarButtonActionPerformed
        dispose();
        ListarAnimalesView lista = new ListarAnimalesView();
        lista.setVisible(true);
    }//GEN-LAST:event_ListarButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        dispose();
    }//GEN-LAST:event_SalirButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AgregarButton;
    private javax.swing.JToggleButton ListarButton;
    private javax.swing.JToggleButton SalirButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelmenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
