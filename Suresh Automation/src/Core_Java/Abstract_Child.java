package Core_Java;

public class Abstract_Child extends Abstract_ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract_Child a = new Abstract_Child();
	a.breakfast();
	a.dinner();
	a.eveningsnack();
		

	}

	@Override
	public void eveningsnack() {
		// TODO Auto-generated method stub
		System.out.println("Had eveningsnack");
		
	}

	@Override
	public void morningsnack() {
		// TODO Auto-generated method stub
		
	}

}
