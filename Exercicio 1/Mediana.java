
package Mediana;

import java.util.Arrays;

public class Mediana {
//Bem, no caso essa só conseguiria mostrar correntamente a mediana de listas com um numero impar de elementos.

    public static void main(String[] args) {
              int Lista[] = {1, 11, 8, 9, 7, 3, 2 };
              
              Arrays.sort(Lista);
              System.out.println("A mediana da lista é o número: " + Lista[Lista.length/2]);
              
              }

    }
    
