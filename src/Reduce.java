public class Reduce {
    public static void main(String[] args) {
        int num_steps = 0;
        int n = 100;
        while (n != 0) {
            if (n % 2 == 0){
                n = n / 2;
            }
            else {
                n = n - 1;
            }
            num_steps++;
        }
        System.out.println(num_steps);
    }
}
