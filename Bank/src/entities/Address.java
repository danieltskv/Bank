package entities;

public class Address {
	
	private String city;
	private String street;
	private int apartmentNumber;
	private int addressID;
	
	public Address(String city, String street, int apartmentNumber) {
		this.city = city;
		this.street = street;
		this.apartmentNumber = apartmentNumber;
		
		/* Address ID set after creation according to DB */
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


	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", apartmentNumber=" + apartmentNumber + ", addressID="
				+ addressID + "]";
	}
	
	
}
