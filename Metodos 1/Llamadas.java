import javax.swing.JOptionPane;


public class Llamadas{

    
        
    private String numcel;
    private int TNacio, TInter, Tcel, op;
    private double Nacio=0.5,Inter=0.6,cel=0.2;
    private double saldo, FA,FB,FC;
    private char letra;

    public void datos() {
        
    
    numcel=JOptionPane.showInputDialog("Ingresa tu numero telefonico");
    
    saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu credito actual"));

    
    TNacio=Integer.parseInt(JOptionPane.showInputDialog("CUantas veces has hecho llamadas Locales"));
    
    TInter=Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces has hecho llamadas Internacionales"));
    
    Tcel=Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces has hecho llamadas a Celulares"));
    }

    public void operaciones() {
        
    
    FA=Nacio*TNacio;
    FB=Inter*TInter;
    FC=cel*Tcel;
    saldo=saldo-FA-FB-FC;
    JOptionPane.showMessageDialog(null,"Tu saldo actual es de "+saldo);


    if(saldo<=0){
        JOptionPane.showMessageDialog(null,"Ya no tienes suficiente saldo");
    }else{
    do{
        
        op=Integer.parseInt(JOptionPane.showInputDialog("Si quieres hacer una llamada Local, escribe 1\nSi quieres hacer una llamada Internacional, escribe 2\nSi quieres hacer una llamada a celular, escribe 3"));

        switch (op) {
            case 1:
                saldo=saldo-0.5;
                JOptionPane.showMessageDialog(null,"Tu saldo es de "+saldo);
            break;

            case 2:
                saldo=saldo-0.6;
                JOptionPane.showMessageDialog(null,"Tu saldo es de "+saldo);
            break;

            case 3:
                saldo=saldo-0.2;
                JOptionPane.showMessageDialog(null,"Tu saldo es de "+saldo);
            break;

            default:
            if(saldo==0){
                JOptionPane.showMessageDialog(null,"Ya no tienes suficiente saldo");
            }    
        }
        
        letra=JOptionPane.showInputDialog("Quiere vover a hacer una llamada?").charAt(0);
    }while(letra=='s');

    }

    }
}