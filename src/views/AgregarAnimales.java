package views;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class AgregarAnimales extends javax.swing.JDialog {

    public AgregarAnimales(Principal parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void setjValorFijo(JTextField ValorFijo) {
        this.ValorFijo = ValorFijo;
    }

    public JComboBox<String> getComboBoxEmpleado() {
        return ComboBoxEmpleado;
    }

    public JComboBox<String> getComboBoxPais() {
        return ComboBoxPais;
    }

    public JComboBox<String> getComboBoxEspecie() {
        return ComboBoxEspecie;
    }

    public JComboBox<String> getComboBoxSector() {
        return ComboBoxSector;
    }

    public JComboBox<String> getComboBoxTipoAlimentacion() {
        return ComboBoxTipoAlimentacion;
    }

    public JTextField getEdad() {
        return Edad;
    }

    public JTextField getValorFijo() {
        return ValorFijo;
    }

    public JTextField getPeso() {
        return Peso;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ComboBoxTipoAlimentacion = new javax.swing.JComboBox<>();
        LabelTipoAlimentacion = new javax.swing.JLabel();
        LabelEspecie = new javax.swing.JLabel();
        ComboBoxEspecie = new javax.swing.JComboBox<>();
        LabelSector = new javax.swing.JLabel();
        ComboBoxSector = new javax.swing.JComboBox<>();
        LabelEdad = new javax.swing.JLabel();
        Edad = new javax.swing.JTextField();
        LabelPeso = new javax.swing.JLabel();
        Peso = new javax.swing.JTextField();
        LabelEncargado = new javax.swing.JLabel();
        ComboBoxEmpleado = new javax.swing.JComboBox<>();
        LabelPais = new javax.swing.JLabel();
        ComboBoxPais = new javax.swing.JComboBox<>();
        BotonGuardar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ValorFijo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("INGRESO DE ANIMAL");

        ComboBoxTipoAlimentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxTipoAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoAlimentacionActionPerformed(evt);
            }
        });

        LabelTipoAlimentacion.setText("Tipo de alimentacion");

        LabelEspecie.setText("Especie");

        ComboBoxEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelSector.setText("Sector");

        ComboBoxSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSectorActionPerformed(evt);
            }
        });

        LabelEdad.setText("Edad (Años)");

        Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadActionPerformed(evt);
            }
        });

        LabelPeso.setText("Peso (Kg)");

        LabelEncargado.setText("Empleado encargado");

        ComboBoxEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelPais.setText("Pais origen");

        ComboBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonSalir.setText("Volver");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor fijo de comida(Kg)");

        ValorFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorFijoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LabelSector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelEspecie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(LabelTipoAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPais, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxSector, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBoxTipoAlimentacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxEspecie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LabelPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(23, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ValorFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(BotonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonSalir)
                                .addGap(68, 68, 68))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelEncargado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEspecie)
                    .addComponent(ComboBoxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEdad)
                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSector)
                    .addComponent(ComboBoxSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPeso)
                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTipoAlimentacion)
                    .addComponent(ComboBoxTipoAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ValorFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPais)
                    .addComponent(ComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonGuardar)
                            .addComponent(BotonSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelEncargado))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadActionPerformed

    private void ComboBoxSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSectorActionPerformed
      Controlador.cargarEmpleado();
    }//GEN-LAST:event_ComboBoxSectorActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
       Controlador.agregarAnimal();
       // Limpiar campos
       ComboBoxEspecie.setSelectedIndex(0);
       ComboBoxSector.setSelectedIndex(0);
       ComboBoxTipoAlimentacion.setSelectedIndex(0);
       ComboBoxPais.setSelectedIndex(0);
       ComboBoxEmpleado.setSelectedIndex(0);
       
       getEdad().setText("");
       getPeso().setText("");
       getValorFijo().setText("");

    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void ValorFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorFijoActionPerformed
        
    }//GEN-LAST:event_ValorFijoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void ComboBoxTipoAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoAlimentacionActionPerformed
        Controlador.cargarEspecie();
        Controlador.cargarSector();
        //Controlador.mostrarValorFijo();
    }//GEN-LAST:event_ComboBoxTipoAlimentacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> ComboBoxEmpleado;
    private javax.swing.JComboBox<String> ComboBoxEspecie;
    private javax.swing.JComboBox<String> ComboBoxPais;
    private javax.swing.JComboBox<String> ComboBoxSector;
    private javax.swing.JComboBox<String> ComboBoxTipoAlimentacion;
    private javax.swing.JTextField Edad;
    private javax.swing.JLabel LabelEdad;
    private javax.swing.JLabel LabelEncargado;
    private javax.swing.JLabel LabelEspecie;
    private javax.swing.JLabel LabelPais;
    private javax.swing.JLabel LabelPeso;
    private javax.swing.JLabel LabelSector;
    private javax.swing.JLabel LabelTipoAlimentacion;
    private javax.swing.JTextField Peso;
    private javax.swing.JTextField ValorFijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
