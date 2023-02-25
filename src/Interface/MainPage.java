/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


public class MainPage extends javax.swing.JFrame {

   
    public MainPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        saveDataButton = new javax.swing.JButton();
        newStorageButton = new javax.swing.JButton();
        invManagementButton = new javax.swing.JButton();
        newOrderButton = new javax.swing.JButton();
        storageMapButton = new javax.swing.JButton();
        addNewRutesButton = new javax.swing.JButton();
        uploadDataButton = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 51));
        jLabel3.setText(" AMAZON");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 210, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 70));

        saveDataButton.setText("Guardar Datos");
        saveDataButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataButtonActionPerformed(evt);
            }
        });
        jPanel3.add(saveDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, 50));

        newStorageButton.setText("Crear Nuevo Almacén");
        newStorageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStorageButtonActionPerformed(evt);
            }
        });
        jPanel3.add(newStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, 50));

        invManagementButton.setText("Gestión de Inventario");
        invManagementButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invManagementButtonActionPerformed(evt);
            }
        });
        jPanel3.add(invManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 170, 50));

        newOrderButton.setText("Nuevo Pedido");
        newOrderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });
        jPanel3.add(newOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 170, 40));

        storageMapButton.setText("Mapa de Almacenes");
        storageMapButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        storageMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageMapButtonActionPerformed(evt);
            }
        });
        jPanel3.add(storageMapButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 170, 50));

        addNewRutesButton.setText("Añadir nuevas rutas");
        addNewRutesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewRutesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewRutesButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addNewRutesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, 40));

        uploadDataButton.setText("Cargar Datos");
        uploadDataButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadDataButtonActionPerformed(evt);
            }
        });
        jPanel3.add(uploadDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 770, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Triggers page change to NewStoragePage on press
     */
    private void newStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStorageButtonActionPerformed
        // TODO add your handling code here:
        GlobalUI.openNewStoragePage();
    }//GEN-LAST:event_newStorageButtonActionPerformed

    private void invManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invManagementButtonActionPerformed
        GlobalUI.openStockManagementPage();
    }//GEN-LAST:event_invManagementButtonActionPerformed

    private void saveDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataButtonActionPerformed
        InterfaceFunctions.saveCurrentData("¿Está seguro que desea guardar la información actual?");
    }//GEN-LAST:event_saveDataButtonActionPerformed

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
        GlobalUI.openNewOrderPage();
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void uploadDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadDataButtonActionPerformed
        InterfaceFunctions.saveCurrentData("Antes de subir un nuevo archivo: ¿Desea guardar la información actual?; de no hacerlo se puede perder");
        GlobalUI.openUploadDataPage();
    }//GEN-LAST:event_uploadDataButtonActionPerformed

    private void storageMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageMapButtonActionPerformed
        GlobalUI.showGraphMap();
    }//GEN-LAST:event_storageMapButtonActionPerformed

    private void addNewRutesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewRutesButtonActionPerformed
        GlobalUI.openAddNewRutes();
    }//GEN-LAST:event_addNewRutesButtonActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewRutesButton;
    private javax.swing.JButton invManagementButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JButton newStorageButton;
    private javax.swing.JButton saveDataButton;
    private javax.swing.JButton storageMapButton;
    private javax.swing.JButton uploadDataButton;
    // End of variables declaration//GEN-END:variables
}
