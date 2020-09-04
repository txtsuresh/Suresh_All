package Core_Java;
// Abstract Class extends the abstract (only method) & concrete methods (Method & body). Method created without body will be called as abstract.

public abstract class Abstract_ParentClass {

	
	public void breakfast()
	{
		System.out.println("Had Breakfast");
	}

	public void lunch()
	{
		System.out.println("Had lunch");
	}
	public void dinner()
	{
		System.out.println("Had dinner");
	}

  public abstract void eveningsnack();
  
  public abstract void morningsnack();
  
  
}
 