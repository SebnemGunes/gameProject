package Entities;

import Abstracts.Entity;

public class Sale implements Entity {
    private int saleId;
    private int gamerId;
    private int gameId;
    private double price;
    public  Sale(){}

    public Sale(int saleId, int gamerId, int gameId, double price) {
        this.saleId = saleId;
        this.gamerId = gamerId;
        this.gameId = gameId;
        this.price = price;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
