package emailApp.emailApp;

import java.util.Scanner;

public class email {
	 private String firstName;
	 private String lastName;
	 private String  password;
	 private String email;
	 private String department;
	 private int mailboxCapacity=500;
	 private int defaultpasswordLength=10;
	 private String alternateEmail;
	 private String companySuffix ="anycompany.com";
	 
		// constructor to receive the first name and last name
	 
	public email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		// call a method asking for the department - return the department
		this.department = setDepartment();
		
		
		//call a method that returns random password 
		this.password = randomPassword(defaultpasswordLength);
		System.out.println("Your password is:"+ this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companySuffix;
	    
	}
	
	 
 
	 
	 //ask for department 
	 
	public String setDepartment() {
		System.out.print(" new worker:"+firstName+" Department Codes:\n1 for sales\n2 for development\n3 for accounting\n0 for  none\nEnter department code:");
		Scanner in =new Scanner(System.in);
		int depChoice= in.nextInt();
		 if(depChoice ==1) {
			 return "sales";
		 }
		 else if(depChoice ==2) {
			 return  "dev";
		 }
		 else if(depChoice ==3) {
			 return "acct";
		 }
		 else {
			 return "";		 }
		 
		
		}
	 //generate a random password 
	
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$%&";
		char[]password =new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random()* passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	 
	 // set the mailbox capacity
	 
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	 //set the alternate email
	  
	public void setAlternateemail(String altemail) {
		this.alternateEmail= altemail;
	}
	 //change the password
	public void changePasswprd(String passowrd) {
		this.password=password;
	}
	
	public int getmailboxCapacity() {
		return mailboxCapacity;
	}
	 
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return  password;
	}
	
	public String showInfo() {
		return  "Display Name:"+ firstName + ""+ lastName +
				"\nCompany Email:"+ email+
				 "\nMailbox Capacity:"+ mailboxCapacity+"mb" ;
	}
	
}
