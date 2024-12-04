import java.util.List;
import java.util.ArrayList;

public final class GestorTareas {

  private final List<Tarea> tareas = new ArrayList<>();

  public void agregarTarea(final Tarea tarea) { // El parámetro debe ser final.
    if (tarea == null) {
      System.out.println("La tarea no puede ser nula.");
      return; // Evitar agregar tareas nulas.
    }
    tareas.add(tarea);
  }

  public int obtenerTotalTareas() {
    return tareas.size();
  }

  public void eliminarTarea(final int codigo) {
    if (codigo < 0 || codigo >= tareas.size()) {
      System.out.println("Índice fuera de rango.");
      return;
    }
    tareas.remove(codigo);
  }

  public void bucleIneficiente() { // Bucle optimizado para evitar redundancia.
    for (int i = 0; i < tareas.size(); i++) {
      System.out.println("Tarea " + i + ": " + tareas.get(i).getTitulo());
    }
  }
}
