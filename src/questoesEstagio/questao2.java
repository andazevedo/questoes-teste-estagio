package questoesEstagio;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String entrada;
        do {
            System.out.print("Digite um número para a verificação (Se quiser encerrar, digite 'X')\n");
            System.out.print("Entrada: ");
            entrada = scanner.nextLine();

            if (!entrada.equalsIgnoreCase("X")) {
                try {
                    int numero = Integer.parseInt(entrada);
                    if (verificarFibonacci(numero)) {
                        System.out.println(numero + " pertence à sequência de Fibonacci.");
                    } else {
                        System.out.println(numero + " não pertence à sequência de Fibonacci.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro válido ou 'X' para sair.");
                }
            }

        } while (!entrada.equalsIgnoreCase("X"));

        scanner.close();
    }

    public static boolean verificarFibonacci(int numero) {
        int anterior = 0;
        int atual = 1;

        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            if (atual == numero) {
                return true;
            }
        }

        return false;
	}

}
