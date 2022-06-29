
public class GradingCalculator {

	public static void main(String[] args) {

		int [] arr = {95, 85, 62, 40, 79};

		int [] grades= arr; 
		String[]topic = {"Math", "English", "Science", "History", "Art"};
		char[]letter=new char[grades.length];
		int a=90, b=80, c=70, d=60;
		
		//fill letter array based on grade array
		for(int i=0;i<grades.length;i++) {
			if(grades[i]>=a)
				letter[i]='A';
			else if(grades[i]>=b)
				letter[i]='B';
			else if(grades[i]>=c)
				letter[i]='C';
			else if(grades[i]>=d)
				letter[i]='D';
			else
				letter[i]='F';
		}	
		
		System.out.println("Grades\n"+topic[0]+":"+letter[0]);
		for(int i=1;i<grades.length;i++)
			System.out.println(topic[i]+": "+letter[i]);
	}

}
