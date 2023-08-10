
public enum Type
{
	ALCOHOL,
	COFFEE,
	SMOOTHIE;
	
	

	 public static Type valueOF(String name) 
	 {
	        return Enum.valueOf(Type.class, name);
	 }


     public static Type[] value() 
	  {
	        return values();
	  }
	
}
