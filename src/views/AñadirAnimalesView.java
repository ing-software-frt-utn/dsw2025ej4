/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import data.Persistencia;
import domain.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Bernabé
 */
public class AñadirAnimalesView extends javax.swing.JFrame {

    /**
     * Creates new form AñadirAnimalesView
     */
    public AñadirAnimalesView() {
        initComponents();
        esconderComp();
        cargarEspeciesEnCombo();
        cargarPaisesEnCombo();
        
        //comboBoxEspecies.addActionListener(comboBoxPaises);
        comboBoxEspecies.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombreSeleccionado = (String) comboBoxEspecies.getSelectedItem();
            Especie especieSeleccionada = null;

            // Buscar la especie según el nombre
            for (Especie esp : Persistencia.getEspecies()) {
                if (esp.getNombre().equals(nombreSeleccionado)) {
                    especieSeleccionada = esp;
                    break;
                }
            }

            // Mostrar el tipo de alimentación
            if (especieSeleccionada != null) {
                tipoAlimentacion.setText(especieSeleccionada.getTipoAlimentacion().toString());
                cargarSectoresEnCombo(especieSeleccionada.getTipoAlimentacion());
                
            }
            
            
        }
        });
        
        
    }
    
    
    
    private void cargarEspeciesEnCombo(){
        for (Especie e : Persistencia.getEspecies()) {
            comboBoxEspecies.addItem(e.getNombre());
        }
    }

       
    private void cargarPaisesEnCombo(){
        for (Pais p : Persistencia.getPaises()) {
            comboBoxPaises.addItem(p.getNombre());
        }
    }
    
    private void cargarSectoresEnCombo(TipoAlimentacion tipo){
        comboBoxSectores.removeAllItems();
        esconderComp();
        if (tipo == TipoAlimentacion.HERBIVORO) {
           comboBoxSectores.addItem(Integer.toString(1));
            comboBoxSectores.addItem(Integer.toString(3));
            tfValorFijo.setVisible(true);
            labelValorFijo.setVisible(true);
        } else if (tipo == TipoAlimentacion.CARNIVORO) {
            comboBoxSectores.addItem(Integer.toString(2));
            comboBoxSectores.addItem(Integer.toString(4));
            tfPorcentaje.setVisible(true);
            labelPorcentaje.setVisible(true);
        }            
    }
    
    private void esconderComp(){
        labelCompletar.setVisible(false);
        labelPorcentaje.setVisible(false);
        labelValorFijo.setVisible(false);
        tfPorcentaje.setVisible(false);
        tfValorFijo.setVisible(false);
    }
    
    private void guardarAnimal() {
    try {
        int edad = Integer.parseInt(tfEdad.getText());
        double peso = Double.parseDouble(tfPeso.getText());

        String nombreEspecie = (String) comboBoxEspecies.getSelectedItem();
        Especie especieSeleccionada = Persistencia.getEspecies().stream()
            .filter(e -> e.getNombre().equals(nombreEspecie))
            .findFirst()
            .orElseThrow();
        
        String numeroSectorStr = (String) comboBoxSectores.getSelectedItem();
        int numeroSector = Integer.parseInt(numeroSectorStr);
        
        //Buscar el objeto Sector original segun el numero:
        Sector sectorSeleccionado = Persistencia.getSectores().stream()
                .filter(s -> s.getNumero()== numeroSector)
                .findFirst()
                .orElseThrow();
     
        String nombrePais = (String) comboBoxPaises.getSelectedItem();
        Pais paisSeleccionado = Persistencia.getPaises().stream()
            .filter(p -> p.getNombre().equals(nombrePais))
            .findFirst()
            .orElseThrow();
        
        //Sector sectorSeleccionado = (Sector) comboBoxSectores.getSelectedItem();
        //Pais paisSeleccionado = (Pais) comboBoxPaises.getSelectedItem();

        Mamifero nuevo;

        if (especieSeleccionada.getTipoAlimentacion() == TipoAlimentacion.HERBIVORO) {
            double valorFijo = Double.parseDouble(tfValorFijo.getText());
            nuevo = new Herbivoro(edad, peso, especieSeleccionada, sectorSeleccionado, valorFijo, paisSeleccionado);
            Persistencia.agregarAnimal(nuevo);
        } else if(especieSeleccionada.getTipoAlimentacion() == TipoAlimentacion.CARNIVORO){
            nuevo = new Carnivoro(edad, peso, especieSeleccionada, sectorSeleccionado, paisSeleccionado);
            Persistencia.agregarAnimal(nuevo);
        }

        JOptionPane.showMessageDialog(this, "Animal agregado exitosamente.");
        
        System.out.println("Se esta guardando");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al ingresar los datos: " + e.getMessage());
    }
}

    private void limpiarCampos() {
        tfEdad.setText("");
        tfPeso.setText("");
        tfValorFijo.setText(""); 
        tfPorcentaje.setText("");
        comboBoxEspecies.setSelectedIndex(0);
        comboBoxSectores.setSelectedIndex(0);
        comboBoxPaises.setSelectedIndex(0);
        esconderComp();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        botonVolverAlMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboBoxEspecies = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tfEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboBoxPaises = new javax.swing.JComboBox<>();
        tipoAlimentacion = new javax.swing.JLabel();
        comboBoxSectores = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        labelValorFijo = new javax.swing.JLabel();
        tfValorFijo = new javax.swing.JTextField();
        labelPorcentaje = new javax.swing.JLabel();
        tfPorcentaje = new javax.swing.JTextField();
        botonAñadir = new javax.swing.JButton();
        labelCompletar = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVolverAlMenu.setBackground(new java.awt.Color(255, 102, 102));
        botonVolverAlMenu.setText("Volver al Menu");
        botonVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAlMenuActionPerformed(evt);
            }
        });

        jLabel1.setText("Especie");

        comboBoxEspecies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEspeciesActionPerformed(evt);
            }
        });

        jLabel2.setText("Edad");

        jLabel3.setText("Peso");

        jLabel4.setText("Pais");

        comboBoxPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboBoxPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPaisesActionPerformed(evt);
            }
        });

        tipoAlimentacion.setText("Tipo de Alimentacion");

        jLabel5.setText("Sector");

        labelValorFijo.setText("Valor fijo");

        tfValorFijo.setText("0");

        labelPorcentaje.setText("Porcentaje");

        tfPorcentaje.setText("0");

        botonAñadir.setBackground(new java.awt.Color(0, 204, 255));
        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        labelCompletar.setText("Campos Incompletos!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipoAlimentacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBoxPaises, 0, 90, Short.MAX_VALUE)
                                    .addComponent(comboBoxSectores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPorcentaje)
                                    .addComponent(tfPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelValorFijo)
                                    .addComponent(tfValorFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBoxEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                        .addComponent(botonVolverAlMenu)
                                        .addGap(8, 8, 8))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelCompletar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(comboBoxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoAlimentacion)
                    .addComponent(comboBoxSectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelValorFijo)
                            .addComponent(labelPorcentaje))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfValorFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAñadir)
                    .addComponent(botonVolverAlMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCompletar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAlMenuActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botonVolverAlMenuActionPerformed

    private void comboBoxEspeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEspeciesActionPerformed
        
    }//GEN-LAST:event_comboBoxEspeciesActionPerformed

    private void comboBoxPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPaisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPaisesActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        guardarAnimal();
        limpiarCampos();
    }//GEN-LAST:event_botonAñadirActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirAnimalesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirAnimalesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonVolverAlMenu;
    private javax.swing.JComboBox<String> comboBoxEspecies;
    private javax.swing.JComboBox<String> comboBoxPaises;
    private javax.swing.JComboBox<String> comboBoxSectores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelCompletar;
    private javax.swing.JLabel labelPorcentaje;
    private javax.swing.JLabel labelValorFijo;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfPorcentaje;
    private javax.swing.JTextField tfValorFijo;
    private javax.swing.JLabel tipoAlimentacion;
    // End of variables declaration//GEN-END:variables
}
