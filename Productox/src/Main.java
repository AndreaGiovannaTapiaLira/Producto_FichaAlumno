public class Main {
  public static void main(String[] args) {

      Productos producto1 = new Productos("Camisa", 25.99, 10);
      Productos producto2 = new Productos("Pantalón", 45.50, 5);

      System.out.println("-------------------------------------------------");
      System.out.println("...PRODUCTO 1...");
      System.out.println("Antes del descuento...");
      producto1.mostrarInfo();
      System.out.println("Valor en inventario: $" + producto1.calcularValorInventario());

      if (producto1.hayDisponibilidad()) {
          System.out.println("Hay disponibilidad: Sí");
      } else {
          System.out.println("Hay disponibilidad: No");
      }
      System.out.println("---------------------");

      producto1.aplicarDescuento(10); // Aplicamos descuento
      System.out.println("Después del descuento...");
      producto1.mostrarInfo();
      System.out.println("Valor en inventario: $" + producto1.calcularValorInventario());
      System.out.println("-------------------------------------------------");

      System.out.println("...PRODUCTO 2...");
      System.out.println("Antes del descuento...");
      producto2.mostrarInfo();
      System.out.println("Valor en inventario: $" + producto2.calcularValorInventario());

      if (producto2.hayDisponibilidad()) {
          System.out.println("Hay disponibilidad: Sí");
      } else {
          System.out.println("Hay disponibilidad: No");
      }
      System.out.println("----------------------");

      producto2.aplicarDescuento(15); // Aplicamos descuento diferente
      System.out.println("Después del descuento...");
      producto2.mostrarInfo();
      System.out.println("Valor en inventario: $" + producto2.calcularValorInventario());
      System.out.println("-------------------------------------------------");
  }
}