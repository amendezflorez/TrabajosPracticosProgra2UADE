public class Punto3 {

    public static void main(String[] args) {


        /*
        Punto 1 :

        Punto 1:
        Implementar dos métodos adicionales a los fundamentales (push, pop, peek, isEmpty, isFull) en una estructura de pila
        basada en un arreglo. Se sugiere, por ejemplo:
        • Método que permita vaciar completamente la pila.
        • Método que devuelva la cantidad de elementos presentes en la pila.

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
         */

/*

SE PRUEBAN ACÁ LOS 2 METODOS

        Punto1 pila =  new Punto1();
        pila.mostrar();
        pila.agregar(5);
        pila.agregar(4);
        pila.agregar(6);
        pila.mostrar();
        System.out.println(pila.cantidadElementos());
        pila.vaciarPila();
        pila.mostrar();

 */

        /*

        PUNTO 2:

        Diseñar e implementar una pila utilizando un arreglo en la que la adición o extracción del elemento (operación pop y
        push) siempre se realice desde la posición 0 del arreglo, desplazando los elementos restantes en cada operación.


        public void eliminar2(){
        if (estaVacia()){
            System.out.println("Pila vacia");
        }
        for (int i = 0 ; i < tope; i++){
            pila[i]= pila[i+1];
        }
        pila[tope]= 0;
        tope--;

         public void agregar2(int valor){
        for (int i = tope ;  i>=0 ; i--){
            pila[i+1] = pila[i];
        }
        pila[0]=valor;
        tope++;
    }
    }


        Pila pila =  new Pila();
        pila.mostrar2();
        pila.agregar2(5);
        pila.agregar2(4);
        pila.agregar2(6);
        pila.mostrar2();
        System.out.println("---------");
        pila.eliminar2();
        pila.mostrar2();



         */

        /*

        PUNTO 4:
        Desarrollar un algoritmo que, dada una expresión matemática o lógica con paréntesis, determine si estos se
        encuentran correctamente balanceados. Es decir, si la cantidad de paréntesis de apertura coincide con la de cierre y
        están correctamente ubicados.

        METODO ESTA FUERA DEL MAIN COMO METODO ESTATICO

        System.out.println( pilaBalanceada("(a + b) * (c - d)"));
        System.out.println( pilaBalanceada("(a + b) * c - d)"));



         */

        /*
        PUNTO 5:

        Escribir un programa que, utilizando una pila, invierta el orden de los caracteres de una cadena de texto ingresada por
        el usuario.


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
         */



    }

    //PUNTO 4
    public static boolean pilaBalanceada (String string){
        PilaEstaticaString pilaString = new PilaEstaticaString();
        for (char c : string.toCharArray()) {

            if (c == '('){
                pilaString.agregar(String.valueOf(c));
            } else if (c ==')') {
                if (pilaString.estaVacia()){
                    return false;
                }
                pilaString.eliminar();
            }
        }
        return pilaString.estaVacia();
    }
}
