package bronze.five;

import java.util.Scanner;

public class Num3003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int king = scan.nextInt(); //1
		int queen = scan.nextInt(); //1
		int rook = scan.nextInt(); //2
		int bishop = scan.nextInt(); //2
		int knight = scan.nextInt(); //2
		int pawn = scan.nextInt(); //8
		
		int rKing = 1-king;
		int rQueen = 1-queen;
		int rRook = 2-rook;
		int rBishop = 2-bishop;
		int rKnight = 2-knight;
		int rPawn = 8-pawn;
		
		System.out.printf("%d %d %d %d %d %d", rKing, rQueen, rRook, rBishop, rKnight, rPawn);

	}

}
