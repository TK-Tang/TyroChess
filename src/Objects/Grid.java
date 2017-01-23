package Objects;

import java.util.HashMap;

public class Grid {
	
	public Grid(String coordinates, ChessPiece cp){
		this.coordinates = coordinates;
		this.chessPiece = cp;
	}
	
	private ChessPiece chessPiece;
	private String coordinates;
	
	
	public ChessPiece getChessPiece() {
		return chessPiece;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setChessPiece(ChessPiece chessPiece) {
		this.chessPiece = chessPiece;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	
	public Grid goNorth(HashMap<String, Grid> board){
		char y = this.getCoordinates().charAt(1);
		System.out.println(this.getCoordinates().charAt(0) + "" + (char)(y + 1));
		
		return board.get(this.getCoordinates().charAt(0) + "" + (char)(y + 1));
	}
	
	public Grid goSouth(HashMap<String, Grid> board){
		char y = this.getCoordinates().charAt(1);
		System.out.println(this.getCoordinates().charAt(0) + "" + (char)(y - 1));
		
		return board.get(this.getCoordinates().charAt(0) + "" + (char)(y - 1));
	}
	
	public Grid goWest(HashMap<String, Grid> board){
		char x = this.getCoordinates().charAt(0);
		System.out.println((char) (x + 1) + "" + this.getCoordinates().charAt(1));
		
		return board.get((char) (x + 1) + "" + this.getCoordinates().charAt(1));
	}
	
	public Grid goEast(HashMap<String, Grid> board){
		
		char x = this.getCoordinates().charAt(0);
		System.out.println((char) (x - 1) + "" + this.getCoordinates().charAt(1));
		
		
		return board.get((char) (x - 1) + "" + this.getCoordinates().charAt(1));
	}
}
