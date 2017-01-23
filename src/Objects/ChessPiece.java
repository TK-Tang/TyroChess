package Objects;

import java.util.HashMap;
import java.util.List;

public interface ChessPiece {
	
	public List<String> returnDestinations(HashMap<String, Grid> board);
	
	public String getName();
	
	public String getColor();
	
	public String getCoordinates();
	
	public void setColor(String color);
	
	public void setCoordinates(String coordinates);

}
