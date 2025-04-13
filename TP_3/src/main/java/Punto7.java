public class Punto7 {
    private String[] elementos;
    private int maxSize;
    private int top;

    public Punto7(int size) {
        maxSize = size;
        elementos = new String[maxSize];
        top = -1;
    }

    public boolean estaVacia() {
        return top == -1;
    }

    public boolean estaLlena() {
        return top == maxSize - 1;
    }


    public void encolar(String item) {
        if (!estaLlena()) {
            elementos[++top] = item;
        } else {
            System.out.println("Pila llena, no se puede añadir el elemento: " + item);
        }
    }


    public String desencolar() {
        if (!estaVacia()) {
            return elementos[top--];
        } else {
            System.out.println("Pila vacía, no hay elementos para extraer.");
            return null;
        }
    }


    public String mostrarTope() {
        if (!estaVacia()) {
            return elementos[top];
        } else {
            return null;
        }
    }


    public int mostrarTamanio() {
        return top + 1;
    }


    public void limpiarPila() {
        top = -1;
    }

}
