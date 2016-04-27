/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kr_2;

/**
 *
 * @author Илья
 */
public class Hotel extends Room {
    private String name;
    private int  time;

    public Hotel(String name, int time, String type, int kolvo, int costOf) {
        super(type, kolvo, costOf);
        this.name = name;
        this.time = time;
    }

    public Hotel() {
        this.name ="none";
        this.time = -1;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    public double costOfOne(){
        return onePeople()*time;
    }
    public double costOf(){
        return costOf*time;
    }
    public void outInfo(){
        System.out.println("Тип комнаты:"+ type+" Кол-вщ человек:"+ kolvo+" Стоимость:" +costOf+" Цена на одного:"+onePeople());
        System.out.println( "Наиминование:"+name+" Длительность проживания:"+time+" Цена на одного:"+costOfOne()+" Цена на всех:"+costOf);
         System.out.println();
}
    
    
    
}