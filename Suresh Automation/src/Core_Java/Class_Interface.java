package Core_Java;



public  class Class_Interface implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Class_Interface a = new Class_Interface();
	a.flightsair();
	a.carroad();
	a.flightsair();
	a.traintracks();
	a.carroad();
	a.walkground();	

	}
	
	@Override
	public void flightsair() {
		// TODO Auto-generated method stub
		System.out.println("Print flightsair");
		
	}
	
	public void walkground()
	{
		System.out.println("Print walkground");
	}
		

	@Override
	public void traintracks() {
		// TODO Auto-generated method stub
		System.out.println("Print trainstracks");
	}

	@Override
	public void carroad() {
		// TODO Auto-generated method stub
		System.out.println("Print carroad");
		
		
	}
	
}
