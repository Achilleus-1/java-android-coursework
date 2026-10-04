package edu.utsa.cs3443.propertylisting.model;

import android.content.Context;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Listing {

     private ArrayList<Property> properties = new ArrayList<>();

    // Load properties from .csv from assets
    public void loadProperties(Context context) {
        try {
            //opens it
            InputStream is = context.getAssets().open("listings.csv");


                   Scanner scanner = new Scanner(is);

                while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(", ");

                // just debugging
                // Do not echo record contents into diagnostic logs.


                //not used really
                if (data[0].startsWith("rp")) {
                    // makes and adds ResidentialProperty to lists
                    properties.add(new ResidentialProperty(
                            data[0], // ID
                            data[1], // ;ocation

                            Double.parseDouble(data[2]), // price

                            Double.parseDouble(data[3]), // HOA fees


                            Integer.parseInt(data[4]), // Number of Bedrooms

                            Double.parseDouble(data[5]) //Number of bathrooms

                    ));
                } else if (data[0].startsWith("cp"))
                {
                    // makes and adds CommercialProperty to list
                    properties.add(new CommercialProperty(
                            data[0], // ID
                            data[1], // location
                            Double.parseDouble(data[2]), // price
                            data[3], // zone
                            Integer.parseInt(data[4]), // number of units
                            Integer.parseInt(data[5]) //  mumber of parking Spots

                    ));

                }


            }


            scanner.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }

    public Property getProperty(String location)
    {
        for (Property property : properties)
        {
            if (property.getLocation().equals(location))
            {
                return property;
            }
        }
        return null;
    }
}
