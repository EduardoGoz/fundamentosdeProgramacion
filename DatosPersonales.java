package datospersonales;
import java.util.Scanner;
public class DatosPersonales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String Nombre = "";
        int Edad = 0;
        String Tel = "";
        String Direccion = "";
        double Peso = 0.0;
        
        System.out.printf("Escriba su nombre: ");
        Nombre = entrada.nextLine();
        System.out.printf("Escriba su telÃ©fono: ");
        Tel = entrada.nextLine();
        System.out.printf("Escriba su direcciÃ³n: ");
        Direccion = entrada.nextLine();
        System.out.printf("Escriba su edad: ");
        Edad = entrada.nextInt();
        System.out.printf("Escriba su peso: ");
        Peso = entrada.nextDouble();
        
        System.out.printf("\nEl nombre es: %s", Nombre);
        System.out.printf("\nEl telÃ©fono es: %s", Tel);
        System.out.printf("\nLa direccion es: %s", Direccion);
        System.out.printf("\nLa edad es: %d", Edad);
        System.out.printf("\nEl peso es: %.2f", Peso);
       
    }
    
}
