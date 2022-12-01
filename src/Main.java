import models.Groups;
import models.Players;
import models.Teams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Players p1 = new Players("Jonas Hector", 7, 29, 10);
        Players p2 = new Players("Manuel Neuer", 8, 21, 5);
        Players p3 = new Players("Felix Uduokhai", 9, 31, 8);
        Players p4 = new Players("Nico Schulz", 10, 20, 9);
        Players p5 = new Players("Sergio Ramos", 11, 24, 5);
        Players p6 = new Players("Sergio Busquets", 12, 24, 4);
        Players p7 = new Players("Iker Casillas", 13, 29, 5);
        Players p8 = new Players("David Raya", 14, 23, 1);
        Players p9 = new Players("Cristiano Ronaldo", 15, 23, 100);
        Players p10 = new Players("Pepe", 16, 23, 1);
        Players p11 = new Players("Fernando Couto", 17, 23, 1);
        Players p12 = new Players("Nani", 18, 23, 1);

//arraylistofplayers
        ArrayList<Players> germany_players = new ArrayList<Players>();
        germany_players.add(p1);
        germany_players.add(p2);
        germany_players.add(p3);
        germany_players.add(p4);


        ArrayList<Players> spain_players = new ArrayList<Players>();
        spain_players.add(p5);
        spain_players.add(p6);
        spain_players.add(p7);
        spain_players.add(p8);

        ArrayList<Players>portugal_players= new ArrayList<Players>();
        portugal_players.add(p9);
        portugal_players.add(p10);
        portugal_players.add(p11);
        portugal_players.add(p12);


        Teams t1 = new Teams("Germany", "white", "front", "A",germany_players);
        Teams t2 = new Teams("Spain", "white", "front", "C",spain_players);
        Teams t3=new Teams("Portugal","Red","front","D",portugal_players);

        ArrayList<Teams>teamA=new ArrayList<Teams>();
        teamA.add(t1);
        teamA.add(t2);
        teamA.add(t3);


        Groups g1=new Groups("A",teamA);
        Groups g2= new Groups("B",teamA);

    }
}












