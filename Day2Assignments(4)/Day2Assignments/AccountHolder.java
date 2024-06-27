package Day2Assignments;


import java.util.Scanner;

//Class to store basic account holder information
class AccountHolder {
 protected String AcNo;
 protected String Name;
 protected String contactNo;

 // Constructor to initialize AccountHolder details
 public AccountHolder(String AcNo, String Name, String contactNo) {
     this.AcNo = AcNo;
     this.Name = Name;
     this.contactNo = contactNo;
 }

 // Method to display AccountHolder details
 public void display() {
     System.out.println("Account Number: " + AcNo);
     System.out.println("Name: " + Name);
     System.out.println("Contact Number: " + contactNo);
 }
}

//Class to store detailed account information, inherits from AccountHolder
class AccountDetails extends AccountHolder {
 private String AcType;
 private double bal;

 // Constructor to initialize AccountDetails along with AccountHolder details
 public AccountDetails(String AcNo, String Name, String contactNo, String AcType, double bal) {
     super(AcNo, Name, contactNo);
     this.AcType = AcType;
     this.bal = bal;
 }

 // Overridden method to display AccountDetails along with AccountHolder details
 @Override
 public void display() {
     super.display();
     System.out.println("Account Type: " + AcType);
     System.out.println("Balance: " + bal);
 }
}

