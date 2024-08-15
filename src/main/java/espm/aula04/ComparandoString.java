package espm.aula04;

public class ComparandoString {

    public static void main(String[] args) {

        String s1 = "Hello Isabela";
        String s2 = "Hello Isabela";
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
        String s3 = "Hello ";
        s3 = s3 + "Isabela";
        // estou comparando referências de objetos
        System.out.println(s1 + " == " + s3 + " -> " + (s1 == s3));
        // estou comparando conteúdo dos objetos
        System.out.println(s1 + " == " + s3 + " -> " + (s1.equals(s3)));
        System.out.println();
        System.out.println("hash s1: " + System.identityHashCode(s1));
        System.out.println("hash s2: " + System.identityHashCode(s2));
        System.out.println("hash s3: " + System.identityHashCode(s3));

    }
    
}
