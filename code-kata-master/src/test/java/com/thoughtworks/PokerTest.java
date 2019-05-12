package com.thoughtworks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PokerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	} 
	@Test
    public void test1() {
    	Poker Poker = new Poker();
    	String result = Poker.compareResult("2H 3D 5S 9C KD","2C 3H 4S 8C AH");
    	String result1 = Poker.compareResult("2H 4S 4C 2D 4H","2S 8S AS QS 3S");
    	String result2 = Poker.compareResult("2H 3D 5S 9C KD","2C 3H 4S 8C KH");
    	String TIE = Poker.compareResult("2H 3D 5S 9C KD","2H 3D 5S 9C KD");

    	Assert.assertEquals("White wins - high card:A", result);
    	Assert.assertEquals("Black wins - full house", result1);
    	Assert.assertEquals("Black wins - high card:9", result2);
    	Assert.assertEquals("Tie", TIE);

    }


}
