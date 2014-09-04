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
        System.out.printf("Escriba su teléfono: ");
        Tel = entrada.nextLine();
        System.out.printf("Escriba su dirección: ");
        Direccion = entrada.nextLine();
        System.out.printf("Escriba su edad: ");
        Edad = entrada.nextInt();
        System.out.printf("Escriba su peso: ");
        Peso = entrada.nextDouble();
        
        System.out.printf("\nEl nombre es: %s", Nombre);
        System.out.printf("\nEl teléfono es: %s", Tel);
        System.out.printf("\nLa direccion es: %s", Direccion);
        System.out.printf("\nLa edad es: %d", Edad);
        System.out.printf("\nEl peso es: %.2f", Peso);
        
        if(Edad >= 0){
            
            if(Edad < 12){
                System.out.println("\nEres un infante");
            }
            if((Edad >= 12) && (Edad < 18)){
                System.out.println("\n Eres un adolescenete");
            }
            if((Edad >= 18) && (Edad < 65)){
                System.out.println("\n Eres un adulto");
            }
            else{
                System.out.println("\n Perteneces a la tercera edad, eres un anciano!! :D");
            }                   
        }
        else{
         
            System.out.println("\nLa edad no es válida." + " La edad debe ser igual o mayor a 0");
        
        }
      
    }
    
}
