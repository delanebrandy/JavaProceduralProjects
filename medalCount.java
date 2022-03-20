/* ***************************************
  @author    Delane Brandy
  @date      23 November 2021
  @version   1

    A program that asks the user for 5
    olympians, medal count, and sport.
    Averages medal count and displays all
    info in csv.
  ***************************************/


  import java.util.Scanner;

  public class Main {
  
      public static void main(String[] args) {
      program();
      System.exit(0);
      }
  
      //String Input method
      public static String StrInput(String message) {
          String answer;
          Scanner scanner = new Scanner(System.in);
          System.out.println(message);
          answer = scanner.nextLine();
          return answer;
      }
  
      //Integer Input method
      public static int IntInput(String message) {
          int answer;
          Scanner scanner = new Scanner(System.in);
          System.out.println(message);
          answer = scanner.nextInt();
          return answer;
      }
  
      //Average
      public static void Average(double medal_total){
          final double total_olympians = 5;
          double average = medal_total/total_olympians;
          System.out.println("Between them they won an average of " + Math.rint(average) + " medals each.");
      }
  
      //Data Display
      public static void display(String sport[], String olympians[], int medals[]) {
          for (int j = 4; j >= 0; j--) {
              System.out.println(sport[j] + ", " + olympians[j] + ", " + medals[j]);
          }
      }
      
      //
      public static void program() {
          String[] olympians = new String[5];
          int medals[] = new int[5];
          String sport[] = new String[5];
  
  
          int arr_length = olympians.length;
          double medal_total = 0;
          for (int i = 0; i < arr_length; i++) {
              olympians[i] = StrInput("Name Olympians/Paralympian " + (i + 1) + "?");
  
              medals[i] = IntInput("How many medals did he/she win?");
              medal_total = medal_total + medals[i];
  
              sport[i] = StrInput("What sport did he/she compete in?");
          }
          Average(medal_total);
          display(sport, olympians, medals);
  
          }
  
      }