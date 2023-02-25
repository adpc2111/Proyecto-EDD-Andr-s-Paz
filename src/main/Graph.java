/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


public class Graph {

    private MatrixGraph matrix;
    private ListStorage storageList;
    private int counter;


    public Graph(MatrixGraph matrix) {
        this.matrix = matrix;
        this.storageList = null;
    }

    public Graph() {

    }

    public MatrixGraph getAdjMatrix() {
        return matrix;
    }

    public ListStorage getStorageList() {
        return storageList;
    }


    public void setMatrix(MatrixGraph matrix) {
        this.matrix = matrix;
    }

    /**
     * Setter Method
     *
     * @param storage
     */
    public void setStorage(ListStorage storage) {
        this.storageList = storage;
    }

    public void printInventory(int index) {
        storageList.getStorageNodeByIndex(index).getStorage().getInventory().printInventory();
    }


    public void printStorageName(int n) {
        System.out.println("\n" + storageList.getStorageNodeByIndex(n).getStorage().getName());
    }


    public void createStorage(ListInv i, String n) {
        Storage a = new Storage(i, n);
        if (storageList.getLength() == 0) {
            storageList.addHead(a);
        } else {
            storageList.addEnd(a);
        }

        counter++;
    }


    public Product product(String name, int quantity) {
        Product p1 = new Product(quantity, name);
        return p1;
    }

    public int getStorageNumber(String letter) {
        int num = 0;
        for (int i = 0; i < storageList.getLength(); i++) {
            String storage = storageList.getStorageNodeByIndex(i).getStorage().getName();
            String[] storageArray = storage.split(" ");
            
            if (letter.equalsIgnoreCase(storageArray[1])) {
                num = i;
                break;
            }
        }

        return num;
    }
    

    public int getStorageNumberWithName(String name){
        int num = 0;
        for (int i = 0; i < storageList.getLength(); i++) {
            String storageName = storageList.getStorageNodeByIndex(i).getStorage().getName();
            if (storageName.equalsIgnoreCase(name)) {
                num = i;
                break;
            }
            
        }
        return num;
    }


    public int getCounter() {
        return counter;
    }


    public String[] namenOnAString() {
        String[] chain;
        chain = new String[counter];
        for (int i = 0; i < counter; i++) {
            chain[i] = storageList.getStorageNodeByIndex(i).getStorage().getName();

        }

        return chain;

    }

    public NodeStorage getFirstNode() {
        return getStorageList().getHead();
    }

    public int getNodeIndex(NodeStorage node) {
        NodeStorage pointer = getStorageList().getHead();
        int cont = 0;
        while (pointer != node) {
            pointer = pointer.getNext();
            cont++;
        }

        return cont;
    }

    public ObjectList getStoragesByDFS() {
        NodeStorage currentNode = getFirstNode();
        ObjectList traveledNodes = new ObjectList();
        ObjectList traveledIndexes = new ObjectList();

        int[][] adjMatrix = getAdjMatrix().getMatrix();


        boolean traveledAllNodes = false;
        int stepsBack = 0;

        mainLoop:
        while (!traveledAllNodes) {
            int currentIndex = getNodeIndex(currentNode);

            boolean validRoute = false;

            if (!traveledNodes.isObjectInList(currentNode.getStorage())) {
                traveledNodes.addEnd(currentNode.getStorage());
                traveledIndexes.addStart(currentIndex);
            }

            innerLoop:
            for (int i = 0; i < adjMatrix[currentIndex].length; i++) {
                int route = adjMatrix[currentIndex][i];

                if (route != 0) {
                    if (!traveledIndexes.isObjectInList(i)) {
                        
                        currentNode = getStorageList().getStorageNodeByIndex(i);
                        
                        validRoute = true;
                        stepsBack = 0;
                        break;
                    }
                }
            }

            if (traveledNodes.getLength() == getStorageList().getLength()) {
                traveledAllNodes = true;
            }
            if (!validRoute) {
                stepsBack++;
                int newIndex = (int) traveledIndexes.getElementInIndex(stepsBack);
                currentNode = getStorageList().getStorageNodeByIndex(newIndex);

            }
        }

        return traveledNodes;
    }

  
    public ObjectList getStoragesByBFS() {
        NodeStorage currentNode = getFirstNode();
        ObjectList traveledNodes = new ObjectList();
        ObjectList indexToCheck = new ObjectList();

        int[][] adjMatrix = getAdjMatrix().getMatrix();

        boolean traveledAllNodes = false;

        traveledNodes.addEnd(currentNode.getStorage());
        indexToCheck.addEnd(getNodeIndex(currentNode));

        while (!traveledAllNodes) {
            currentNode = getStorageList().getStorageNodeByIndex((int) (indexToCheck.getHead().getElement()));
            indexToCheck.deleteStart();

            int currentIndex = getNodeIndex(currentNode);

            for (int i = 0; i < adjMatrix[currentIndex].length; i++) {
                int route = adjMatrix[currentIndex][i];

                if (route != 0) {
                    Storage objectToEvaluate = getStorageList().getStorageNodeByIndex(i).getStorage();
                    if (!traveledNodes.isObjectInList(objectToEvaluate)) {
                        traveledNodes.addEnd(getStorageList().getStorageNodeByIndex(i).getStorage());
                        indexToCheck.addEnd(i);
                    }

                }

            }

            if (traveledNodes.getLength() == getStorageList().getLength()) {
                traveledAllNodes = true;
            }

        }

        getAdjMatrix().printMatrix();
        System.out.println("----");

        return traveledNodes;

    }
   
    public void insertNewStorage(String name){
        Storage storag = new Storage(name);
        this.storageList.addEnd(storag);
        counter++;
        
    }
}
