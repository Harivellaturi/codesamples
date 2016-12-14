package com.github.harivellaturi;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

//Junit Test
public class UnitTest{

	//Test Method
	@Test
	public void TestUppercase() {	
	
		ClassToBeTested classToBeTested = new ClassToBeTested();
		List<String> inputText = Arrays.asList("a", "b", "hi");
        List<String> result = classToBeTested.convertToUpperCase(inputText);
       
		assertEquals(Arrays.asList("A", "B", "HI"), result);
	}
}