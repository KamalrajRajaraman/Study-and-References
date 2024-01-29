package oops;
/**
 * if the getter method we are looking is not found in the class, then it recursively with the super classes for the method and it break at object class or if the method is found.
The syntax for a getter method name is as follows
1. the method name begins with a lowercase letter
2. convert the first character for the property name to upper case
3. if the return type is a primitive typed boolean, then the method starts with "is"
4. if the return type is not a primitive typed boolean, then the method starts with "get"
 *
 */
public class ReflectionUtils {
    public static <D> Object callGetterForProperty(D instance, String propertyName) {
    	Class<?> currentClass=null;
    	try {
    	if(instance!=null) {
    		currentClass = instance.getClass();    		
    	}
    	else {
			throw new NoSuchFieldException("The supplied property is invalid...");
		}
    	if (currentClass == Object.class) {
    			throw new NoSuchFieldException("The supplied property is invalid...");
    		}  	      
        return callGetterRecursively(instance, propertyName, currentClass);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            System.out.println("The supplied property is invalid...");
            return null;
        }
    }
    private static <D> Object callGetterRecursively(D instance, String propertyName, Class<?> currentClass) throws NoSuchMethodException {
        if (currentClass == null || currentClass == Object.class) {
            // Base case: If we have reached Object class, the getter method was not found, throws exception
            throw new NoSuchMethodException("The supplied property is invalid...");
        }
        try {
            // Get the getter method for the property
            Method getter = currentClass.getDeclaredMethod(getGetterMethodName(propertyName,currentClass));
            // If getter method is found, invoke it on the instance to get the property value
            if (getter != null) {
                return getter.invoke(instance);
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | NoSuchFieldException e) {
            // Handle any exceptions that may occur during reflection
            System.out.println("The supplied property is invalid...");
            //e.printStackTrace();
        }
        // Move up to the superclass and continue the search recursively
        return callGetterRecursively(instance, propertyName, currentClass.getSuperclass());
    }
    // Helper method to construct the getter method name from the property name
    private static String getGetterMethodName(String propertyName,Class currentClazz)throws NoSuchFieldException {
    	
        char firstChar = Character.toUpperCase(propertyName.charAt(0));
        Field field=currentClazz.getDeclaredField(propertyName);
        Type type= field.getType();
        if(type.getTypeName().equals("boolean")) {
        	if (propertyName.length() == 1) {
                return "is" + firstChar;
            }
        	return "is" + firstChar + propertyName.substring(1);
        }
        if (propertyName.length() == 1) {
            return "get" + firstChar;
        }
        return "get" + firstChar + propertyName.substring(1);
    }
}

