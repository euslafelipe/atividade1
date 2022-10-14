package atividade1;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite sua nota da prova 1:");
        Float nota1 = ler.nextFloat();

        System.out.println("Digite sua nota da prova 2:");
        Float nota2 = ler.nextFloat();

        float media = (nota1 + nota2)/2;

        System.out.println("Sua nota é:"+ media);
        if (media>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");

    
    }


}