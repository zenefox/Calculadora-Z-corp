package calculadora;


import java.math.*;
import java.util.*;

import javax.swing.*;

public class Menuinteractivo {
	
    public static void main(String[] args) {
    	
    	Scanner teclado=new Scanner(System.in);
    	
    	//int a = teclado.nextInt();// introduce a
    	//int b = teclado.nextInt();// introduce b
    	//int suma = a+b;
    	
    	
    	JOptionPane.showMessageDialog(null, "Bienvenidos a la calculadora Z-corp \n");
    	//JOptionPane.showConfirmDialog(null, "�Esta seguro?", "El dios Zenen lo aprueba", JOptionPane.YES_NO_OPTION); confirmacion si o no
    	String[] operaciones = {
                "Operaciones matem�ticas",
                "Operaciones binarias",
                "Promedios",
                "Orden de datos",
                "Acerca de:",
                "Salir", };
                
        String[] matematicas = {
        		"Suma",
        		"Resta",
        		"Multiplicaci�n",
        		"Divisi�n",
        		"Regresar",  };
        
        String[] binarias = {
        		"Suma binaria",
        		"Suma hexadecimal",
        		"Cambio de base",
        		"Decimal - Binario",
        		"Decimal - Hexadecimal",
        		"Regresar",};
        		
        String[] promedios = { 
        	"Ponderaci�n",
        	"General",
        	"Regresar", };
            
        
        String[] orden = {
        		"Aleatorio",
        		"Personalizado",
        		"Regresar", };
        
        boolean salida;
        
        
        
            
           
        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opci�n", "Calculadora", JOptionPane.DEFAULT_OPTION, null, operaciones, operaciones[0]);// menu desplegable
           
        
        switch(resp) {
           
           case "Operaciones matem�ticas":
        	   
        	 resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opci�n", "Operaciones matem�ticas", JOptionPane.DEFAULT_OPTION, null, matematicas, matematicas[0]);// menu desplegable
        	  switch(resp) {
        	  
        	  case "Suma":
        		  
        		  
        	  case "Resta":
        		  
        	  case "Multiplicaci�n":
        		  
        	  case "Divisi�n":
        		  
        	  case "Regresar":
        		  
        	  
        	  
        	  }
           case "Operaciones binarias":
        	   
        	   resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opci�n", "Operaciones binarias", JOptionPane.DEFAULT_OPTION, null, binarias, binarias[0]);// menu desplegable		
			
           case "Promedios":
        	  
        	   resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opci�n", "Promedios", JOptionPane.DEFAULT_OPTION, null, promedios, promedios[0]);// menu desplegable		
 	   
           case "Orden de datos":
        	   
        	   resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opci�n", "Orden de datos", JOptionPane.DEFAULT_OPTION, null, orden, orden[0]);// menu desplegable		
 
        	   
           case "Acerca de:":
        	   
        	   JOptionPane.showMessageDialog(null, "Calculadora \n"+ "Creada y dise�ada por: \n " + "\n" + "V�ctor Barraza \n" + "Zenen *Maestro* Canales \n" + "Luise Galleguillos \n" + "Miguel Ocque \n" + "Alejandro Ontiveros \n");	
        	   break;
        	   
           case "Salir":
        	  JOptionPane.showConfirmDialog(null, "�Esta seguro?", "El dios Zenen lo aprueba", JOptionPane.YES_NO_OPTION); 
        	   if(salida= true) {
        		   JOptionPane.showMessageDialog(null, "Gracias por su visita \n");
        		   break;
        	   } 
        	   
        	   if(salida=false) {
        		  
        	   }
        	   
            	
            }
            
            
        
            
    
    
}
}
    	



//JOptionPane.showMessageDialog(null, "Bienvenidos al reino de Zenen \n");
    	//JOptionPane.showInputDialog(null, "�Desea continuar?", "Si - No");
    	
    	//menu para ingresar opcion    //int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenidos a nuestra calculadora Zeneniana\n\n 1.Operaciones matem�ticas\n 2.Operaciones bienarias\n 3.Promedio\n 4.Ordenamiento de datos\n 5.Atras"));
    	   
    	   

    	
    	
    	
    	
    