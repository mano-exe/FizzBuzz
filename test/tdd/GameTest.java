package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
		
	}

	@Test
	void test1() {
		
		game.roll(0);
		assertEquals(game.score(),0);
	}
	@Test
	void test2() {
		for (int i=0; i<20; i++) {
			game.roll(0);
		}
		assertEquals(game.score(),0);
		
	}
	
	@Test
	void test4() {
		for (int i=0; i<10; i++) {
			game.roll(1);
		}
		for (int j=0; j<10; j++) {
			game.roll(2);
		}
		assertEquals(game.score(),0);
	}
	@Test
	void test3() {
		for (int i=0; i<20; i++) {
			game.roll(1);
		}
		assertEquals(game.score(),20);
	}
	
}