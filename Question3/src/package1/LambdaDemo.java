package package1;

public interface LambdaDemo {
	    // An abstract function
	    void fun(String x);
	  
	    // default function
	    default void defFunction()
	    {
	       System.out.println("hii I am Aditya");
	    }
	}
	  
	class Test
	{
	    public static void main(String args[])
	    {
	        /* lambda expression to implement above
	         LambdaDemo interface. This interface
	         by default implements fun()*/
	        LambdaDemo obj = (String x)->System.out.println(x);
	  
	        // This calls above lambda expression and prints 10.
	        obj.fun("Hii This is Massage");
	    }
	}
	

