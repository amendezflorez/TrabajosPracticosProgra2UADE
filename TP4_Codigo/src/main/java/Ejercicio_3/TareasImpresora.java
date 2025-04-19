package Ejercicio_3;
import Recursos.ColaLineal;
import Recursos.ColaLinealStrings;

public class TareasImpresora {
    private ColaLineal cantidadTareas;
    private ColaLinealStrings tareasImpresion;
    private int capacidad;

    public TareasImpresora(int capacidad) {
        this.capacidad = capacidad;
        cantidadTareas = new ColaLineal(capacidad);
        tareasImpresion = new ColaLinealStrings(capacidad);
    }

    public void agregarTarea(int cantidad, String tarea) {
        cantidadTareas.enqueue(cantidad);
        tareasImpresion.enqueue(tarea);
        System.out.println("Tarea " + tarea + " con cantidad " + cantidad + " agregada con éxito!");
    }
}
