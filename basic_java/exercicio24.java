import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int menor_perfeito = Integer.MAX_VALUE; // Inicializa com um valor alto
        boolean encontrou_perfeito = false; // Flag para verificar se encontramos algum número perfeito

        while (contador < 10) {
            System.out.println("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            int somaDivisores = 0;

            // Verifica os divisores próprios do número
            for (int x = 1; x < numero; x++) {
                if (numero % x == 0) {
                    somaDivisores += x;
                }
            }

            // Verifica se o número é perfeito
            if (somaDivisores == numero) {
                encontrou_perfeito = true;
                if (numero < menor_perfeito) {
                    menor_perfeito = numero;
                }
                contador++; // Incrementa o contador apenas se encontrar um número perfeito
            }
        }

        if (encontrou_perfeito) {
            System.out.println("O menor número perfeito é: " + menor_perfeito);
        } else {
            System.out.println("Nenhum número perfeito foi encontrado.");
        }

        scanner.close();
    }
}
