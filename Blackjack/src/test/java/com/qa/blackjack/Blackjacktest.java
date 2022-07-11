package com.qa.blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Blackjacktest {
	Blackjack plays = new Blackjack();
	
	@Test
	public void  handOneHandTwoZero() {
		int a = 10;
		int b = 10;
		
		assertEquals("Test 1 fail",0,plays.play(a, b));
		}
	
	@Test
	public void  handOneHandTwoLessZero() {
		int a = -1;
		int b = -1;
		
		assertEquals("Test 2 fail",0,plays.play(a, b));
		}
	@Test
	public void  handOneHandTwoGreaterthan21() {
		int a = 22;
		int b = 24;
		
		assertEquals("Test 3 fail",0,plays.play(a, b));
		}
	@Test
	public void  handOneGreaterthan21HandTwo() {
		int a =22;
		int b = 21;
		
		assertEquals("Test 4 fail",21,plays.play(a, b));
		}
	@Test
	public void  handOneLess21HandTwo() {
		int a =21;
		int b = 23;
		
		assertEquals("Test 5 fail",21,plays.play(a, b));
		}
	@Test
	public void  handOneGreaterHandTwo() {
		int a =19;
		int b = 14;
		
		assertEquals("Test 6 fail",19,plays.play(a, b));
		}
	@Test
	public void  handOneLessHandTwo() {
		int a =12;
		int b = 16;
		
		assertEquals("Test 7 fail",16,plays.play(a, b));
		}
	
	

}
