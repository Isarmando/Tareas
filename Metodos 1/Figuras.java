import javax.swing.JOptionPane;


public class Figuras{
    

    
    

    private int opcion;
    private double l1, l2,l3, radio, base, altura; 
    private double area, perimetro; 
    private double pi=3.14;

    
    public void Figuras(){
       
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Quieres el area y perimetro de un Cuadrado\n2.-Quieres el area y perimetro de un Rectangulo\n3.-Quieres el area y perimetro de un Triangulo\n4.-Quieres el area y perimetro de un Circulo"));
             
    
    }
    public void calcular() {

        switch(opcion){
            case 1:
            l1=Double.parseDouble(JOptionPane.showInputDialog("Ingresar los datos en Centimetros\nIngresa uno de los lados del Cuadrado"));

            area=l1+l1;
            perimetro=l1*4;
    
            JOptionPane.showMessageDialog(null,"El area del Cuadrado "+area+" cm \nEll perimetro es de "+perimetro+" cm");
            break;
    
            case 2:
            l1=Double.parseDouble(JOptionPane.showInputDialog("Ingresar los datos en Centimetros\nIngresa la altura del Rectangulo"));
            l2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del Rectangulo"));

            area=l1*l2;
            perimetro=(l1*2)+(l2*2);
            JOptionPane.showMessageDialog(null,"El area del Rectangulo "+area+" cm \nEll perimetro es de "+perimetro+" cm");
            break;
            
            case 3:
            altura=Double.parseDouble(JOptionPane.showInputDialog("Ingresar los datos en Centimetros\nIngresa la altura del Triangulo"));
            
            base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del Triangulo"));
            
            l1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida del lado 1 del Triangulo"));
            
            l2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida del lado 2 del Triangulo"));
           
            l3=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida del lado 3 del Triangulo"));
            area=(altura*base)/2;
            perimetro=l1+l2+l3;
            JOptionPane.showMessageDialog(null,"El area del Triangulo "+area+" cm \nEll perimetro es de "+perimetro+" cm");
            break;
    
            case 4:
            radio=Double.parseDouble(JOptionPane.showInputDialog("Ingresar los datos en Centimetros, por favor\nIngresa el Radio del circulo"));

            area=pi*(radio*radio);
            perimetro=2*pi*radio;
    
            JOptionPane.showMessageDialog(null,"El area del Circulo "+area+" cm \nEl perimetro es de "+perimetro+" cm");
            break;
        
    }
    
    
    

    
    
}
}