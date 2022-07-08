
public class EvenOdd {

	public static boolean even(int i) {
		if(i%2==0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		if(even(3)==true)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
