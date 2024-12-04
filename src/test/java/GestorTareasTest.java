import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GestorTareasTest {

  @Test
  public void testAgregarTarea() {
    GestorTareas gestor = new GestorTareas();
    Tarea tarea1 = new Tarea();
    Tarea tarea2 = new Tarea();

    tarea1.setTitulo("Tarea uno 1");
    tarea2.setTitulo("Tarea uno 2");

    gestor.agregarTarea(tarea1);
    gestor.agregarTarea(tarea2);

    assertEquals(2, gestor.obtenerTotalTareas(), "Debería tener 2 tareas.");
  }

  @Test
  public void testTituloTarea() {
    Tarea tarea = new Tarea();
    tarea.setTitulo("Título de la tarea");

    assertEquals("Título de la tarea", tarea.getTitulo(), "El título de la tarea debe coincidir.");
  }

  @Test
  public void testEliminarTarea() {
    GestorTareas gestor = new GestorTareas();
    Tarea tarea = new Tarea();
    tarea.setTitulo("Tarea de prueba");

    gestor.agregarTarea(tarea);
    assertEquals(1, gestor.obtenerTotalTareas(), "Debería tener 1 tarea antes de eliminar.");

    gestor.eliminarTarea(0);
    assertEquals(0, gestor.obtenerTotalTareas(), "Debería tener 0 tareas después de eliminar.");
  }

  @Test
  public void testAgregarTareaNula() {
    GestorTareas gestor = new GestorTareas();

    gestor.agregarTarea(null);
    assertEquals(0, gestor.obtenerTotalTareas(), "No debería agregar tareas nulas.");
  }

  @Test
  public void testBucleIneficiente() {
    GestorTareas gestor = new GestorTareas();
    Tarea tarea1 = new Tarea();
    Tarea tarea2 = new Tarea();

    tarea1.setTitulo("Tarea 1");
    tarea2.setTitulo("Tarea 2");

    gestor.agregarTarea(tarea1);
    gestor.agregarTarea(tarea2);

    gestor.bucleIneficiente(); // Verificar manualmente que no se generan mensajes redundantes.
  }
}
