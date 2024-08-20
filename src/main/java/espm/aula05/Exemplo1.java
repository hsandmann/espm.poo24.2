package espm.aula05;

public class Exemplo1 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ceumini");

        System.out.println("p1: " + p1.getNome());

        Pessoa p2 = new Pessoa("123321", "Com cpf");
        System.out.println("p2: " + p2.getNome() + " | " + p2.cpf);


    }
    
}
