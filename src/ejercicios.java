/* import java.util.Scanner;
public class ejercicios {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Float num1 = input.nextFloat();
        Float num2 = input.nextFloat();
        Float suma = num1+num2;
        Float resta = num1-num2; 
        Float multiplicacion = num1*num2;
        Float division = num1/num2;
        System.out.println("la suma de " +num1+ " y " +num2+ "es igual a " +suma);
        System.out.println("la resta de " +num1+ " y " +num2+ "es igual a " +resta);
        System.out.println("la ultiplicacion de " +num1+ " y " +num2+ "es igual a " +multiplicacion);
        System.out.println("la division de " +num1+ " y " +num2+ "es igual a " +division);
    }
}
*/

/* import java.util.Scanner;
public class ejercicios {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        Float nota1 = input.nextFloat();
        Float nota2 = input.nextFloat();
        Float nota3 = input.nextFloat();
        Float prom = (nota1+nota2+nota3)/3;

        if (prom>=3){
            System.out.println("Aprobabdo");
        } else {
            System.out.println("Reprobado");
        }
    }
}
*/

/*import java.util.Scanner;
public class ejercicios {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();
        
        for ( int i=0; i<=10; i++){
            
            System.out.println(num*i);
        }
    }
}
*/ 

/*import java.util.Scanner;
public class ejercicios {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num = (int)(Math.random()*10+1);
        System.out.println(num);

        System.out.println("Ingrese un numero: ");
        int num2 = input.nextInt();
        
        while (num2 != num){
            if (num2>num){
                System.out.println("El numero que buscas es menor "); 
            } else {
                if(num2<num){
                    System.out.println("El numero que buscas es mayor "); 
                }
            }
            System.out.println("Ingrese un numero: ");
            num2 = input.nextInt();
    }
    }
}*/

import java.util.Scanner;
public class ejercicios {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num = (int)(Math.random()*10+1);
        System.out.println(num);

        System.out.println("Ingrese un numero: ");
        int num2 = input.nextInt();
        while (num2 != num){
            if (num2>num){
                System.out.println("El numero que buscas es menor "); 
            } else {
                if(num2<num){
                    System.out.println("El numero que buscas es mayor "); 
                }
            }
            System.out.println("Ingrese un numero: ");
            num2 = input.nextInt();
    }
    }
}