package de.tu_bs.cs.isf.e4cf.core.test;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.tu_bs.cs.isf.e4cf.core.transform.TransformationHelper;

public class TransformationHelperTest {

	@Test
	@DisplayName("IfInstanceOfThenTest")
	void testIfInstanceOfThen() {		
		Object o = new String("Hallo");
		TransformationHelper.ifInstanceOfThen(o, Integer.class, integer -> {
			fail("The method shouldn't get access to this part.");
		});
	}

}
