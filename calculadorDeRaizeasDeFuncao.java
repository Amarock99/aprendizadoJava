package lista_java;
import java.util.Scanner;

public class calculadorDeRaizeasDeFuncao {
    public static void main(String[]args){
        Scanner recebe = new Scanner(System.in);

        System.out.println("digite o valor de a ");
        double a=recebe.nextDouble();

        System.out.println("digite o valor de b ");
        double b=recebe.nextDouble();

        System.out.println("digite o valor de c ");
        double c=recebe.nextDouble();

        double delta=Math.pow(b,2)-4*a*c;
        if(delta>0){
            double rd=Math.sqrt(delta);
            double rp=(-(b)+rd)/(2*a); 
            double rn=(-(b)-rd)/(2*a);
            System.out.println(rp);
            System.out.println(rn);
        }
        else{
            System.out.println("nao a raizes");
        }
        
       
        
    }
    
}
