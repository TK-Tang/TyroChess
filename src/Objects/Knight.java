package Objects;

import java.util.List;

public class Knight implements ChessPiece {
	
	public Knight(){
		this.name = "Knight";
	}
	
	public Knight(String color, String coordinates){
		this.name = "Knight";
		this.color = color;
		this.coordinates = coordinates;
	}
	
	String name;
	String color;
	String coordinates;


	@Override
	public List<String> returnDestinations() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public String getCoordinates() {
		return this.coordinates;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String place() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "\nCoordinates: " + this.getCoordinates() + "\nName: " + this.getColor() + " " +  this.getName(); 
	}


}
