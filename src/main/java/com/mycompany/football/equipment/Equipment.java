
package com.mycompany.football.equipment;

import com.mycompany.football.Interface;
import com.mycompany.football.equipment.sportsman.Coach;
import com.mycompany.football.equipment.sportsman.Player;
import java.util.ArrayList;


public class Equipment implements Interface{
    private String name;
    private String city;
    private int score = 0;
    private Coach coach;
    private ArrayList<Player> listPlayers = new ArrayList<>();
    
    public Equipment(String name, String city, Coach coach) {
        this.name = name;
        this.city = city;
        this.coach = coach;
    }
    
    public void punctuation(int score){
        this.score += score;
    }
    
    public void addPlayers(Player player){
        listPlayers.add(player);
    }
    
    public void lookPlayers(){
        String information;
        for (int i = 0; i < listPlayers.size(); i++) {
           information =  listPlayers.get(i).getName() +" "+ listPlayers.get(i).getGoals() +" "+ listPlayers.get(i).getAssists()+" "+ listPlayers.get(i).getCards();
            System.out.println(information);
        }
    }
    @Override
    public void entertainmnent() {
        System.out.println("El equipo esta entrenando");
    }

    @Override
    public void excercise() {
        System.out.println("El equipo está realizando ejercicio");
    }

    @Override
    public void eat() {
        System.out.println("El equipo esta en horario de comida");
    }
    
    
}
