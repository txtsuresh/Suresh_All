package resources;

public class HTTPActions {
	
	public String post="maps/api/place/add/json";
	public String get = "maps/api/place/get/json";
	public String update = "maps/api/place/update/json";
	public String delete= "maps/api/place/delete/json";
	
	public String GetAdd()
	{
		return post;
	}
	public String GetView()
	{
		return get;
	}

	public String GetUpdate()
	{
		return update;
	}
	public String GetDelete()
	{
		return delete;
	}


}
