package view;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        panelHeather = new javax.swing.JPanel();
        labelTItle = new javax.swing.JLabel();
        tabbedPaneMain = new javax.swing.JTabbedPane();
        panelVehicles = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelBrand = new javax.swing.JLabel();
        labelModel = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textBrand = new javax.swing.JTextField();
        textModel = new javax.swing.JTextField();
        textYear = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVehicles = new javax.swing.JTable();
        panelOwners = new javax.swing.JPanel();
        panelVehiclesOwners = new javax.swing.JPanel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeather.setBackground(new java.awt.Color(242, 105, 56));

        labelTItle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTItle.setForeground(new java.awt.Color(255, 255, 255));
        labelTItle.setText("SISTEMA AGENCIA");

        javax.swing.GroupLayout panelHeatherLayout = new javax.swing.GroupLayout(panelHeather);
        panelHeather.setLayout(panelHeatherLayout);
        panelHeatherLayout.setHorizontalGroup(
            panelHeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeatherLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(labelTItle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeatherLayout.setVerticalGroup(
            panelHeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeatherLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelTItle)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        labelID.setText("id:");

        labelBrand.setText("Marca: ");

        labelModel.setText("Modelo:");

        labelYear.setText("Año:");

        btnClean.setText("Limpiar");

        btnAdd.setText("Agregar");

        btnUpdate.setText("Actualizar");

        btnDelete.setText("Eliminar");

        tableVehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "Año"
            }
        ));
        jScrollPane1.setViewportView(tableVehicles);

        javax.swing.GroupLayout panelVehiclesLayout = new javax.swing.GroupLayout(panelVehicles);
        panelVehicles.setLayout(panelVehiclesLayout);
        panelVehiclesLayout.setHorizontalGroup(
            panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVehiclesLayout.createSequentialGroup()
                .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVehiclesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelVehiclesLayout.createSequentialGroup()
                                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelVehiclesLayout.createSequentialGroup()
                                    .addComponent(labelBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textBrand)))
                            .addGroup(panelVehiclesLayout.createSequentialGroup()
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelVehiclesLayout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelVehiclesLayout.createSequentialGroup()
                                    .addComponent(labelModel)
                                    .addGap(18, 18, 18)
                                    .addComponent(textModel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelVehiclesLayout.createSequentialGroup()
                                    .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8))
                    .addGroup(panelVehiclesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelVehiclesLayout.setVerticalGroup(
            panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVehiclesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVehiclesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelID)
                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBrand)
                            .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelVehiclesLayout.createSequentialGroup()
                        .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelModel)
                            .addComponent(textModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelYear)
                            .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(panelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClean)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPaneMain.addTab("Vehiculos", panelVehicles);

        javax.swing.GroupLayout panelOwnersLayout = new javax.swing.GroupLayout(panelOwners);
        panelOwners.setLayout(panelOwnersLayout);
        panelOwnersLayout.setHorizontalGroup(
            panelOwnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        panelOwnersLayout.setVerticalGroup(
            panelOwnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        tabbedPaneMain.addTab("Propietarios", panelOwners);

        javax.swing.GroupLayout panelVehiclesOwnersLayout = new javax.swing.GroupLayout(panelVehiclesOwners);
        panelVehiclesOwners.setLayout(panelVehiclesOwnersLayout);
        panelVehiclesOwnersLayout.setHorizontalGroup(
            panelVehiclesOwnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        panelVehiclesOwnersLayout.setVerticalGroup(
            panelVehiclesOwnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        tabbedPaneMain.addTab("Vehiculos-Propitarios", panelVehiclesOwners);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeather, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneMain)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPaneMain)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdd;
    public javax.swing.JButton btnClean;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnUpdate;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBrand;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelTItle;
    private javax.swing.JLabel labelYear;
    private javax.swing.JPanel panelHeather;
    private javax.swing.JPanel panelOwners;
    private javax.swing.JPanel panelVehicles;
    private javax.swing.JPanel panelVehiclesOwners;
    private javax.swing.JTabbedPane tabbedPaneMain;
    public javax.swing.JTable tableVehicles;
    public javax.swing.JTextField textBrand;
    public javax.swing.JTextField textID;
    public javax.swing.JTextField textModel;
    public javax.swing.JTextField textYear;
    // End of variables declaration//GEN-END:variables
}
