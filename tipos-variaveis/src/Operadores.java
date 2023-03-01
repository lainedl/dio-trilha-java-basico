public class Operadores {

    public static void main(String[] args) {
        //OPERADORES -> SOMA e CONCATENAÇÃO 
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //OPERADORES -> POSITIVO E NEGATIVO
        int numero = 5;
        numero = - numero;
        System.out.println("Valor 1: " + numero);

        //numero = + numero; //Não transforma em positivo
        numero = numero *-1; 
        System.out.println("Valor 2: " + numero);

        //REPETIÇAO - INCREMENTO, DECREMENTO e NEGAÇÃO
        int numero2 = 5;

        //numero2 = numero2 + 2;
        //numero2++;
        //System.out.println("Numero 2: " + numero2);


        System.out.println("Valor incrementado antes: " + ++numero);
        System.out.println("Valor incrementado depois: " + numero++);
        System.out.println(numero);


        System.out.println("Valor decrementado antes: " + --numero);
        System.out.println("Valor decrementado depois: " + numero--);
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);

        //OPERADOR TERNÁRIO
        int a, b;

        a = 6;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
            System.out.println("Ternário: "+ resultado); 

        String resultado2 = a==b ? "verdadeiro":"falso";
        System.out.println("Ternário2: " + resultado2);     

        //OPERADORES RELACIONAIS
        int valor1 = 1;
        int valor2 = 2;

        boolean simNao = valor1 == valor2;
        System.out.println("valor1 é igual ao valor2? " +simNao);

        simNao = valor1 != valor2;
        System.out.println("valor1 é diferente do valor2? " +simNao);

        
        simNao = valor1 > valor2;
        System.out.println("valor1 é maior que o valor2? " +simNao);

        if (valor1 < valor2){
            System.out.println("A nossa condição é verdadeira!");
        }


        String nome1 = "Edilaine";
        String nome2 = "Edilaine";
        String nome3 = new String("Edilaine");
        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome3);//Não se compara objeto assim, só para exemplificar.

        System.out.println(nome1.equals(nome3));//equals compara conteudo, usar para objetos.
       
        //OPERADORES LÓGICOS
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeiras");
        }

        System.out.println("fim");


    }
    
}
