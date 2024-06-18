

package com.mycompany.football;

import com.mycompany.football.equipment.Equipment;
import com.mycompany.football.equipment.sportsman.Coach;
import com.mycompany.football.equipment.sportsman.Player;


public class FOOTBALL {

    public static void main(String[] args) {
        League league = new League("La Liga", "España");
        Coach coach = new Coach("Anchelotti", 56);
        Equipment equipoOne = new Equipment("Real Madrid", "Madrid", coach);
        Coach coachTwo = new Coach("Paulo Fonseca", 49);
        Equipment equipoTwo = new Equipment("Milan", "Milan", coachTwo);
        Player playerOne = new Player("Bellingham", 20, "MCO", 5);
        Player playerTwo = new Player("Toni", 34, "MCD", 8);
        Player playerThree = new Player("Vinicius", 22, "EI", 7);
        equipoOne.addPlayers(playerTwo);
        equipoOne.addPlayers(playerThree);
        equipoOne.addPlayers(playerOne);
        playerOne.statistics(1, 2, 0);
        playerThree.statistics(5, 1, 1);
        equipoOne.lookPlayers();
        equipoOne.punctuation(3);
        equipoTwo.punctuation(1);
        league.addEquipments(equipoOne);
        league.addEquipments(equipoTwo);
        league.positionsTable();
    }
}
