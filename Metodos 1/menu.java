import java.util.Scanner;
import javax.swing.JOptionPane;


public class menu{

    Scanner entrada = new Scanner(System.in);


    //Creación de un menu.
    // Aqui se iniciara todos lo procedimientos
    public void Menu(){


        char letra, cosa;
        
        int op;
        
        
        
            do{
       
        op = Integer.parseInt(JOptionPane.showInputDialog("Arenas Trejo Diego Israel. 3IV8\nSeleccione el programa que desea ejecutar\n1.-Calculadora de edad.\n2.-Area y perimetro\n3.--Costos llamadas"));

        // Se dara la opcion de repetir cada programar o regresar a este menu
        
        switch(op){
            case 1:
                
                do{
                    CalcuEdad obj=new CalcuEdad();
                    obj.CalcuEdad();
                    letra = JOptionPane.showInputDialog("Quieres repetir el programa?, escriba si").charAt(0);
                }while(letra == 's');
            break;

            case 2:
                
                do{
                    Area obj=new Area();
                    obj.Area();
                    letra = JOptionPane.showInputDialog("Quieres repetir el programa?, escriba si").charAt(0);
                }while(letra == 's');
            break;  

            case 3:
               
            do{
                Llamadas obj=new Llamadas();
                obj.Llamadas();
                letra = JOptionPane.showInputDialog("Quieres repetir el programa?, escriba si").charAt(0);
            }while(letra == 's');
            break;
        }

        cosa = JOptionPane.showInputDialog("Quiere regresar al menu princioal, escriba p").charAt(0);
    }while(cosa=='p');
}  
} 
        
    

