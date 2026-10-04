/**
 * Author:  
 * UTSA CS 3443 - Lab 1
 * Fall 2024
 */
public class FamilyMember extends Contact {

	private String relationship;
	private String location;

	public FamilyMember(String name, String relationship, String phoneNumber, String location) {

		super(name, phoneNumber);

		this.relationship = relationship;

		this.location = location;

	}

		public String getRelationship()
		{
		return relationship;
	}  //for relationship
		public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
		public String getLocation() {
		return location;
	}   //does location
		public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return name + " (" + relationship + " - " + location + "): " + phoneNumber;
	}
}
