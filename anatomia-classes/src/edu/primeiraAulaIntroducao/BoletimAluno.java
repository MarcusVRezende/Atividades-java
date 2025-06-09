package edu.primeiraAulaIntroducao;
public class BoletimAluno {
    public static void main(String[] arg) {

        int mediaAluno = 10;
        if (mediaAluno < 5) {
            System.out.println("Aluno reprovado!");
        } else if (mediaAluno == 5) {
            System.out.println("passou na media!");
        } else {
            System.out.println("Aluno aprovado!");
        }
    }

}
