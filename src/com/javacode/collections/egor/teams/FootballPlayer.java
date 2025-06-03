package com.javacode.collections.egor.teams;

import java.util.Objects;

public class FootballPlayer {
    private final String fullName;
    private final String team;
    private final int playerNumber;

    public FootballPlayer(String fullName, String team, int playerNumber) {
        this.fullName = fullName;
        this.team = team;
        this.playerNumber = playerNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTeam() {
        return team;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    @Override
    public String toString() {
        return "№ " + playerNumber + " " + fullName + ", " + team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballPlayer that = (FootballPlayer) o;
        return playerNumber == that.playerNumber && Objects.equals(fullName, that.fullName) && team == that.team;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, team, playerNumber);
    }
}
