package variables;

public class Address {
	int buildingNumber;
	String streetName;
	String city;
	String state;
	int zipCode;
	
	public Address(int building, String street, String city, String state, int zip)
	{
		this.buildingNumber = building;
		this.streetName = street;
		this.city = city;
		this.state = state;
		this.zipCode = zip;
	}
}
