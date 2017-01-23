package Turn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

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

    	System.out.println(board.get("a6").getChessPiece());
    	System.out.println(board.get("h3").getChessPiece());

    	
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
            	
            	int pieceCount = 0;
                System.out.print("Enter number of pieces: ");
                String input = br.readLine();
                
                pieceCount = Integer.parseInt(input);
                
                while (pieceCount != 0){
                	
                }

                if ("Exit".equals(input)) {
                    System.out.println("Exit!");
                    System.exit(0);
                }

                for ( int i = 1 ; i != 9 ; i++){
                	System.out.print(       "   ---------------------------------\n");
                	System.out.print((9 - i) + "  |   |   |   |   |   |   |   |   |\n");
                };
                
                System.out.print(       "   ---------------------------------\n");
                System.out.print(       "     a   b   c   d   e   f   g   h\n");
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

}