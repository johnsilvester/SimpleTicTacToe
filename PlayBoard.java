public class PlayBoard {

   private String[][] rutor;
   protected static final int NBR_SQAURES =  3;


   public PlayBoard() {
      rutor = new String[NBR_SQAURES][NBR_SQAURES];
      
   }
         
   public String getTecken(int i, int j) {
      return rutor[i][j];            
    }
   
   public void setTecken(int i, int j, String m) {
      rutor[i-1][j-1] = m;
   
   }
   
   public boolean draw() {
      for(int i = 0; i<NBR_SQAURES; i++) {
         for(int j = 0; j<NBR_SQAURES; j++) {
 
            if (rutor[i][j] == null) {
               return false; }           
         }       
      }

      return true; }
      
    private static String repeatString(String s, int count){
       StringBuilder r = new StringBuilder();
       for (int i = 0; i < count; i++) {
           r.append(s);
       }
       return r.toString();
    }
   
   public boolean hasWon(String symbol1, String symbol2) {
      
      //checking horizontal and vertical directions
      for(int i = 0; i<NBR_SQAURES; i++) {
         String horizontal = "";
         String vertical = "";
         for(int j = 0; j<NBR_SQAURES; j++) {
            horizontal += rutor[i][j];
            vertical += rutor[j][i];
            if (horizontal.equals(repeatString(symbol1, NBR_SQAURES)) || horizontal.equals(repeatString(symbol2, NBR_SQAURES)) || vertical.equals(repeatString(symbol1, NBR_SQAURES)) || vertical.equals(repeatString(symbol2, NBR_SQAURES))) {
               return true; }    
         }
      }
      // checking diagonals
      String diagonal1 = "";
      String diagonal2 = "";
      
      for(int i = 0; i<NBR_SQAURES; i++) {
         diagonal1 +=  rutor[i][i];
      }
      
      int j = NBR_SQAURES;
      for(int i = 0; i<NBR_SQAURES; i++) {
         j -= 1;
         diagonal2 += rutor[i][j]; }

      if (diagonal1.equals(repeatString(symbol1, NBR_SQAURES)) || diagonal1.equals(repeatString(symbol2, NBR_SQAURES)) || diagonal2.equals(repeatString(symbol1, NBR_SQAURES)) || diagonal2.equals(repeatString(symbol2, NBR_SQAURES))) {
         return true; }

      return false;
   }
  
      public String getGrid() {
      String grid = String.format("-------------\n  %s | %s | %s  \n------------- \n  %s | %s | %s  \n-------------\n  %s | %s | %s \n-------------", rutor[0][0], rutor[0][1], rutor[0][2], rutor[1][0], rutor[1][1], rutor[1][2], rutor[2][0], rutor[2][1], rutor[2][2]);       
      
      
            
      return grid;
   
   }
}

