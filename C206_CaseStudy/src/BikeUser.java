public class BikeUser {
	private String name;
    private int age;
    private String email;
    private int phoneNo;

    public BikeUser(String name, int age, String email, int phoneNo) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNo = phoneNo;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
}
