package Lab2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * , ProductCollection.java for Lab2
 * This class represents a collection of characters in a setting way with lists to each type of barbie
 * it uses a list of Character objects and provides methods to load and display the collection.
 */





public class ProductCollection

{
    private String productCollectionName;
    private ArrayList<Character> characters;

    //makes productcollectionname and arraylist
    public ProductCollection(String productCollectionName)
    {
        this.productCollectionName = productCollectionName;
        this.characters = new ArrayList<>();

    }
//get and set for productcollectionname
    public String getProductCollectionName() {
        return productCollectionName;
    }


    public void setProductCollectionName(String productCollectionName)
    {
        this.productCollectionName = productCollectionName;
    }

    // the actual list, get and set

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }


    // bring in csv
    public void loadCharacters(String fileName) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("data/" + fileName));
        String line;
        while ((line = reader.readLine()) != null)
        {
            String[] data = line.split(",");

            if (data.length == 4)
            {
                // turns it into usable stuff
                Character character = new Character(data[0], data[1], data[2], data[3]);

                characters.add(character);
            }
        }


        reader.close();

     }

    // tformats everything
    @Override
    public String toString()  {


        StringBuilder result = new StringBuilder(productCollectionName + "\n--------------- \n");

        for (Character character : characters) {
            result.append(character.toString()).append("\n");

        }

        return result.toString();
    }
}
