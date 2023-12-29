public class Student {
	int id = 546;
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.id);

		int height = 177;               // inside the method can created variable this can only use inside the method
		
		System.out.println(height);

	}
}