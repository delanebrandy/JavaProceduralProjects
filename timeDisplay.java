/* ***************************************
  @author    Delane Brandy
  @date      2 November 2021
  @version   1

    A program that asks the user for how many 
    attractions they wish to find information 
    about, then allow them to input the 
    attraction to find information about them.
   ****************************************/

  import java.util.Scanner;

  class Attraction
  {
      String name;
      int open_time;
      int close_time;
      boolean bank_holiday;
  }
  
  public class Attractions {
  
      public static void main(String[] args) {
          menu();
          System.exit(0);
      }
  
      public static int IntInput(String message) {
          int answer;
          Scanner scanner = new Scanner(System.in);
          System.out.println(message);
          answer = scanner.nextInt();
          return answer;
      }
  
      public static String StrInput(String message) {
          String answer;
          Scanner scanner = new Scanner(System.in);
          System.out.println(message);
          answer = scanner.nextLine();
          return answer;
      }
  
      public static void printAttraction(Attraction b) {
          if (b.bank_holiday = false) {
              System.out.println(b.name + " does not open on bank holidays.");
              System.out.println("It opens at" + b.open_time + " am");
              System.out.print(System.lineSeparator());
          }
          else if (b.bank_holiday = true) {
              System.out.println(b.name + " does open on bank holidays.");
              System.out.println("It opens at " + b.open_time + " am");
              System.out.print(System.lineSeparator());
          }
          else
          {
              System.out.println("I don't know if " + b.name + " opens on bank holidays");
              System.out.println("It opens at " + b.open_time + "am");
              System.out.print(System.lineSeparator());
          }
      }
  
      public static void menu()
      {
          int Attraction_Number = IntInput("How many attractions do you need to know about?");
          int i;
  
          for (i = 1; i <= Attraction_Number; i++) {
              String Attraction_Name = StrInput("Name attraction " + i);
  
              if (Attraction_Name.equalsIgnoreCase("The Eden Project"))
              {
                  eden();
              }
  
              else if (Attraction_Name.equalsIgnoreCase("Tate Modern"))
              {
                  tate();
              }
  
              else if (Attraction_Name.equalsIgnoreCase("London Zoo"))
              {
                  zoo();
              }
              else
              {
                  System.out.println("I have no information about that attraction.");
              }
          }
      }
  
      public static void eden()
      {
          Attraction Eden_Project = new Attraction();
          Eden_Project.name = "The Eden Project";
          Eden_Project.open_time = 9;
          Eden_Project.bank_holiday = true;
          printAttraction(Eden_Project);
      }
      public static void tate()
      {
          Attraction Tate_Modern = new Attraction();
          Tate_Modern.name = "Tate Modern";
          Tate_Modern.open_time = 10;
          Tate_Modern.bank_holiday = false;
          printAttraction(Tate_Modern);
      }
  
      public static void zoo() {
          Attraction London_Zoo = new Attraction();
          London_Zoo.name = "London Zoo";
          London_Zoo.open_time = 10;
          London_Zoo.bank_holiday = true;
          printAttraction(London_Zoo);
      }
  }