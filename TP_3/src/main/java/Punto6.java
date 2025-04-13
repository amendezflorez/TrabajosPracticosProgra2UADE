public class Punto6 {

    private StringBuilder resultado;
    private PilaEstaticaString pilaDeStrings;

    public Punto6(){
        resultado = new StringBuilder();
        pilaDeStrings = new PilaEstaticaString();
    }

    public String infijaToPostfija(String expresionMatematica){

        for (char c : expresionMatematica.toCharArray()) {
            if(Character.isDigit(c)) {
                resultado.append(c).append(" ");
            } else if (c == '(') {
                pilaDeStrings.agregarCharComoString(c);
            } else if (c == ')') {
                while (!pilaDeStrings.estaVacia() && pilaDeStrings.tope != '('){
                    resultado.append(pilaDeStrings.eliminar3());
                    resultado.append(" ");
                }
                pilaDeStrings.eliminar();
            } else {
                while (!pilaDeStrings.estaVacia() && precedenciaOp(c) <= precedenciaOp(pilaDeStrings.valorTope())){
                    resultado.append(pilaDeStrings.eliminar3()).append(" ");
                }
                pilaDeStrings.agregarCharComoString(c);
            }
        }
        while (!pilaDeStrings.estaVacia()){
            resultado.append(pilaDeStrings.eliminar3()).append(" ");
        }
        return resultado.toString().trim();
    }

    private int precedenciaOp(char op){

        switch (op){
            case '+','-':
                return 1;

            case '*','/':
                return 2;

            default:
                return 0;
        }
    }
}
