package com.sd.Prac;

//nested if

class Player{
	String s = "가위";
	String r = "바위";
	String p = "보";

	String name;
	String result = "";
	int num;

	Player(String _name){
		this.name = _name;
	}
	String getName(){
		return this.name;
	}
	String getResult(){
		return this.result;
	}

	void play(){
		num = (int)(Math.random()*3);
		if (num == 0){
			result = s;
			System.out.println(this.name + " is get " + result);	
		}
		else if(num == 1){
			result = r;
			System.out.println(this.name + " is get " + result);	
		}
		else{
			result = p;
			System.out.println(this.name + " is get " + result);	
		}
	}
}

class SRPGame{
	
	Player p1 = new Player("soyeon");
	Player p2 = new Player("yeseul");

	void startGame(){
		p1.play();
		p2.play();


	//nested if문을 사용하여 코딩

		if(p1.getResult()=="보"){
			if(p2.getResult()=="보"){
			System.out.println("서로 비겼습니다.");
			}
			else if(p2.getResult()=="가위"){
			System.out.println(p2.getName() + " 이(가) 이겼습니다.");
			}
			else if(p2.getResult()=="바위"){
			System.out.println(p1.getName() + " 이(가) 이겼습니다.");
			}
		}

		
		else if(p1.getResult()=="가위"){
			if(p2.getResult()=="가위"){
			System.out.println("서로 비겼습니다.");
			}
			else if(p2.getResult()=="바위"){
			System.out.println(p2.getName() + " 이(가) 이겼습니다.");
			}
			else if(p2.getResult()=="보"){
			System.out.println(p1.getName() + " 이(가) 이겼습니다.");
			}
		}

		else if(p1.getResult()=="바위"){
			if(p2.getResult()=="바위"){
			System.out.println("서로 비겼습니다.");
			}
			else if(p2.getResult()=="가위"){
			System.out.println(p1.getName() + " 이(가) 이겼습니다.");
			}
			else if(p2.getResult()=="보"){
			System.out.println(p2.getName() + " 이(가) 이겼습니다.");
			}
		}



	}

	public static void main(String[] args){
		SRPGame s = new SRPGame();
		s.startGame();
	}
}