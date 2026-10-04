package edu.utsa.cs3443.propertylisting;

import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import edu.utsa.cs3443.propertylisting.model.Listing;
import edu.utsa.cs3443.propertylisting.model.Property;



public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Listing listing = new Listing();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // loas csv file
        listing.loadProperties(this);



        // sets up buttons for clicking
        Button btnProperty1 = findViewById(R.id.btnProperty1);


        Button btnProperty2 = findViewById(R.id.btnProperty2);

         Button btnProperty3 = findViewById(R.id.btnProperty3);

        Button btnProperty4 = findViewById(R.id.btnProperty4);

        btnProperty1.setOnClickListener(this);

         btnProperty2.setOnClickListener(this);

        btnProperty3.setOnClickListener(this);

        btnProperty4.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        String location = "";

        // matches buttons to their pos
        //simpler for if else than a switch for me
        if (view.getId() == R.id.btnProperty1)
        {
            location = "123 River Rd - San Antonio - TX";
        }
            else if (view.getId() == R.id.btnProperty2) {
            location = "23412 Hill St - San Antonio - TX";
        }
            else if (view.getId() == R.id.btnProperty3) {
            location = "34 Deer Ct - San Antonio - TX";
        }
         else if (view.getId() == R.id.btnProperty4) {
            location = "109 Medina St - Boerne - TX";
        }

        // shows prices when done
        Property property = listing.getProperty(location);

        if (property != null)
        {
            DecimalFormat decimalFormat = new DecimalFormat("#");


            String formattedPrice = decimalFormat.format(property.getPrice());


            Toast.makeText(this, "Price: $" + formattedPrice, Toast.LENGTH_SHORT).show();
        }
        else
        {//error handler

             Toast.makeText(this, "doesnt exist", Toast.LENGTH_SHORT).show();
        }


    }
}
