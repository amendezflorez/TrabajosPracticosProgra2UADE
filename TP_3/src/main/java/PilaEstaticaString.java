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

    public void agregarCharComoString(char c){
        if (estaLlena()) {
            System.out.println("Pila llena");
            return;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(c);
        pila[++tope] = builder.toString();
    }

    public void eliminar() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return;
        }
        pila[tope] = null; // opcional: limpiar valor
        tope--;
    }

    public String eliminar3() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return null;
        }
        String valor = pila[tope];
        pila[tope] = null; // opcional: limpiar valor
        tope--;
        return valor;
    }


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

    public char valorTope(){
        String topePila = pila[tope];
        return topePila.charAt(0);
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

    public String reverse(String string){

        StringBuilder resultado = new StringBuilder();
        PilaEstaticaString pilaNueva = new PilaEstaticaString();

        for ( char c : string.toCharArray()){
            pilaNueva.agregar(String.valueOf(c));
        }

        while(!pilaNueva.estaVacia()){
            resultado.append(pilaNueva.eliminar3());

        }
        return String.valueOf(resultado);
    }
}
