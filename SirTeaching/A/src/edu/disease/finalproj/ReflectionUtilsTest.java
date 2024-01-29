package edu.disease.finalproj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;

public class ReflectionUtilsTest {
	@Test
	public void testCallGetterForProperty() {
		SampleClass sc = new SC("ramu");
		// Redirect standard output to capture the printed stack trace
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outputStream));
		// Call the met method
		ReflectionUtils.callGetterForProperty(sc, "firstname");
		// Restore the standard output
		System.setOut(originalOut);
		// Get the captured stack trace as a string
		String printedStackTrace = outputStream.toString().trim();
		// Verify that the stack trace contains the exception message
		// You can customize this assertion based on your expected output
		// For example, you can check for specific keywords in the stack trace
		// or compare it with an expected stack trace string.
		assertEquals("The supplied property is invalid...", printedStackTrace.substring(0, 35));
	}

	@Test
	public void testCallGetterForProperty6() {
		// Redirect standard output to capture the printed stack trace
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outputStream));
		// Call the met method
		ReflectionUtils.callGetterForProperty(null, "firstname");
		// Restore the standard output
		System.setOut(originalOut);
		// Get the captured stack trace as a string
		String printedStackTrace = outputStream.toString().trim();
		// Verify that the stack trace contains the exception message
		// You can customize this assertion based on your expected output
		// For example, you can check for specific keywords in the stack trace
		// or compare it with an expected stack trace string.
		assertEquals("The supplied property is invalid...", printedStackTrace.substring(0, 35));
	}

	@Test
	public void testCallGetterForProperty7() {
		// Redirect standard output to capture the printed stack trace
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outputStream));
		// Call the met method
		ReflectionUtils.callGetterForProperty(new Object(), "firstname");
		// Restore the standard output
		System.setOut(originalOut);
		// Get the captured stack trace as a string
		String printedStackTrace = outputStream.toString().trim();
		// Verify that the stack trace contains the exception message
		// You can customize this assertion based on your expected output
		// For example, you can check for specific keywords in the stack trace
		// or compare it with an expected stack trace string.
		assertEquals("The supplied property is invalid...", printedStackTrace.substring(0, 35));
	}

	@Test
	public void testCallGetterForProperty2() {
		// Sample class with a property "name"
		SampleClass sample = new SC("ramu");
		// Call the callGetterForProperty method to get the value of the "name" property
		Object value = ReflectionUtils.callGetterForProperty(sample, "name");
		// Assert that the value is "ramu"
		Assert.assertEquals("ramu", value);
	}

	@Test
	public void testCallGetterForProperty5() {
		// Sample class with a property "name"
		SampleClass sample = new SC("ramu");
		// Call the callGetterForProperty method to get the value of the "name" property
		Object value = ReflectionUtils.callGetterForProperty(sample, "f");
		// Assert that the value is "somu"
		Assert.assertEquals("somu", value);
	}

	@Test
	public void testCallGetterForProperty3() {
		// Sample class with a property "name"
		SampleClass sample = new SC("ramu");
		// Call the callGetterForProperty method to get the value of the "name" property
		Object value = ReflectionUtils.callGetterForProperty(sample, "available");
		// Assert that the value is "false"
		Assert.assertFalse((boolean) value);
	}

	@Test
	public void testCallGetterForProperty4() {
		// Sample class with a property "name"
		SampleClass sample = new SC("ramu");
		// Call the callGetterForProperty method to get the value of the "name" property
		Object value = ReflectionUtils.callGetterForProperty(sample, "s");
		// Assert that the value is "false"
		Assert.assertFalse((boolean) value);
	}

}

class SampleClass {
	private String name;
	private boolean available;
	private String f = "somu";
	private boolean s;

	/**
	 * @return the f
	 */
	public String getF() {
		return f;
	}

	/**
	 * @param f the f to set
	 */
	public void setF(String f) {
		this.f = f;
	}

	/**
	 * @return the s
	 */
	public boolean isS() {
		return s;
	}

	/**
	 * @param s the s to set
	 */
	public void setS(boolean s) {
		this.s = s;
	}

	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	public SampleClass() {
// TODO Auto-generated constructor stub
	}

	public SampleClass(String name) {
		this.name = name;
	}

// Getter method for the "name" property
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class SC extends SampleClass {
	public SC(String name) {
		super(name);
	}
}