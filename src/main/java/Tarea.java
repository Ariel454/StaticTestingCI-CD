public class Tarea {

  private String titulo;

  /**
   * Establece el título.
   * 
   * @param nuevoTitulo El título a asignar.
   * @throws NullPointerException si el título es nulo.
   */
  public void setTitulo(String nuevoTitulo) {
    if (nuevoTitulo == null) {
      throw new NullPointerException(
          "El título no puede ser nulo");
    }
    this.titulo = nuevoTitulo;
  }

  /**
   * Obtiene el título.
   * 
   * @return El título actual.
   */
  public String getTitulo() {
    return this.titulo;
  }

  /**
   * Método innecesario que solo imprime un mensaje.
   */
  public void metodoInutil() {
    System.out.println("Este método no hace nada relevante.");
  }

}

