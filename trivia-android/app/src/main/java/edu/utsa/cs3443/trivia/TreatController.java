package edu.utsa.cs3443.trivia;

import android.os.Bundle;


import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

 public class TreatController extends AppCompatActivity
{
    private int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9};



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treat);

        Random rand = new Random();
        int randomImage = images[rand.nextInt(images.length)];

        ((ImageView) findViewById(R.id.treat_image)).setImageResource(randomImage);
    }

}
