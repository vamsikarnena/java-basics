public class User {
    public static void main(String args[]) {
        Vamsi vamsi = new Vamsi();
        vamsi.read();

        V v = new V();
        v.read();
        v.write();

        S s = new S();
        s.read();
        s.write();
        s.mange();
        
    }
}