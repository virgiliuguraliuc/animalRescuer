package org.fasttrackit;

public class Fish extends Animal {

    public String preferedplace;
    public String nameFavoriteActivity;
    public String looksLikeAlive = "       \\\n" +
            "         }\\\n" +
            "   `\\  .'  \\\n" +
            "    }\\/ ~~ o\\\n" +
            "    }/\\  )) _}\n" +
            "   ,/ /`.  /`\n" +
            "         }/\n" +
            "         /";
    public String looksLikeDead  = "  ....._____.......\n" +
            "      /     \\/|\n" +
            "      \\x__  /\\|\n" +
            "          \\|\n";


       public Fish(String petName) {
        super(petName);
    }

    @Override
    public void HappynessLevel() {
        System.out.println( getPetName() + " Makes a heart shape bubble ");//
    }
}
