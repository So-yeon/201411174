package com.sd.DiceGame;

class DiceGame {
	Player p1;
	Player p2;
	public int playTime = 2;
 	public void startGame() {
		p1 = new Player("Soyeon");
		p2 = new Player("Yeseul");
		for (int i = 0; i < playTime; i ++){
			p1.play();
			p2.play();
		}
		if(p1.getNum() > p2.getNum()) {
			System.out.println(p1.getName() + " is win!");
		}
		else if (p1.getNum() < p2.getNum()){
			System.out.println(p2.getName() + " is win!");
		}
		else 
			System.out.println(p1.getName() + " and " + p2.getName() + 
					" is same score. Plz play again~!" );

		System.out.println("#Play dice game " + playTime + " times#");
		System.out.println("Player " + p1.getName()  + " has " + p1.getNum() + "Points.");
		System.out.println("Player " + p2.getName()  + " has " + p2.getNum() + "Points.");
	}
	public static void main(String[] args){
		DiceGame dg = new DiceGame();
		dg.startGame();
	}
}