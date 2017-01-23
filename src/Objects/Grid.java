package Objects;

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
}
