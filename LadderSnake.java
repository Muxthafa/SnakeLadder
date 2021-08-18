package com.bridgelabs;

public class LadderSnake {
	public static final int no_play = 1;
	public static final int Ladder = 2;
	public static final int Snake = 3;
	public static void main(String[] args) {
		System.out.println("Welcome to snake ladder problem");
		int pos = 0;
		int count=0;
		
		int dice = ((int)(Math.random()*10)%6)+1; //player rolls the dice
		System.out.println("Die Number:"+dice);
	}
}

