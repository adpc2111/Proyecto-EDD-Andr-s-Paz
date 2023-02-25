/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Scanner;

public class MatrixGraph {
    
    Scanner sc = new Scanner(System.in);
    private int numVertices;
    private int matrix [][];
    

    public MatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        matrix = new int[numVertices][numVertices];    
    }
    
    public int getNumVertices() {
        return numVertices;
    }
    

    public int[][] getMatrix() {
        return matrix;
    }
    

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void addEdge(int from, int to, int cost){
        matrix[from][to] = cost;       
    }
    

    public void printMatrix(){
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    
    public void getEdge(){
        int origen =0;
        int destino=1;
        int costo = 1;
        
        for (int i = 0; i < numVertices; i++) {
            addEdge(origen,destino,costo);
            origen +=1;
            if(origen == (numVertices-1)){
                destino = 0;
            }else{
              destino+=1;  
            }
            costo+=2;
        }
    }
    
    
    
    
    
}
