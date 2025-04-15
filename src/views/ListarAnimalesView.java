package views;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListarAnimalesView extends javax.swing.JFrame {

    public ListarAnimalesView() {
        initComponents();
        listarAnimales();
    }

    private void listarAnimales() {
        ArrayList<AnimalViewModel> animales = Controlador.getAnimales();
        animalesGrid.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{"Especie", "Edad", "Peso", "Sector", "Comida Fija", "Por. Peso"}));

        for (AnimalViewModel animal : animales) {
            ((DefaultTableModel) animalesGrid.getModel()).addRow(new Object[]{
                animal.getEspecie(),
                animal.getEdad(),
                animal.getPeso(),
                animal.getSector(),
                animal.getValorFijo() > 0 ? String.format("%.2f%n Kgs.", animal.getValorFijo()) : "-",
                animal.getPorcentaje() > 0 ? String.format("%.2f %%", animal.getPorcentaje() * 100) : "-"
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        animalesGrid = new javax.swing.JTable();
        calcularComida = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        totalHerbivoros = new javax.swing.JLabel();
        totalCarnivoros = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalAlimentos = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zoológico - Listar Animales");
        setPreferredSize(new java.awt.Dimension(640, 480));
        setSize(new java.awt.Dimension(640, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        animalesGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(animalesGrid);

        calcularComida.setText("Calcular Comida");
        calcularComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularComidaActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 204, 204));

        totalHerbivoros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalHerbivoros.setText("Total Herbívoros");

        totalCarnivoros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalCarnivoros.setText("Total Carnívoros");

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("TOTAL");

        totalAlimentos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalAlimentos.setForeground(new java.awt.Color(0, 0, 255));
        totalAlimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAlimentos.setText("0");
        totalAlimentos.setToolTipText("");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(totalCarnivoros, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(totalHerbivoros, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(totalHerbivoros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalCarnivoros)
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcularComida, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(calcularComida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularComidaActionPerformed
        ComidaViewModel comida = Controlador.calcularComida();
        totalHerbivoros.setText(String.format("Total Herbívoros: %.2f%n Kgs.", comida.getHerbivoros()));
        totalCarnivoros.setText(String.format("Total Carnívoros: %.2f%n Kgs.", comida.getCarnivoros()));
        totalAlimentos.setText(String.format("%.2f%n Kgs.", comida.getTotal()));
    }//GEN-LAST:event_calcularComidaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        MenuPrincipalView view = new MenuPrincipalView();
        view.setVisible(true);
        view.setLocationRelativeTo(null);

    }//GEN-LAST:event_formWindowClosed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable animalesGrid;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton calcularComida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel totalAlimentos;
    private javax.swing.JLabel totalCarnivoros;
    private javax.swing.JLabel totalHerbivoros;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

}
