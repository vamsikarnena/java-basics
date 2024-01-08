public class Demo {
    public static void main(String args[]) {
        String s1 = "vamsi hi";
        String s2 = "VamSi";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        char[] a = s1.toCharArray();
        System.out.println(Arrays.toString(s1.split(" ")));
        
    }
}