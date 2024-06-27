package Day2Exercise;

public class Email extends Document{
	 private String Sender;
	 private String Receiver;
	 private String Title;

	public Email() {
		super();
	}
	
	public Email(String sender, String receiver, String title , String text) {
		super();
		text =text;
		Sender = sender;
		Receiver = receiver;
		Title = title;
	}

	public String getSender() {
		return Sender;
	}

	public void setSender(String sender) {
		Sender = sender;
	}

	public String getReceiver() {
		return Receiver;
	}

	public void setReceiver(String receiver) {
		Receiver = receiver;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	
	@Override
	public String toString() {
		return "Sender=" + Sender+"\n" + "Receiver=" + Receiver+"\n" + "Title=" + Title +"\n"+ "Body :"+getText();
	}

	public static void main(String[] args) {
		
	Email E1 = new Email();
	
	E1.setSender("Harsha");
	
	E1.setReceiver("Ashok");
	
	E1.setTitle("Subject");
	
	E1.setText("Hi Ashok come to Training intime");
	System.out.println(E1);
	}


	}
