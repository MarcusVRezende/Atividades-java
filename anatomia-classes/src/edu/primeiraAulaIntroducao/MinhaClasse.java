package edu.primeiraAulaIntroducao;

//classe
public class MinhaClasse {
    
//metodo
    public static void main (String[] arg){
        int num1 = 10;
        int num2 = 5;

        String primeiroNome = "Marcus ";
        String ultimoNome = "Rezende";

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        int somar = somar(num1, num2);

        System.out.println(somar);
        System.out.println(nomeCompleto);
        
        somar(num1, num2);
        

    }
    public static int somar(int numero1, int numero2){
        return numero1 + numero2;
    }
    
    public static String nomeCompleto(String primeiroNome, String ultimoNome){
        return "resultado do metodo = " + primeiroNome.concat(ultimoNome);

    }
}
