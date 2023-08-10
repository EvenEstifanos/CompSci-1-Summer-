

public  enum  Day 
{
	SUNDAY,
	MONDAY, 
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
	
	
	 public static Day valueOF(String name) 
	 {
	        return Enum.valueOf(Day.class, name);
	 }


      public static Day[] value() 
	  {
	        return values();
	  }
	
}

