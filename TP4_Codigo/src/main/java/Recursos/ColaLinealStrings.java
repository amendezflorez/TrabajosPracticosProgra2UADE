package Recursos;

public class ColaLinealStrings {
    private String[] cola;
    private int frente;
    private int fin;
    private int capacidad;

    public ColaLinealStrings(int tamaño) {
        capacidad = tamaño;
        cola = new String[capacidad];
        frente = -1;
        fin = -1;
    }

    public void enqueue(String valor) {
        if (isFull()) {
            System.out.println("La cola está llena. No se puede añadir más elementos.");
            return;
        }
        if (isEmpty()) {
            frente = 0;
        }
        cola[++fin] = valor;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No se puede eliminar elementos.");
            return null;
        }
        String elementoEliminado = cola[frente];

        for (int i = 0; i <= capacidad - 2; i++) {
            cola[i] = cola[i + 1];
        }
        fin--;
        return elementoEliminado;

    }

    public boolean isEmpty() {
        return frente == -1;
    }

    public boolean isFull() {
        return fin == capacidad - 1;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No hay elementos para mostrar.");
            return null;
        }
        return cola[frente];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Cola: ");
        for (int i = frente; i <= fin; i++) {
            System.out.print(cola[i] + " ");
        }
        System.out.println();
    }
}
