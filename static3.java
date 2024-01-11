public class Test {

    static int number;

    public static void main(String args[]) {
        
        Test.number = new Random().nextInt();
        Test.number = new Random().nextInt();             // any number of times called number the class should be override
                                                          // and it will shows the same output why because static class have only static type of data
                                                          
        Test.number = new Random().nextInt();
        Test.number = new Random().nextInt();

        System.out.println(Test.number);
        System.out.println(Test.number);
        System.out.println(Test.number);
        System.out.println(Test.number);

    }
}