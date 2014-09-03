package entradasalida;

import java.util.Scanner;

public class EntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
            
        Scanner datos = new Scanner(System.in);
        int iVariable = 0;
        String sVariable = "";
        double dVariable = 0.0;
        char cVariable = 'a';
        boolean bVariable = false;
            
        //char
        String sChar = "";
        System.out.printf("Inserta un caracter: ");
        sChar = datos.nextLine();
        cVariable = sChar.charAt(0);
        System.out.printf("%s\n", cVariable);
        System.out.println("El valor e la variable es: " + cVariable + "\n");
            
        //String
        System.out.printf("Inserta una linea de texto: ");
        sVariable = datos.nextLine();
        System.out.printf("%s\n", sVariable);
        System.out.println("El valor de la variable es: " + sVariable + "\n");
            
        //boolean
        System.out.printf("Inserta un valor booleano(true o false): ");
        bVariable = datos.nextBoolean();
        System.out.printf("%b\n", bVariable);
        System.out.println("El valor de la variables es: " + bVariable + "\n");
            
        //integer
        System.out.printf("insertar un valor entero: ");
        iVariable = datos.nextInt();
        System.out.printf("%d\n",iVariable);
        System.out.println("El valor de la variable es: " + iVariable + "\n");
            
        //double
        System.out.printf("Inserta un valor númerico con decimales: ");
        dVariable = datos.nextDouble();
        System.out.printf("%f\n",dVariable);
        System.out.println("El valor de la variable es: " + dVariable + "\n");
    }    
}
