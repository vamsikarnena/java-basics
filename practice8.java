public class MultidimentionalArray {
    public static void main (String args[]) {
        int [][] a = new int [3][2];
        a[0][0] = 1;
        a[0][1] = 2;
        
        a[1][0] =3;
        a[1][1] =3;
        
        a[2][0] =3;
        a[2][1] =3;

        System.out.println(a.[0][1]);
        
        for(int i=0; i<a.length; i++) {
            int [] b = a[i];
              for(int j=0; j<b.length; j++) {

              System.out.print(b[j] + " ");
              
              }    
              System.out.println();          
        }
    }
}