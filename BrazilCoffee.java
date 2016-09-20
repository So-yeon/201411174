class BrazilCoffee{
	String origin;
	int dergreeOfRoast = 3;
	int grade = 5;

	BrazilCoffee(String o) {
		this.origin = o;
	}
	public void roastingCoffee(){
		System.out.println(origin + "'s coffee is Roasting..." );
	}
	public void brewCoffee(){
		System.out.println(origin + "'s coffee is Brewing...");
	}
	public void grindCoffee(){
		System.out.println(origin + "'s coffee is Grinding...");
	}

	public void makeCoffee() {
		grindCoffee();
		roastingCoffee();
		brewCoffee();
		System.out.println("This coffee's grade : " + grade + " and degreeOfRoast is " 
				+ dergreeOfRoast + ".");
		System.out.println("Have a good coffee time soyeon.");
	}
}