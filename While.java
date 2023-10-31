package Part1;

public class While {

	public static void main(String[] args) {
		int i=0;
		while(i<10)
		{
			System.out.println("Value of i after iteration  : "+ i);
			i= ++i;
		}
	}

}
