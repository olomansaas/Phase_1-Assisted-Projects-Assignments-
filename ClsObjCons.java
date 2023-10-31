package Part1;

public class ClsObjCons {
	
	public static class Fun{
		int i;
		int c;
		public void getinfo(int a , int b) {
			 c =a+b;
			
			System.out.println(this.i );
			System.out.println(this.c );
			
		}
		
	}
	

	public static void main(String[] args) {
		
		
		Fun f1 = new Fun();  // Default Constructor.
		f1.i=4;     // Object of a class.
		f1.getinfo(8, 7);  // Parameterized Constructor.
		
		
	}

}
