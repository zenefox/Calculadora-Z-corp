package calculadora;

import java.util.*;

public class Multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);

		double a,b,res,x,temp;

		System.out.println("Ingrese el primer numero: ");
		a=entrada.nextDouble();
		
		System.out.println();

		System.out.println("Ingrese el segundo numero: ");
		b=entrada.nextDouble();
		System.out.println();
		
		temp=b;
		for (x=1;x<a;x++){
		res=temp+b;
		temp=res;
		System.out.println(temp);
		entrada.close();
		
		}
		System.out.println();
		
		System.out.println("El resultado es :"+temp); 
		


}
}
