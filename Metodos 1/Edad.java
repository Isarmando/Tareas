import javax.swing.JOptionPane;


public class Edad{
        //variables 
        private int dia, mes, ano;
        private int diaA,mesA,anoA;
        private int edad;

        public void edad() {
        //Donde se ingresaran los datos 

        dia=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrsar todos los datos en numeros.\nIngresa tu dia de nacimiento"));

        mes=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrsar todos los datos en numeros.\nIngresa tu mes de nacimiento"));
        
        ano=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrsar todos los datos en numeros.\nIngresa tu año de nacimiento"));
    
        diaA=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrsar todos los datos en numeros.\nIngresa el dia en el que estas ingresando esto"));

        mesA=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrsar todos los datos en numeros.\nIngresa el mes en el que estas ingresando esto"));

        anoA=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrsar todos los datos en numeros.\nIngresa el año en el que estas ingresando esto"));
        }

        public void calculo() {
            
        
            edad=anoA-ano;
    
            if(mes>mesA){
                edad=edad-1;
                JOptionPane.showMessageDialog(null, "Tu edad es de "+edad+" años");
            }else if(mes<mesA){
                JOptionPane.showMessageDialog(null, "Tu edad es de "+edad+" años");
            }else if (mes==mesA && dia>=diaA){
                JOptionPane.showMessageDialog(null, "Tu edad es de "+edad+" años");
            }else if (mes==mesA && dia<diaA){
                edad=edad-1;
                JOptionPane.showMessageDialog(null, "Tu edad es de "+edad+" años");
    
    
    
            }
        }
    
    
    
    
        
    
    
}