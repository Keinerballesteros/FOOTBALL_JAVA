
package com.mycompany.football.equipment.sportsman;


public class Player {
    private String name;
    private int age;
    private String position;
    private int shirtNumber;
    private int goals = 0;
    private int assists = 0;
    private int cards = 0;

    public Player(String name, int age, String position, int shirtNumber) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.shirtNumber = shirtNumber;
    }
    
    public void statistics(int goals, int assists, int cards){
        this.goals = goals;
        this.assists = assists;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getCards() {
        return cards;
    }
    
    
    
}
