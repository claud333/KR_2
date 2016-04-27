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
public class Room {
    protected String type;
    protected int kolvo;
    protected int costOf;

    public Room() {
        type="none";
        kolvo=-1;
        costOf=-1;
    }

    public Room(String type, int kolvo, int costOf) {
        this.type = type;
        this.kolvo = kolvo;
        this.costOf = costOf;
    }

    public String getType() {
        return type;
    }

    public int getKolvo() {
        return kolvo;
    }

    public int getCostOf() {
        return costOf;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public void setCostOf(int costOf) {
        this.costOf = costOf;
    }
    public double onePeople(){
        return costOf/kolvo;
    }
   public void outInfo(){
       System.out.println("Тип комнаты:"+ type+" Кол-вщ человек:"+ kolvo+" Стоимость:" +costOf+" Цена на одного:"+onePeople());
   }
    
    
    
}
