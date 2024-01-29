package LabelledBreak;


import java.util.Stack;

public class BreakBlocks {
	public static void main(String[] args) {
		
	
		
		first:{
			System.out.println("First Starts");
			Second:{
				System.out.println("Seconds Starts");
				Third:{
					System.out.println("third Starts");
					if(true) break Second;
					System.out.println("Third ends");
				}
				System.out.println("Second ends");
				
			}
			System.out.println("First ends");
		}
	}
	
}
