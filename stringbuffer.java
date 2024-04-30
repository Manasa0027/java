package week7;

public class stringbuffer 
{
	public class StringBufferExample 
	{
	    public static void main(String[] args) 
	    {
	        StringBuffer buffer = new StringBuffer("Hello");
	        buffer.append(",java!!!");
	        System.out.println("After append: " + buffer);
	        buffer.insert(5, " Java");
	        System.out.println("After insert: " + buffer);
	        buffer.reverse();
	        System.out.println("After reverse: " + buffer);
	        buffer.delete(0, 6);
	        System.out.println("After delete: " + buffer);
	        int length = buffer.length();
	        System.out.println("Length of buffer: " + length);
	        String str = buffer.toString();
	        System.out.println("Converted to String: " + str);
	    }
	}

}
