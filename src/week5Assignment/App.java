package week5Assignment;

public class App {
//In this class instantiate an instance of each of your logger classes that implement the Logger interface.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.Log("Hello there");
		asteriskLogger.Error("General Kenobi");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.Log("Hello there");
		spacedLogger.Log("General Kenobi");
	}
}
