package staticexample;

public class Studentmainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Methode");
		System.out.println("........................Staic Varibale...................");
		System.out.println(Student.name);
		System.out.println(Student.mark);
		
		System.out.println(".....................Staic Methode............");
		Student.study();
		
	}

}
