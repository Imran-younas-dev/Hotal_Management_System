package hotel.management.system;

public class Customer_Change_Info_mutable {
	 String username;
	    String fullName;
	    String password;
	    String contactNo;
	    String address;

	    public Customer_Change_Info_mutable(String username, String password, String contactNo, String address) {
	        this.username = username;
	        this.password = password;
	        this.contactNo = contactNo;
	        this.address = address;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getFullName() {
	        return fullName;
	    }

	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getContactNo() {
	        return contactNo;
	    }

	    public void setContactNo(String contactNo) {
	        this.contactNo = contactNo;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
	}

