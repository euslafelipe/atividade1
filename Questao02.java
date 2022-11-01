package atividades.atividade1;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite um numero");
    int num = ler.nextInt();
    int anterior = num - 1;
    int sucessor = num + 1;
    
    System.out.println("O valor anterior é :"+ anterior);
    System.out.println("O valor anterior é : "+ sucessor);

    ler.close();

    }

}