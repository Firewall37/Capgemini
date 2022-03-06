package texto;

public class Texto {
    

    public static void main(String[] args) {
        System.out.println("A frase utilizada no exemplo será: Quissamã terra boa e amiga ");
        
    String texto = "Quissamã terra boa e amiga";     
    int raiz;
    texto = texto.replaceAll("\\s+", "");      
     int encrypter = 0;
    
    raiz = (int) (Math.sqrt(texto.length())+ 1);
         char encrypted[] = new char [raiz*raiz];
        
 for(int i = 0; i <texto.length() ; i++){
           encrypted[i] = texto.charAt(i);
            }
           String stringEnc = "";
       
    for(int line = 0; line<raiz; line++){
        for(int row = 0; row<raiz; row++){
            if  (encrypter >= raiz*raiz){
              encrypter = 0;   
            }
           stringEnc = stringEnc + encrypted[encrypter + line];
         encrypter += raiz;
        }
        stringEnc = stringEnc + "\n";
    }
        System.out.println(stringEnc+"\n");
         }
       }

           
       

               


        
                
   