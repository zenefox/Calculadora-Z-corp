import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		    String a;           
	        String b;           
	        double x;          
	        double y;           
	        Scanner teclado=new Scanner(System.in); 
	        System.out.print("ingrese un numero: ");        
	        a=teclado.nextLine();                   
	        System.out.print("ingrese otro numero: ");        
	        b=teclado.nextLine();                  
	        try{
	        	x=double.parseDouble(a); 
	        	y=double.parseDouble(b);
	        }catch (NumberFormatException ex){
	        	System.out.println("No es un numero");
	        }
	        }//falta un variante para que se lea que operatoria sera!
	        
	       // System.out.println("La suma es: "+Sumar(x, y)); 
	      
	    public static double Sumar(double x, double y){   //funcion suma
	        double total;               
	        total= x + y;               
	        return total;               
	}
	    static int potencia(int x,int y){
	    	double total;
	    	for(int i=1;i)
	    }

}
