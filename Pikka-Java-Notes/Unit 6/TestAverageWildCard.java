class Average<T extends Number>
  {
	T[] list;
	Average(T[] r)
	     {
		list=r;
	     }
	double find_Average()
	    {
		double sum=0.0;
		for(int i=0;i<list.length;i++)
	                           { 
  			sum=sum+list[i].doubleValue();
			//sum=sum+(double)list[i];
                                                 }
	                       return sum/list.length;
	     }
	boolean isEqualAverage(Average<?> ob)//T can be Float, Integer,Double or Number and comparison can be made between objects of different type class only
	//boolean isEqualAverage(Average<T> ob) //T can be Float, Integer,Double or Number only but comparison can be made between objects of same type class only
	    {
		if(find_Average()==ob.find_Average())
			return true;
		else 
			return false;
	     }           
  }
class TestAverageWildCard
	{
		public static void main(String[] args)
		      {
		               Integer[] a_list={1,2,3,4,5,6};
		               Average<Integer> iob=new Average<Integer>(a_list);
		               System.out.println("Average of Integer List is"+iob.find_Average());

		               Float[] fa_list={1.0f,2.0f,3.0f,4.0f,5.0f,6.0f};
		               Average<Float> fob=new Average<Float>(fa_list);
		               System.out.println("Average of Float List is"+fob.find_Average());

                               Double[] da_list={1.1,2.2,3.3,4.4,5.5,6.6};
		               Average<Double> dob=new Average<Double>(da_list);
		               System.out.println("Average of Double List is"+dob.find_Average());

		               System.out.println("Testing Average for Equality of Integer and Float");
		               if(iob.isEqualAverage(fob))
            	                     System.out.println("Average is Same");
		               else
                                     System.out.println("Average is Different");

/*String[] sa_list={"a","ab","abc","abcd","abcde"};
Average<String> sob=new Average<String>(sa_list);
System.out.println("Average of Double List is"+sob.find_Average());

String[] sa_list={"a","ab","abc","abcd","abcde"};
Average<String> sob=new Average<String>(sa_list);
System.out.println("Testing Average for Equality of Integer and String");
if(iob.isEqualAverage(sob))
            System.out.println("Average is Same");
else
            System.out.println("Average is Different");*/
                                                      }
           }

