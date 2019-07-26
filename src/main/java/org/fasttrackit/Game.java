package org.fasttrackit;
import static org.fasttrackit.Animal.*;



public class Game {


public static void initAnimal () {

    System.out.println("this is a method in game");
// În clasa Game, creați o metodă private void initAnimal, în cadrul căreia veți instanția un obiect de tip Dog sau Cat sau o altă sub-clasă a clasei Animal
// (îi puteți chiar cere jucătorului să își exprime preferința), pe a cărui referință o veți stoca în variabila de instanță animal din clasa Game. Tot în cadrul acestei metode,
// atribuiți câte o valoare tuturor prorietăților obiectului Animal instanți.




}

private void nameAnimal (){
//    În clasa Game, creați o nouă metodă private void nameAnimal prin care să îi solicitați utilizatorului să îi dea un nume animalului salvat. Citiți datele introduse
//    de utilizator folosind clasa Scanner și stocați numele introdus în proprietatea name a obiectului animal din clasa Game.
//            Apoi apelați metoda nameAnimal din metoda start.
}


private void initRescuer () {
//În clasa Game, creați o nouă metodă private void initRescuer, în cadrul căreia veți instanția un obiect de tip Rescuer, pe a cărui referință o veți stoca în variabila de
// instanță rescuer din clasa Game. Tot în cadrul acestei metode, îi veți afișa utilizatorului un mesaj solicitându-i să își introducă numele, iar apoi, cu ajutorul unui obiect
// de tip Scanner, veți citi numele introdus de utilizator. În cele din urmă, stocați acest nume în proprietatea name a obiectului rescuer. Folosiți try-catch și recursivitatea pentru
// a forța utilizatorul să introducă date valide.

    PetOwner petOwner = new PetOwner("Virgiliu");
    petOwner.setAvailableCash(100);

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



public void Start (){
        // Asigurați-vă că în clasa Game, aveți o metodă public void start. În această metodă veți include întreaga logică de funcționare a jocului.
        // Deocamdată, în corpul metodei start apelați metoda initAnimal creată anterior, așa încât, la pornirea jocului, să existe un animal abandonat care trebuie salvat.

   // Încorporați apelarea metodelor requireFeeding și requireActivity într-o buclă while sau for și introduceți o condiție pe baza căreia să fie determinat rezultatul
    // jocului în funcție de valoare proprietăților hungerLevel și happinessLevel din obiectul animal (de exemplu, stabiliți un număr de runde sau o durată de timp, iar în
    // funcție de nivelul de foame și nivelul stării de bine ale animalului la sfârșitul acestor runde sau la sfârșitul timpului, jocul să fie câștigat sau pierdut).
    }








}
