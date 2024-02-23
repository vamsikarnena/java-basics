public class PrimeNumber {
    public static void main (Sting args[]) {
        int num = 55;
        boolean flag = false;
        for (i=2; i<=num/2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
            if (!flag)
                System.out.println("is prime");
            else
                System.out.println("not a prime");    
        }
    }
}