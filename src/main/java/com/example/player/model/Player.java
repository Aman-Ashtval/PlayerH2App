package com.example.player.model;

public class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    // constructor of model class to inisializing variable
    Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    // public gatter and setter methods to manupulate the value of private
    // attributes
    public void setId(int playerId) {
        this.playerId = playerId;
    }

    public int getId() {
        return this.playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setJearseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}