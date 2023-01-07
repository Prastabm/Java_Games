package com.snakes_and_ladders;
import java.util.*;

public class Player {
    Random r=new Random();
     String name;
    int flag=0,dice_roll,move=0,pos=0;
    public Player (String n)
    {
        name=n;
    }
    void initFlag()
    {
        flag=r.nextInt(2);
        if(flag==1) System.out.println("game started for "+name);
        else System.out.println("game not started for "+name+" try again");
    }
    void Dice_roll()
    {

            dice_roll=r.nextInt(6)+1;
    }

}
