public class JaggedArray {
    public static void main (String args[]) {
        int[][] b = {
            {1,2},
            {3,4,5},
            {6,7}
        };
        for(i=0; i<b.length; i++) {
            for(j=0; j<b[i].length; j++) {

                System.out.print(b[i][j] + " ");
                
            }

            System.out.println();
        }
    }
}