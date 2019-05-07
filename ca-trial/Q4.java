import java.util.*;

@FunctionalInterface
interface myString{
    abstract String toggleString(String str);
    static int count(String s){
        int val = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='A') val++;
            if(s.charAt(i)=='e'||s.charAt(i)=='E') val++;
            if(s.charAt(i)=='i'||s.charAt(i)=='I') val++;
            if(s.charAt(i)=='o'||s.charAt(i)=='O') val++;
            if(s.charAt(i)=='u'||s.charAt(i)=='U') val++;
        }
        return val;
    }
}
interface Upper{
    default int count(String s){
        int val = 0;
        for(int i=0;i<s.length();i++){
            if( Character.isUpperCase(s.charAt(i)) )
                val++;
        }
        return val;
    }
}
interface Lower{
    default int count(String s){
        int val = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i)))
                val++;
        }
        return val;
    }
}
class Demo implements myString,Upper,Lower{
    
    public String toggleString(String str){
        StringBuilder sb = new StringBuilder(str.length());

            for( char ch : str.toCharArray() ){
                     if( Character.isUpperCase(ch) )
                            ch = Character.toLowerCase(ch);
                else if( Character.isLowerCase(ch) )
                            ch = Character.toUpperCase(ch);
                sb.append(ch);
            }

        return sb.toString();
    }  
    
    public int count(String st){
        int valUpper = Upper.super.count(st);
        int valLower = Lower.super.count(st);
        System.out.println("Upper case letter count is: "+valUpper);
        System.out.println("Lower case letter count is: "+valLower);
        return 0;
    }
    class Demo1{
        String str;
        public void readString(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string");
            str = sc.nextLine();
        }
    }
    public static void main(String[] args) {
        Demo obOuter = new Demo();
        Demo.Demo1 obInner = obOuter.new Demo1();
        obInner.readString();
        String s = obOuter.toggleString(obInner.str);
        int countChar = myString.count( obInner.str );
        obOuter.count( obInner.str );
        System.out.println("Total count of vowel in string is: "+countChar);
        System.out.println("Toggled string is: "+s);
    }

}