package com.lehigh;

public class Monster {
    public String name;
    public int strength; // 力量
    public int agility; // 敏捷
    public int intelligence;  //智力

    public String toString(){
        return "(" + this.name + " " + this.strength + " " + this.agility + " " + this.intelligence + ")";
    }
}

class Duck extends Monster {
    public Duck(){
        this.name = "Duck";
        this.strength = 8 ;
        this.agility = 18;
        this.intelligence = 1;
    }
}

class Dragon extends Monster {
    public Dragon(){
        this.name = "Dragon";
        this.strength = 9 ;
        this.agility = 39;
        this.intelligence = 9;
    }
}

class Tortoise extends Monster {
    public Tortoise(){
        this.name = "Tortoise";
        this.strength = 7 ;
        this.agility = 1;
        this.intelligence = 47;
    }
}
