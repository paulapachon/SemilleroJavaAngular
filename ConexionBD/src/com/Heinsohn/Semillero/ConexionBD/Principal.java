/*
 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
package com.Heinsohn.Semillero.ConexionBD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
 /*  
    //Agregar a la base de datos 10 personas 
    Persona per1= new Persona("Paula","Pachón","Femenino","1998-10-22",1500000);
    Persona per2= new Persona("Paula","Garcia","Femenino","2000-08-20",1000000);
    Persona per3= new Persona("Ana","Castillo","Femenino","1998-10-22",1500000);
    Persona per4= new Persona("Andres","Garcia","Masculino","2002-09-20",3000000);
    Persona per5= new Persona("Gabriel","Molina","Masculino","1997-10-22",2500000);
    Persona per6= new Persona("Daniel","Camacho","Masculino","1999-08-20",2000000);
    Persona per7= new Persona("David","Vargas","Masculino","1998-10-22",1500000);
    Persona per8= new Persona("Tatiana","Rodriguez","Femenino","2002-09-20",3000000);
    Persona per9= new Persona("Daniel","Pachón","Masculino","2000-08-22",3500000);
    Persona per10= new Persona("Paula","Andrade","Femenino","1995-07-20",1000000);
    
    ArrayList<Persona> Personas= new ArrayList<>();
    Personas.add(per1);
    Personas.add(per2);
    Personas.add(per3);
    Personas.add(per4);
    Personas.add(per5);
    Personas.add(per6);
    Personas.add(per7);
    Personas.add(per8);
    Personas.add(per9);
    Personas.add(per10);
    
    for(Persona e: Personas) {
    	e.Crear();
    }
   */ 
    
    //Leer datos
    ArrayList<Persona> ListPer= Persona.Leer();
    
    //Imprimir Nombre-Apellido-Longitud
    for(Persona e: ListPer) {
    	System.out.println("Nombre: "+e.getNombre()+" Apellido: "+e.getApellido()+" Longitud Apellido: "+e.getApellido().length());
    }
    
 
    
    //Nombres en mayuscula de fechas de nacimiento menores a 01/01/2010
    for(Persona e: ListPer) {
    String fecha=e.getFecha_nac();
	int año= Integer.parseInt(fecha.substring(0, 4));

	if(año<2010) {
		System.out.println(e.getNombre().toUpperCase());
	}
    }
    
    
    //Promedio de salario por genero
    int PromF=0;
	int countF=0;
	int PromM=0;
	int countM=0;
    for(Persona e: ListPer) {
    	if(e.getSexo().equals("Femenino")) {
    		PromF+=e.getSalario();
    		countF+=1;
    	}
    	else {
    		PromM+=e.getSalario();
    		countM+=1;
    	}
    		
    }
    System.out.println("Salario Promedio Femenino: "+(PromF/countF));
	System.out.println("Salario Promedio Masculino: "+(PromM/countM));
    
}
}
