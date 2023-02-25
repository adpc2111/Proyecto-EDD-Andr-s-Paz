/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


public class ListInv {

    private NodeInv head;
    private NodeInv end;
    private int length;


    public ListInv() {
        this.head = null;
        this.end = null;
        this.length = 0;
    }

    public NodeInv getHead() {
        return head;
    }

    public NodeInv getEnd() {
        return end;
    }

    public int getLength() {
        return length;
    }

    public void setHead(NodeInv head) {
        this.head = head;
    }

    public void setEnd(NodeInv end) {
        this.end = end;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addHead(Product head) {
        NodeInv nodito = new NodeInv(head);
        if (isEmpty()) {
            setHead(nodito);
            end = nodito;

        } else {
            NodeInv aux = this.head;
            nodito.setNext(aux);
            setHead(nodito);
        }

        length++;
    }

    public void addEnd(Product end) {
        NodeInv nodito = new NodeInv(end);
        if (isEmpty()) {
            setHead(nodito);
            this.end = nodito;

        } else {
            NodeInv aux = this.head;
            for (int i = 0; i < length; i++) {
                if (aux.getNext() == null) {
                    aux.setNext(nodito);
                    this.end = nodito;
                } else {
                    aux = aux.getNext();
                }
            }
        }

        length++;
    }


    public void addIndex(int pos, Product middle) {
        NodeInv nodito = new NodeInv(middle);
        int cont = 0;
        if (isEmpty()) {
            setHead(nodito);
            this.end = nodito;

        } else {
            NodeInv aux = head;
            while (cont < pos && aux.getNext() != null) {
                aux = aux.getNext();
                cont += 1;
            }
            nodito.setNext(aux.getNext());
            aux.setNext(nodito);

            if ((pos + 1) >= length) {
                this.end = nodito;
            }

            length++;

        }

    }


    public void deleteHead() {
        NodeInv aux = head;
        if (length == 1) {
            setHead(null);
            length--;
        } else if (!isEmpty()) {
            aux = head.getNext();
            setHead(aux);
            this.head = aux;
            length--;
        }
    }

    /**
     * Delete a end in the list
     */
    public void deleteEnd() {
        NodeInv aux = head;
        if (length == 1) {
            deleteHead();
        } else if (!isEmpty()) {
            for (int i = 0; i < length; i++) {
                if (aux.getNext().getNext() == null) {
                    aux.setNext(null);
                    this.end = aux;
                    length--;
                } else {
                    aux = aux.getNext();
                }
            }

        }
    }


    public void deleteInIndex(int pos) {
        int cont = 0;
        if (length == 1) {
            deleteHead();
        } else if (length <= (pos + 1)) {
            deleteEnd();
        } else if (!isEmpty()) {
            NodeInv aux = head;
            while (cont < pos && aux.getNext() != null) {
                aux = aux.getNext();
                cont += 1;
            }
            aux.setNext(aux.getNext().getNext());

            length--;
        }

    }

    public void printQuantity() {
        NodeInv aux = head;
        if (!isEmpty()) {
            for (int i = 0; i < length; i++) {
                System.out.println(aux.getProduct().getQuantity());
                aux = aux.getNext();
            }
        }
    }

    public void printName() {
        NodeInv aux = head;
        if (!isEmpty()) {
            for (int i = 0; i < length; i++) {
                System.out.println(aux.getProduct().getName());
                aux = aux.getNext();
            }
        }
    }

    public void printInventory() {
        NodeInv aux = head;
        if (!isEmpty()) {
            for (int i = 0; i < length; i++) {
                System.out.println("\nProducto: " + aux.getProduct().getName() + "\nCantidad: " + aux.getProduct().getQuantity() + "\n");

                aux = aux.getNext();
            }
        }
    }

    public Product getElementInIndex(int pos) {
        if (!isEmpty()) {
            NodeInv pointer = getHead();
            for (int i = 0; i < pos; i++) {
                if (pointer.getNext() == null) {
                    break;
                }
                pointer = pointer.getNext();
            }
            return pointer.getProduct();
        } else {
            return null;
        }

    }

    public String[] getInvStringArray() {
        String[] array;
        array = new String[getLength()];
        for (int i = 0; i < getLength(); i++) {
            array[i] = getElementInIndex(i).getName();
        }

        return array;

    }


    public Product getProductByName(String productName) {
        NodeInv pointer = getHead();
        Product wantedProduct = null;
        while(pointer != null) {
            if (pointer.getProduct().getName().equals(productName)) {
                wantedProduct = pointer.getProduct();
                break;
            }
            pointer = pointer.getNext();
        }
        
        return wantedProduct;
    }
    

    public Product[] getProductStringArray() {
        Product[] array;
        array = new Product[getLength()];
        for (int i = 0; i < getLength(); i++) {
            array[i] = getElementInIndex(i);
        }

        return array;

    }
    

    public void addNewProductWithQuantity(String name, int quantity){
        Product p = new Product(quantity,name);
        addEnd(p);
        
    }

}
