/**
 * Author:  
 * UTSA CS 3443 - Lab 1
 * Fall 2024
 */
public class AddressBook {


	private String name; //names it

	private Contact[] contacts; //array. up to 10

	private int contactCount;



	public AddressBook(String name) {

		this.name = name;

		this.contacts = new Contact[10];  // makes 10

		this.contactCount = 0;  //start off with none
	}

	public String getName() {
		return name;
	}
//more setting
	public void setName(String name) {
		this.name = name;
	}


	public void addContact(Contact contact)
	{
		if (contactCount < contacts.length)
		{
			contacts[contactCount] = contact;
			contactCount++;
		}
		else
		{
			System.out.println("address book full");
		}
	}

	public void removeContact(Contact contact) {
		for (int i = 0; i < contactCount; i++)
		{
			if (contacts[i].equals(contact))
			{
				contacts[i] = contacts[contactCount - 1];  // recursive replacement
				contacts[contactCount - 1] = null;
				contactCount--;
				break;
			}

			}

	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(name + "\n- - - - - - - -\n");
		for (int i = 0; i < contactCount; i++) {

			result.append(" * ").append(contacts[i].toString()).append("\n");
		}
		return result.toString();
	}
}
