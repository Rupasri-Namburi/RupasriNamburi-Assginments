package Spring;


public class Address {
	 String street;
	 String city;
	 String state;
	 int zip;
	String country;

	public Address(String country, String state, String city, int zip, String street) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.street = street;
    }

	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public String getCountry() {
		return country;
	}
	
	 @Override
	    public String toString() {
	        return "{Country:- "+getCountry()+", State:-"+getState()+", City:-"+getCity()+", Zipcode:-"+getZip()+", Street:-"+getStreet()+"}";
	    }

}

