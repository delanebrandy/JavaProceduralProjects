/* ***************************************
  @author    Delane Brandy
  @date      4th December 2021
  @version   1

    Write a program that is to be used to
    investigate how late trains passing
    through a given station are.
   ****************************************/

  import java.util.Scanner;

  public class Main {
  
      public static void main(String[] args) {
          trains_main();
      }
  
      //Integer Input method
      public static int IntInput(String message) {
          int answer;
          Scanner scanner = new Scanner(System.in);
          System.out.println(message);
          answer = scanner.nextInt();
          return answer;
      }
  
      //String Input method
      public static String StrInput(String message) {
          String answer;
          Scanner scanner = new Scanner(System.in);
          System.out.println(message);
          answer = scanner.nextLine();
          return answer;
      }
  
      public static String[] setTrainName(int i, String input)
      {
          String[] names = new String[100];
          names[i] = input;
          return names;
      }
  
      public static int[] setTrainTime(int i, int train_time)
      {
  
          int[] times = new int[100];
          times[i] = train_time;
          return times;
      }
  
      public static void end(int total, int[] punctual, String[] tN)
      {
  
          System.out.println("The trains were in total " + total +" minutes late.");
          System.out.println("The most punctual train was to " + tN[punctual[1]] + ". It was " + punctual[0] + " minute(s) late.");
      }
  
      public static int[] mostPunctualMethod(int mostPunctual, int train_time, int i)
      {
  
          int[] punctual = new int[2];
          if (train_time < mostPunctual)
          {
              mostPunctual = train_time;
              int mostPunctuali = i;
              punctual[0] = mostPunctual;
              punctual[1] = mostPunctuali;
          }
  
          return punctual;
      }
  
  
      public static void trains_main() {
  
          String train = "NULL";
          int i = 0;
          int mostPunctual = 10000;
          int[] punctual = new int[2];
          String[] tN = new String[100];
          int total = 0;
  
          while (!train.equals("XXX")) {
  
              train = StrInput("What is the destination of the train that just departed?");
  
              if (train.equals("XXX"))
  
              {
                  end(total, punctual, tN);
              }
  
              else
              {
                  int train_time = IntInput("How many minutes late was it?");
  
                  tN = setTrainName(i, train);
                  int[] tT = setTrainTime(i, train_time);
  
                  total = total + tT[i];
  
                  punctual = mostPunctualMethod(mostPunctual, train_time, i);
  
                  i++;
              }
  
          }
      }
  }