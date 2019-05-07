// enum reference can be used as a switch type
// values() returns array of all the objects defineed in enum

class EnumDemo{
    public enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        for(Days d: Days.values()){
            System.out.println(d);
        }
    }
}