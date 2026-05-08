public class Alumnos {
    String matricula;
    String nombre;
    String carrera;
    double promedio;

    public Alumnos(String matricula, String nombre, String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    public void mostrarFicha() {
        System.out.println("La matrícula es: " + this.matricula);
        System.out.println("El nombre es: " + this.nombre);
        System.out.println("La carrera es: " + this.carrera);
        System.out.println("El promedio fue de: " + this.promedio);
    }
    public void estaAprobado() {
        if (promedio >= 6) {
            System.out.println(this.nombre + " está APROBAD@");
        } else {
            System.out.println(this.nombre + " está REPROBAD@");
        }
    }
}

