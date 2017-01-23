package Objects;

import java.util.List;

public class Pawn implements ChessPiece {
	
	private String name;
	private String color;
	private String coordinates;
	private boolean firstMove = true;

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

}
