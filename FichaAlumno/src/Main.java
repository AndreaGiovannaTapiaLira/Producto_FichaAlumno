public class Main {
    public static void main(String[] args) {
        Alumnos alumno1 = new Alumnos("20253RD013", "Andrea", "Programación", 5);
        Alumnos alumno2 = new Alumnos("20253RD004", "Juan", "Redes Digitales", 7.8);

        System.out.println("----------------------------");

        alumno1.mostrarFicha();
        alumno1.estaAprobado();

        System.out.println("----------------------------");

        alumno2.mostrarFicha();
        alumno2.estaAprobado();

        System.out.println("----------------------------");

    }
}