package API;

public class Location {
	private String city;
	private String state;
	private String country;
	private int postcode;
	
	
	
	Street STREET;
	Coordinates COORDINATES;
	Timezone TIMEZONE;
	
	
	
	public String getCity() {
		return city;

	}
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getState() {
		return state;

	}
	public void setState(String state) {
		this.state=state;
	}
	

	public String getCountry() {
		return country;

	}
	public void setCountry(String country) {
		this.country=country;
	}
	
	
	public int getPostcode() {
		return postcode;

	}
	public void setPostcode(int postcode) {
		this.postcode=postcode;
	}

	
	
}
