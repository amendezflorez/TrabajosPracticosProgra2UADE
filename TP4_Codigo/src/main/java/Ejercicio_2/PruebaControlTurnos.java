package Ejercicio_2;

public class PruebaControlTurnos {
    public static void main(String[] args) {
        ControlTurnos controlTurnos = new ControlTurnos(5);

        controlTurnos.agregarTurno(1);
        controlTurnos.agregarTurno(2);
        controlTurnos.agregarTurno(3);
        controlTurnos.agregarTurno(4);
        controlTurnos.agregarTurno(5);

        System.out.println("Mostrando turnos:");
        controlTurnos.mostrarTurnos();

        controlTurnos.atenderTurno();
        controlTurnos.atenderTurno();

        if (controlTurnos.hayTurnos()) {
            System.out.println("Hay turnos pendientes.");
        } else {
            System.out.println("No hay turnos pendientes.");
        }

        controlTurnos.mostrarTurnos();
    }
}
