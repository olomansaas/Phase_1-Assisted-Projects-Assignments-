	package Part1;
	
	public class Inheritance {
		// Single - Multi lvl inheritance / hierarchical inheritance
		
		
		public static class Animal{
			
			   public void Type()
			   {
			     System.out.println("Base class method");
			   }
		}
	public static class dog extends Animal{
		
	public void color ()
	{
	System.out.println("Child class method");
	}
	
		public static void main(String[] args) {
			dog obj = new dog();
			obj.Type(); //calling super class method
			obj.color(); //calling local method
			}
		
	}
	}
	
	
