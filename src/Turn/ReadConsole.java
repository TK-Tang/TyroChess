package Turn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import Objects.ChessPieceFactory;
import Objects.Grid;
import Objects.Knight;
import Objects.Pawn;

public class ReadConsole {

    public static void main(String[] args) {
    	
    	HashMap<String, Grid> board = new HashMap();
   
    	for (int i = 1 ; i < 9 ; i ++){
    		for (int j = 97 ; j < 105; j++ ) {
    			String xy = "" + (char) j + i;
    			board.put(xy, new Grid( xy, null));
    		}
    	}
    	
    	board.get("a6").setChessPiece( new Pawn("Black", board.get("a6").getCoordinates()) );
    	board.get("h3").setChessPiece( new Knight("White", board.get("h3").getCoordinates()) );

    	
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
            	
            	int pieceCount = 0;
                for ( int i = 1 ; i != 9 ; i++){
                	System.out.print(       "   ---------------------------------\n");
                	System.out.print((9 - i) + "  |   |   |   |   |   |   |   |   |\n");
                };
                
                System.out.print(       "   ---------------------------------\n");
                System.out.print(       "     a   b   c   d   e   f   g   h\n");
            	
                System.out.print("Enter number of pieces: ");
                String input = br.readLine();
                
                if ("Exit".equals(input)) {
                    System.out.println("Exit!");
                    System.exit(0);
                }
                
                try {
                	pieceCount = Integer.parseInt(input);
                	
                	if (pieceCount > 0){
                		placePieces(board, pieceCount, br);
                	}
                	
                } catch (NumberFormatException e){
                	System.out.println("Input not a valid integer");
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        

    }
    
    public static void placePieces(HashMap<String, Grid> board, int pieceCount, BufferedReader br){
    	
    	while (pieceCount > 0){
    		
    		ChessPieceFactory cpf = new ChessPieceFactory();
    		
    		
    		System.out.println("\nPiece " + pieceCount + "");
    		System.out.println("\nEnter type(N/P): ");
    		
    		try {
				String input = br.readLine();
				
				// True if no errors
				if (checkSetPiece(input)){
					cpf.setPiece(input);
				} else {
					return;
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
    		
    		System.out.println("\nEnter color(W/B): ");
    		
    		try {
    			String input = br.readLine();
    			
    			if (checkSetColor(input)){
    				cpf.setColor(input);
    			} else {
    				return;
    			}
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		
    		System.out.println("\n Enter position: ");
    		
    		try {
    			String input = br.readLine();
    			
    			if (checkGrid(input, board)){
    				cpf.setCoordinates(input);
    			} else {
    				return;
    			}
    			
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		
    		
    		pieceCount = pieceCount - 1;
    	}
    }
    
    public static boolean checkSetPiece(String input){
    	if (input.equals("N") || input.equals("P")){
    		return true;
    	}
    	return false;
    }
    
    public static boolean checkSetColor(String input){
    	if (input.equals("B") || input.equals("W")){
    		return true;
    	}
    	return false;
    }
    
    public static boolean checkGrid(String input, HashMap<String, Grid> board){
    	if(input.length() != 2){
    		System.out.println("\n\nYou must specify valid coordinates. Example a6 - It is case sensitive. Put the letter first.\n");
    		// Line directly below. Checks if first letter inclusively between a-h and 2nd letter between 1-8
    	} else if ((int) input.charAt(0) > 96 && (int) input.charAt(0) < 105 && (int) input.charAt(0) > 0 && (int) input.charAt(1) < 9){
    		
    		if (board.get(input).getChessPiece() != null){
    			System.out.println("\n\nA chess piece occupies this position. Try again.\n");
    			return false;
    		}
    		return true;
    	}
    	
    	System.out.println("\n\n Invalid coordinates.\n");
    	
    	return false;
    }

}