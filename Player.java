import java.util.Scanner;


public class Player {
   private String name;
   private static Scanner scan = new Scanner(System.in);
   private String tecken;

/** Skapar en spelare med namnet name
*/
   protected Player(String name, String tecken) {
      this.name = name;
      this.tecken = tecken;
   
   }
   
   public String getName() {
      return name;
   }



/** Gör ett drag från spelplanen board. Läses från tangentbordet
*/
   public void makeMove(PlayBoard board) {
      int row = scan.nextInt();
      int column = scan.nextInt();
      board.setTecken(row, column, tecken);
   }

}