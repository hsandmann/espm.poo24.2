package espm.aula02;

public class Ex1 {

    public static void main(String[] args) {
        int ini = Integer.parseInt(args[0]);
        int fim = Integer.parseInt(args[1]);
        long total = 0l;
        for (int i = ini; i < fim; i ++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            } // 233168
        }
        System.out.println(total);
    }
    
}
