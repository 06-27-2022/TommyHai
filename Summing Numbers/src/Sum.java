
public class Sum {
	
	int maxsize;
	int maxnum;
	
	public Sum(int maxsize, int maxnum){
		this.maxsize=maxsize;
		this.maxnum=maxnum;
	}

	public int[]createList(){
		return createList(maxsize,maxnum);
	}
	public int[]createList(int maxsize, int maxnum){
		int length = (int)(Math.random()*maxsize);
		int[]list = new int[length];
		
		for(int i=0;i<length;i++)
			list[i]=(int)(Math.random()*maxnum);
		
		return list;
	}
	public int sum(int[]list) {
		int sum=0;
		for(int i:list) 
			sum+=i;
		return sum;
	}
	public void printList(int[]list) {
		System.out.print("List: ( ");
		for(int i:list)
			System.out.print(i+" ");
		System.out.println(")");
	}

}
