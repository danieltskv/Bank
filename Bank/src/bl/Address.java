package bl;

public class Address {
	private String city;
	private String street;
	private int apartmentNumber;
	
	public Address(String city, String street, int apartmentNumber) {
		this.city = city;
		this.street = street;
		this.apartmentNumber = apartmentNumber;
	}

	public String getCity() {	
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", apartmentNumber=" + apartmentNumber + "]";
	}
	
	
}
