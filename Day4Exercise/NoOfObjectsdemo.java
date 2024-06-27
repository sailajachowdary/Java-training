package Day4Exercise;

public class NoOfObjectsdemo {
		    public static void main(String[] args) {
	        // Creating instances of ObjectCounter
	    	NoOfObjects obj1 = new NoOfObjects();
	    	NoOfObjects obj2 = new NoOfObjects();
	    	NoOfObjects obj3 = new NoOfObjects();

	        // Printing the number of objects created
	        System.out.println("Number of objects created: " + NoOfObjects.getObjectCount());

	        // Creating more instances of ObjectCounter
	        NoOfObjects obj4 = new NoOfObjects();
	        NoOfObjects obj5 = new NoOfObjects();

	        // Printing the updated number of objects created
	        System.out.println("Number of objects created: " + NoOfObjects.getObjectCount());
	    



	}


}
