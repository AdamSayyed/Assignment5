import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	
	
	
	
	
	

	
	
	
	public static double[][] readFile(File file) throws IOException {
		
		Scanner scan = new Scanner(file);
		ArrayList<double[]> rows = new ArrayList<>();
		
		while(scan.hasNextLine()) {
					String line = scan.nextLine();
					String[] word = line.split(" ");
					
					double[] row = new double[word.length];
for(int i =0; i<word.length; i++) {
	
	row[i]= Double.parseDouble(word[i]);
	
	
	
}
			
			rows.add(row);
		}
		double[][] result = new double[rows.size()][];
		for(int i =0; i<rows.size();i++) {
			
			result[i] = rows.get(i);
		}
		
		return result;
		
	}
	public static void writeToFile(double[][]  array,File file) throws IOException {
		
		
		
	PrintWriter write = new PrintWriter(file);
	
	for(int i =0; i<array.length; i++) {
		
		for(int s =0; i< array[i].length;s++) {
			
			
			
			write.print(array[i] [s]+ " ");
			
			
			
		}
		write.println();
		
	}
	write.close();
	}
	
	
	public static double getRowTotal(double[][] array , int rowindex) {
		 
		double total=0;
		
		if(rowindex>=0 && rowindex<  array.length) {
			
			
			
			
			for(int i =0; i<array[rowindex].length;i++) {
				
				total+= array[rowindex][i];
			}
		}
		
		
		
		
		
		
		
		return total;
	}
	public static double getColumnTotal(double[][] array , int colindex) {
		 
		double total=0;
		
		
			
			
			
			
			for(int i =0; i<array[colindex].length;i++) {
				if(colindex>=0 && colindex<=  array[colindex].length) {
				total+= array[colindex][i];
			}
		}
		
		
		
		
		
		
		
		return total;
	}
	
	
	public static double getHighestInRow (double[][] array , int rowindex) {
		 
		double highest=Double.NEGATIVE_INFINITY;
		
		if(rowindex>=0 && rowindex<  array.length) {
			
			
			
			
			for(int i =0; i<array[rowindex].length;i++) {
				
				if(array[rowindex][i]> highest) {
					
					highest = array[rowindex][i];
				}
			}
		}
		
		
		
		
		
		
		
		return highest;
	}
	
	public static double getHighestInRowIndex (double[][] array , int rowindex) {
		 
		double highest=Double.NEGATIVE_INFINITY;
		 double index =0;
		
		if(rowindex>=0 && rowindex<  array.length) {
			
			
			
			
			for(int i =0; i<array[rowindex].length;i++) {
				
				if(array[rowindex][i]> highest) {
					
					highest = array[rowindex][i];
					index = i;
				}
			}
		}
		
		
		
		
		
		
		
		return index;
	}
	
	
	
	
	
	
	
	
	public static double getLowestInRow (double[][] array , int rowindex) {
		 
		double highest=Double.POSITIVE_INFINITY;
		
		if(rowindex>=0 && rowindex<  array.length) {
			
			
			
			
			for(int i =0; i<array[rowindex].length;i++) {
				
				if(array[rowindex][i]<   highest) {
					
					highest = array[rowindex][i];
				}
			}
		}
		
		
		
		
		
		
		
		return highest;
	}
	
	
	public static double getLowestInRowIndex (double[][] array , int rowindex) {
		 
		double highest=Double.POSITIVE_INFINITY;
		 double index =0;
		
		if(rowindex>=0 && rowindex<  array.length) {
			
			
			
			
			for(int i =0; i<array[rowindex].length;i++) {
				
				if(array[rowindex][i]<highest) {
					
					highest = array[rowindex][i];
					index = i;
				}
			}
		}
		
		
		
		
		
		
		
		return index;
	}
	
	public static double getHighestInColumn (double[][] array , int colindex) {
		
		
		
		double highest = Double.MIN_VALUE ;
		 
		 
			
			
			for(int i = 0; i<array.length; i++) {
				
                 if(colindex< array[i].length) {
					if(array[i][colindex]>highest) {
					highest = array[i][colindex];
					
					
					 
					 }
				}
				
			}
			
		 
		
		
		return highest;
		
	}
	
	
public static double getHighestInColumnIndex (double[][] array , int colindex) {
		
		
		
		double highest = Double.MIN_VALUE ;
		double index =0;
		 
			
			
			for(int i = 0; i<array.length; i++) {
				
                 if(colindex< array[i].length) {
					if(array[i][colindex]>highest) {
					highest = array[i][colindex];
					
					
					 index = colindex;
					 }
				}
				
			}
			
		 
		
		
		return index;
		
	}
	
public static double getLowestInColumn (double[][] array , int colindex) {
	
	
	
	double lowest = Double.MAX_VALUE ;
 	 
		
		
		for(int i = 0; i<array.length; i++) {
			
             if(colindex< array[i].length) {
				if(array[i][colindex]<lowest) {
				lowest = array[i][colindex];
				
 				 }
			}
			
		}
		
	 
	
	
	return lowest;
	
 
}
	
	
public static double getLowestInColumnIndex (double[][] array , int colindex) {
	
	
	

	double lowest = Double.MAX_VALUE ;
	double index =0;
	 
		
		
		for(int i = 0; i<array.length; i++) {
			
             if(colindex< array[i].length) {
				if(array[i][colindex]<lowest) {
				lowest = array[i][colindex];
				
				 index = colindex;
				 }
			}
			
		}
		
	 
	
	
	return index;
	
}
	public static double getHighestInArray(double [][] array  ) {
		
		
		
		double highest = Double.NEGATIVE_INFINITY;
		for(int i = 0 ; i< array .length; i++ ) {
			
			for(int s =0; s<array[0].length;s++) {
				
				
				if(highest< array[i][s]) {
					
					highest = array[i][s];
				}
				
				
			}
			
			
		}
		return highest;
		
	}public static double getLowestInArray(double [][] array  ) {
		
		
		
		double lowest = Double.POSITIVE_INFINITY;
		for(int i = 0 ; i< array .length; i++ ) {
			
			for(int s =0; s<array[0].length;s++) {
				
				
				if(lowest> array[i][s]) {
					
					lowest = array[i][s];
				}
				
				
			}
			
			
		}
		return lowest;
		
	}
	public static double getTotal(double[][] array) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
