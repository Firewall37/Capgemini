package Pares;

import java.util.Arrays;

public class Pares {

    public static void main(String[] args) {
              int numeros[] = {10, 30, 20, 60, 80, 100 };
              int x = 20;
              int Pares = 0;
              System.out.println("Números: " + Arrays.toString(numeros));
              
              for (int i = 0; i < numeros.length; i++) {
                  for (int j = 0; j < numeros.length; j++) {
                  if (numeros[i]- numeros[j] == x){
                      Pares+= 1;
                      
                      System.out.println("[" + numeros[i] + ", " + numeros[j] +"]");                                            
                     }                         
                  }
              }            
            System.out.println("Total de " + Pares + " pares com diferença de " + x + ".");
                            }
    }

    