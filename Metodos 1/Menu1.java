import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu1{

    Scanner entrada = new Scanner(System.in);

    //Creación del método «menu».
    public void menu(){

        char opcion,letra;
        
        
        String cadena;

        
        do{
            
       
        opcion = JOptionPane.showInputDialog("Yaniz Sanchez Diego Nathan. 3IV8\nSeleccione el programa que desea ejecutar\nA.- Calculadora de edad.\nB.-Area y perimetro\nC.--Costos llamadas").charAt(0);

        
        switch(opcion){
            case 'A':
                
                do{
                    Edad obj = new Edad();
                    obj.Edad();
                
               
                    letra = JOptionPane.showInputDialog("Deseas Repetir el programa?\ndale s si es asi:").charAt(0);
                }while(letra == 's');
            break;

            case 'B':
                
                do{
                    Figuras obj = new Figuras();
                    obj.Figuras();
                    letra = JOptionPane.showInputDialog("Deseas Repetir el programa?\ndale s si es asi:").charAt(0);
                }while(letra == 's');
            break;  

            case 'C':
               
            do{
                Llamadas obj = new Llamadas();
                obj.Llamadas();
                letra = JOptionPane.showInputDialog("Deseas Repetir el programa?\ndale s si es asi:").charAt(0);
            }while(letra == 's');
            break;
        }

        //Se brinda la opción para volver al menú o cerrar el programa.
        letra = JOptionPane.showInputDialog("Deseas Volver al menu?\ndale s si es asi:").charAt(0);
            }while(letra == 's');
    }

}