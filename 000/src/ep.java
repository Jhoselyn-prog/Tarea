
public class ep {
	public static void main(String[] args) {
		double epsilon=1;
		while(true){
			if(epsilon+1<=1)
			{
				break;
			}
			epsilon=epsilon/2;
		}
		epsilon=2*epsilon;
		
System.out.println(epsilon);
	}

}
