import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main (String[] args){

        String nome1 = args[0];
        String sobrenome1 = args[1];
        int idade1 = Integer.valueOf(args[2]);
        double altura1 = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome1 + " " + sobrenome1);
        System.out.println("Tenho " + idade1 + " anos ");
        System.out.println("Minha altura é " + altura1 + " cm ");

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");

        

    }
}
