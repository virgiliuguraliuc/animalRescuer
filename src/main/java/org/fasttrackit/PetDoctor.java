package org.fasttrackit;

public class PetDoctor {
   private String PetDoctorName;
   private String Speciality;
   private double skilllevel;
   private double medicinalCost;

   //getter




    public PetDoctor(double skilllevel, double medicinalCost) {
        this.skilllevel = skilllevel;
        this.medicinalCost = medicinalCost;
    }

    public String getPetDoctorName() {
        return PetDoctorName;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public double getSkilllevel() {
        return skilllevel;
    }

    public double getMedicinalCost() {
        return medicinalCost;
    }

    //setter


    public void setPetDoctorName(String petDoctorName) {
        PetDoctorName = petDoctorName;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public void setSkilllevel(double skilllevel) {
        this.skilllevel = skilllevel;
    }

    public void setMedicinalCost(double medicinalCost) {
        this.medicinalCost = medicinalCost;
    }



    // doctor treats pets for a price
    public double medicalcare (double skilllevel, double healthlevel, double medicinalCost) {

        double restoredHealth = 10 - healthlevel;

        double difficulty = restoredHealth / skilllevel;

        double price =  medicinalCost * difficulty;



        System.out.println( " Doctor " + PetDoctorName + "discovers that the animal is at " + healthlevel +  " health and treats the suffering animal restoring " +restoredHealth + " health, bringing back the pet to full health. "  );
        System.out.println( " The cost of the treatment is " + price + " $.");

        return price;

    }

    public double medicalcarePrice (double skilllevel, double healthlevel, double medicinalCost) {

        double restoredHealth = 10 - healthlevel;

        double difficulty = restoredHealth / skilllevel;

        double price =  medicinalCost * difficulty;


        return price;

    }


}
