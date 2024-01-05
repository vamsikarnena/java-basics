public class Array {
    public static void main (String args[]) {
        int[] j = new int[5];
        j[0] = 1;
        j[1] = 46;
        j[3] = 77;
        System.out.println(j[3]);

        for(i=0; i<j.len; i++) {
            System.out.println(j[i]);
        }
        int sum = j[0]+j[1]+j[3]+j[4]+j[5];
            System.out.println(sum);


    }
}