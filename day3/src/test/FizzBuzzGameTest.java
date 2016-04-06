package test;

import main.FizzBuzzGame;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGameTest {

	@Test
	public void sayFizzTest() throws Exception {
		
		String answer = new FizzBuzzGame().say(3);
		Assert.assertEquals(answer, "3");
	}
}
