package _05_for_loops._2_badgers;

public class Badger {
public static void main(String[] args) {
	for(int verse =0; verse<2; verse += 1) {
	for(int count =0; count<12; count += 1) {
		System.out.print("Badger");
		if(count <11) {
			System.out.print(", ");
		}
	}
	System.out.println();
	for(int count =0; count<2; count += 1) {
		System.out.print("Mushroom");
		if(count <1) {
			System.out.print(", ");
		}
	}
	System.out.println();
	System.out.println();
	}
	
	System.out.print("A Snake!!!");
}
}
