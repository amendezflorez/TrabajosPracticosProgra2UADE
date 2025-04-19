package Ejercicio_2;
import Recursos.ColaLineal;

public class ControlTurnos {
    private ColaLineal cola;
    private int capacidad;

    public ControlTurnos(int capacidad) {
        this.capacidad = capacidad;
        cola = new ColaLineal(capacidad);
    }

    public void agregarTurno(int turno) {
        cola.enqueue(turno);
        System.out.println("Turno " + turno + " agregado con éxito!");
    }

    public void atenderTurno() {
        int turnoAtendido = cola.dequeue();
        if (turnoAtendido != -1) {
            System.out.println("El turno " + turnoAtendido + " está siendo atendido ahora");
        } else {
            System.out.println("No hay turnos para atender.");
        }
    }

    public boolean hayTurnos() {
        return !cola.isEmpty();
    }

    public void mostrarTurnos() {
        cola.display();
    }
}
