package addbook;

public class PersonInfo {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	int zip;
	int phoneNum;

	public PersonInfo(String fn,String ln,String add,String c, String s,int z,int phone){
		firstname = fn;
		lastname = ln;
		address = add;
		city = c;
		state = s;
		zip = z;
		phoneNum = phone;  
	}

	@Override
	public String toString() {
		return "PersonInfo [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNum=" + phoneNum + "]";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}  

}
