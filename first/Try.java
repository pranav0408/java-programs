public class Try{
        // inside class only declaration and initialization is allowed and no statement 
		public static void main(String args[]){
			int t = 10;
			// byte b = 128; => gives an error since -128 to 127
			byte b = (byte) 128;
			
			long l = 345798797898789L;

			float f = (float) 1.14545454545;  //  or
			float ff = 1.14545454545f;

			char c = 122;
			char cc ='6';
			// char cc = '65' ==> throws an error since two character

/*			byte bc = 6;
			char cb = bc;
			throws an error. Automatic conversion is allowed only for int and for rest it is narrowing in case of conversion to char.
*/
			
			String bla = "hello";

			byte  a1= 2,  b1= 3;
			byte c1 = (byte)(a1*b1);

			char c2 = 65;
			// c2 = c2 + 1; ==> error
			c2 += 1; // means we don't need to take the variable out but increment is done inside the variable. So, no need to type cast


			
			int x = 10,y=5;
			while(x-->7||++y<8){
			System.out.print(x);
			System.out.println(y);
		    	}
			System.out.print(x);
			System.out.println(y);
		}
}