package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.GetAddress;
import pojo.location;



public class Body {

	public pojo.GetAddress GetAddress(String name, String address, String language) {

	GetAddress GA = new GetAddress();
	GA.setAccuracy(50);
	GA.setName(name);
	GA.setAddress(address);
	GA.setPhone_number("(+91) 983 893 3937");
	GA.setWebsite("http://google.com");
	GA.setLanguage(language);
	
	List<String> data= new ArrayList<String>();
	data.add("shoe park");
	data.add("shop");
	GA.setTypes(data);
	
	location l= new location();
	l.setLat(-38.383494);
	l.setLng(33.427362);
	GA.setLocation(l);
	
	return GA;
	
}
}