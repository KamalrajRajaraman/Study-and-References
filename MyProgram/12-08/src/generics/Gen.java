package generics;
//, Gen is a generic class, which is also called a
//parameterized type.
public class Gen <T>{
	
	private T ob;
	public Gen(T o) {
		ob=o;
	}
	public T getOb() {
		return ob;
	}
	public void showType() {
		System.out.println(ob.getClass().getName());
	}
}
/*
 * Generics Work Only with Reference Types
 * You cannot use a primitive type
 * 
 * Generic Types Differ Based on Their Type Arguments 	
 * 
 * a reference of one specific
version of a generic type is not type compatible with another version of the
same generic type. For example, assuming the program just shown, the
following line of code is in error and will not compile:


		iOb = strOb; // Wrong!
		
		
 Gen class can be achieved without
generics, by simply specifying Object as the data type and employing the
proper casts, what is the benefit of making Gen generic? 

The answer is that
generics automatically ensure the type safety of all operations involving Gen.
In the process, they eliminate the need for you to enter casts and to type-check
code by hand.
*/

/*it also prevents the Java
compiler from having any real knowledge about the type of data actually stored
in NonGen, which is bad for two reasons. 

First, explicit casts must be
employed to retrieve the stored data.
 
Second, many kinds of type mismatch
errors cannot be found until run time.

	// This compiles, but is conceptually wrong!
	iOb = strOb;
	v = (Integer) iOb.getob(); // run-time error!
*
*
*Although using
Object references to create “generic” code has always been possible, that code
was not type safe, and its misuse could result in run-time exceptions. Generics
prevent this from occurring. In essence, through generics, run-time errors are
converted into compile-time errors. This is a major advantage.
*
*/