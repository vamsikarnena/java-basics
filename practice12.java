public class Practice {
    public static void main(String args[]) {
        String s1 = " hello ";
        String s2 = "Hello";
        String s3 = "HeLl0";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.contain("l"));
        System.out.println(s1.contain("He"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.endsWith("he"));
        System.out.println(s1.length()); 
        System.out.println(s1.trim());
        System.out.println(s1.trim().length());
    
        
    }

}