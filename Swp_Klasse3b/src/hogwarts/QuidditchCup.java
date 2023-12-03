package hogwarts;

import java.util.ArrayList;
import java.util.Collections;

public class QuidditchCup {

	private ArrayList<QuidditchGame> quidditchGames;
	
	public QuidditchCup() {
		this.quidditchGames = new ArrayList<QuidditchGame>();
	}

	public ArrayList<QuidditchGame> getQuidditchGames() {
		return quidditchGames;
	}

	public void setQuidditchGames(ArrayList<QuidditchGame> quidditchGames) {
		this.quidditchGames = quidditchGames;
	}
	
	public void addQuidditchGame(QuidditchGame qg) {
		this.quidditchGames.add(qg);
	}
	
	public void removeQuidditchGame(QuidditchGame qg) {
		this.quidditchGames.remove(qg);
	}
	
	private ArrayList<House> getAllWinners(){
		ArrayList<House> tmp = new ArrayList<House>();
		for(QuidditchGame qg : this.quidditchGames) {
			House h = qg.getWinner();
			tmp.add(h);
			// tmp.add(qp.getWinner());
		}
		return tmp;
	}
	
	private ArrayList<House> getDistinctWinners(ArrayList<House> allWinners){
		ArrayList<House> tmp = new ArrayList<House>();
		for(House h : allWinners) {
			if(!tmp.contains(h)) {
				tmp.add(h);
			}
		}
		return tmp;
	}
	
	public House getCurrentLeader() {
		ArrayList<House> allWinners = this.getAllWinners();
		ArrayList<House> distinctWinners = this.getDistinctWinners(allWinners);
		ArrayList<Integer> countWins = new ArrayList<Integer>();
		for(House h : distinctWinners) {
			//Collections.frequency(Datenstruktur, Element)
			int wins = Collections.frequency(allWinners, h);
			countWins.add(wins);
		}
		int maximum = Collections.max(countWins);
		int index = countWins.indexOf(maximum);
		return distinctWinners.get(index);
	}
	
	
	
}
