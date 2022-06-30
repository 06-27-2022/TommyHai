
public class SummingNumbers {

	public static void main(String[] args) {
		
		Sum s= new Sum(10, 10);
		
		for(int i=0;i<10;i++) {
			int[]list=s.createList();
			int sum = s.sum(list);
			s.printList(list);
			System.out.println("Sum:"+sum+"\n");
		}
		
	}

}
