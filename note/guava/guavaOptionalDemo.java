
import com.google.common.base.Optional;


/**
* how to use optional?
* the guava cache not allowed return null value. optional make guava perfect.
* if object null then just return absent value.
* that a great idea. best work guava!! 
**/
import com.google.common.base.Optional;

public class guavaOptionalDemo {

	public static Optional optionalStringVal(){
		return Optional.of("test");
	}
	
	public static Optional optionalObjVal(){
		test t = new test();t.name="hello guava";
		return Optional.of(t);
	}
	
	public static Optional optionalNull(){
		return Optional.absent();
	}
	
	
	
	public static void main(String[]args){
		System.out.println(optionalStringVal().orNull());
		System.out.println(((test)optionalObjVal().orNull()).name);
		System.out.println(optionalNull().orNull());
	}
}

class test{
	public String name;
}