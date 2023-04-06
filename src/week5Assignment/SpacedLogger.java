package week5Assignment;

public class SpacedLogger implements Logger{
//The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//If the log method received “Hello” as an argument, it should print H e l l o
	private String space;
	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
	space = message.replaceAll("", " ").trim();
	System.out.println(space);
	}

	@Override
	public void Error(String message) {
		// TODO Auto-generated method stub
		String spaceError = ("ERROR: " + space);
		System.out.println(spaceError);
	}

}
