public class ConstructorPractice {
    public int i;
        public static void main (String args[]) {
            ConstructorPractice cp = new ConstructorPractice(46);
            System.out.println(cp.i);
        }
        public ConstructorPractice() {
            i = 20;
        }
        public ConstructorPractice(int a) {
            i  = a;
        }
}