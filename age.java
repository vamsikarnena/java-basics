public class Age {

   public static void checkAge(int age) {

    if (age < 18) {
      System.out.println("You are teenage "); 
      
    } else {
      System.out.println("You are young"); 
    }
    
  } 

   public static void main(String[] args) { 
    checkAge(20); 
  } 
}
