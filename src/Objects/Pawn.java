package Objects;

import java.util.List;

public class Pawn implements ChessPiece {
	
	public Pawn (){
		this.name = "Pawn";
		
		if ((int) this.getCoordinates().charAt(1) == 2 && this.getColor().equals("W") || (int) this.getCoordinates().charAt(1) == 7 && this.getColor().equals("B")){
			this.moved = true;
		}
	}
	
	public Pawn (String color, String coordinates){
		this.name = "Pawn";
		this.color = color;
		this.coordinates = coordinates;
		
		if ((int) this.getCoordinates().charAt(1) == 2 && this.getColor().equals("W") || (int) this.getCoordinates().charAt(1) == 7 && this.getColor().equals("B")){
			this.moved = true;
		}
	}

	private String name;
	private String color;
	private String coordinates;
	private boolean moved = true;

	@Override
	public List<String> returnDestinations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String place() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public String getCoordinates() {
		return this.coordinates;
	}

	public boolean getMoved() {
		return moved;
	}
	
	@Override
	public String toString(){
		return "Moved: " + this.getMoved() +  "\nCoordinates: " + this.getCoordinates() + "\nName: " + this.getColor() + " " +  this.getName(); 
		
	}

	@Override
	public void setColor( String color) {
		this.color = color;
	}

	@Override
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

}
