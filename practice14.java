public class BiggestNumber {
    public static void main(String args[]) {
        int x,y,z;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Largest number is "+x);
        x = s1.nextInt();
        System.out.println("largest number is " +y);
        y = s1.nextInt();
        System.out.println("largest number is " +z);
        z = s1.nextInt();

        if(x>y && x>z) {

             System.out.println("largest number is " +x);

        }
        else if(y>z) {
    
             System.out.println("largest number is " +y);

        }
        else {

             System.out.println("largest number is " +z);

        }


    }
}