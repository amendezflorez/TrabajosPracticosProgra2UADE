package Recursos;

public class ColaLineal implements Colas {
    private int[] cola;
    private int frente;
    private int fin;
    private int capacidad;

    public ColaLineal(int tamaño) {
        capacidad = tamaño;
        cola = new int[capacidad];
        frente = -1;
        fin = -1;
    }

    @Override
    public void enqueue(int valor) {
        if (isFull()) {
            System.out.println("La cola está llena. No se puede añadir más elementos.");
            return;
        }
        if (isEmpty()) {
            frente = 0;
        }
        cola[++fin] = valor;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No se puede eliminar elementos.");
            return -1;
        }
        int elementoEliminado = cola[frente];

        for (int i = 0; i <= capacidad - 2; i++) {
            cola[i] = cola[i + 1];
        }
        fin--;

        /*if (frente >= fin) {
            frente = -1;
            fin = -1;
        } else {
            frente++;
        }*/
        return elementoEliminado;

    }

    @Override
    public boolean isEmpty() {
        return frente == -1;
    }

    @Override
    public boolean isFull() {
        return fin == capacidad - 1;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        return cola[frente];
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Elementos en la cola: ");
        for (int i = frente; i <= fin; i++) {
            System.out.print(cola[i] + " ");
        }
        System.out.println();
    }
}
