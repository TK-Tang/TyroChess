package Objects;

import java.util.List;

public interface ChessPiece {
	
	String move();
	
	String returnCoordinates();
	
	List<String> returnDestinations();
	

}
