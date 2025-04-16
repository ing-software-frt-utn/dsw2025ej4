package views;

import domain.*;
import data.*;
import static java.awt.Color.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author user
 */
public class AgregarAnimal extends javax.swing.JFrame {

    /**
     * Creates new form AgregarAnimal
     */
    public AgregarAnimal() 
    {
        initComponents();
        setTitle("Agregar Animal");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
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
    
    public void limpiarCampos()
    {
        CampoEdad.setText("");
        CampoPeso.setText("");
        CampoComidaFija.setText("");
    }
    
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CampoEdad = new javax.swing.JTextField();
        CampoPeso = new javax.swing.JTextField();
        CampoComidaFija = new javax.swing.JTextField();
        labelComida = new javax.swing.JLabel();
        especieCbx = new javax.swing.JComboBox<>();
        sectorCbx = new javax.swing.JComboBox<>();
        paisCbx = new javax.swing.JComboBox<>();
        AgregarButton = new javax.swing.JButton();
        volverButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoEdad.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        CampoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEdadActionPerformed(evt);
            }
        });
        jPanel1.add(CampoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 207, -1));

        CampoPeso.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(CampoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 207, -1));

        CampoComidaFija.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(CampoComidaFija, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 207, -1));

        labelComida.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelComida.setForeground(new java.awt.Color(204, 204, 0));
        labelComida.setText("Comida Fija:");
        jPanel1.add(labelComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        especieCbx.setBackground(new java.awt.Color(0, 51, 102));
        especieCbx.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        especieCbx.setForeground(new java.awt.Color(204, 204, 0));
        especieCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Especie --", "León", "Jirafa", "Tigre", "Elefante" }));
        especieCbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                especieCbxItemStateChanged(evt);
            }
        });
        especieCbx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                especieCbxMouseMoved(evt);
            }
        });
        especieCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieCbxActionPerformed(evt);
            }
        });
        jPanel1.add(especieCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 190, -1));

        sectorCbx.setBackground(new java.awt.Color(0, 51, 102));
        sectorCbx.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        sectorCbx.setForeground(new java.awt.Color(204, 204, 0));
        sectorCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Especie--" }));
        sectorCbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sectorCbxItemStateChanged(evt);
            }
        });
        sectorCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorCbxActionPerformed(evt);
            }
        });
        jPanel1.add(sectorCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 190, -1));

        paisCbx.setBackground(new java.awt.Color(0, 51, 102));
        paisCbx.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        paisCbx.setForeground(new java.awt.Color(204, 204, 0));
        paisCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Especie--" }));
        paisCbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paisCbxItemStateChanged(evt);
            }
        });
        jPanel1.add(paisCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 190, -1));

        AgregarButton.setBackground(new java.awt.Color(0, 51, 102));
        AgregarButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        AgregarButton.setForeground(new java.awt.Color(255, 255, 0));
        AgregarButton.setText("Agregar");
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 140, 70));

        volverButton.setBackground(new java.awt.Color(0, 51, 102));
        volverButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        volverButton.setForeground(new java.awt.Color(255, 255, 0));
        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });
        jPanel1.add(volverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 130, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText(">>INGRESE LOS DATOS DEL ANIMAL<<");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("Edad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 0));
        jLabel9.setText("Sector:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("Peso:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 0));
        jLabel11.setText("Especie:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 0));
        jLabel12.setText("Pais:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1020, 380));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setForeground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Agregar Animal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(340, 340, 340))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEdadActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
       dispose();
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
    }//GEN-LAST:event_volverButtonActionPerformed

    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed
        guardarAnimal();
    }//GEN-LAST:event_AgregarButtonActionPerformed

    private void especieCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieCbxActionPerformed
       cargarSectores();
       bloquearComidaFija();
    }//GEN-LAST:event_especieCbxActionPerformed

    private void especieCbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_especieCbxItemStateChanged
      especieCbx.removeItem(1);
    }//GEN-LAST:event_especieCbxItemStateChanged

    private void especieCbxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especieCbxMouseMoved

    }//GEN-LAST:event_especieCbxMouseMoved

    private void sectorCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectorCbxActionPerformed

    }//GEN-LAST:event_sectorCbxActionPerformed

    private void sectorCbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sectorCbxItemStateChanged

    }//GEN-LAST:event_sectorCbxItemStateChanged

    private void paisCbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paisCbxItemStateChanged

    }//GEN-LAST:event_paisCbxItemStateChanged

    

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
                        nuevo = new Herbivoro(edad, peso, pais, e, sector, comidaFija);
                    } else 
                        {
                            nuevo = new Carnivoro(edad, peso, pais, e, sector);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButton;
    private javax.swing.JTextField CampoComidaFija;
    private javax.swing.JTextField CampoEdad;
    private javax.swing.JTextField CampoPeso;
    private javax.swing.JComboBox<String> especieCbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelComida;
    private javax.swing.JComboBox<String> paisCbx;
    private javax.swing.JComboBox<String> sectorCbx;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
