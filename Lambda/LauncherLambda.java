package Lambda;

public class LauncherLambda {

	public static void main(String[] args) {
		Lambda aux = new Lambda();
		//Define operations
		Operation addition = (int a, int b) -> a+b;
		Operation substraction = (int a, int b) -> a-b;
		
		//Declare some variables
		int x = 10; 
		int y = 20;
		
		//Getting the results
	    System.out.println(aux.operate(x,y, addition));
	    System.out.println(aux.operate(x,y, substraction));
	}
}
