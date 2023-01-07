package com.snakes_and_ladders;

public class Movement {
    Player p;
    public Movement(Player player)
    {
        p=player;
    }
    void movepos()
    {
        p.Dice_roll();
        p.move= p.dice_roll;
        System.out.println("Dice roll for "+p.name+':'+p.move);
        p.pos+=p.move;
        checkpos(p.pos);
    }
    void checkpos(int ch){
        switch (ch)
        {
            case 9:
                System.out.println("LADDER!!");
                System.out.println(p.name+" promoted to 33");
                p.pos=33;
                break;
            case 18:
                System.out.println("LADDER!!");
                System.out.println(p.name+" promoted to 24");
                p.pos=24;
                break;
            case 41:
                System.out.println("LADDER!!");
                System.out.println(p.name+" promoted to 59");
                p.pos=59;
                break;
            case 66:
                System.out.println("LADDER!!");
                System.out.println(p.name+" promoted to 87");
                p.pos=87;
                break;
            case 36:
                System.out.println("SNAKE!!");
                System.out.println(p.name+" demoted to 7");
                p.pos=7;
                break;
            case 62:
                System.out.println("SNAKE!!");
                System.out.println(p.name+" demoted to 44");
                p.pos=44;
                break;
            case 90:
                System.out.println("SNAKE!!");
                System.out.println(p.name+" demoted to 47");
                p.pos=47;
                break;
            case 98:
                System.out.println("SNAKE!!");
                System.out.println(p.name+" demoted to 61");
                p.pos=61;
                break;
        }

    }
}
