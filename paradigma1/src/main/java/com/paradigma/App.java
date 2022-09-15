package com.paradigma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);
        ;

        Alumno p;
        
        p=new Alumno();
        
        System.out.println("Ingrese su nombre: ");
        p.setNombre(teclado.nextLine());
        System.out.println("Ingrese su apellido: ");
        p.setApellido(teclado.nextLine());
        System.out.println("Ingrese su edad: ");
        p.setEdad(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Ingrese su Estado Civil: ");
        p.setEstadoCivil(teclado.nextLine());
        System.out.println("Ingrese Carrera: ");
        p.setCarrera(teclado.nextLine());
        System.out.println("Ingrese Matricula: ");
        p.setMatricula(teclado.nextLine());
        System.out.println("Ingrese Cantidad de Materias Aprobadas: ");
        p.setCantidadMateriasAprobadas(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Ingrese Promedio: ");
        try{
            p.setPromedio(teclado.nextFloat());
        }catch(InputMismatchException e)
        {
            System.out.println("Error, ingrese un numero con coma (,)");
        }
        teclado.nextLine();
        
    

        System.out.println(p);
       
    }   
}
