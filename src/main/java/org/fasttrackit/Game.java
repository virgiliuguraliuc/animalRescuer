package org.fasttrackit;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static org.fasttrackit.Animal.*;




public class Game {

    public int UserInputInt() {
        System.out.println(" Type your answer here: ");
        Scanner input = new Scanner(System.in);
        int ch = 0;
        try {
            ch = input.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Numbers only, please.");
            UserInputInt();
        }
        return ch;
    }

    public String UserInputString() { // vezi cum fortezi sa bage doar string

        System.out.println(" Type your answer here: ");
        Scanner input = new Scanner(System.in);
        String st = "";
        try {
            st = input.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("A program needs a name.");
            UserInputString();
        }
        return st;
    }


public void initAnimal () {

    System.out.println(" WELCOME  TO  THE PET SHELTER ");
    System.out.println("------------------------------");
// În clasa Game, creați o metodă private void initAnimal, în cadrul căreia veți instanția un obiect de tip Dog sau Cat sau o altă sub-clasă a clasei Animal
// (îi puteți chiar cere jucătorului să își exprime preferința), pe a cărui referință o veți stoca în variabila de instanță animal din clasa Game. Tot în cadrul acestei metode,
// atribuiți câte o valoare tuturor prorietăților obiectului Animal instanți.

    System.out.println("Please select the animal you want to rescue: \n 1.Dog   2.Cat   3.Bird   4.Fish ");
    int petSelection = UserInputInt();
    switch (petSelection) {
        case 1:
            Animal animal = new Dog(nameAnimal());
            ((Dog) animal).preferedplace = "land";
            animal.setType("doggy");
            animal.setPetAge(RandomNumberGenerator()); // hardcodat de modificat in ceva nehardcodat si random
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setNameFavoriteFood("name");        // make it match a random dog food
            animal.setNameFavoriteActivity("");        // make it match a list of land activitys

            System.out.println(animal.getHealthLevel() + " is health level ");
            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            break;

        case 2:
            animal = new Cat(nameAnimal());

            animal.setType("catto");
            animal.setPetAge(RandomNumberGenerator()); // hardcodat de modificat in ceva nehardcodat si random
            animal.setHealthLevel(RandomNumberGenerator());
            animal.setNameFavoriteFood("name");        // make it match a random dog food
            animal.setNameFavoriteActivity("");        // make it match a list of land activitys
            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

           break;

        case 3:
            animal = new Bird(nameAnimal());

            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            break;

        case 4:
            animal = new Fish(nameAnimal());

            System.out.println(" The animal is a " + animal.getType() + " and its name is " + animal.getPetName()+  ".");
            System.out.println(" " + animal.getPetName() + " is " + animal.getPetAge() + " years old and enjoys " + animal.getNameFavoriteActivity() + ".");

            break;


       default:
            System.out.println();
            initAnimal();
    }

//    System.out.println(" The animal needs to live on " + AnimalEnvironment.preferedBiome + ".");
 //   System.out.println(" The animal is a " + pet.getType() + " and its name is " + pet.getPetName()+  ".");
//    System.out.println(" " + pet.getPetName() + " is " + pet.getPetAge() + " years old and enjoys " + pet.getNameFavoriteActivity() + ".");


}

private String nameAnimal (){
//    În clasa Game, creați o nouă metodă private void nameAnimal prin care să îi solicitați utilizatorului să îi dea un nume animalului salvat. Citiți datele introduse
//    de utilizator folosind clasa Scanner și stocați numele introdus în proprietatea name a obiectului animal din clasa Game.
//            Apoi apelați metoda nameAnimal din metoda start.
    System.out.println("Lets name your new Friend!");
    String petname = UserInputString();

    return petname;
}


private void initRescuer () {
//În clasa Game, creați o nouă metodă private void initRescuer, în cadrul căreia veți instanția un obiect de tip Rescuer, pe a cărui referință o veți stoca în variabila de
// instanță rescuer din clasa Game. Tot în cadrul acestei metode, îi veți afișa utilizatorului un mesaj solicitându-i să își introducă numele, iar apoi, cu ajutorul unui obiect
// de tip Scanner, veți citi numele introdus de utilizator. În cele din urmă, stocați acest nume în proprietatea name a obiectului rescuer. Folosiți try-catch și recursivitatea pentru
// a forța utilizatorul să introducă date valide.

    System.out.println("Please tell us your Name");
    String RescuerName = UserInputString();
    double AvailableCash = 100;   // make it to be random somehow

    PetOwner petOwner = new PetOwner(RescuerName);
    petOwner.setAvailableCash(AvailableCash);
    petOwner.setPetTraining(1);
    System.out.println("Hello " + petOwner.getOwnerName() + ", your available cash is " + petOwner.getAvailableCash());

}

private void requireFeeding(){
//    În clasa Game, creați o nouă metodă private void requireFeeding prin care să îi solicitați utilizatorului să hrănească animalul salvat.
//    În cadrul acestei metode, folosind o buclă for, afișați-i utilizatorului toate tipurile de hrană disponibile.
//    Îi puteți lăsa și posibilitatea de a nu alege niciunul dintre ele. Cu ajutorul clasei Scanner citiți tipul de hrană ales de utilizator și folosiți-l pentru a apela,
//    din cadrul metodei requireFeeding, metoda feed expusă de obiectul rescuer din clasa Game.
//
//    Apoi apelați metoda requireFeeding din metoda start.
}

private void requirePlay(){
// Faceți la fel pentru a-i solicita utilizatorului să se joace cu animalul salvat.
}

private void requireShelter(){

}

private int RandomNumberGenerator () {
     //   int randomnumber = 2;
    Random rng = new Random();
int randomnumber =  rng.nextInt(10) + 1;


    return randomnumber;

}

public void Start (){
        //1. initiem User, cerem nume, dam random cash according to name
        initRescuer();
        initAnimal();

        //2. User chooses animal type (dog, cat, fish or bird)
        //3. Cand selectam ce animal vrem aratam ascii art si cerem sa ii puna un nume
        //4. selectam o casa adecvata pentru animal
        //5. train and play and feed with animal for 5 minutes or so.
        //6. if good job the animal likes you and likes to stay with you, dies or runs away.



        // Asigurați-vă că în clasa Game, aveți o metodă public void start. În această metodă veți include întreaga logică de funcționare a jocului.
        // Deocamdată, în corpul metodei start apelați metoda initAnimal creată anterior, așa încât, la pornirea jocului, să existe un animal abandonat care trebuie salvat.

   // Încorporați apelarea metodelor requireFeeding și requireActivity într-o buclă while sau for și introduceți o condiție pe baza căreia să fie determinat rezultatul
    // jocului în funcție de valoare proprietăților hungerLevel și happinessLevel din obiectul animal (de exemplu, stabiliți un număr de runde sau o durată de timp, iar în
    // funcție de nivelul de foame și nivelul stării de bine ale animalului la sfârșitul acestor runde sau la sfârșitul timpului, jocul să fie câștigat sau pierdut).
    }








}
