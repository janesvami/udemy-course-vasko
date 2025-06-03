package com.javacode.collections.egor.teams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TeamsMain {
    public static void main(String[] args) {

        FootballPlayer fullbackBars = new FootballPlayer("Jules Kunde", "BARCELONA", 23);
        FootballPlayer goalkeeperBars = new FootballPlayer("Ander Astralaga", "BARCELONA", 23);
        FootballPlayer halfbackBars = new FootballPlayer("Unai Hernandez", "BARCELONA", 35);
        FootballPlayer forwardBars = new FootballPlayer("Fermin Lopez", "BARCELONA", 16);

        FootballPlayer fullbackRM = new FootballPlayer("Edgar Pujol", "REAL_MADRID", 37);
        FootballPlayer goalkeeperRM = new FootballPlayer("Fran Gonzalez", "REAL_MADRID", 30);
        FootballPlayer halfbackRM = new FootballPlayer("Federico Valverde", "REAL_MADRID", 15);

        FootballPlayer fullbackMU = new FootballPlayer("Habib Ogunneye", "MANCHESTER_UNITED", 75);
        FootballPlayer goalkeeperMU = new FootballPlayer("Andre Onana", "MANCHESTER_UNITED", 24);

        FootballPlayer fullbackJuv = new FootballPlayer("Tiago Djalo", "JUVENTUS", 33);

        List<FootballPlayer> players = new ArrayList<>();
        players.add(fullbackJuv);
        players.add(fullbackMU);
        players.add(fullbackBars);
        players.add(fullbackRM);
        players.add(goalkeeperMU);
        players.add(goalkeeperBars);
        players.add(goalkeeperRM);
        players.add(halfbackBars);
        players.add(halfbackRM);
        players.add(forwardBars);

        HashMap<String, List<FootballPlayer>> teamPlayers = groupByTeams(players);
        List<FootballPlayer> oneTeamPlayers = teamPlayers.get("REAL_MADRID");
        if (oneTeamPlayers == null) {
            System.out.println("There are no players from this team on the list");
    } else {
            printPlayers(oneTeamPlayers);
        }

}

    private static void printPlayers(List<FootballPlayer> players) {
        for (FootballPlayer footballPlayer : players) {
            System.out.println(footballPlayer);
        }
    }

    static HashMap<String, List<FootballPlayer>> groupByTeams(List<FootballPlayer> players) {

        HashMap<String, List<FootballPlayer>> teamPlayers = new HashMap<>();
        String checkingKey = null;



            for (FootballPlayer footballPlayer : players) {

                checkingKey = footballPlayer.getTeam();
                List<FootballPlayer> oneTeamPlayers = teamPlayers.get(checkingKey);

                if (oneTeamPlayers == null) {
                    oneTeamPlayers = new ArrayList<>();
                    teamPlayers.put(checkingKey, oneTeamPlayers);
                    oneTeamPlayers.add(footballPlayer);
                } else {
                    oneTeamPlayers.add(footballPlayer);
                }
            }

            return teamPlayers;
        }


}


