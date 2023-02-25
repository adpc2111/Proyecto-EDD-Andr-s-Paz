/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import main.Graph;

/**
 *
 * @author isaac
 */
public class GlobalUI {

    private static final MainPage mainPage = new MainPage();
    private static final NewRute addNewRutesPage = new NewRute();
    private static final NewStoragePage newStoragePage = new NewStoragePage();
   
    private static final NewOrder newOrderPage = new NewOrder();
    private static final UploadData uploadDataPage = new UploadData();
    private static final StockPage stockManagementPage = new StockPage();
    private static Graph graph = new Graph();
    private static String direction;

    /**
     *
     * Opens the main interface page
     */
    public static void openMainPage() {
        getMainPage().setVisible(true);
    }

    /**
     *
     * hides the main interface page and opens NewStoragePage
     */
    public static void openNewStoragePage() {
        getNewStoragePage().setVisible(true);
        getMainPage().setVisible(false);
        getNewStoragePage().createGprah(graph);
    }

    /**
     *
     * opens showInvPage
     */
   
    
    /**
     *
     * opens show AddNewRutes
     */
    public static void openAddNewRutes() {
        getAddNewRutesPage().setVisible(true);
        
        getMainPage().setVisible(false);
        getAddNewRutesPage().createGprah(getGraph());
    }

    /**
     *
     * Hides every sub-page, and opens MainPage
     */
    public static void getBackToMainPage() {
        getMainPage().setVisible(true);

        // in here we will be adding every page to setVisible(false)
        // so we can recycle this method for every page
        getNewStoragePage().setVisible(false);
        
        getNewOrderPage().setVisible(false);
        getUploadDataPage().setVisible(false);
        getAddNewRutesPage().setVisible(false);
        getStockManagementPage().setVisible(false);

    }

    /**
     *
     * opens NewOrder
     */
    public static void openNewOrderPage() {
        getMainPage().setVisible(false);
        
        InterfaceFunctions.initNewOrderPage();
        getNewOrderPage().setVisible(true);
    }

    
      /**
     *
     * opens UploadData
     */
    public static void openUploadDataPage() {
        getMainPage().setVisible(false);
        getUploadDataPage().setVisible(true);
    }

    /**
     * Shows the graphic for the main graph
     */
    public static void showGraphMap() {
        InterfaceFunctions.createGraphMap();
    }

    /**
     *
     * Getter for MainPage
     *
     * @return MainPage
     */
    public static MainPage getMainPage() {
        return mainPage;
    }

    /**
     *
     * Getter for NewStoragePage
     *
     * @return NewStoragePage
     */
    public static NewStoragePage getNewStoragePage() {
        return newStoragePage;
    }
    
    /**
     *
     * opens StockManagementPage
     */
    public static void openStockManagementPage() {
        getStockManagementPage().setVisible(true);
        stockManagementPage.setGraph(getGraph());
        getMainPage().setVisible(false);
    }

 
    public static Graph getGraph() {
        return graph;
    }

    /**
     *
     * Setter for Graph
     *
     * @param graph
     */
    public static void setGraph(Graph graph) {
        GlobalUI.graph = graph;
    }

    /**
     *
     * Getter for NewOrder
     *
     * @return NewOrder
     */
    public static NewOrder getNewOrderPage() {
        return newOrderPage;
    }
    
    /**
     * Getter for direction
     * @return 
     */

    public static String getDirection() {
        return direction;
    }
    
    /**
     * setter for Direction
     * @param direction 
     */

    public static void setDirection(String direction) {
        GlobalUI.direction = direction;
    }
    /**
     *
     * Getter for UploadData
     *
     * @return UploadData
     */
    public static UploadData getUploadDataPage() {
        return uploadDataPage;
    }
    
    /**
     * Getter for NewRute
     * @return 
     */

    public static NewRute getAddNewRutesPage() {
        return addNewRutesPage;
    }
    
    /**
     * Getter for StockPage
     * @return 
     */

    public static StockPage getStockManagementPage() {
        return stockManagementPage;
    }
    
    
    
    

}
