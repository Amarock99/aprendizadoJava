package lista_java;
public class operaçoes {
    public static void main(String[] args) {
        int inteiro=2;
        int inteirinho=2;
        System.out.println(inteiro-inteirinho);
        System.out.println(inteiro+inteirinho);

        double dobinho=4;
        double dobli=4.25;
        System.out.println(dobinho+dobli);
        System.out.println(dobinho-dobli);

        //para utilizar o float e necessario colocar um "f" no final do numero se não da erro
        float flotin=25.5f;
        float flotinhojr=25.5f;
        System.out.println(flotin%flotinhojr);
        System.out.println(flotin*flotinhojr);

        //usando a biblioteca de matematica 
        //pow para potencia 
        System.out.println(Math.pow(inteirinho,dobinho));
        //sqrt para raiza quadrada
        System.out.println(Math.sqrt(flotin));
        //e tan para tangente 
        System.out.println(Math.tan(dobli));
        //algus exemplos simples 
    }
    
}
