package Objects;

import java.util.List;

public interface ChessPiece {
	
	public List<String> returnDestinations();
	
	public String place();
	
	public String getName();
	
	public String getColor();
	
	public String getCoordinates();
	
	public void setColor(String color);
	
	public void setCoordinates(String coordinates);

}
