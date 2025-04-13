public class Punto1 {

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
            System.out.println("Punto1 llena");
        }
        pila [++tope] = valor;
    }

    public void agregar2(int valor){
        for (int i = tope ;  i>=0 ; i--){
            pila[i+1] = pila[i];
        }
        pila[0]=valor;
        tope++;
    }

    public void eliminar(){
        if (estaVacia()){
            System.out.println("Esta vacìa la pila");
        }
        pila[tope]= 0;
        tope -=1;
    }

    public void eliminar2(){
        if (estaVacia()){
            System.out.println("Pila vacia");
        }
        for (int i = 0 ; i < tope; i++){
            pila[i]= pila[i+1];
        }
        pila[tope]= 0;
        tope--;
    }

    public void mostrarTope(){
        if (estaVacia()){
            System.out.println("Punto1 vacia");

        }

        System.out.println(pila[tope]);
    }

    public void mostrar(){
        if (estaVacia()){
            System.out.println("Punto1 vacia");
            return;
        }
        for (int i = tope ; i >=0 ; i--){
            System.out.println(pila[i]);
        }
    }

    public void mostrar2(){
        if (estaVacia()){
            System.out.println("Pila vacia");
            return;
        }
        for (int i = 0 ; i <=tope ; i++){
            System.out.println(pila[i]);
        }
    }

    public int cantidadElementos(){
        if (estaVacia()){
            System.out.println("La pila está vacía");
            return 0;
        }

        return tope +1;
    }

    public void vaciarPila(){
        if (estaVacia()){
            System.out.println("La pila está vacía");

            return;
        }

        for (int i = 0 ; i <=tope; i++){
            pila[i]= 0;
        }

        tope = -1;
    }
}
