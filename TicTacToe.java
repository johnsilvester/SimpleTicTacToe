public class TicTacToe {
   private static final String x = "X";
   private static final String o = "O";


/** Skapar en spelplan med två spelare. Genomför en spelomgång
*/
   public static void main(String[] args) {
      PlayBoard board = new PlayBoard();
      Player playerX = new Player("Tussan", x);
      Player playerO = new Player("Frasse", o);
      Player current = playerO;
      
      do {         
         if (current == playerX) {
            current = playerO; }
         else {
         current = playerX; }
         
         System.out.println(board.getGrid());
         System.out.println(current.getName() + "'s drag: (rad, kolumn)");
         current.makeMove(board);

         
      }
      while (!board.hasWon(x, o) && !board.draw());
      
      System.out.println(board.getGrid());
      System.out.println(current.getName() + " WON!");
   
   
   
   }
}