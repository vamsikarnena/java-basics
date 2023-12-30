public class Bank {

	public static void greetings() {
		System.out.println("hello. Welcome");

	}
	public static void main(String[] args) {
		greetings();
		
	}
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
	    System.out.println("deposit successfully");

	}
	public static void withdrawn (int amount) {
		withdrawn = Balance - amount;
		System.out.println("withdrawn successfully");
	}
	public int getcurrentBalance() {
		System.out.println("currentBalance + ");


	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(500);
		System.out.println("balance after deposit :"+bank.getcurrentBalance());
        bank.getBalance();
        withdrawn(300);
        System.out.println("balance after withdrawn :" +currentBalance);

	}
}