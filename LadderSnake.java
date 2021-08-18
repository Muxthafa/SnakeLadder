package com.bridgelabs;

public class LadderSnake {
	public static final int no_play = 1;
	public static final int Ladder = 2;
	public static final int Snake = 3;
	public static void main(String[] args) {
		System.out.println("Welcome to snake ladder problem");
		int pos = 0;
		int count=0;
		
		while(pos != 100) {
		
		int dice = ((int)(Math.random()*10)%6)+1; //player rolls the dice
		System.out.println("Die Number:"+dice);
		
		int choice = ((int)(Math.random()*10)%3)+1;
		System.out.println("Option is:"+choice);
		
		switch(choice)
		{
		case no_play : System.out.println("No play");
						break;
		case Ladder : System.out.println("Moving ahead by "+dice+" and current position is: "+pos);
						pos = pos+dice;
						break;
		case Snake : System.out.println("Moving behind by "+dice+"and current position is: "+pos);
						pos = pos-dice;
						break;
		}
		count++;
		if(pos > 100) {			//ensure player gets exact winning position 100
			pos = pos-dice;
		}
		if(pos<0) {
			pos=0;
		}
		}
		System.out.println("Your current position is: "+pos+" Congratulations!! You have won!!!");
		System.out.println("Number of times dice thrown is: "+count);
	}
}

