/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import main.Graph;


public class NewStoragePage extends javax.swing.JFrame {

    public static Graph g1 = new Graph();
    String name = "";
    String from = "";
    String to = "";
    String directionFrom = "";
    String directionTo = "";
    String direction = "";
    int counterTransmitter = 0;
    /**
     * 
     */
    public NewStoragePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }
    /**
     * Get the default values of the page
     */
    public void defaultValues() {

        nameField.setEnabled(true);
        selectStorageNameButton.setEnabled(true);
        transmitterComboBox.setEnabled(false);
        transmitterCostField.setEnabled(false);
        selectTransmitterStorageButton.setEnabled(false);
        transmitterRutesTextArea.setText("");
        applyTransmitterStorageButton.setEnabled(false);
        receiverComboBox.setEnabled(false);
        receiverCostField.setEnabled(false);
        selectReceiverStorageButton.setEnabled(false);
        ReceiverRutesTextArea.setText("");
        applyTransmitterStorageButton1.setEnabled(false);
        createStorageButton.setEnabled(false);
        name = "";
        from = "";
        to = "";
        directionFrom = "";
        directionTo = "";
        direction = "";
        counterTransmitter = 0;
        nameField.setText("");
        transmitterComboBox.removeAllItems();
        receiverComboBox.removeAllItems();
    }
    
    /**
     * fill the transmitter chooser storage
     * @param g1 
     */

    public void fillTransmitterChooserCombo(Graph g1) {

//        System.out.println(direction);
        transmitterComboBox.removeAllItems();
        String[] storage = g1.namenOnAString();
        String[] arrayAux = InterfaceFunctions.fromTexttoArray(direction);
        System.out.println(arrayAux.length);
        System.out.println(storage.length);

        for (int i = 0; i < storage.length; i++) {

            if (!storage[i].equalsIgnoreCase(from)) {
                boolean validator = true;
                for (int j = 0; j < arrayAux.length; j++) {
                    String[] aux = arrayAux[j].split(",");
                    if (aux[0].equalsIgnoreCase(storage[i])) {
                        validator = false;

                    }
                }
                if (validator) {
                    transmitterComboBox.addItem(storage[i]);

                }
            }
        }

    }
    
    /**
     * fill the receiver chooser storage
     * @param g1 
     */

    public void fillReceiverChooserCombo(Graph g1) {

        receiverComboBox.removeAllItems();
        String[] storage = g1.namenOnAString();
        String[] arrayAux = InterfaceFunctions.fromTexttoArray(direction);
        for (int i = 0; i < storage.length; i++) {
            if (!storage[i].equalsIgnoreCase(to)) {
                boolean validator = true;
                for (int j = 0; j < arrayAux.length; j++) {
                    String[] aux = arrayAux[j].split(",");
                    if (aux[0].equalsIgnoreCase(storage[i])) {
                        validator = false;

                    }
                }
                if (validator) {
                    receiverComboBox.addItem(storage[i]);

                }
            }
        }

    }
    
    /**
     * fill the transmitter chooser storage
     * @param g1 
     */

    public void fillTransmitterCombo(Graph g1) {
        transmitterComboBox.removeAllItems();
        String[] storage = g1.namenOnAString();
        for (int i = 0; i < storage.length; i++) {
            transmitterComboBox.addItem(storage[i]);
        }
    }
    
    /**
     * fill the receiver chooser storage
     * @param g1 
     */

    public void fillReceiverCombo(Graph g1) {
        receiverComboBox.removeAllItems();
        String[] storage = g1.namenOnAString();
        for (int i = 0; i < storage.length; i++) {
            receiverComboBox.addItem(storage[i]);
        }
    }
    /**
     * get the graph information from GlobalUI
     * @param graph 
     */
    public void createGprah(Graph graph) {
        g1 = graph;
        transmitterRutesTextArea.setEditable(false);
        ReceiverRutesTextArea.setEditable(false);
        defaultValues();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        selectReceiverStorageButton = new javax.swing.JButton();
        applyTransmitterStorageButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReceiverRutesTextArea = new javax.swing.JTextArea();
        createStorageButton1 = new javax.swing.JToggleButton();
        applyTransmitterStorageButton = new javax.swing.JButton();
        selectTransmitterStorageButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transmitterRutesTextArea = new javax.swing.JTextArea();
        nameField = new javax.swing.JTextField();
        transmitterComboBox = new javax.swing.JComboBox<>();
        receiverCostField = new javax.swing.JTextField();
        receiverComboBox = new javax.swing.JComboBox<>();
        transmitterCostField = new javax.swing.JTextField();
        createStorageButton = new javax.swing.JToggleButton();
        BackToTheMenuButton = new javax.swing.JToggleButton();
        selectStorageNameButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        writeNameLabel = new javax.swing.JLabel();
        chooseTransmitterLabel = new javax.swing.JLabel();
        transmitterCostLabel = new javax.swing.JLabel();
        chooseReceiverLabel = new javax.swing.JLabel();
        receiverCostLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 255, 0));
        titleLabel.setText("Crear nuevo almacen");
        jPanel4.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 280, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 70));

        selectReceiverStorageButton.setText("Seleccionar");
        selectReceiverStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectReceiverStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(selectReceiverStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 160, -1));

        applyTransmitterStorageButton1.setText("Aplicar");
        applyTransmitterStorageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyTransmitterStorageButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(applyTransmitterStorageButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 160, -1));

        ReceiverRutesTextArea.setColumns(20);
        ReceiverRutesTextArea.setRows(5);
        jScrollPane2.setViewportView(ReceiverRutesTextArea);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 160, 70));

        createStorageButton1.setText("Reiniciar");
        createStorageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStorageButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(createStorageButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 160, -1));

        applyTransmitterStorageButton.setText("Aplicar");
        applyTransmitterStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyTransmitterStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(applyTransmitterStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 160, -1));

        selectTransmitterStorageButton.setText("Seleccionar");
        selectTransmitterStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTransmitterStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(selectTransmitterStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 160, -1));

        transmitterRutesTextArea.setColumns(20);
        transmitterRutesTextArea.setRows(5);
        jScrollPane1.setViewportView(transmitterRutesTextArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 160, 70));
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 160, -1));

        transmitterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmitterComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(transmitterComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 160, -1));

        receiverCostField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiverCostFieldActionPerformed(evt);
            }
        });
        jPanel2.add(receiverCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 160, -1));

        jPanel2.add(receiverComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 160, -1));
        jPanel2.add(transmitterCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 160, -1));

        createStorageButton.setText("Crear almacen");
        createStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(createStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 160, 20));

        BackToTheMenuButton.setText("Regresar al menu");
        BackToTheMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToTheMenuButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BackToTheMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 160, 60));

        selectStorageNameButton.setText("Seleccionar");
        selectStorageNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStorageNameButtonActionPerformed(evt);
            }
        });
        jPanel2.add(selectStorageNameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 160, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        writeNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        writeNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        writeNameLabel.setText("Ingrese nombre del almacen:");
        jPanel1.add(writeNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 20));

        chooseTransmitterLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chooseTransmitterLabel.setForeground(new java.awt.Color(255, 255, 255));
        chooseTransmitterLabel.setText("Almacen emisor:");
        jPanel1.add(chooseTransmitterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 20));

        transmitterCostLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        transmitterCostLabel.setForeground(new java.awt.Color(255, 255, 255));
        transmitterCostLabel.setText("Distancia en Km:");
        jPanel1.add(transmitterCostLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        chooseReceiverLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chooseReceiverLabel.setForeground(new java.awt.Color(255, 255, 255));
        chooseReceiverLabel.setText("Almacen receptor:");
        jPanel1.add(chooseReceiverLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 20));

        receiverCostLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        receiverCostLabel.setForeground(new java.awt.Color(255, 255, 255));
        receiverCostLabel.setText("Distancia en Km:");
        jPanel1.add(receiverCostLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 260, 450));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStorageButtonActionPerformed
        InterfaceFunctions.createNewStorage(name, directionTo, directionFrom);
        JOptionPane.showMessageDialog(null, "Almacén creado con éxito");
        defaultValues();

    }//GEN-LAST:event_createStorageButtonActionPerformed

    private void BackToTheMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToTheMenuButtonActionPerformed
        GlobalUI.getBackToMainPage();
    }//GEN-LAST:event_BackToTheMenuButtonActionPerformed

    private void transmitterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmitterComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transmitterComboBoxActionPerformed

    private void selectStorageNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStorageNameButtonActionPerformed
        name = nameField.getText().toUpperCase();
        name = name.replace("ALMACEN", "");
        name = name.replace("ALMACÉN", "");
        name = name.replace(" ", "");
        name = name.replace(",", "");
        name = name.replace(";", "");
        name = name.replace(":", "");
        
        if(!name.contains("ALMACEN")){
            name = "Almacen "+ name;

        if (InterfaceFunctions.selectStorageName(name)) {
            transmitterComboBox.setEnabled(true);
            transmitterCostField.setEnabled(true);
            selectTransmitterStorageButton.setEnabled(true);
            nameField.setEnabled(false);
            selectStorageNameButton.setEnabled(false);
            fillTransmitterCombo(g1);

        }
        }else{
            JOptionPane.showMessageDialog(null, "Error al introducir el nombre del almacen. Recuerde utilizar los espacios.");
        }
        
        


    }//GEN-LAST:event_selectStorageNameButtonActionPerformed

    private void selectTransmitterStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTransmitterStorageButtonActionPerformed
        applyTransmitterStorageButton.setEnabled(true);
        if (transmitterComboBox.getSelectedItem() != null && counterTransmitter + 1 < GlobalUI.getGraph().getCounter()) {
            String cost = transmitterCostField.getText();
            String storage = transmitterComboBox.getSelectedItem().toString();
            System.out.println(storage);
            if (InterfaceFunctions.isANumber(cost)) {
                int distance = Integer.parseInt(cost);
                String output = "";
                directionFrom += storage + "," + distance + "  ";
                direction += storage + "," + distance + "  ";
                fillTransmitterChooserCombo(GlobalUI.getGraph());
                transmitterRutesTextArea.setText("");
                String[] directionArray = directionFrom.split("  ");
                for (int i = 0; i < directionArray.length; i++) {
                    output += directionArray[i] + "\n";

                }
                transmitterRutesTextArea.setText(output);

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un numero válido en la distancia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe quedar al menos un almacén disponible como receptor");
            transmitterComboBox.setEnabled(false);
            transmitterCostField.setEnabled(false);
            selectTransmitterStorageButton.setEnabled(false);

        }
        counterTransmitter++;
        transmitterCostField.setText("");


    }//GEN-LAST:event_selectTransmitterStorageButtonActionPerformed

    private void applyTransmitterStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyTransmitterStorageButtonActionPerformed
        fillReceiverChooserCombo(GlobalUI.getGraph());
        transmitterComboBox.setEnabled(false);
        transmitterCostField.setEnabled(false);
        selectTransmitterStorageButton.setEnabled(false);
        applyTransmitterStorageButton.setEnabled(false);
        receiverComboBox.setEnabled(true);

        receiverCostField.setEnabled(true);
        selectReceiverStorageButton.setEnabled(true);
        

    }//GEN-LAST:event_applyTransmitterStorageButtonActionPerformed

    private void selectReceiverStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectReceiverStorageButtonActionPerformed

        if (receiverComboBox.getSelectedItem() != null) {
            String cost = receiverCostField.getText();
            String storage = receiverComboBox.getSelectedItem().toString();
            System.out.println(storage);
            if (InterfaceFunctions.isANumber(cost)) {
                int distance = Integer.parseInt(cost);
                String output = "";
                directionTo += storage + "," + distance + "  ";
                direction += storage + "," + distance + "  ";
                fillReceiverChooserCombo(GlobalUI.getGraph());
                ReceiverRutesTextArea.setText("");
                String[] directionArray = directionTo.split("  ");
                for (int i = 0; i < directionArray.length; i++) {
                    output += directionArray[i] + "\n";
                }
                ReceiverRutesTextArea.setText(output);
                applyTransmitterStorageButton1.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un numero válido en la distancia");
            }
        } else {
            receiverComboBox.setEnabled(false);
            receiverCostField.setEnabled(false);
            selectReceiverStorageButton.setEnabled(false);
        }
        receiverCostField.setText("");
    }//GEN-LAST:event_selectReceiverStorageButtonActionPerformed

    private void applyTransmitterStorageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyTransmitterStorageButton1ActionPerformed
        receiverComboBox.setEnabled(false);
        receiverCostField.setEnabled(false);
        selectReceiverStorageButton.setEnabled(false);
        applyTransmitterStorageButton1.setEnabled(false);
        createStorageButton.setEnabled(true);

    }//GEN-LAST:event_applyTransmitterStorageButton1ActionPerformed

    private void receiverCostFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiverCostFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiverCostFieldActionPerformed

    private void createStorageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStorageButton1ActionPerformed
        defaultValues();
    }//GEN-LAST:event_createStorageButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewStoragePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStoragePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStoragePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStoragePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStoragePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BackToTheMenuButton;
    private javax.swing.JTextArea ReceiverRutesTextArea;
    private javax.swing.JButton applyTransmitterStorageButton;
    private javax.swing.JButton applyTransmitterStorageButton1;
    private javax.swing.JLabel chooseReceiverLabel;
    private javax.swing.JLabel chooseTransmitterLabel;
    private javax.swing.JToggleButton createStorageButton;
    private javax.swing.JToggleButton createStorageButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> receiverComboBox;
    private javax.swing.JTextField receiverCostField;
    private javax.swing.JLabel receiverCostLabel;
    private javax.swing.JButton selectReceiverStorageButton;
    private javax.swing.JButton selectStorageNameButton;
    private javax.swing.JButton selectTransmitterStorageButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> transmitterComboBox;
    private javax.swing.JTextField transmitterCostField;
    private javax.swing.JLabel transmitterCostLabel;
    private javax.swing.JTextArea transmitterRutesTextArea;
    private javax.swing.JLabel writeNameLabel;
    // End of variables declaration//GEN-END:variables
}