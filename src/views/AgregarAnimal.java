/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package views;

/**
 *
 * @author victor
 */
import data.Persistencia;
import domain.Carnivoro;
import domain.Especie;
import domain.Herbivoro;
import domain.Mamifero;
import domain.Pais;
import domain.Sector;
import domain.TipoAlimentacion;
import static java.awt.Color.DARK_GRAY;
import static java.awt.Color.GRAY;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static sun.jvm.hotspot.HelloWorld.e;


public class AgregarAnimal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMain
     */
    public AgregarAnimal() {
        initComponents();
    }
        public void limpiarCampos()
    {
        CampoEdad.setText("");
        CampoPeso.setText("");

    }
          public void bloquearComidaFija()
    {
        String especieSeleccionada = especieCbx.getSelectedItem().toString();
        
        for(Especie e : Controlador.getEspecies())
        {
            if(especieSeleccionada.equals(e.getNombre()))
            {
                if(e.getTipoAlimentacion().esCarnivoro())
                {
                    CampoComidaFija.setEnabled(false);
                    labelComida.setForeground(GRAY);
                }
                else{CampoComidaFija.setEnabled(true); labelComida.setForeground(DARK_GRAY);}
            }
        }
    }
          private void cargarSectores() {
    ArrayList<Especie> especies =Controlador.getEspecies();
    ArrayList<Sector> sectores =Controlador.getSectores();
    ArrayList<Pais> paises =Controlador.getPaises();
     sectorCbx.removeAllItems();
     paisCbx.removeAllItems();
     
    
 for(Pais pais : paises){
     paisCbx.addItem(pais.getNombre());
 }
    
    String especieSeleccionada = especieCbx.getSelectedItem().toString();
    boolean espacio=false;
    
     for (Especie e : especies) 
     {
        if(especieSeleccionada.equals(e.getNombre())){
         
            for(Sector s : sectores){
            if(e.getTipoAlimentacion().equals(s.getTipoAlimentacion())){
                
                if(s.getLimite()>=1){ 
              sectorCbx.addItem(s.toString()); 
              espacio=true;
                } 
            }
            }
        }
     
     }
     if (!espacio && !especieCbx.getSelectedItem().toString().equals("--Seleccione Especie --")) {
    JOptionPane.showMessageDialog(this, "Error: todos los sectores están ocupados");
    dispose();
    }
    }
        
    private void guardarAnimal() {
        try {
            ArrayList<Especie> especies =Controlador.getEspecies();
            ArrayList<Sector> sectores =Controlador.getSectores();
             ArrayList<Pais> paises =Controlador.getPaises();
            int edad = Integer.parseInt(CampoEdad.getText());
            double peso = Double.parseDouble(CampoPeso.getText());
            
            String sectorSeleccionado = sectorCbx.getSelectedItem().toString();
            String especieSeleccionada = especieCbx.getSelectedItem().toString();
            String paisSeleccionado = paisCbx.getSelectedItem().toString();
            
            Mamifero nuevo;
            Sector sector = null;
            Pais pais =null;
     
     
            if (sectorSeleccionado.equals("--Seleccione Especie--")) 
            {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione una especie válida.");
                return;
            }
    
            for (Sector s : sectores) 
            {
      
                if(sectorSeleccionado.equals(s.toString()))
                {
                    sector=s;
                    s.reducirLimite();
                    break;
                }
     
            }
      
            for (Pais p : paises) 
            {
                if(paisSeleccionado.equals(p.getNombre()))
                {
                    pais=p;
                }
            }
        
            for (Especie e : especies) 
            {
                if(especieSeleccionada.equals(e.getNombre()))
                {
                    if(e.getTipoAlimentacion()== TipoAlimentacion.HERBIVORO)
                    { 
                        double comidaFija = Double.parseDouble(CampoComidaFija.getText());
                         nuevo = new Herbivoro(edad, peso,e, sector, comidaFija, pais);
                    } else 
                        {
                            nuevo = new Carnivoro(edad, peso, e, sector, pais);
                        }
            Controlador.agregarAnimal(nuevo);
            JOptionPane.showMessageDialog(this, "Animal agregado correctamente.");
            limpiarCampos();
                }
            }
        } catch (Exception ex) 
        {
            if(CampoEdad.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Error: El campo Edad no puede estar vacío.");
            }
            if(CampoPeso.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Error: El campo Peso no puede estar vacío.");
            }
            if(CampoComidaFija.getText().equals(""))
            {
                String especieSeleccionada = especieCbx.getSelectedItem().toString();
                for(Especie e : Controlador.getEspecies())
                {
                    if(e.getNombre().equals(especieSeleccionada))
                    {
                        if(e.getTipoAlimentacion().esHerbivoro())
                        {
                            JOptionPane.showMessageDialog(this, "Error: El campo Comida Fija no puede estar vacío.");
                        }
                    }
                }
            }
            
        }
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelcomida = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CampoPeso = new javax.swing.JTextField();
        CampoEdad = new javax.swing.JTextField();
        CampoComidaFija = new javax.swing.JTextField();
        especieCbx = new javax.swing.JComboBox<>();
        sectorCbx = new javax.swing.JComboBox<>();
        paisCbx = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Peso");

        jLabel5.setText("Edad");

        labelcomida.setText("Comida Fija ");

        jLabel2.setText("Especie ");

        jLabel3.setText("Sector");

        jLabel6.setText("Pais");

        CampoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPesoActionPerformed(evt);
            }
        });

        CampoComidaFija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoComidaFijaActionPerformed(evt);
            }
        });

        especieCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "León", "Jirafa", "Tigre", "Elefante" }));
        especieCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieCbxActionPerformed(evt);
            }
        });

        sectorCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SECTOR 1 [HERBIVORO]", "SECTOR 2 [CARNIVORO]", "SECTOR 3 [HERBIVORO]", "SECTOR 4 [CARNIVORO]" }));
        sectorCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorCbxActionPerformed(evt);
            }
        });

        paisCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madagascar", "Rusia", "India", "brasil", "australia" }));
        paisCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisCbxActionPerformed(evt);
            }
        });

        jButton2.setText("agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelcomida)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoComidaFija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paisCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectorCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especieCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(CampoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especieCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(CampoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectorCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcomida)
                    .addComponent(jLabel6)
                    .addComponent(CampoComidaFija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoComidaFijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoComidaFijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoComidaFijaActionPerformed

    private void CampoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPesoActionPerformed

    private void paisCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisCbxActionPerformed

    private void especieCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieCbxActionPerformed
        // TODO add your handling code here:
        cargarSectores();
       bloquearComidaFija();
    }//GEN-LAST:event_especieCbxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        dispose();
        ListarAnimalesView lista = new ListarAnimalesView();
        lista.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         guardarAnimal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sectorCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectorCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectorCbxActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoComidaFija;
    private javax.swing.JTextField CampoEdad;
    private javax.swing.JTextField CampoPeso;
    private javax.swing.JComboBox<String> especieCbx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelcomida;
    private javax.swing.JComboBox<String> paisCbx;
    private javax.swing.JComboBox<String> sectorCbx;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(javax.swing.JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public javax.swing.JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(javax.swing.JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(javax.swing.JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public javax.swing.JComboBox<String> getjComboBox1() {
        return especieCbx;
    }

    public void setjComboBox1(javax.swing.JComboBox<String> jComboBox1) {
        this.especieCbx = jComboBox1;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public javax.swing.JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(javax.swing.JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    /*public javax.swing.JTextField getjTextField2() {
        return SectorCampo;
    }

    public void setjTextField2(javax.swing.JTextField jTextField2) {
        this.SectorCampo = jTextField2;
    }*/

    public javax.swing.JTextField getjTextField3() {
        return CampoPeso;
    }

    public void setjTextField3(javax.swing.JTextField jTextField3) {
        this.CampoPeso = jTextField3;
    }

    public javax.swing.JTextField getjTextField4() {
        return CampoEdad;
    }

    public void setjTextField4(javax.swing.JTextField jTextField4) {
        this.CampoEdad = jTextField4;
    }

}
