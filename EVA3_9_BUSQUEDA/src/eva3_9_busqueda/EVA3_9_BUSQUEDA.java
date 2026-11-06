
package eva3_9_busqueda;

import java.util.Scanner;


public class EVA3_9_BUSQUEDA {


    public static void main(String[] args) {
        
        
       Scanner cap = new Scanner(System.in);
        int[] valores = new int [10];
        int valor;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
            
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[ " + valores[i] + " ] ");
            
    }
    
        boolean encontrado = false;
    do{
        //pedir valor
        System.out.println("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO");
        valor = cap.nextInt();
        cap.nextLine();
        //buscar
        //RECORRER TODOS LOS VALORES DEL ARREGLO
        for (int i = 0; i < valores.length ; i++) {
            if(valor == valores[i]){//el valor esta en el arreglo
            
                System.out.println("ENCONTRASTE EL VALOR, ESTA EN LA POSICION: " + i);
                encontrado = true;
                break;
                
            }else{//no esta en la posicion 
            
            }
        }
        //si esta en el arreglo, salimos del ciclo
        
    }while(!encontrado);
            
    }
 }

