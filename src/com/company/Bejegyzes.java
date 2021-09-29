package com.company;

import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok=0;
    private LocalDateTime letrejott=LocalDateTime.now();
    private LocalDateTime szerkesztve=LocalDateTime.now();


    public Bejegyzes(String szerzo, String tartalom){
        this.szerzo= szerzo;
        this.tartalom=tartalom;
    }
    public String getSzerzo(){
        return this.szerzo;
    }
    public String getTartalom(){
        szerkesztve=LocalDateTime.now();
        return this.tartalom;
    }
    public void setTartalom(String tartalom){

    }
    public int getLikeok(){
        return this.likeok;
    }

    public LocalDateTime getLetrejott() {
        return this.letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }
    public void like(){
        this.likeok++;
    }

    @Override
    public String toString() {
        return this.szerzo + " - " + this.likeok +" - " + this.letrejott + "\nSzerkeztve: " + this.szerkesztve + "\n" + this.tartalom;
    }

}
