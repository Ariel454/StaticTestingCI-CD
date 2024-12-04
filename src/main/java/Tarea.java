public final class Tarea { // Clase marcada como final porque no está diseñada para herencia.

  private String titulo;

  public void setTitulo(final String titulo) { // Parámetro final para evitar modificaciones accidentales.
    if (titulo == null || titulo.isEmpty()) { // Validación para evitar valores nulos o vacíos.
      throw new IllegalArgumentException("El título no puede ser nulo o vacío.");
    }
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  @Deprecated // Indicar que el método no se debe usar.
  public void metodoInutil() {
    System.out.println("Este método no hace nada relevante.");
  }
}
