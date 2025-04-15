
package views;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AgregarAnimalesView extends javax.swing.JFrame {

   
    public AgregarAnimalesView() {
        initComponents();
        setEspeciesCmb();
        
        setSectoresCmb();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);


    }

  public final void setEspeciesCmb(){
      ArrayList<EspecieViewModel> especies = Controlador.getEspeciesCmb();
      for(EspecieViewModel especie: especies){
          especieCmb.addItem(especie);
      }
      
  }
 
    public final void setSectoresCmb(){
      ArrayList<SectorViewModel> sectores = Controlador.getSectoresCmb();
      for(SectorViewModel sector: sectores){
          sectorCmb.addItem(sector);
      }  
  }
   
     public void limitarEspecie() {
        ArrayList<SectorViewModel> sectores = Controlador.getSectoresCmb();
        EspecieViewModel especieSelec = (EspecieViewModel) especieCmb.getSelectedItem();
        if(especieSelec.getTipoAlimentacion().esCarnivoro()){
           sectorCmb.removeAllItems();
           valorHerbivorTxtField.setEnabled(false);
           valorHerbivorTxtField.setText("0");
            for (SectorViewModel sector : sectores) {
                if(sector.getTipoAlimentacion().esCarnivoro()){
                    sectorCmb.addItem(sector);
                }
            }
        }else{
            sectorCmb.removeAllItems();
            valorHerbivorTxtField.setEnabled(true);
            for (SectorViewModel sector : sectores) {
                if(sector.getTipoAlimentacion().esHerbivoro()){
                    sectorCmb.addItem(sector);
                }
        }
    }
    
    }
     
     
     public final void crearMamifero() throws InvalidPropertiesFormatException{
         EspecieViewModel especieSelec = (EspecieViewModel) especieCmb.getSelectedItem();
         int edadSelec = Integer.parseInt(edadTxtField.getText());
         
         double pesoSelec = Double.parseDouble(pesoTxtField.getText());
         SectorViewModel sectorSelec = (SectorViewModel) sectorCmb.getSelectedItem();
         
         
         if(especieSelec.getTipoAlimentacion().esCarnivoro()){
             Controlador.crearCarnivoro(especieSelec,edadSelec,pesoSelec,sectorSelec);
         }else{
             double valorHerbivoroSelec = Double.parseDouble(valorHerbivorTxtField.getSelectedText());
            Controlador.crearHerbivoro(especieSelec,edadSelec,pesoSelec,sectorSelec,valorHerbivoroSelec);
            
         }
          JOptionPane.showMessageDialog(null, "Mamifero creado con exito");
         
       
     }

    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesoTxt1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        paisCmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sectorCmb = new javax.swing.JComboBox<>();
        confirmarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        edadTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pesoTxtField = new javax.swing.JTextField();
        valorHerbivorTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        especieCmb = new javax.swing.JComboBox<>();

        pesoTxt1.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 51));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Agregar Animal");

        jLabel2.setText("Especie");

        jLabel3.setText("Edad");

        confirmarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmarBtn.setText("Confirmar");
        confirmarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Sector");

        jLabel6.setText("Valor Herbivoro");

        valorHerbivorTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorHerbivorTxtFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Peso");

        jLabel4.setText("Pais");

        especieCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieCmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(valorHerbivorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sectorCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pesoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paisCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(especieCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edadTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(confirmarBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(especieCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edadTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sectorCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valorHerbivorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorHerbivorTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorHerbivorTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorHerbivorTxtFieldActionPerformed

    private void especieCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieCmbActionPerformed
        limitarEspecie();
    }//GEN-LAST:event_especieCmbActionPerformed

    private void confirmarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBtnActionPerformed
        try {
            crearMamifero();
        } catch (InvalidPropertiesFormatException ex) {
            Logger.getLogger(AgregarAnimalesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAnimalesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBtn;
    private javax.swing.JTextField edadTxtField;
    private javax.swing.JComboBox<Object> especieCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<Object> paisCmb;
    private javax.swing.JLabel pesoTxt1;
    private javax.swing.JTextField pesoTxtField;
    private javax.swing.JComboBox<Object> sectorCmb;
    private javax.swing.JTextField valorHerbivorTxtField;
    // End of variables declaration//GEN-END:variables
}
