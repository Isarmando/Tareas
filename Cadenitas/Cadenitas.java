import java.util.Scanner;   

public class Cadenitas{

   
    int m;
    
    

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        char letra;
         
        Cadenitas promedio=new Cadenitas();
        
        System.out.println("No supe como hacer la matriz, ni siquiera le entendi.");
        do{
          
        
        promedio.PositivosNegativos();
        promedio.Promedio();
        promedio.calificaciones();
        System.out.println("Deseas repetir el proceso,escriba si. Si no escriba no");
        letra = entrada.next().charAt(0);
        
        }while(letra == 's');


    }

    
    public void PositivosNegativos(){

        Scanner entrada= new Scanner(System.in);
        
        int i,c;
        int pos = 0, neg = 0; 
        int[] numeros = new int[10]; 
        double TPos = 0, TNeg = 0;                  
        
        
        
        for (i = 0; i < 10; i++) {
            
            System.out.println("Ingresa el valor: "+(i+1));
            numeros[i]=entrada.nextInt();
        }

         
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0){ 
                TPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ 
                TNeg += numeros[i];
                neg++;
            }
        }

        
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + TPos / pos);                
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + TNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
        
    }



    public void Promedio(){

        Scanner entrada= new Scanner(System.in);
        
        int i;
        int c=0;
        
        double resultado;
        
        
        
        int [] lol=new int[10];
        

        for (i = 0; i < 10; i++) {
            
                System.out.println("Ingresa el valor No. "+(i+1));
                lol[i]=entrada.nextInt();
                c += lol[i];
                
              
        }
        resultado=c/10;
        System.out.println("El promedio es "+resultado);

          
    }

    public void calificaciones(){

        Scanner entrada=new Scanner(System.in);
        int i;
        int TCal=0;
        int c;
        int pos = 0, neg = 0; 
        double TPos = 0, TNeg = 0; 
        int [] calificaciones=new int[10]; 
        double Promedio;

        for (i=0;i<10;i++){
             
        System.out.println("Ingresa la calificion No."+(i+1));
        calificaciones[i]=entrada.nextInt();
        TCal += calificaciones[i];
        }
        for (i=0;i<10;i++){
             
            System.out.println("Las calificacion "+(i+1)+": "+calificaciones[i]);
            
        }
       Promedio=TCal/10;
    System.out.println("El promedio de las calificaciones es: "+Promedio);

    for (i = 0; i < 10; i++) {
        if (calificaciones[i] > Promedio){
    System.out.println("Calificacion mayores al promedio: "+calificaciones[i]);
    }else{
    System.out.println("Calificiones menores al promedio: "+ calificaciones[i]);
    }
    }

   for (i = 0; i < 10; i++) {
            if (calificaciones[i] >=6){ 
                TPos += calificaciones[i];
                pos++;
            } else if (calificaciones[i] <=5){ 
                TNeg += calificaciones[i];
                neg++;
            }
        }

        
        if (pos != 0) {
            System.out.println("Alumnos aprobados: " + pos);                
        } else {
            System.out.println("Ningun alumno aprobado");
        }
        if (neg != 0) {
            System.out.println("Alumnos reporbados: " + neg);
        } else {
            System.out.println("Ningun alumno reprobado");

    
        }  
    }
}