/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Interface.GlobalUI;
import javax.swing.JOptionPane;

public class Amazon {


    public static void main(String[] args) {
        initializeApp();
        GlobalUI.openMainPage();

    }

    public static void initializeApp() {

        int v;
       
        String direccion = "src//File//amazon.txt";
        GlobalUI.setDirection(direccion);
        File dataFile = new File();
        String arInfo = dataFile.readFile(direccion);

        v = dataFile.numVertices(arInfo);
        MatrixGraph am = new MatrixGraph(v);

        
        Graph g1 = dataFile.getInfo(arInfo, am);

        GlobalUI.setGraph(g1);

    }

    public static void initializeAppWithNewInfo(String path) {
        int v;
        String direccion = path;

        File dataFile = new File();
        String arInfo = dataFile.readFile(direccion);

        if (!(arInfo.contains("Almacenes") && arInfo.contains("Rutas"))) {
            JOptionPane.showMessageDialog(null, "Alerta, el documento dado no contiene el formato correspondiente, por favor intentar de nuevo", "Alerta", 2);
        } else {
            v = dataFile.numVertices(arInfo);

            if (v == -1) {
                JOptionPane.showMessageDialog(null, "Alerta, el documento dado no contiene el formato correspondiente, por favor intentar de nuevo", "Alerta", 2);

            } else {
                MatrixGraph am = new MatrixGraph(v);

                Graph g1 = dataFile.getInfo(arInfo, am);
                if (g1 != null) {
                    GlobalUI.setDirection(direccion);
                    GlobalUI.setGraph(g1);
                    JOptionPane.showMessageDialog(null, "Proceso exitoso, los datos han sido cargados", "Éxito", 1);

                } else {
                    JOptionPane.showMessageDialog(null, "Alerta, el documento dado no contiene el formato correspondiente, por favor intentar de nuevo", "Alerta", 2);

                }
            }
        }

    }

}
