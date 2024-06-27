package Day2Exercise;

public class Document {
	private String text;
	
	public Document() {
		super();
	}

	public Document(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
	
	public static void main(String args[])
	{
		
		Document td = new Document();

		td.setText("This the document");
		System.out.println(td);
	}
	
	

}
