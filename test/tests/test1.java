package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tdd.Game;

class test1 {

	@Test
	void test() {
		Game.roll(0);
		assertEquals(Game.score(),0);
	}

}
