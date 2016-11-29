package com.sd.Prac;

public class Turtle{
	private int nLimbs = 4;
	protected String food;

	public void setFood(String f){
		this.food = f;
	}

	public void eat(){
		System.out.println("Turtle eats " + food);
	}

	public int getLimbs(){
		System.out.println("Limbs are " + this.nLimbs);
		return this.nLimbs;

	}

	public static void main(String[] args){
		Turtle t = new Turtle();
		SeaTurtle st = new SeaTurtle();
		LandTurtle lt = new LandTurtle();
		
		t.eat();
		st.swim();
		st.getLimbs();
		lt.walk();
		lt.getLimbs();
	}
	
}