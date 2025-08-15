public class Exercicio2 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            int j = 1;
            System.out.println("Tabuada do " + i);
            while(j <= 10) {
                System.out.println(i + "X" + j + "=" + i*j);
                j++;
            }
            i++;
        }
    }
}