package espm.aula04;

public class ManipulaPessoas {

    public static void main(String[] args) {

        Pessoa p0 = null;

        Pessoa p1 = new Pessoa();
        p1.nome = "John";
        p1.idade = 31;
        System.out.println(p1.nome);
        System.out.println(p1.idade);

        Pessoa p2 = new Pessoa();
        p2.nome = "Mary";
        p2.idade = 34;
        System.out.println(p2.nome);
        System.out.println(p2.idade);

        System.out.println("p0: " + p0);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1 == p2: " + (p1 == p2));

        p0 = new Pessoa(); // instanciar o objeto
        System.out.println("p0: " + p0);

    }
    
}
