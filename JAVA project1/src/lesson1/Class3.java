package lesson1;
// switch, case, break, and default.
public class Class3 {
	

	public static void main(String[] args) {
	int score = 60;
	switch (score) 
	{
	case 90:
		System.out.println("very good");
		break;
	case 65:
	case 55:
		System.out.println("good");
		break;
	case 45:
	case 105:
	case 35:
	case 60:
		System.out.println("ok");
		break;
		default:
			System.out.println("condition not found");
		

}
}
}