
public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World");
			
			TestApp objTestApp = new TestApp();
			
			System.out.println("My name is " + objTestApp.fullName("pankaj", "shandilya"));
			
			System.out.println("Game about to start");
	}
	
	public String fullName(String firstName, String lastName){
		
		String fullName = "";
		
		if(!("".equals(firstName)))
			fullName = firstName;
		
		if(!("".equals(lastName)))
			fullName = fullName + " " + lastName;
		
		return fullName;
		
	}

}
