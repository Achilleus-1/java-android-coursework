/**
 * Author:  
 * UTSA CS 3443 - Lab 1
 * Fall 2024
 */
public class WorkContact extends Contact {


		private String title; //all these organzie the names and titles and descriptors to print them
		private String company;

	public WorkContact(String name, String company, String title, String phoneNumber)
	{

		super(name, phoneNumber);


		this.title = title;

		this.company = company;
	}

			public String getTitle()
			{
		return title;

	}

				public void setTitle(String title) {
		this.title = title;
	}
			public String getCompany() {
		return company;
	}
			public void setCompany(String company) {
		this.company = company;
	}


	@Override
		public String toString() {
		return name + " [" + title + ", " + company + "]: " + phoneNumber;
	}
}
