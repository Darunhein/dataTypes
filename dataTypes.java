import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DECLARACION DE VARIABLES
        final double PI = 3.1416;
        final double IVA = .16;

        // Cadena
        System.out.println("Type your Name");
        String name = scanner.nextLine();

        // Caracter
        System.out.println("Type the first letter of your name");
        char initial = scanner.next().charAt(0);

        // Integer
        System.out.println("Type your age");
        int age = scanner.nextInt();

        // Long
        System.out.println("Type your phone number ");
        long phoneNumber = scanner.nextLong();

        // Float
        System.out.println("Type your height");
        float height = scanner.nextFloat();

        // Double
        System.out.println("Type your weight");
        double weight = scanner.nextDouble();

        // Boolean
        System.out.println("Are you a student ? ");
        boolean student = scanner.nextBoolean();

        System.out.println(
                "Your data is " + " " + name + " " + initial + " " + age + " " + height + " " + weight + " " + student
                        + " " + phoneNumber + "\n Next are the constants " + PI + IVA);

        // Profe por favor no me fune ya es noche y como ya tenia el codigo completado
        // solo tengo un commit :P
        scanner.close();
    }
}