import java.util.Scanner;

/**
 *
 * @author Luisa
 */
public class EncriptarAscii {
    
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
       
        System.out.println("1. Encriptar a ASCII.");
        System.out.println("2. Desencriptar de ASCII.");
        System.out.println("3. Salir.");
            
        System.out.println("¿Qué desea realizar?");
        opcion = sc.nextInt();
        
        menu(opcion);
    }
    
    private static int encriptar(){
       char letra;
       int convertida;
        
       System.out.println("Ingrese la letra: ");
       letra = sc.next().charAt(0);
       convertida = (int)letra;
           
       return convertida;
    }
    
    private static char desencriptar(){
       int codigo;
       char convertida;
        
       System.out.println("Ingrese el código: ");
       codigo = sc.nextInt();
       convertida = (char)codigo;
           
       return convertida;
    }
    
    private static void menu(int opcion){

           switch(opcion){
               case 1:
                   
                   System.out.println("El código es: " + encriptar());
                   break;
               case 2:
                    System.out.println("La letra es: " + desencriptar());
                   break;
                case 4:
                   break;
                default:
                   System.out.println("Esa opción no existe");
           
            
       }
    }
    
}
