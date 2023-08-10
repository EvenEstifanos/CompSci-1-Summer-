
public enum Size 
{
	LARGE,
	MEDIUM,
	SMALL;

	 public static Size valueOF(String name) 
	 {
	        return Enum.valueOf(Size.class, name);
	 }


    public static Size[] value() 
	  {
	        return values();
	  }
	
}
