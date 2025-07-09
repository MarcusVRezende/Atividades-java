package edu.atividades;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.err.println("Digite seu Primeiro nome:");
        String nome = scanner.next();

        System.err.println("Digite seu Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite Sua Idade:");
        double idade = scanner.nextInt();

        System.out.println("Digite Sua Altura:");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.err.println("tenho " + idade + " Anos");
        System.err.println("Minha Altura é " + altura +"cm ");
        
    }
}
