package repetitive_structure;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//        Lembrando que, por definição, fatorial de 0 é 1.

import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero inteiro: ");
        int N = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= N; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
