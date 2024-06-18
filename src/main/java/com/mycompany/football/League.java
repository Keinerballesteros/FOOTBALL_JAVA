
package com.mycompany.football;

import com.mycompany.football.equipment.Equipment;
import java.util.ArrayList;


public class League {
    private String name;
    private String country;
    private ArrayList<Equipment> listEquipments;
    
    
    public League(String name, String country) {
        this.name = name;
        this.country = country;
        listEquipments = new ArrayList<>();
    }
    
    public void addEquipments(Equipment equipment){
        listEquipments.add(equipment);
    }
    
    public void positionsTable(){
        for (int i = 0; i < listEquipments.size(); i++) {
          String information = i+1 +"." +" Equipo: "+listEquipments.get(i).getName() + " Puntaje: "+listEquipments.get(i).getScore();
            System.out.println(information);
        }
    }
}
