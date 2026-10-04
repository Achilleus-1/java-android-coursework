/**
 * Author:  
 * UTSA CS 3443 - Lab 1
 * Fall 2024
 */
public abstract class Contact {
	protected String name;
	protected String phoneNumber;

	public Contact(String name, String phoneNumber) {


		this.name = name;

		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} //gets and makes name

	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	//gets and makes num

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;

	}

	public abstract String toString();

}
