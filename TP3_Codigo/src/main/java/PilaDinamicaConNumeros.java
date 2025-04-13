public class PilaDinamicaConNumeros {

    private Nodo tope;

    public void apilar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.nodoSiguiente = tope;
        tope = nuevoNodo;
    }

    public int desapilar(){
        if (tope == null){
            System.out.println("Punto1 vacía!");
            return -1;
        }
        int dato = tope.dato;
        tope = tope.nodoSiguiente;
        return dato;
    }

    public int mostrarTope(){
        if (tope == null){
            System.out.println("Punto1 vacía!");
            return -1;
        }
        return tope.dato;
    }

    public boolean estaVacia(){
        return tope == null;
    }
}
