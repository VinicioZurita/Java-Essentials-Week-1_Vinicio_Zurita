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
        int numero1=45,numero2=55,numero3=17, sumaNumeros;
        sumaNumeros=numero1+numero2+numero3;
        System.out.println(numero1+" + "+numero2+" + "+numero3+" = "+sumaNumeros);
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
        
        System.out.println("9.Tipos de Datos en Java"); 
        System.out.println("¿Es posible asignar variables valores ASCII a un tipo de variable de cadena tipo CHAR?");
        System.out.println("Numeral: "+(char)35);
        System.out.println("Signo de dólar: "+(char)36);
        System.out.println("Porcentaje: "+(char)37);
        System.out.println("Arroba: "+(char)64);
        System.out.println("Menor que: "+(char)60);
        System.out.println("Mayor que: "+(char)62);
        System.out.println("=================================="); 
        
        System.out.println("10.	Conversiones en Java"); 
        System.out.println("Definir 1 variable tipo Int y una variable de tipo Double, sumarlo, convertirlo a Int y mostrarlo por Consola");
        int numeroInt=27;
        double numeroDouble=43.5d, suma;
        suma=numeroInt+numeroDouble;
        System.out.println((int)suma);
        System.out.println("=================================="); 
        
        System.out.println("11.	Operadores en Java"); 
        System.out.println("Realizar las siguientes operaciones con 4 números y mostrarlo por consola ");
        int num1=200,num2=2,num3=3,num4=10,sum,resta,multiplicacion, division;
       
        sum=num1+num2+num3+num4;
        resta=num1-num2-num3-num4;
        multiplicacion=num1*num2*num3*num4;
        division=num1/num2/num3/num4;
      
        System.out.println(sum);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(multiplicacion+1);
        System.out.println(division-1);
        System.out.println("=================================="); 
        
        System.out.println("12.	Cadenas de Texto"); 
        System.out.println("Realizar los siguientes ejercicios de cadenas de texto y mostrarlos por consola");
        
        System.out.println("Crear una variable con tu nombre en minúscula y mostrarlo en mayúscula");
        String nombreCompletoMiniscula="césar vinicio zurita toro";
        System.out.println(nombreCompletoMiniscula.toUpperCase());
        
        System.out.println("\nCrear 3 variables con tu nombre completo en mayúscula y mostrarlo en minúscula");
        String nombresMayuscula="CÉSAR VINICIO",apellidoPaternoMayuscula="ZURITA",apellidoMaternoMayuscula="TORO";
        System.out.println((nombresMayuscula+" "+apellidoPaternoMayuscula+" "+apellidoMaternoMayuscula).toLowerCase());
        
        System.out.println("\nCrear una variable con la siguiente frase “Java no es tan complicado” y encontrar la posición de la palabra “no”");
        String frase="Java no es tan complicado";
        System.out.println(frase.indexOf("no"));
        System.out.println("=================================="); 
        
        System.out.println("13. Concatenación de cadenas de textos"); 
        System.out.println("Crear las variables que consideres correspondientes y muestra el siguiente resultado, concatenando las variables “nombre(espacio) apellido(espacio)está(espacio) aprendiendo(espacio)Java”");
        System.out.println("\""+nombres+" "+apellidoPaterno +" "+apellidoMaterno+" "+"está aprendiendo Java. "+" \"");
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
        
        System.out.println("17.	Funciones matemáticas en Java"); 
        System.out.println("Mostrar por consola los siguientes resultados");
        System.out.println("Hallar el número mayor entre 99 y 200");
        System.out.println(Math.max(99, 200)); 
        System.out.println("Hallar el número menor entre 10 y 20");
        System.out.println(Math.min(10, 20));
        System.out.println("Hallar la raíz cuadra de 25");
        System.out.println(Math.sqrt(25));
        System.out.println("Hallar el valor absoluto de -6.2");
        System.out.println(Math.abs(-6.2));
        System.out.println("Mostrar un número aleatorio entre 10-50");
        int numeroAleatorio=(int)(Math.random()*(51-10)+10);
        System.out.println(numeroAleatorio);
        System.out.println("=================================="); 
        
        System.out.println("18.	Expresiones Booleanas"); 
        System.out.println("Mostrar el resultado por consola las siguientes expresiones Booleanas de las siguientes operaciones");
        System.out.println(30 >10);
        System.out.println(30<10);
        System.out.println(10==10); 
        System.out.println("=================================="); 
    }
}
