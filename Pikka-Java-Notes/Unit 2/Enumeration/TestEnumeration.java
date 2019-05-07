import java.util.Scanner;
enum Direction
  {
	NORTH, SOUTH, EAST, WEST //semi colon optional
  }
class TestEnumeration
  {
	public static void main(String[] args)
         {
		Direction var1=Direction.NORTH;
		System.out.println(var1);
		Direction var2=Direction.SOUTH;
		System.out.println(var1==var2);
		switch(var2)
		  {
		    case NORTH:
			System.out.println("This is NORTH Direction");
			break;
		    case SOUTH:
			System.out.println("This is SOUTH Direction");
			break;
		    case EAST:
			System.out.println("This is EAST Direction");
			break;
		    case WEST:
			System.out.println("This is WEST Direction");
			break;
		  }
		Direction test_values[]=Direction.values();
		for(int i=0;i<test_values.length;i++)
			System.out.println("  "+test_values[i]);

		Scanner s=new Scanner(System.in);
		String str=s.next();
		Direction d=Direction.valueOf(str);
		System.out.println(d);

	 }
  }




