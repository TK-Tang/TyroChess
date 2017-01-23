package Objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pawn implements ChessPiece {

	public Pawn() {
		this.name = "Pawn";

		/*
		 * if ((int) this.getCoordinates().charAt(1) == 2 &&
		 * this.getColor().equals("W") || (int) this.getCoordinates().charAt(1)
		 * == 7 && this.getColor().equals("B")){ this.moved = true; }
		 */
	}

	public Pawn(String color, String coordinates) {
		this.name = "Pawn";
		this.color = color;
		this.coordinates = coordinates;

		if (Character.getNumericValue(this.getCoordinates().charAt(1)) == 2 && this.getColor().equals("W")
				|| Character.getNumericValue(this.getCoordinates().charAt(1)) == 7 && this.getColor().equals("B")) {
			this.moved = false;
		} else {
			this.moved = true;
		}
	}

	private String name;
	private String color;
	private String coordinates;
	private boolean moved;

	@Override
	public List<String> returnDestinations(HashMap<String, Grid> board) {
		ArrayList<String> destinations = new ArrayList<String>();

		try {
			if (this.color.equals("W")) {

				if (board.get(this.coordinates).goNorth(board).getChessPiece() == null) {
					destinations.add(board.get(this.coordinates).goNorth(board).getCoordinates());

					if (this.moved == false
							&& board.get(this.coordinates).goNorth(board).goNorth(board).getChessPiece() == null) {
						destinations.add(board.get(this.coordinates).goNorth(board).goNorth(board).getCoordinates());
					}
				}

				if (board.get(this.coordinates).goEast(board).getChessPiece() != null) {
					if (board.get(this.coordinates).goEast(board).getChessPiece().getColor().equals("B")) {
						destinations.add(board.get(this.coordinates).goEast(board).getCoordinates());
					}
				}

				if (board.get(this.coordinates).goWest(board).getChessPiece() != null) {
					if (board.get(this.coordinates).goWest(board).getChessPiece().getColor().equals("B")) {
						destinations.add(board.get(this.coordinates).goWest(board).getCoordinates());
					}
				}

			} else {
				if (board.get(this.coordinates).goSouth(board).getChessPiece() == null) {
					destinations.add(board.get(this.coordinates).goSouth(board).getCoordinates());

					if (this.moved == false
							&& board.get(this.coordinates).goSouth(board).goSouth(board).getChessPiece() == null) {
						destinations.add(board.get(this.coordinates).goSouth(board).goSouth(board).getCoordinates());
					}
				}

				if (board.get(this.coordinates).goEast(board).getChessPiece() != null) {
					if (board.get(this.coordinates).goEast(board).getChessPiece().getColor().equals("W")) {
						destinations.add(board.get(this.coordinates).goEast(board).getCoordinates());
					}
				}

				if (board.get(this.coordinates).goWest(board).getChessPiece() != null) {
					if (board.get(this.coordinates).goWest(board).getChessPiece().getColor().equals("W")) {
						destinations.add(board.get(this.coordinates).goWest(board).getCoordinates());
					}
				}
			}

		} catch (NullPointerException e) {
		}

		return destinations;
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
	public String toString() {
		return "Moved: " + this.getMoved() + "\nCoordinates: " + this.getCoordinates() + "\nName: " + this.getColor()
				+ " " + this.getName();

	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

}
