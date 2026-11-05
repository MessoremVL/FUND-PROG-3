
package eva3_5_menu2;

import java.util.Scanner;


public class EVA3_5_MENU2 {

    
    public static void main(String[] args) {
     
        String[] opciones = {"Ventas", "Clientes", "Proveedores", "Salir"};
        System.out.println("-------------MENU DEL SISTEMA-------------");
        for(int i = 0; i <opciones.length; i++){
        
        
        }
    Scanner cap = new Scanner(System.in);
        System.out.println("SELECCIONA UNA OPCION");
        
        
        
        
        int sel = cap.nextInt();
        switch(sel){
            case 0:
                System.out.println("MODULO DE VENTAS");
                break;
                
            case 1:
                System.out.println("MODULO DE CLIENTES");
                break;
                
            case 2:
                System.out.println("MODULO DE PROVEEDORES");
                break;
                
            case 3:
                System.out.println("MODULO DEL SISTEMA");
                break;
                
            default:
                System.out.println("OPCION INCORRECTA");
                
        
        
        }
    
    }
    
    
    
}
