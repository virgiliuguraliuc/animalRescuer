package org.fasttrackit;

public class PetDoctor {
    String PetDoctorName;
    String Speciality;
    double skilllevel;
    double medicinalCost;

        // doctor treats pets for a price
    public double medicalcare (double skilllevel, double healthlevel, double medicinalCost) {

        double restoredHealth = 10 - healthlevel;

        double difficulty = restoredHealth / skilllevel;

        double price = difficulty * medicinalCost;



        System.out.println( " Doctor " + PetDoctorName + "discovers that the animal is at " + healthlevel +  " health and treats the suffering animal restoring " +restoredHealth + " health, bringing back the pet to full health. "  );
        System.out.println( " The cost of the treatment is " + price + " $.");

        return price;



    }
}
