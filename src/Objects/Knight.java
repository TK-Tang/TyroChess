package Objects;

import java.util.List;

public class Knight implements ChessPiece {
	
	public Knight(String color, String coordinates){
		this.name = "Knight";
		this.color = color;
		this.coordinates = coordinates;
	}
	
	String name;
	String color;
	String coordinates;

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String returnCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> returnDestinations() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String place() {
		// TODO Auto-generated method stub
		return null;
	}

}
