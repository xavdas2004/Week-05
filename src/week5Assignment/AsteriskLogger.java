package week5Assignment;

public class AsteriskLogger implements Logger{
	/*The log method on the AsteriskLogger should print out the String it receives between 3 asterisks 
	 * on either side of the String (e.g. if the String passed in is “Hello”, then it should print 
	 * ***Hello*** to the console).*/
	String asts = "***";
	String astline = "****************";

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		String astMsg = asts + message + asts;
		System.out.println(astMsg);
	}
	/*The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, 
	 * with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the 
	 * following should be printed:
	 ****************
	 ***Error: Hello***
	 ****************
	 */
	@Override
	public void Error(String message) {
		String error = ("Error: " + message);
		// TODO Auto-generated method stub
		String errorMsg = (astline + "\n" + asts + error + asts + "\n" + astline );
		System.out.println(errorMsg);
	}

}
