package com.sd.Prac;

//nested if

class Player{
	String s = "����";
	String r = "����";
	String p = "��";

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


	//nested if���� ����Ͽ� �ڵ�

		if(p1.getResult()=="��"){
			if(p2.getResult()=="��"){
			System.out.println("���� �����ϴ�.");
			}
			else if(p2.getResult()=="����"){
			System.out.println(p2.getName() + " ��(��) �̰���ϴ�.");
			}
			else if(p2.getResult()=="����"){
			System.out.println(p1.getName() + " ��(��) �̰���ϴ�.");
			}
		}

		
		else if(p1.getResult()=="����"){
			if(p2.getResult()=="����"){
			System.out.println("���� �����ϴ�.");
			}
			else if(p2.getResult()=="����"){
			System.out.println(p2.getName() + " ��(��) �̰���ϴ�.");
			}
			else if(p2.getResult()=="��"){
			System.out.println(p1.getName() + " ��(��) �̰���ϴ�.");
			}
		}

		else if(p1.getResult()=="����"){
			if(p2.getResult()=="����"){
			System.out.println("���� �����ϴ�.");
			}
			else if(p2.getResult()=="����"){
			System.out.println(p1.getName() + " ��(��) �̰���ϴ�.");
			}
			else if(p2.getResult()=="��"){
			System.out.println(p2.getName() + " ��(��) �̰���ϴ�.");
			}
		}



	}

	public static void main(String[] args){
		SRPGame s = new SRPGame();
		s.startGame();
	}
}