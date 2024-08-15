import java.util.Scanner;

public class numero_inteiro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números a serem digitados: ");
        int quantidade = scanner.nextInt();
        
        float soma = 0;
        for (int x = 0; x < quantidade; x++){
            System.out.println("Digite um número:");
            float numero = scanner.nextFloat();
            if (numero % 1 == 0 && numero > 0)
                soma = soma + numero;

    }
    System.out.println(soma);
    scanner.close();

    }
}
