package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Athina
 */
public class eidiko_programma 
{
    private String titlos;
    private int tmima;

    public eidiko_programma(String titlos,int tmima) {
        this.titlos = titlos;
        this.tmima = tmima;
    }

    
    public String getTitlos() {
        return titlos;
    }

    public void setTitlos(String titlos) {
        this.titlos = titlos;
    }

    public int getTmima() {
        return tmima;
    }

    public void setTmima(int tmima) {
        this.tmima = tmima;
    }
    

    @Override
    public String toString() {
        return "eidiko_programma{" + "titlos=" + titlos + ", aithousa=" + ", tmima=" + tmima + '}';
    }
    
    
    
    
}
