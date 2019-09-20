package cst8284.generics;

import java.util.ArrayList;

public final class Table {

	public static <E> void displayEqualityTable(ArrayList<E> arList){

		// Print out column header
		System.out.println("\n\nCompare the two object's volumes.  Are they equal?");
		System.out.print("\t\t");
		int i= 0;
		int c = 0;
		for (E columnHeader: arList) {
			System.out.print("\t" + columnHeader.getClass().getSimpleName() + i + " ");
		i++;
		}

		// Print out each row,starting with the name of the object
		for (E solidObjRow: arList){
			System.out.println();	// Next line
			System.out.print(solidObjRow.getClass().getSimpleName() + c + " ");
			c++;
			for (E solidObjColumn: arList)
				System.out.print("\t\t" + solidObjColumn.equals(solidObjRow) + " ");
			}  
	}
	
//	public String sameStringLength() {
//		
//		
//	}
}





