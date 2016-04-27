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
public class KR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String[] name={"Коьната 1","Комната 2","Комната 3","Комната 4","Комната 5"};
      String[] type={"Люкс","Стандарт","Эконом"};
      Hotel[] mas=new Hotel [10];
      for (int i=0;i<mas.length;i++){
          int kol=(int)(Math.round(Math.random()*4+1));
          int costOf=(int)(Math.round(Math.random()*10000));
          int time=(int)(Math.round(Math.random()*10+1));
          int nameI=(int)(Math.round(Math.random()*4));
          int typeI=(int)(Math.round(Math.random()*2));
          mas[i]=new Hotel( name[nameI],  time,  type[typeI],  kol, costOf);
          mas[i].outInfo();
      }
      
      
      
    }
    
}
