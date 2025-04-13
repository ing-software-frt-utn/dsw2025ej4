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
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    public void bloquearComidaFija()
    {
        String especieSeleccionada = especieComboBox.getSelectedItem().toString();
        
        for(Especie e : Controlador.getEspecies())
        {
            if(especieSeleccionada.equals(e.getNombre()))
            {
                if(e.getTipoAlimentacion().esCarnivoro())
                {
                    comidafijaField.setEnabled(false);
                    labelComida.setForeground(GRAY);
                }
                else{comidafijaField.setEnabled(true); labelComida.setForeground(DARK_GRAY);}
            }
        }
    }
    
    public void limpiarCampos()
    {
        edadField.setText("");
        pesoField.setText("");
        comidafijaField.setText("");
    }
    
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelComida = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edadField = new javax.swing.JTextField();
        pesoField = new javax.swing.JTextField();
        comidafijaField = new javax.swing.JTextField();
        especieComboBox = new javax.swing.JComboBox<>();
        sectorComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paisComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("INGRESE LOS DATOS DEL ANIMAL");

        jLabel2.setText("Edad:");

        jLabel3.setText("Peso:");

        labelComida.setText("Comida Fija:");

        jLabel5.setText("Especie:");

        jLabel6.setText("Sector:");

        edadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadFieldActionPerformed(evt);
            }
        });

        especieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Especie --", "León", "Jirafa", "Tigre", "Elefante" }));
        especieComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                especieComboBoxItemStateChanged(evt);
            }
        });
        especieComboBox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                especieComboBoxMouseMoved(evt);
            }
        });
        especieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieComboBoxActionPerformed(evt);
            }
        });

        sectorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Especie--" }));
        sectorComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sectorComboBoxItemStateChanged(evt);
            }
        });
        sectorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorComboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar y volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleccione especie para ver sectores disponibles");

        jLabel8.setText("Pais:");

        paisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Especie--" }));
        paisComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paisComboBoxItemStateChanged(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(especieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sectorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(paisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(labelComida))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edadField)
                                    .addComponent(pesoField)
                                    .addComponent(comidafijaField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pesoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComida)
                    .addComponent(comidafijaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(especieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(sectorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(paisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarAnimal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void especieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieComboBoxActionPerformed
       cargarSectores();
       bloquearComidaFija();
    }//GEN-LAST:event_especieComboBoxActionPerformed

    private void especieComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_especieComboBoxItemStateChanged
      especieComboBox.removeItem(1);
    }//GEN-LAST:event_especieComboBoxItemStateChanged

    private void especieComboBoxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especieComboBoxMouseMoved

    }//GEN-LAST:event_especieComboBoxMouseMoved

    private void sectorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectorComboBoxActionPerformed

    }//GEN-LAST:event_sectorComboBoxActionPerformed

    private void sectorComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sectorComboBoxItemStateChanged

    }//GEN-LAST:event_sectorComboBoxItemStateChanged

    private void paisComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paisComboBoxItemStateChanged

    }//GEN-LAST:event_paisComboBoxItemStateChanged

    

    private void cargarSectores() {
    ArrayList<Especie> especies =Controlador.getEspecies();
    ArrayList<Sector> sectores =Controlador.getSectores();
    ArrayList<Pais> paises =Controlador.getPaises();
     sectorComboBox.removeAllItems();
     paisComboBox.removeAllItems();
     
    
 for(Pais pais : paises){
     paisComboBox.addItem(pais.getNombre());
 }
    
    String especieSeleccionada = especieComboBox.getSelectedItem().toString();
    boolean espacio=false;
    
     for (Especie e : especies) 
     {
        if(especieSeleccionada.equals(e.getNombre())){
         
            for(Sector s : sectores){
            if(e.getTipoAlimentacion().equals(s.getTipoAlimentacion())){
                
                if(s.getLimite()>=1){ 
              sectorComboBox.addItem(s.toString()); 
              espacio=true;
                } 
            }
            }
        }
     
     }
     if (!espacio && !especieComboBox.getSelectedItem().toString().equals("--Seleccione Especie --")) {
    JOptionPane.showMessageDialog(this, "Error: todos los sectores están ocupados");
    dispose();
    }
    }
    
    
    
    private void guardarAnimal() {
        try {
            ArrayList<Especie> especies =Controlador.getEspecies();
            ArrayList<Sector> sectores =Controlador.getSectores();
             ArrayList<Pais> paises =Controlador.getPaises();
            int edad = Integer.parseInt(edadField.getText());
            double peso = Double.parseDouble(pesoField.getText());
            
            String sectorSeleccionado = sectorComboBox.getSelectedItem().toString();
            String especieSeleccionada = especieComboBox.getSelectedItem().toString();
            String paisSeleccionado = paisComboBox.getSelectedItem().toString();
            
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
                        double comidaFija = Double.parseDouble(comidafijaField.getText());
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
            if(edadField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Error: El campo Edad no puede estar vacío.");
            }
            if(pesoField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Error: El campo Peso no puede estar vacío.");
            }
            if(comidafijaField.getText().equals(""))
            {
                String especieSeleccionada = especieComboBox.getSelectedItem().toString();
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
    private javax.swing.JTextField comidafijaField;
    private javax.swing.JTextField edadField;
    private javax.swing.JComboBox<String> especieComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelComida;
    private javax.swing.JComboBox<String> paisComboBox;
    private javax.swing.JTextField pesoField;
    private javax.swing.JComboBox<String> sectorComboBox;
    // End of variables declaration//GEN-END:variables
}
