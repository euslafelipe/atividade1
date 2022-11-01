package atividades.atividade1;
import java.util.Scanner;

public class Questao00 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //nome, idade, altura, sexo
        System.out.println("digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("digite sua idade:");
        int idade = ler.nextInt();

        System.out.println("digite sua altura:");
        Float altura = ler.nextFloat();

        System.out.println("digite seu genero:");
        char sexo = ler.next().toCharArray()[0];

        ler.close();

        System.out.println("Informacoes Registradas");
        System.out.println("Nome:"+nome);
        System.out.println("idade:"+idade);
        System.out.println("altura:"+altura);
        System.out.println("sexo:"+sexo);

        //quantas copas do mundo essa pessoa ja viu o brasil vencer???
        // 1958 1962 1970 1994 2002
        int anonacimento = 2022 - idade;
        int qtcopas = 0;
        String listacopas = "";
        if(anonacimento <= 1958) {
            qtcopas++;
            listacopas += "1958";
            
        }
        if(anonacimento <= 1962) {
            qtcopas++;
            listacopas += "1962";
            
        }
        if(anonacimento <= 1970) {
            qtcopas++;
            listacopas += "1970";
            
        }
        if(anonacimento <= 1994) {
            qtcopas++;
            listacopas += "1994";
            
        }
        if(anonacimento <= 2002) {
            qtcopas++;
            listacopas += "2002";
            
        }
        System.out.println("As copas que eu vi: "+ qtcopas+" anos "+listacopas);

    }

} 

