/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaessentialsweek1viniciozurita;

/**
 *
 * @author USER
 */
public class JavaEssentialsWeek1VinicioZurita {

    public static void main(String[] args) {
        System.out.println("6. Salida de Datos de Java");
        System.out.println("Mostrar un número por consola");
        System.out.println(777);
        
        System.out.println("==================================");
        System.out.println("Mostrar una suma de 4 números por consola");
        System.out.println(10+5+15+11);
        System.out.println("==================================");
        
         //7.Comentarios en Java
        //Comentarios de una sola linea
        /*Comentarios de 
        varias lineas*/
       
        System.out.println("8.Variables en Java + Salida de Datos en java");
        System.out.println("Mostrar por consola la suma de 3 números enteros creando 3 variables;");
        int numero1=45,numero2=55,numero3=17;
        System.out.println(numero1+" + "+numero2+" + "+numero3+"="+numero1+numero2+numero3);
        System.out.println("==================================");
        
        System.out.println("Mostrar por consola tus nombres completos creando más de 2 variables");
        String nombres="César Vinicio",apellidoPaterno="Zurita",apellidoMaterno="Toro";
        System.out.println(nombres+" "+apellidoPaterno+" "+apellidoMaterno);
        System.out.println("==================================");
        
        System.out.println("Mostrar por consola tu Nombre solo utilizando variables CHAR");
        char caracter1='V',caracter2='I',caracter3='N',caracter4='I',caracter5='C',caracter6='I',caracter7='O';
        System.out.println(caracter1+""+caracter2+""+caracter3+""+caracter4+""+caracter5+""+caracter6+""+caracter7);
        System.out.println("==================================");
        
        System.out.println("Mostrar por consola la suma de 2 números flotantes creando 2 variables");
        float numeroFlotante1=14.5f,numeroFlotante2=78.1f;
        System.out.println(numeroFlotante1+numeroFlotante2);
        System.out.println("==================================");
        
        System.out.println("Mostrar por consola la suma de 4 números doubles creando 4 variables");
        double numeroDouble1=1.55d,numeroDouble2=4.55d,numeroDouble3=7.5d,numeroDouble4=7.33d;
        System.out.println(numeroDouble1+numeroDouble2+numeroDouble3+numeroDouble4);
        System.out.println("==================================");
        
        System.out.println("10.	Conversiones en Java"); 
        System.out.println("Definir 1 variable tipo Int y una variable de tipo Double, sumarlo, convertirlo a Int y mostrarlo por Consola");
        int numeroInt=27;
        double numeroDouble=43.5d, suma;
        suma=numeroInt+numeroDouble;
        System.out.println((int)suma);
        System.out.println("=================================="); 
        
        System.out.println("15. Caracteres especiales en Java"); 
        System.out.println("Mostrar por consola los siguientes enunciados Java es un \"Lenguaje de Programación\"");
        System.out.println("Java es un \"Lenguaje de Programación\"");
        System.out.println("=================================="); 

        System.out.println("16.	Secuencias extras en Java"); 
        System.out.println("Mostrar los siguientes enunciados por consola");
        System.out.println("Hoy inicia mi camino\nEn JAVA");
        System.out.println("Hoy inicia\tmi camino en java");
        System.out.println("=================================="); 
        
    }
}
