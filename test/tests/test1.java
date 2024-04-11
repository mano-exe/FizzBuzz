package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tdd.Game;

class test1 {

	@Test
	void test1() {
		Game.roll(0);
		assertEquals(Game.score(),0);
	}
	@Test
	void test2() {
		for (int i=0; i<20; i++) {
			Game.roll(0);
		}
		assertEquals(Game.score(),0);
		
	}
	@Test
	void test3() {
		for (int i=0; i<20; i++) {
			Game.roll(1);
		}
		assertEquals(Game.score(),20);
	}

}
