package Entities;

import Abstracts.Entity;

public class Game implements Entity {
    private int gameId;
    private String gameName;
    private double gamePrice;
    private double discountPrice;

    public  Game(){}

    public Game(int gameId, String gameName, double gamePrice, double discountPrice) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.discountPrice = discountPrice;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
