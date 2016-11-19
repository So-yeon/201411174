package com.sd.Structure;


public class LivingSeoul{
	int sum_m;
	int sum_f;

	int[][] data = {{74425, 76326},{61164, 61636},{109688, 115744},{144796, 146776},
    {174996, 181676},{177841, 177434},{204630, 205980},{223373, 232245},{161055, 166130},
    {171576, 176735},{279169, 293772},{239450, 251066},{148690, 156510},{182977, 196992},
    {237792, 242641}, {283869, 296762},{209344, 210282},{118965, 114441},{186503, 186856},
    {195734, 203014},{254381, 249472},{212401, 229111},{271654, 295354},{319197, 335045},{229829, 231671}};


	void newMale(){
		for(int i = 0; i<data.length;i++){
			for(int j = 0; j<data[i].length;j++){
				sum_m += data[i][0];
			}
		}
		System.out.println("Living in Seoul total male : " + sum_m);
		System.out.println("Living in Seoul avg male : " + sum_m/data.length);
		
	}

	void newFemale(){
		for(int i = 0; i<data.length;i++){
			for(int j = 0; j<data[i].length;j++){
				sum_f += data[i][j];
			}
		}
		System.out.println("Living in Seoul total female : " + sum_f);
		System.out.println("Living in Seoul avg female : " + sum_f/data.length);
		
	}
	public static void main(String[] args){
		LivingSeoul s = new LivingSeoul();
		s.newMale();
		s.newFemale();
	}
}