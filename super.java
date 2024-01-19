public class S extends V {
    public void mange() {
        super.read();            // using the super key word read method called from the parent class 
        write();
        System.out.println("mange");

    }

    public void read() {
        System.out.println("hi"); // here it is read method called local variable method its called only local class
        
    }
}