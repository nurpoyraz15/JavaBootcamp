package oop1;

public class Customer {
	// id=> bir datayı diğerinden ayırmak için kullandığımız veri kaynağı numarası.  sıralı gider: 1,2,3 diye
	private int id;
	private String customerNumber;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
