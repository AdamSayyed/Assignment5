
public class HolidayBonus {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static double[] calculateHolidayBonus(double[][] array,double high, double low, double other) {
		// TODO Auto-generated method stub
		
		
		int numStores = array.length;
		int numCategories =0;
		
		double bonus[ ] = new double [numStores];
		
		
		
		for(int i =0; i< array.length; i++ ) {
			bonus[i  ] =0;
			numCategories = array[i].length;
			System.out.println("row "+i+" columns "+numCategories);
			for(int s =0 ; s<numCategories; s++) {
				
				
				if(TwoDimRaggedArrayUtility.getHighestInColumnIndex(array, s)==i){
					if(array[i][s]>0)
						bonus[i] += high;
				}
				else if(TwoDimRaggedArrayUtility.getLowestInColumnIndex(array, s)==i){
					if(array[i][s]>0)
						bonus[i]+= low;
				}
				else {
					if(array[i][s]>0)
						bonus[i] += other;
			}

			}
			
		}
		
		
		
		
		
		return bonus;
	}

	public static double calculateTotalHolidayBonus(double[][] array,double high, double low, double other) {
		// TODO Auto-generated method stu
		 double result=0;
		double[] bonuses = HolidayBonus.calculateHolidayBonus(array, high, low, other);
		for(int i=0;i<bonuses.length;i++)
			result += bonuses[i];
		return result;
		
		
		
		 
	}
 
 


}
