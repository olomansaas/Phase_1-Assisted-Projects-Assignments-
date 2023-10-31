package Part1;

public class Accessmodifiers {
	
	 public static class Student{
		int Rno;  //Default Access Modifier.
		
		public String Name;  //Public Access Modifier.
		
		private int pno; //Private Access Modifier.
		
		protected String address;  //Protected Access Modifiers.
		
		public int getpno() { 
			 return this.pno;
			 }
		public void setpno(int phone) { 
			 this.pno=phone;
			 }
		
	}

	public static void main(String[] args) {
		Student s1= new Student();
		
		// We are able to access the default access modifier in main function.
		s1.Rno=5;
		System.out.println(s1.Rno);
		
		// We are able to access the public access modifier in main function.
		s1.Name="Panakraj";
		System.out.println(s1.Name);
		
		// We ar  able to access the private access modifier in main function by getter and setter method.
		s1.setpno(8765432);
		
		
		// We are able to access the Protected access modifier in main function as they are accessible only in same class/package/subclass.
				s1.address="jrbfhvjbv";
				
		
		
		
	
}
	
	 }
