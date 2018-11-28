package calculadora;
import java.util.*;

public class CalculadoraMenuTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("      ******************************");
        System.out.println("      * **********Z-corp********** *");
        System.out.println("      *    Calculadora Zeneniana   *");
        System.out.println("      ******************************");
        System.out.println();
        System.out.println("              Bienvenido          ");
        System.out.println();
        System.out.println();
        System.out.println("Seleccione una de las siguientes opciones \n");
        
        
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean regresar = false;
        int opcion; //Guardaremos la opcion del usuario
        int opcion2;
        int opcion3;
        int opcion4;
        int opcion5;
        int opcion6;
        int opcionsalir;
        int opcionregresar;
        int opcionacerca;
        
       // System.out.println("Calculadora Z-Corp \n\n");
       // System.out.println("Bienvenido \n\n");
       // System.out.println("Selecciona una opción \n");
        
 
        while (!salir) {
 
            System.out.println("1. Operaciones matemáticas");
            System.out.println("2. Operaciones binarias");
            System.out.println("3. Orden de datos");
            System.out.println("4. Promedios");
            System.out.println("5. Acerca");// muestra información acerca de quien realizo el trabajo y email de contacto.
            System.out.println("6. Salir \n");
 
            try {
            	
                System.out.println("Ingrese una opción \n");
                opcion = sn.nextInt();
                
 //menu general de la calculadora
                
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Operaciones matemáticas \n");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Operaciones binarias \n");
                        break;
                    case 3:
                        System.out.println("Has seleccionado Orden de datos \n");
                        break;
                    case 4:
                        System.out.println("Has seleccionado Promedios \n");
                        break;
                    case 5:
                        System.out.println("Has seleccionado Acerca \n");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("\nSeleccione una opción entre 1 y 6 \n");}}
               
             catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        
 // menu de la sección de operaciones matemáticas       
        while (!regresar) {
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Regresar \n");
        
 
        try {
        	
            System.out.println("Ingrese una opción \n");
            opcion2 = sn.nextInt();

            switch (opcion2) {
                case 1:
                    System.out.println("Has seleccionado Suma \n");
                    break;
                case 2:
                    System.out.println("Has seleccionado Resta \n");
                    break;
                case 3:
                    System.out.println("Has seleccionado Multiplicación \n");
                    break;
                case 4:
                    System.out.println("Has seleccionado División \n");
                    break;
                case 5:
                    regresar = true; //opción que nos devuelve al menu anterior
                    break;
                default:
                    System.out.println("\nSeleccione una opción entre 1 y 5 \n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
            
        }
        }
        while (!regresar) {
            
            System.out.println("1. Suma binaria");
            System.out.println("2. Suma hexadecimal");
            System.out.println("3. Cambio de base");
            System.out.println("4. Decimal - Binario");
            System.out.println("5. Decimal - Hexadecimal");
            System.out.println("6. Regresar");
     
            try {
            	
                System.out.println("Ingrese una opción \n");
                opcion3 = sn.nextInt();

                switch (opcion3) {
                    case 1:
                        System.out.println("Has seleccionado Suma binaria \n");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Suma hexadecimal \n");
                        break;
                    case 3:
                        System.out.println("Has seleccionado Cambio de basen \n");
                        break;
                    case 4:
                        System.out.println("Has seleccionado Decimal - binario \n");
                        break;
                    case 5:
                        System.out.println("Has seleccionado Decimal - hexadecimal \n");
                        break;
                    case 6:
                        regresar = true;
                        break;
                    default:
                        System.out.println("\nSeleccione una opción entre 1 y 5 \n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
                
            }
        
        
    } 
    }
	

}
}
        
