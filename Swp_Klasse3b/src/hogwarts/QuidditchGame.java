package hogwarts;

public class QuidditchGame {
	
	private House house1;
	private House house2;
	private House winner;
	private Teacher referee;
	
	
	
	public QuidditchGame(House house1, House house2, Teacher referee) {
		this.house1 = house1;
		this.house2 = house2;
		this.referee = referee;
		this.winner = this.getRandomWinner();
		this.addHousePoints();
	}
	
	public House getHouse1() {
		return house1;
	}
	public void setHouse1(House house1) {
		this.house1 = house1;
	}
	public House getHouse2() {
		return house2;
	}
	public void setHouse2(House house2) {
		this.house2 = house2;
	}
	public Teacher getReferee() {
		return referee;
	}
	public void setReferee(Teacher referee) {
		this.referee = referee;
	}
	public House getWinner() {
		return winner;
	}
	
	private House getRandomWinner() {
		int resultHouse1 = (int)(Math.random()*100);
		int resultHouse2 = (int)(Math.random()*100);
		int snitchCatch = (int)Math.random() + 1;
		if(snitchCatch == 1) {
			resultHouse1 += 120;
		} else {
			resultHouse2 += 120;
		}
		if(resultHouse1 > resultHouse2) {
			return this.house1;
		} else {
			return this.house2;
		}
	}
	
	public void addHousePoints() {
		this.winner.addHousePoints(referee, 30);
	}
	
	

}
