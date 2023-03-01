public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

            String meuNome = "Edilaie";
            double salarioMinimo = 2500.33; //Convenção Americana
            
            byte idade = 123;
            short ano = 2021;
            int cep = 21070333; //se começar com zero, talvez tenha que ser outro tipo
            long cpf = 98765432109L; //se começar com zero, talvez tenha que ser outro tipo. Precisa encerrar com L
            float pi = 1.4F; //sempre encerra com F
            double salario = 1275.33;

            short numeroCurto = 1;
            int numeroNornal = numeroCurto;
            short numeroCurto2 = (short) numeroNornal; //cast - converte o tipo mais abrangente e o mais especifico.

            int numero = 5;
            numero = 10;
            System.out.println(numero);

            final double VALOR_DE_PI = 3.14;
                        
    }
}