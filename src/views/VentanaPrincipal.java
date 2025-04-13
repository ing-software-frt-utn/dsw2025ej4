package views;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnListar = new javax.swing.JToggleButton();
        btnAgregar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 102));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("MENÚ PRINCIPAL");

        btnListar.setText("LISTAR ANIMALES");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR ANIMALES");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarAnimal alta = new AgregarAnimal();
        alta.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        ListarAnimalesView lista = new ListarAnimalesView();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnListar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
