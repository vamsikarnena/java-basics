public class Test {

             int i = 10;
             int j = 20;

            public Test () {
            int i;
            int j;
            }

            public Test(int i, int j ) {
                this.i = i;
                this.j = j;

             }
            public static void main (Strijng args []) {

                Test t = new Test();
                Test t1 = new Test(20,30);
                System.out.println(t.add());
                System.out.println(t1.add());
                
             }

             public int add() {
                 return i + j;
             }
}