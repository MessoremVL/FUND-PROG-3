
package eva3_2_arreglos;


public class EVA3_2_ARREGLOS {

 
   public static void main(String[] args) {
     int arreglo[], x, y;//solo arreglo es un arreglo
     //int[] arreglo, x, y; todos son arreglos
     arreglo = new int [10];// arreglo con 10 enteros
     
     //arreglo[10] = 100; el indice es incorrecto, 10 no es una posicion valida(llega hasta el 9)
     
     //EL USO DEL ARREGLOS VA LIGADO AL USO DE CICLOS.
     //EN PARTICULAR UNO, FOR
     for(int i = 0; i <10; i++){
        arreglo[i] = (int) (Math.random() * 100); //CASTING ----> COMPATIBLES 
        System.out.println( " - " + arreglo[i] );
        
     }
   }
   
}
