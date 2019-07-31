package org.fasttrackit;

public class AsciiGraphics {

    private String dogAlive = "   /^-----^\\\n" +
                              "     V  o o  V\n" +
                              "      |  Y  |\n" +
                              "       \\ Q /\n" +
                              "       / - \\\n" +
                              "       |    \\\n" +
                              "       |     \\    )\n" +
                              "       || (___\\====";

    private String catAlive = "  /\\_/\\\n" +
                              "   >^.^<.---.\n" +
                              "  _'-`-'     )\\\n" +
                              " (6--\\ |--\\ (`.`-.\n" +
                              "     --'  --'  ``-'";
    private String birdAlive = ",\n" +
            "         ,_     ,     .'<_\n" +
            "        _> `'-,'(__.-' __<\n" +
            "        >_.--(.. )  =;`\n" +
            "             `V-'`'\\/``";
    private String fishAlive = " \\\n" +
            "         }\\\n" +
            "   `\\  .'  \\\n" +
            "    }\\/ ~~ o\\\n" +
            "    }/\\  )) _}\n" +
            "   ,/ /`.  /`\n" +
            "         }/\n" +
            "         /";

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    private String all = "     /^-----^\\         ,_                  ,           .'<_            \\\n" +
            "     V  o o  V         \\)\\_    \t          _> `'-,'(__.-' __<   o       }\\\n" +
            "      |  Y  |         /    '. .---._\t  >_.--(.. )  =;`        `\\  .'  \\\n" +
            "       \\ Q /        =P ^     `      '.\t       `V-'`'\\/`          }\\/ ~~ o\\\n" +
            "       / - \\         `--.       /     \\\t                        o }/\\  )) _}\n" +
            "       |    \\        .-'(       \\      |                         ,/ /`.  /`\n" +
            "       |     \\    ) (.-'   )-..__>   , ;                               }/\n" +
            "       || (___\\====  (_.--``    (__.-/ /                       o       /\n" +
            "                             .-.__.-'.'\n" +
            "     \t                     '-...-' ";

    public String getDogAlive() {
        return dogAlive;
    }

    public void setDogAlive(String dogAlive) {
        this.dogAlive = dogAlive;
    }

    public String getCatAlive() {
        return catAlive;
    }

    public void setCatAlive(String catAlive) {
        this.catAlive = catAlive;
    }

    public String getBirdAlive() {
        return birdAlive;
    }

    public void setBirdAlive(String birdAlive) {
        this.birdAlive = birdAlive;
    }

    public String getFishAlive() {
        return fishAlive;
    }

    public void setFishAlive(String fishAlive) {
        this.fishAlive = fishAlive;
    }
}
