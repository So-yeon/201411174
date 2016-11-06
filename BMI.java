package com.sd.Prac;

class BMI{

	void computeBMI(float height, float weight){
		float bmi =(float) weight/(height*height);
		
		System.out.println("BMI : " + bmi);

		if(bmi<=18.5)	
			System.out.println("Your BMI is Low.");

		else if(18.5<=bmi && bmi<23)
			System.out.println("Your BMI is Normal.");

		else if(23<=bmi && bmi<25)
			System.out.println("Your BMI is Risky.");

		else if(25<=bmi && bmi<30)
			System.out.println("Your BMI is Obesity 1.");

		else if(30<=bmi && bmi<40)
			System.out.println("Your BMI is Obesity 2.");

		else if(bmi > 40)
			System.out.println("Your BMI is Obesity 3.");
		else
			System.out.println("Error. Please try again.");

	}

	public static void main(String[] args){
		BMI b = new BMI();
		b.computeBMI(1.78f,78);
		System.out.println("\n");
		b.computeBMI(1.81f,60);
	}
}