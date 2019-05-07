import java.util.Scanner;
enum Speed
  {
	ONE(20), TWO(40), THREE(60), FOUR(80), FIVE(100), OFF; 
        int rpm;
  	Speed()
	 {
		rpm=0;
	 }
	Speed(int rpm)
	 {
		this.rpm=rpm;
	 }
	int get_speed()
	 {
		return this.rpm;
	 }
	 public String toString()
	 {
		return "Speed of level "+this.name()+" is "+this.get_speed();

	 }
  }
class TestEnumeration1
  {
	public static void main(String[] args)
         {
		Speed s[]=Speed.values();
		for(int i=0;i<s.length;i++)
			//System.out.println("Speed of level "+s[i]+" is "+s[i].get_speed());
			System.out.println(s[i]);


	 }
  }




