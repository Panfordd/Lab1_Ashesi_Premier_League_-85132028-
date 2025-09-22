import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args){
        //VARIABLE DECLARATION
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;

        //TAKING INPUT FROM KEYBOARD
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age= sc.nextInt();
        System.out.print("Enter your height: ");
        height = sc.nextDouble();
        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();
        System.out.print("Enter your jersey number: ");
        jerseyNumber = sc.nextInt();

        //NECESSARY CONVERSIONS
        final double POUND= 0.45359237;
        final int METER= 100;
        double heightConversion= height*METER;
        double weightConversion= weight*POUND;
        int convertedWeight = (int) weightConversion;

        // CHECKING FOR ELIGIBILITY
        String ee;
        if (age>=18 && age<=35 && weight<90){
            ee="Eligible";
        }
        else{
            ee="Not Eligible";
        }

        //POSITION
        String position;
        switch (jerseyNumber){
            case 1:position="Goalkeeper";break;
            case 2,5:position="Defender";break;
            case 6,8:position="Midfielder";break;
            case 7,11:position="Winger";break;
            case 9:position="Striker";break;
            case 10:position="Playmaker";break;
            default:position="Player position not known";
        }
        //CATEGORY
        String category;
        if (age<20){
            category="Rising star";
        }
        else if (age>=20 && age<=30){
            category="Prime Player";
        }
        else{
            category="Veteran";
        }

        //ATTACKER STATUS
        String attackerStatus;
        if(jerseyNumber==7||jerseyNumber==11||jerseyNumber==9){
            attackerStatus="Yes";
        }
        else {
            attackerStatus = "No";
        }

        //LINEUP
        String lineup;
        if(age>=20 && age<=30){
            if(weight<80){
                lineup="Starting lineup";
            }
            else{
                lineup="Bench";
            }
        }
        else
            lineup="Not a prime player";


        //FINAL DECISION
        String ff=(age>=18 && age<=35 && weight<90)? "Play":"Rest";

        //OUTPUT
        System.out.println("PLAYER REPORT");
        System.out.println("Age: " + age +" (" +category+ ")");
        System.out.println("Height: "+heightConversion+"cm");
        System.out.println("Weight: "+weightConversion +"kg");
        System.out.println("Jersey Number: "+jerseyNumber);
        System.out.println("Position: "+ position);
        System.out.println("Attacker jersey: "+attackerStatus);
        System.out.println("Eligibility: "+ee);
        System.out.println("Lineup Decision: "+lineup);
        System.out.println("Final Decision: "+ff);




    }
}

