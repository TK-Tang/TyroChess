package Turn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import Objects.Grid;
import Objects.King;

public class ReadConsole {

    public static void main(String[] args) {
    	
    	HashMap<String, Grid> board = new HashMap();
   
    	for (int i = 1 ; i < 9 ; i ++){
    		for (int j = 97 ; j < 105; j++ ) {
    			String xy = "" + (char) j + i;
    			board.put(xy, new Grid( xy, null));
    		}
    	}
    	
    	
    	
    	
    	// Creating and setting Kings
    	board.put("e8", new Grid("e8", new King("Black", "e8")));
    	board.put("d1", new Grid("d1", new King("White", "d1")));
    	
    	
    	
    	
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                System.out.print("Enter something : ");
                String input = br.readLine();

                if ("q".equals(input)) {
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