
package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ExamenU5 {

    public static void main(String[] args) {
        List <String> ListaOrdenada=new ArrayList<String>();
        ListaOrdenada.add("1 2 3 4 5 6 7 8 9 10");//9 2 6 1 5 10 0 1 //AQUI PONGO LOS NÚMEROS COMO DEBERIAN IR ORDENADOS
       String[] arreglo=null;                                        //EN MI ARCHIVO ESTAN SEPARADOS POR ESPACIO
       String[] arreglo2=null;
        
        //1 Código sacado de internet
     
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         File archivo= new File ("C:\\Users\\Kate Villanueva\\Desktop\\examenU5.txt");
         FileReader fr = new FileReader (archivo);
         BufferedReader br = new BufferedReader(fr);
         //2 termina código de internet*/

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            arreglo=linea.split(" "); //acomodar en el codigo para que separe el archivo txt
         //System.out.println(arreglo);
         }
         
         
         for(String nombre:ListaOrdenada){
          arreglo2=nombre.split(" ");
            // System.out.println(palabrasOriginales);
      }
        
         System.out.println("Arreglo desordenado: ");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
        for(int i=0;i<arreglo.length-1;i++){
            for(int j=0;j<arreglo.length-1;j++){
              if(arreglo[j].equals(arreglo2[j])){
                  String auxiliar=arreglo2[j];
                  arreglo[j]=arreglo2[j];
                  arreglo2[j]=auxiliar;
              }
            }
        }
        System.out.println("");
        System.out.println("Arreglo ordenado: ");
        for(int i=0;i<arreglo2.length;i++){
            System.out.print(arreglo2[i]+" ");
        }
        
         fr.close();
      }
      
     
      catch(Exception e){
          System.out.println(e);
      }
      
    }
    
    
}
