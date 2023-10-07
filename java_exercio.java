package lista_java;

import java.util.Scanner;

public class java_exercio {
    public static void main (String[]args) {
        Scanner i= new Scanner(System.in);
        System.out.println("escreva sua idade de forma separada anos meses e dias ");
        System.out.println("escreva sua idade anos");
        double a=i.nextDouble();
        System.out.println("agora escreva os meses");
        double m=i.nextDouble();
        System.out.println("por fim digite os dias");
        double d=i.nextDouble();

        double re=(a*360) + (m*30) + d;
        System.out.println(re);
        
    }
    
}
