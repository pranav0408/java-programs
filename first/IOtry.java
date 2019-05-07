import java.util.*;

class IOtry{

	// static block executes even before the main block
	static{  
		System.out.println("This is a static block");
	}    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		long l = 0L;

		// l = sc.nextLong();
		// sc.nextLine();
		// System.out.println(l);

		l = Long.parseLong(args[0]);
		System.out.println("Your Command Line Input was " + l);
	}
}

// user dummy nextLine() after using any next(), nextInt(), nextLong() ... bla bla to clear the '\n' present in the buffer 
//  since other read methods are token based and do not read the '\n' character and it stays in the buffered.