package Objects;

import java.util.List;

public interface ChessPiece {
	
	List<String> returnDestinations();
	
	String place();
	
	String getName();
	
	String getColor();
	
	String getCoordinates();

}
