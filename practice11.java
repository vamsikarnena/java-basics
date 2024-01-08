public class Demo {
    public static void main (String args[]) {
        String s1 = "hello";           
        
            // these value store in string pool
        
        String s3 = "hello";

        String s2 = new String("hello");  
  
         // these value store in heap memory why beacuse objects 
        
        String s4 = new String("hello");
                                                                                            
        // these value store in heap memory why beacuse objects 
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);            // false  {  == verify  the adress of the strings
        System.out.println(s1==s3);           // true
        System.out.println(s2==s4);          // false    }
        System.out.println(s1.equals(s2));  // true     equals verify the data of the strings
  
        // if you have similar data use the "equals" keyword to equal mrthod

        
 
    }
 }