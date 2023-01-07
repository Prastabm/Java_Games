package com.snakes_and_ladders;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String name;
        int ch1,ch2;
        System.out.println("___________________SNAKES AND LADDERS___________________");
        //inputting player info
        System.out.println("enter the name of player 1: ");
        name= s.nextLine();
        Player p1=new Player(name);
        System.out.println("enter the name of player 2: ");
        name= s.nextLine();
        Player p2=new Player(name);

        Movement m1=new Movement(p1);
        Movement m2=new Movement(p2);

        //rules
        System.out.println("__________________________RULES_________________________");
        System.out.println("1. Enter 1 to roll dice");
        System.out.println("2. Enter 0 to exit game");
        System.out.println("3. In case of game termination player at the\n highest position wins");
        System.out.println("4. Entering wrong choice terminates the game");
        System.out.println("________________________________________________________");

        //performing the game
       do {
            System.out.println("Player 1:\nenter 1 to roll dice : ");
            ch1=s.nextInt();
           System.out.println("Player 2:\nenter 1 to roll dice : ");
           ch2=s.nextInt();
            if(ch1==0 || ch2==0) break;
            else if (ch1==1 && ch2==1) {
                if (p1.flag < 1) p1.initFlag();
                else m1.movepos();
                if (p2.flag < 1) p2.initFlag();
                else m2.movepos();
            }
            else{
                System.out.println("wrong choice");
                break;
            }
           System.out.println(p1.name+':'+p1.pos+" , "+p2.name+':'+p2.pos);

        }
       while(p1.pos<100 && p2.pos < 100);

       if(p1.pos>p2.pos) System.out.println(p1.name+" wins");
       else if (p2.pos>p1.pos) System.out.println(p2.name+" wins");

    }
}
