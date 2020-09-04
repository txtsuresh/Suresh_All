package Core_Java;

 final class Final_keyword extends Super_Keyword_Parent{ //Class marked as final cannot be extended to child class

   final void getdata() { //If parent class has final method then the same method cannot be overridden in child class
	   
   }
   


	public static void main(String[] args) {
		final int j = 2; // Using final variable - Same variable cannot be used again the class
		
		System.out.println(j);
		
		
		
	}

}
