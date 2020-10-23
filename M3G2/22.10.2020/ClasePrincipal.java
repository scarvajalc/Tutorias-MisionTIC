import java.util.Scanner;

public class ClasePrincipal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double n1, n2, resultado;
        int opcion;

        do {
            System.out.println("Por favor ingrese 2 numeros");
            n1 = Double.parseDouble(scanner.nextLine());
            n2 = Double.parseDouble(scanner.nextLine());
            System.out.println("1. sumar, 2. restar, 3. dividir, 4. multiplicar, 5. salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    resultado = n1 + n2;
                    System.out.println("El resultado de su operaciones " + resultado);
                    break;
                case 2:
                    resultado = n1 - n2;
                    System.out.println("El resultado de su operaciones " + resultado);
                    break;
                case 3:
                    resultado = n1 / n2;
                    System.out.println("El resultado de su operaciones " + resultado);
                    break;
                case 4:
                    resultado = n1 * n2;
                    System.out.println("El resultado de su operaciones " + resultado);
                    break;
                case 5:
                    System.out.println("Chao");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 5);

    }

}