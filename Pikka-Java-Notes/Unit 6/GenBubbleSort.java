class GenBubbleSort
{
public static<T extends Number> void bubbleSort(T[] array)
{
for(int i=0;i<array.length-1;i++)
{
for(int j=0;j<array.length-1-i;j++)
{
if(array[j].doubleValue()>=array[j+1].doubleValue())
{
T temp= array[j];
array[j]=array[j+1];
array[j+1]=temp;
}
}
}
}
public static void main(String[] args)
{
Integer i[]={9,2,3,8,51,6,17};
bubbleSort(i);
for(int k=0;k<i.length;k++)
System.out.println("  "+i[k]);
}
}