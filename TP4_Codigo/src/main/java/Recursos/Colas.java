package Recursos;

public interface Colas {

    public void enqueue(int valor);
    public int dequeue();
    public boolean isEmpty();
    public boolean isFull();
    public int peek();
    public void display();
}
