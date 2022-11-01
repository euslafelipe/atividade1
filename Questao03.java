package atividades.atividade1;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Olá "+ nome);


        ler.close();
}

}