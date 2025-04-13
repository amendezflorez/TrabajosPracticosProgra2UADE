public class PilaEstaticaString {

    final int MAX = 5;
    String[] pila = new String[MAX];
    int tope = -1;

    public boolean estaVacia() {
        return tope == -1;
    }

    public boolean estaLlena() {
        return tope == MAX - 1;
    }

    public void agregar(String valor) {
        if (estaLlena()) {
            System.out.println("Pila llena");
            return;
        }
        pila[++tope] = valor;
    }

    // Agrega el elemento en la posición 0, desplazando el resto hacia la derecha
    public void agregar2(String valor) {
        if (estaLlena()) {
            System.out.println("Pila llena");
            return;
        }
        for (int i = tope; i >= 0; i--) {
            pila[i + 1] = pila[i];
        }
        pila[0] = valor;
        tope++;
    }

    public void eliminar() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return;
        }
        pila[tope] = null; // opcional: limpiar valor
        tope--;
    }

    // Elimina el primer elemento (posición 0) y desplaza el resto hacia la izquierda
    public void eliminar2() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return;
        }
        for (int i = 0; i < tope; i++) {
            pila[i] = pila[i + 1];
        }
        pila[tope] = null; // opcional
        tope--;
    }

    public void mostrarTope() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return;
        }
        System.out.println("Tope: " + pila[tope]);
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return;
        }
        System.out.println("Elementos (de tope a base):");
        for (int i = tope; i >= 0; i--) {
            System.out.println(pila[i]);
        }
    }

    public void mostrar2() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return;
        }
        System.out.println("Elementos (de base a tope):");
        for (int i = 0; i <= tope; i++) {
            System.out.println(pila[i]);
        }
    }

    public int cantidadElementos() {
        return tope + 1;
    }

    public void vaciarPila() {
        if (estaVacia()) {
            System.out.println("La pila ya está vacía");
            return;
        }
        for (int i = 0; i <= tope; i++) {
            pila[i] = null;
        }
        tope = -1;
        System.out.println("Pila vaciada");
    }
}
