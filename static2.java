public class Test {

    static int number;

    public static void main(String args[]) {
        
        Test.number = new Random().nextInt();

        System.out.println(Test.number);

    }
}