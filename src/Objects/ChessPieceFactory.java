package Objects;

public class ChessPieceFactory {
	
	private ChessPiece cp;
	
	public ChessPieceFactory(){
		
	}
	
	public void setPiece(String input){
		if (input.equals("P")){
			cp = new Pawn();
		} else {
			cp = new Knight();
		}
	}
	
	public void setColor(String input){
		if (input.equals("W")){
			cp.setColor("W");
		} else {
			cp.setColor("B");
		}
	}
	
	public void setCoordinates(String input){
		cp.setCoordinates("input");
	}
	
	public ChessPiece build(){
		return cp;
	}

}
