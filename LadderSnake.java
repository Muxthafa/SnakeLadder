package com.bridgelabs;

public class LadderSnake {
	public static final int no_play = 1;
	public static final int Ladder = 2;
	public static final int Snake = 3;
	
	public static int count=0;
	public static int dice=0;
	
	public static int play(int pos)
	{
		if(pos < 0)
		{
			pos = 0;
		}
	
		dice = ((int)(Math.random()*10)%6)+1; //player rolls the dice
		System.out.println("Die Number:"+dice);
		count++;
		
		int choice = ((int)(Math.random()*10)%3)+1;
		System.out.println("Option is: "+choice);
		switch(choice)
		{
		    case no_play: System.out.println("NO PLAY");
			              break;
			case Ladder : pos += dice;
						  System.out.println("Increased by "+dice);
						  pos=play(pos);
			              break;
			case Snake  : pos-=dice;
						  System.out.println("Declined by "+dice);
			              break;
		}
		if(pos>100)
		{
			pos -= dice;
		}
		return pos;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder program");
		
		int person1pos = 0,person2pos = 0;
		
		while(person1pos !=100 && person2pos != 100)
		{
			System.out.println("Person1 is playing");
			person1pos = play(person1pos);
			System.out.println("position of person 1 "+person1pos);
			System.out.println("Person2 is playing");
			person2pos = play(person2pos);
			System.out.println("position of person 2 "+person2pos);	
		}
		
		if(person1pos == 100)
		{
			System.out.println("Congratulations!!! Person 1 has won");
		}
		else
		{
			System.out.println("Congratulations!!! Person 2 has won");
		}
		System.out.println("Dice has been rolled "+count+" times");
	}
}

