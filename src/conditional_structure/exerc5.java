package conditional_structure;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//        ordem crescente ou decrescente.

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
