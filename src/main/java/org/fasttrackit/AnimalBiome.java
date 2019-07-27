package org.fasttrackit;

public class AnimalBiome extends AnimalEnvironment {

    AnimalEnvironment animalEnvironment;

    //constructor ca toate  Land animale sa aiba environment;


    public AnimalBiome(AnimalEnvironment animalEnvironment) {
        this.animalEnvironment = animalEnvironment;
    }

    public AnimalEnvironment getAnimalEnvironment() {
        return animalEnvironment;
    }

    public void setAnimalEnvironment(AnimalEnvironment animalEnvironment) {
        this.animalEnvironment = animalEnvironment;
    }



}
