package Turn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import Objects.Grid;
import Objects.Knight;

public class ReadConsole {

    public static void main(String[] args) {
    	
    	HashMap<String, Grid> board = new HashMap();
   
    	for (int i = 1 ; i < 9 ; i ++){
    		for (int j = 97 ; j < 105; j++ ) {
    			String xy = "" + (char) j + i;
    			board.put(xy, new Grid( xy, null));
    		}
    	}
    	
    	Grid x = new Grid("a6", new Knight("Black", "a6"));
    	System.out.println(x.goNorth(board).goSouth(board).goWest(board).goEast(board).getChessPiece().getName());
    	
    	
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                System.out.print("Enter number of pieces: ");
                String input = br.readLine();

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