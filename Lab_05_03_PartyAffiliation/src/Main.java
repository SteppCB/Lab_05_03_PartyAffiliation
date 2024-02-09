public class Main {
    public static void main(String[] args) {

        System.out.println("What is your party? Use: R, J, D, or I: ");
         String partyAffiliation = "J";

         if (partyAffiliation.equals("R")){
             System.out.println("You get a Republican Elephant");
         }
         if (partyAffiliation.equals("D")){
             System.out.println("You get a Democrat Donkey!");
         }
         if (partyAffiliation.equals("I")){
             System.out.println("You get a Independant Man!");
         }if (partyAffiliation.equals("J")) {
            System.out.println("You get a Anonymous player!");
        }
    }
}