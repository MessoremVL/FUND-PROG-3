
package eva3_6_captura;

import java.util.Scanner;


public class EVA3_6_CAPTURA {

   
    public static void main(String[] args) {

        Scanner cap = new Scanner(System.in);
        String nombres[];
        int edad[];
        int cant;
        
        System.out.println("Cantidad de clientes a capturar");
        cant = cap.nextInt();
        cap.nextLine();
        nombres = new String[cant];
        edad = new int[cant];
        for(int i = 0; i < cant; i++){
            System.out.println("Introduce el nombre del cliente: ");
            nombres[i] = cap.nextLine();
            System.out.println("Introduce la edad del cliente: ");
            edad[i] = cap.nextInt();
        
        }
        System.out.println("Datos capturados");
        for(int i = 0; i < cant; i++){
            System.out.println("Nombre: " + nombres[i] + " Edad: " + edad[i]);
           
        
        }
        
    }
    
}
