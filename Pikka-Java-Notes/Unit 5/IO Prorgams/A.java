import java.io.*;

class A
{
	public static void main(String args[])throws IOException
	{
		File f= new File("hello","abcd.text");
		f.createNewFile();
		System.out.println(f.exists());
	}
}