class Box
 {
        double width;
	double height;
	double depth;
	Box() 
	 {
	     System.out.println("Constructing Box");
	     width = 10;
	     height = 10;
	     depth = 10;
	 }
	double volume() 
         {
	     return width * height * depth;
	 }
 }
class BoxDemo4
 {
    public static void main(String args[])
        {
		Box mybox1 = new Box();
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
	}
 }

	
