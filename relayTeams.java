/* ***************************************
  @author    Delane Brandy
  @date      13 December 2021
  @version   1

    Write a program that checks the legality
    of relay teams given the country and the
    disability class of the entrant for each
    relay leg.
   ****************************************/


import java.util.Scanner;

class UniversalRelayTeam {
    String country;
    int Leg1;
    int Leg2;
    int Leg3;
    int Leg4;
}

public class Main {

    public static void main(String[] args) {
        paralympic();
        System.exit(0);
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

    //Type Setter - country
    public static UniversalRelayTeam country(UniversalRelayTeam u)
    {
        String cc = StrInput("What country is the team representing?");
        u.country = cc;
        return u;
    }

    public static UniversalRelayTeam legs(UniversalRelayTeam u)
    {
        for (int i = 1; i <= 4; i++) {
            int l = IntInput("What is the disability class for leg " + i + "? T");
            if (i == 1) {
                u.Leg1 = l;
            } else if (i == 2) {
                u.Leg2 = l;
            } else if (i == 3) {
                u.Leg3 = l;
            } else {
                u.Leg4 = l;
            }
        }
        return u;
    }

    public static String getName(UniversalRelayTeam u)
    {
        return u.country;
    }

    public static void check(UniversalRelayTeam team)
    {
        for (int i = 1; i <= 4; i++) {
            if (!(getLeg(team, 1) == 11 || getLeg(team, 1) == 13)) {
                System.out.println("Leg 1 (T" + getLeg(team, 1) + ") is not legal.");
                team.Leg1 = 11;
            } else if (!(getLeg(team, 2) == 61 || getLeg(team, 2) == 62)) {
                System.out.println("Leg 2 (T" + getLeg(team, 2) + ") is not legal.");
                team.Leg2 = 61;
            } else if (!(getLeg(team, 3) == 35 || getLeg(team, 3) == 36)) {
                System.out.println("Leg 3 (T" + getLeg(team, 3) + ") is not legal.");
                team.Leg3 = 35;
            } else if (!(getLeg(team, 4) == 51 || getLeg(team, 4) == 52)) {
                System.out.println("Leg 4 (T" + getLeg(team, 4) + ") is not legal.");
                team.Leg4 = 51;
            }
        }
    }

    public static int getLeg(UniversalRelayTeam u, int i)
    {
        if (i == 1) {
            return u.Leg1;
        }
        else if (i == 2) {
           return u.Leg2;
        }
        else if (i == 3) {
            return u.Leg3;
        }
        else {
            return u.Leg4;
        }
    }

    public static void paralympic()
    {
        UniversalRelayTeam team = new UniversalRelayTeam();

        StrInput("What is the classification (maximum points) of this relay event?");
        country(team);

        legs(team);

        System.out.println("The " + getName(team) + " team is: Leg 1, T" + getLeg(team, 1)
                + "; Leg 2, T" + getLeg(team, 2)
                + "; Leg 3, T" + getLeg(team, 3)
                + "; Leg 4, T" + getLeg(team, 4));
        check(team);


    }
}