public class Productos {

  String nombre;
  double precio;
  int stock;

  public Productos(String nombre, double precio, int stock) {
      this.nombre = nombre;
      this.precio = precio;
      this.stock = stock;
  }

  public void mostrarInfo() {
      System.out.println("Nombre: " + this.nombre);
      System.out.println("Precio: $" + this.precio);
      System.out.println("Stock: " + this.stock);
  }

  public double calcularValorInventario() {
      return this.precio * this.stock;
  }

  public void aplicarDescuento(double porcentaje) {
      this.precio -= this.precio * (porcentaje / 100);
  }

  public boolean hayDisponibilidad() {
      return this.stock > 0;
  }
}
