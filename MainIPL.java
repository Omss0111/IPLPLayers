package com.tka.oct_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sun.net.www.content.text.plain;

public class MainIPL {

	public static void main(String[] args) {

		List<Player> miPlayersList = new ArrayList<>();
		List<Player> cskPlayersList = new ArrayList<>();
		List<Player> rcbPlayersList = new ArrayList<>();

		// MI Players
		miPlayersList.add(new Player(1, "Rohit Sharma", "Batsman", 500, 0, 5));
		miPlayersList.add(new Player(2, "Suryakumar Yadav", "Batsman", 600, 0, 4));
		miPlayersList.add(new Player(3, "Hardik Pandya", "All-Rounder", 300, 8, 6));
		miPlayersList.add(new Player(4, "Tilak Varma", "Batsman", 400, 0, 3));
		miPlayersList.add(new Player(5, "Jasprit Bumrah", "Bowler", 20, 20, 2));
		miPlayersList.add(new Player(6, "Ishan Kishan", "Wicket-Keeper", 350, 0, 5));
		miPlayersList.add(new Player(7, "Tim David", "Batsman", 250, 0, 4));
		miPlayersList.add(new Player(8, "Piyush Chawla", "Bowler", 30, 12, 3));
		miPlayersList.add(new Player(9, "Gerald Coetzee", "Bowler", 40, 10, 2));
		miPlayersList.add(new Player(10, "Nehal Wadhera", "Batsman", 200, 0, 4));
		miPlayersList.add(new Player(11, "Akash Madhwal", "Bowler", 15, 8, 1));

		// CSK Players
		cskPlayersList.add(new Player(1, "MS Dhoni", "Wicket-Keeper", 250, 0, 8));
		cskPlayersList.add(new Player(2, "Ruturaj Gaikwad", "Batsman", 550, 0, 5));
		cskPlayersList.add(new Player(3, "Ravindra Jadeja", "All-Rounder", 300, 10, 7));
		cskPlayersList.add(new Player(4, "Shivam Dube", "Batsman", 400, 0, 4));
		cskPlayersList.add(new Player(5, "Deepak Chahar", "Bowler", 50, 12, 2));
		cskPlayersList.add(new Player(6, "Devon Conway", "Batsman", 450, 0, 3));
		cskPlayersList.add(new Player(7, "Moeen Ali", "All-Rounder", 200, 6, 4));
		cskPlayersList.add(new Player(8, "Matheesha Pathirana", "Bowler", 10, 15, 1));
		cskPlayersList.add(new Player(9, "Ajinkya Rahane", "Batsman", 350, 0, 2));
		cskPlayersList.add(new Player(10, "Tushar Deshpande", "Bowler", 20, 14, 2));
		cskPlayersList.add(new Player(11, "Mitchell Santner", "All-Rounder", 100, 7, 3));

		// RCB Players
		rcbPlayersList.add(new Player(1, "Virat Kohli", "Batsman", 650, 0, 6));
		rcbPlayersList.add(new Player(2, "Faf du Plessis", "Batsman", 450, 0, 4));
		rcbPlayersList.add(new Player(3, "Glenn Maxwell", "All-Rounder", 300, 8, 5));
		rcbPlayersList.add(new Player(4, "Dinesh Karthik", "Wicket-Keeper", 250, 0, 7));
		rcbPlayersList.add(new Player(5, "Mohammed Siraj", "Bowler", 20, 15, 2));
		rcbPlayersList.add(new Player(6, "Rajat Patidar", "Batsman", 400, 0, 3));
		rcbPlayersList.add(new Player(7, "Cameron Green", "All-Rounder", 350, 8, 4));
		rcbPlayersList.add(new Player(8, "Karn Sharma", "Bowler", 30, 10, 2));
		rcbPlayersList.add(new Player(9, "Will Jacks", "All-Rounder", 200, 5, 3));
		rcbPlayersList.add(new Player(10, "Reece Topley", "Bowler", 15, 7, 1));
		rcbPlayersList.add(new Player(11, "Anuj Rawat", "Wicket-Keeper", 180, 0, 4));

		Map<String, List<Player>> allIplTeamsMap = new HashMap<>();
		allIplTeamsMap.put("MI", miPlayersList);
		allIplTeamsMap.put("CSK", cskPlayersList);
		allIplTeamsMap.put("RCB", rcbPlayersList);

		Set<String> teamNamesKey = allIplTeamsMap.keySet();

		// 1.All Players
		for (String tn : teamNamesKey) {
			System.out.println("\n" + tn + "-->>");
			List<Player> listPlayers = allIplTeamsMap.get(tn);

			for (Player p : listPlayers) {
				System.out.println("  " + p);
			}
		}

		// 2.All Batters
		System.out.println("\nIPL Batters : ");
		for (List<Player> l : allIplTeamsMap.values()) {
			for (Player p : l) {
				if (p.getCategory().equals("Batsman")) {
					System.out.println(p);

				}
			}

		}

		// 3.All Bowlers
		System.out.println("\nIPL Bowlers : ");
		for (List<Player> l : allIplTeamsMap.values()) {
			for (Player p : l) {
				if (p.getCategory().equals("Bowler")) {
					System.out.println(p);

				}
			}

		}

		// 4.All All-Rounders
		System.out.println("\nIPL All-Rounders : ");
		for (List<Player> l : allIplTeamsMap.values()) {
			for (Player p : l) {
				if (p.getCategory().equals("All-Rounder")) {
					System.out.println(p);

				}
			}

		}

		// 5.All Wicket-Keeper
		System.out.println("\nIPL Wicket-Keepers : ");
		for (List<Player> l : allIplTeamsMap.values()) {
			for (Player p : l) {
				if (p.getCategory().equals("Wicket-Keeper")) {
					System.out.println(p);

				}
			}

		}

		// 6.MI Batsman
		System.out.println("\nMumbai Indians Batsmans : ");
		for (Player p : miPlayersList) {
			if (p.getCategory().equals("Batsman")) {
				System.out.println(p);

			}
		}
		// 7.Mi bowlers
		System.out.println("\nMumbai Indians Bowler : ");
		for (Player p : miPlayersList) {
			if (p.getCategory().equals("Bowler")) {
				System.out.println(p);

			}
		}
		// 8.Mi All-Rounders
		System.out.println("\nMumbai Indians All-Rounder : ");
		for (Player p : miPlayersList) {
			if (p.getCategory().equals("All-Rounder")) {
				System.out.println(p);

			}
		}

		// 9.CSK Batsmans
		System.out.println("\nCSK Batsmans : ");
		for (Player p : cskPlayersList) {
			if (p.getCategory().equals("Batsman")) {
				System.out.println(p);

			}
		}
		// 10.CSK Bowler
		System.out.println("\nCSK Bowler : ");
		for (Player p : cskPlayersList) {
			if (p.getCategory().equals("Bowler")) {
				System.out.println(p);

			}
		}
		// 11.CSK All-Rounder
		System.out.println("\nCSK All-Rounder : ");
		for (Player p : cskPlayersList) {
			if (p.getCategory().equals("All-Rounder")) {
				System.out.println(p);

			}
		}

		// 12.RCB Batsmans
		System.out.println("\nRCB Batsmans : ");
		for (Player p : rcbPlayersList) {
			if (p.getCategory().equals("Batsman")) {
				System.out.println(p);

			}
		}
		// 13.RCB Bowlers
		System.out.println("\nRCB Bowlers : ");
		for (Player p : rcbPlayersList) {
			if (p.getCategory().equals("Bowler")) {
				System.out.println(p);

			}
		}
		// 14.RCB All-Rounder
		System.out.println("\nRCB All-Rounder : ");
		for (Player p : rcbPlayersList) {
			if (p.getCategory().equals("All-Rounder")) {
				System.out.println(p);

			}
		}

		// 15.player with highest runs
		System.out.println("\nPlayer with Highest Runs in IPL : ");
		Player highestRuns = null;
		for (List<Player> l : allIplTeamsMap.values()) {
			for (Player p : l) {
				if (highestRuns == null || p.getRuns() > highestRuns.getRuns()) {
					highestRuns = p;
				}
			}
		}
		System.out.println(">>" + highestRuns.getName() + " with Highest Runs " + highestRuns.getRuns());

		// 16.player with highest Wickets
		System.out.println("\nPlayer with Highest Wickets in IPL : ");
		Player highestWickets = null;
		for (List<Player> l : allIplTeamsMap.values()) {
			for (Player p : l) {
				if (highestWickets == null || p.getWickets() > highestWickets.getWickets()) {
					highestWickets = p;
				}
			}
		}
		System.out.println(">>" + highestWickets.getName() + " with Highest Wickets " + highestWickets.getWickets());

		// 17.player with highest Catches
		System.out.println("\nPlayer with Highest Catches in IPL : ");
		Player highestCatches = null;
		for (List<Player> l : allIplTeamsMap.values()) {
			for (Player p : l) {
				if (highestCatches == null || p.getCatches() > highestCatches.getCatches()) {
					highestCatches = p;
				}
			}
		}
		System.out.println(">>" + highestCatches.getName() + " with Highest Catches " + highestCatches.getCatches());

		// 18.Players with Highest Runs, Wickets and Catches in MI
		System.out.println("\nPlayers with Highest Runs, Wickets and Catches in MI : ");
		Player highestRunsMI = null;
		for (Player l : miPlayersList) {

			if (highestRunsMI == null || l.getRuns() > highestRunsMI.getRuns()) {
				highestRunsMI = l;

			}
		}
		Player highestWicketsMI = null;
		for (Player l : miPlayersList) {

			if (highestWicketsMI == null || l.getWickets() > highestWicketsMI.getWickets()) {
				highestWicketsMI = l;

			}
		}
		Player highestCatchesMI = null;
		for (Player l : miPlayersList) {

			if (highestCatchesMI == null || l.getCatches() > highestCatchesMI.getCatches()) {
				highestCatchesMI = l;

			}
		}
		System.out.println(">>" + highestRunsMI.getName() + " with Highest Runs " + highestRunsMI.getRuns() + " in MI");
		System.out.println(
				">>" + highestWicketsMI.getName() + " with Wickets " + highestWicketsMI.getWickets() + " in MI");
		System.out.println(
				">>" + highestCatchesMI.getName() + " with Catches " + highestCatchesMI.getCatches() + " in MI");

		// 19.Players with Highest Runs, Wickets and Catches in CSK
		System.out.println("\nPlayers with Highest Runs, Wickets and Catches in CSK : ");
		Player highestRunsCSK = null;
		for (Player l : cskPlayersList) {

			if (highestRunsCSK == null || l.getRuns() > highestRunsCSK.getRuns()) {
				highestRunsCSK = l;

			}
		}
		Player highestWicketsCSK = null;
		for (Player l : cskPlayersList) {

			if (highestWicketsCSK == null || l.getWickets() > highestWicketsCSK.getWickets()) {
				highestWicketsCSK = l;

			}
		}
		Player highestCatchesCSK = null;
		for (Player l : cskPlayersList) {

			if (highestCatchesCSK == null || l.getCatches() > highestCatchesCSK.getCatches()) {
				highestCatchesCSK = l;

			}
		}
		System.out
				.println(">>" + highestRunsCSK.getName() + " with Highest Runs " + highestRunsCSK.getRuns() + " in MI");
		System.out.println(
				">>" + highestWicketsCSK.getName() + " with Wickets " + highestWicketsCSK.getWickets() + " in MI");
		System.out.println(
				">>" + highestCatchesCSK.getName() + " with Catches " + highestCatchesCSK.getCatches() + " in MI");

		// 20.Players with Highest Runs, Wickets and Catches in RCB
		System.out.println("\nPlayers with Highest Runs, Wickets and Catches in RCB : ");
		Player highestRunsRCB = null;
		for (Player l : rcbPlayersList) {

			if (highestRunsRCB == null || l.getRuns() > highestRunsRCB.getRuns()) {
				highestRunsRCB = l;

			}
		}
		Player highestWicketsRCB = null;
		for (Player l : rcbPlayersList) {

			if (highestWicketsRCB == null || l.getWickets() > highestWicketsRCB.getWickets()) {
				highestWicketsRCB = l;

			}
		}
		Player highestCatchesRCB = null;
		for (Player l : rcbPlayersList) {

			if (highestCatchesRCB == null || l.getCatches() > highestCatchesRCB.getCatches()) {
				highestCatchesRCB = l;

			}
		}
		System.out
				.println(">>" + highestRunsRCB.getName() + " with Highest Runs " + highestRunsRCB.getRuns() + " in MI");
		System.out.println(
				">>" + highestWicketsRCB.getName() + " with Wickets " + highestWicketsRCB.getWickets() + " in MI");
		System.out.println(
				">>" + highestCatchesRCB.getName() + " with Catches " + highestCatchesRCB.getCatches() + " in MI");

		
		
		System.out.println();
		System.out.println("Players with zero Wickets : ");
		// 21.Players with zero Wickets
		for (List<Player> l : allIplTeamsMap.values()) {
			for (Player p : l) {
				if (p.getWickets() == 0) {
					System.out.println(p.getName() + " - Wickets: " + p.getWickets());
				}
			}
		}

		System.out.println();
		// 22.Players with zero Wickets in MI
		System.out.println("Players with zero Wickets in MI");
		for (Player l : miPlayersList) {
			if (l.getWickets() == 0) {
				System.out.println(l.getName() + " - Wickets: " + l.getWickets());

			}
		}

		System.out.println();
		// 23.Players with zero Wickets in CSK
		System.out.println("Players with zero Wickets in CSK : ");
		for (Player l : cskPlayersList) {
			if (l.getWickets() == 0) {
				System.out.println(l.getName() + " - Wickets: " + l.getWickets());

			}
		}

		System.out.println();
		// 24.Players with zero Wickets in RCB
		System.out.println("Players with zero Wickets in RCB");
		for (Player l : rcbPlayersList) {
			if (l.getWickets() == 0) {
				System.out.println(l.getName() + " - Wickets: " + l.getWickets());
			}

		}

	}
}
