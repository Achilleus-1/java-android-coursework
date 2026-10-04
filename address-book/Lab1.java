/**
 * Lab1 is a Java class containing a main method to run your program when completed.
 * This class will not compile until you have completed the requirements outlined in
 * the lab description.
 *
 * @author Course-provided driver
 * UTSA CS 3443 - Lab 1
 * Fall 2023
 */
public class Lab1 {

	public static void main( String[] args ) {

		// Initialize new contacts
		FamilyMember fannie = new FamilyMember("Fannie Schrute", "sister", "555-1234", "Boston");
		FamilyMember cameron = new FamilyMember("Cameron Whitman", "nephew", "555-1235", "Boston");
		FamilyMember jeb = new FamilyMember("Jeb Schrute", "brother", "555-0420", "the farm");
		FamilyMember mose = new FamilyMember("Mose Schrute", "brother", "000-0000", "the farm");

		// Initialize new address book
		AddressBook familyBook = new AddressBook( "Family Contacts" );

		// Add contacts to address book
		familyBook.addContact( fannie );
		familyBook.addContact( cameron );
		familyBook.addContact( jeb );
		familyBook.addContact( mose );

		// Initialize new contacts
		Contact michaelScott = new WorkContact( "Michael Scott", "Dunder Mifflin", "Regional Manager", "555-7268" );
		Contact jim = new WorkContact( "Jim Halpert", "Dunder Mifflin", "Sales Representative", "555-7262" );
		Contact pam = new WorkContact( "Pam Beesly", "Dunder Mifflin", "Receptionist", "555-5464" );
		Contact bob = new WorkContact( "Bob Vance", "Vance Refrigeration", "Owner", "555-5309" );
		Contact ryan = new WorkContact( "Ryan Howard", "Dunder Mifflin", "Intern", "555-5355" );
		Contact toby = new WorkContact( "Toby Flenderson", "Dunder Mifflin", "Human Resource Manager", "555-5263" );
		Contact angela = new WorkContact( "Angela Martin", "Dunder Mifflin", "Accountant", "555-3944" );
		Contact creed = new WorkContact( "Creed Bratton", "Dunder Mifflin", "Unknown", "555-0000" );


		// Initialize new address book
		AddressBook workBook = new AddressBook( "Work Contacts" );

		// Add contacts to address book
		workBook.addContact( michaelScott );
		workBook.addContact( jim );
		workBook.addContact( pam );
		workBook.addContact( bob );
		workBook.addContact( ryan );
		workBook.addContact( toby );
		workBook.addContact( angela );
		workBook.addContact( creed );


		// Print to the console
		System.out.println( workBook );
		System.out.println( familyBook );

		// Add a new contact : Harvey Schrute (uncle, Pennsylvania): 555-9876
		Contact harvey = new FamilyMember( "Harvey Schrute", "uncle", "555-9876", "Pennsylvania" );
		familyBook.addContact( harvey );

		// Remove a contact
		workBook.removeContact( toby );

		// Print to the console
		System.out.println( "**** Updated ****" );
		System.out.println( workBook );
		System.out.println( familyBook );
	}
}