package Lab2;


/**
 *  , Character.java for Lab2
 * This class represents a character in a collection.
 * itll store information like the characters name, actors name, gender, and duty, all here.
 */





public class Character {

    private String characterName;
    private String actorName;
    private String gender;
    private String duty;

    // starts everythuing
    public Character(String actorName, String characterName, String gender, String duty)
    {

        this.actorName = actorName;

        this.characterName = characterName;

        this.gender = gender;

        this.duty = duty;

    }

    // starts everything more-so, gets it sets it
    public String getCharacterName() {
        return characterName;
    }


    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    // get and set for actorName
    public String getActorName() {
        return actorName;

    }

    public void setActorName(String actorName) {
        this.actorName = actorName;

    }

    //get and set for   // gender

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    //get and set for  // duty

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }



    // formats
    @Override
    public String toString() {
        return "- " + characterName + "\n" +
               "Real Name: " + actorName + "\n" +
               "Gender: " + gender + "\n" +
               "Duty: " + duty + "\n";
    }
}
