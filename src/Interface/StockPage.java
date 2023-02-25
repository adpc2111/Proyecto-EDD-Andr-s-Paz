/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import main.Graph;
import main.Product;


public class StockPage extends javax.swing.JFrame {

    String storage = "";
    Product[] inv;
    Graph g1;
    String product = "";
    int quantity = 0;

    /**
     * Creates new form stockManagementPage
     */
    public StockPage() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        defaultValues();

    }
    /**
     * Reboot all the page
     */
    private void defaultValues() {
        storageChooserCombo.setEnabled(true);
        selectStorageButton.setEnabled(true);
        productChooserCombo1.setEnabled(false);
        selectProductButton.setEnabled(false);
        unitsExistingProductTextField.setEnabled(false);
        selectUnitsButton.setEnabled(false);
        addQuantityButton.setEnabled(false);
        newProductNameTextField.setEnabled(false);
        selectNewProductNameButton.setEnabled(false);
        unitsNewProductTextField.setEnabled(false);
        selectNewUnitsButton.setEnabled(false);
        addQuantityNewProductButton.setEnabled(false);
        productChooserCombo1.removeAllItems();
        unitsExistingProductTextField.setText("");
        actualQuantityLabel.setText("");
        newQuantityLabel.setText("");
        unitsNewProductTextField.setText("");
        newProductNameTextField.setText("");
        newQuantityNumberTitleLabel.setText((""));
        storage = "";
        inv = null;
        product = "";
        quantity = 0;

    }
    
    /**
     * Fill products combo with names
     */

    public void fillProductsCombo() {
        productChooserCombo1.removeAllItems();
        inv = g1.getStorageList().getStorageByName(storage).getInventory().getProductStringArray();
        for (int i = 0; i < inv.length; i++) {
            productChooserCombo1.addItem(inv[i].getName());

        }

    }
    
    /**
     * fill TransmitterChooserCombo with the information
     * @param  g1
     */

    public void fillTransmitterChooserCombo(Graph g1) {
        storageChooserCombo.removeAllItems();
        String[] storages = g1.namenOnAString();
        for (int i = 0; i < storages.length; i++) {
            storageChooserCombo.addItem(storages[i]);
        }
    }
    
    /**
     * Graph Constructor
     * @param  graph
     */

    public void setGraph(Graph graph) {
        g1 = graph;
        fillTransmitterChooserCombo(g1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        babkToTheMain = new javax.swing.JButton();
        newQuantityNumberTitleLabel = new javax.swing.JLabel();
        newQuantityLabel = new javax.swing.JLabel();
        selectProductQuantityLabel3 = new javax.swing.JLabel();
        unitsExistingProductTextField = new javax.swing.JTextField();
        selectUnitsButton = new javax.swing.JButton();
        actualQuantityLabel = new javax.swing.JLabel();
        selectQuantityTitleLabel = new javax.swing.JLabel();
        selectProductQuantityLabel = new javax.swing.JLabel();
        selectNewProductNameLabel = new javax.swing.JLabel();
        selectNewProductNameButton = new javax.swing.JButton();
        newProductNameTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        selectStorageButton = new javax.swing.JButton();
        storageChooserCombo = new javax.swing.JComboBox<>();
        selectStorageTitleLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        selectNewUnitsButton = new javax.swing.JButton();
        unitsNewProductTextField = new javax.swing.JTextField();
        selectQuantityTitleLabel1 = new javax.swing.JLabel();
        selectProductName = new javax.swing.JLabel();
        productChooserCombo1 = new javax.swing.JComboBox<>();
        selectProductButton = new javax.swing.JButton();
        addQuantityButton = new javax.swing.JButton();
        addQuantityNewProductButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(51, 255, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Agregar Inventario");
        jPanel4.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 70));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        babkToTheMain.setText("Regresar al menú");
        babkToTheMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                babkToTheMainActionPerformed(evt);
            }
        });
        jPanel1.add(babkToTheMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 180, 50));

        newQuantityNumberTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newQuantityNumberTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(newQuantityNumberTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 120, -1));

        newQuantityLabel.setBackground(new java.awt.Color(255, 255, 255));
        newQuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(newQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 80, -1));

        selectProductQuantityLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectProductQuantityLabel3.setForeground(new java.awt.Color(255, 255, 255));
        selectProductQuantityLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectProductQuantityLabel3.setText("Agregar nuevo producto al inventario");
        jPanel1.add(selectProductQuantityLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 400, -1));
        jPanel1.add(unitsExistingProductTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 220, -1));

        selectUnitsButton.setText("Seleccionar");
        selectUnitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUnitsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectUnitsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 220, -1));

        actualQuantityLabel.setBackground(new java.awt.Color(255, 255, 255));
        actualQuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(actualQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 80, -1));

        selectQuantityTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectQuantityTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectQuantityTitleLabel.setText("Seleccione cantidad:");
        jPanel1.add(selectQuantityTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        selectProductQuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectProductQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectProductQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectProductQuantityLabel.setText("Agregar unidades a producto ya existente");
        jPanel1.add(selectProductQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 380, -1));

        selectNewProductNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectNewProductNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectNewProductNameLabel.setText("Nombre producto nuevo");
        jPanel1.add(selectNewProductNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        selectNewProductNameButton.setText("Seleccionar");
        selectNewProductNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNewProductNameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectNewProductNameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 220, -1));
        jPanel1.add(newProductNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 220, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectStorageButton.setText("Seleccionar");
        selectStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(selectStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 280, -1));

        jPanel2.add(storageChooserCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 280, -1));

        selectStorageTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectStorageTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectStorageTitleLabel.setText("Seleccione el almacén");
        jPanel2.add(selectStorageTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 460, 110));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 880, 110));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectNewUnitsButton.setText("Seleccionar");
        selectNewUnitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNewUnitsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(selectNewUnitsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 220, -1));

        unitsNewProductTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsNewProductTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(unitsNewProductTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 220, -1));

        selectQuantityTitleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectQuantityTitleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        selectQuantityTitleLabel1.setText("Seleccione cantidad:");
        jPanel3.add(selectQuantityTitleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        selectProductName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectProductName.setForeground(new java.awt.Color(255, 255, 255));
        selectProductName.setText("Seleccione el producto");
        jPanel3.add(selectProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel3.add(productChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 220, -1));

        selectProductButton.setText("Seleccionar");
        selectProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProductButtonActionPerformed(evt);
            }
        });
        jPanel3.add(selectProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, -1));

        addQuantityButton.setText("Agregar");
        addQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuantityButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addQuantityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 90, 40));

        addQuantityNewProductButton.setText("Agregar");
        addQuantityNewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuantityNewProductButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addQuantityNewProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 90, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 880, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStorageButtonActionPerformed
        storage = storageChooserCombo.getSelectedItem().toString();
        fillProductsCombo();
        productChooserCombo1.setEnabled(true);
        selectProductButton.setEnabled(true);
        

        newProductNameTextField.setEnabled(true);
        selectNewProductNameButton.setEnabled(true);
        


    }//GEN-LAST:event_selectStorageButtonActionPerformed

    private void selectProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProductButtonActionPerformed
        product = productChooserCombo1.getSelectedItem().toString();
        quantity = g1.getStorageList().getStorageByName(storage).getInventory().getProductByName(product).getQuantity();
        actualQuantityLabel.setText(String.valueOf(quantity));
        newQuantityLabel.setText(String.valueOf(quantity));
        newProductNameTextField.setEnabled(false);
        selectNewProductNameButton.setEnabled(false);
        unitsNewProductTextField.setEnabled(false);
        selectNewUnitsButton.setEnabled(false);
        storageChooserCombo.setEnabled(false);
        selectStorageButton.setEnabled(false);
        unitsExistingProductTextField.setEnabled(true);
        selectUnitsButton.setEnabled(true);


    }//GEN-LAST:event_selectProductButtonActionPerformed

    private void selectUnitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectUnitsButtonActionPerformed
        String stQuantity = unitsExistingProductTextField.getText();

        if (InterfaceFunctions.isANumber(stQuantity)) {
            int quant = Integer.parseInt(stQuantity);
            if (quant > 0) {
                quantity += quant;
                newQuantityLabel.setText(String.valueOf(quantity));

                addQuantityButton.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
                unitsExistingProductTextField.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
            unitsExistingProductTextField.setText("");
        }
    }//GEN-LAST:event_selectUnitsButtonActionPerformed

    private void addQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuantityButtonActionPerformed
        
        g1.getStorageList().getStorageByName(storage).getInventory().getProductByName(product).setQuantity(quantity);
        GlobalUI.setGraph(g1);
        defaultValues();

    }//GEN-LAST:event_addQuantityButtonActionPerformed

    private void selectNewProductNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNewProductNameButtonActionPerformed
        product = newProductNameTextField.getText();
        product = product.replace(" ", "");
        product = product.replace(";", "");
        product = product.replace(":", "");
        product = product.replace(",", "");
        boolean aux = true;

        for (int i = 0; i < inv.length; i++) {
            if (inv[i].getName().equals(product)) {
                aux = false;
                JOptionPane.showMessageDialog(null, "El producto ya existe");
            }

        }

        if (product.equals("")) {
            aux = false;
            JOptionPane.showMessageDialog(null, "El producto no es válido");
        }

        if (aux) {
            unitsNewProductTextField.setEnabled(true);
            selectNewUnitsButton.setEnabled(true);
            productChooserCombo1.setEnabled(false);
            newProductNameTextField.setEnabled(false);
            selectNewProductNameButton.setEnabled(false);
            selectProductButton.setEnabled(false);
            unitsExistingProductTextField.setEnabled(false);
            unitsExistingProductTextField.setEnabled(false);
            unitsExistingProductTextField.setEnabled(false);
            selectUnitsButton.setEnabled(false);
            storageChooserCombo.setEnabled(false);
            selectStorageButton.setEnabled(false);

        }


    }//GEN-LAST:event_selectNewProductNameButtonActionPerformed

    private void selectNewUnitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNewUnitsButtonActionPerformed
        String quant = unitsNewProductTextField.getText();
        if (InterfaceFunctions.isANumber(quant)) {
            if (Integer.parseInt(quant) > 0) {
                quantity = Integer.parseInt(quant);
                newQuantityNumberTitleLabel.setText(quant);
                addQuantityNewProductButton.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un numero valido");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un numero valido");
        }
    }//GEN-LAST:event_selectNewUnitsButtonActionPerformed

    private void addQuantityNewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuantityNewProductButtonActionPerformed
        g1.getStorageList().getStorageByName(storage).getInventory().addNewProductWithQuantity(product, quantity);
        GlobalUI.setGraph(g1);
        defaultValues();
    }//GEN-LAST:event_addQuantityNewProductButtonActionPerformed

    private void babkToTheMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_babkToTheMainActionPerformed
        GlobalUI.getBackToMainPage();
    }//GEN-LAST:event_babkToTheMainActionPerformed

    private void unitsNewProductTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsNewProductTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsNewProductTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(StockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualQuantityLabel;
    private javax.swing.JButton addQuantityButton;
    private javax.swing.JButton addQuantityNewProductButton;
    private javax.swing.JButton babkToTheMain;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField newProductNameTextField;
    private javax.swing.JLabel newQuantityLabel;
    private javax.swing.JLabel newQuantityNumberTitleLabel;
    private javax.swing.JComboBox<String> productChooserCombo1;
    private javax.swing.JButton selectNewProductNameButton;
    private javax.swing.JLabel selectNewProductNameLabel;
    private javax.swing.JButton selectNewUnitsButton;
    private javax.swing.JButton selectProductButton;
    private javax.swing.JLabel selectProductName;
    private javax.swing.JLabel selectProductQuantityLabel;
    private javax.swing.JLabel selectProductQuantityLabel3;
    private javax.swing.JLabel selectQuantityTitleLabel;
    private javax.swing.JLabel selectQuantityTitleLabel1;
    private javax.swing.JButton selectStorageButton;
    private javax.swing.JLabel selectStorageTitleLabel;
    private javax.swing.JButton selectUnitsButton;
    private javax.swing.JComboBox<String> storageChooserCombo;
    private javax.swing.JLabel title;
    private javax.swing.JTextField unitsExistingProductTextField;
    private javax.swing.JTextField unitsNewProductTextField;
    // End of variables declaration//GEN-END:variables
}
