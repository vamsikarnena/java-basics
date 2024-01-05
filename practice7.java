public class Array {
    public static void main (String args[]) {
        int[] j = new int[5];
        j[0] = 1;
        j[1] = 46;
        j[3] = 77;
        int length = j.length;
        
        int sum = 0;
        for(i=0; i<j.length; i++) {
             sum = sum+j[i];

        }   
        double average = sum/length;
        System.out.println("average");
        
    }
}