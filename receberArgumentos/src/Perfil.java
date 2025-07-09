public class Perfil {
    public static void main(String[] args){
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.err.println("tenho " + idade + " Anos");
        System.err.println("Minha Altura é " + altura +"cm ");
    }
}
