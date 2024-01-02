public class Positive_Negative {
    public static void main (String args []) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("check the number");
        Int n = scanner.nextInt();

        if(n<0) {
            System.out.println("this is negative number");
        }

        else if(n>0) {
            System.out.println("this is a positive number");     
        }

        else {
            System.out.println("this is neither positive nor negative");
            
        }
    }
}