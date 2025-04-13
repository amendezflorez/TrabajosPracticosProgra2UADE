public class Pila {

    final int MAX = 5;
    int[]pila = new int[MAX];
    int tope = -1;

    public boolean estaVacia(){
        if (tope==-1){
            return true;
        }

        return false;
    }

    public boolean estaLlena(){
        if (tope == MAX -1){
            return true;
        }
        return false;
    }

    public void agregar(int valor){
        if (estaLlena()){
            System.out.println("Pila llena");
        }
        pila [++tope] = valor;
    }

    public void eliminar(){
        if (estaVacia()){
            System.out.println("Esta vacìa la pila");
        }
        pila[tope]= 0;
        tope -=1;
    }

    public void mostrarTope(){
        if (estaVacia()){
            System.out.println("Pila vacia");

        }

        System.out.println(pila[tope]);
    }

    public void mostrar(){
        if (estaVacia()){
            System.out.println("Pila vacia");
            return;
        }
        for (int i = tope ; i >=0 ; i--){
            System.out.println(pila[i]);
        }
    }
}
