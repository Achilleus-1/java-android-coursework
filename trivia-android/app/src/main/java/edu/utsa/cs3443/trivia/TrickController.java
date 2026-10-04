package edu.utsa.cs3443.trivia;



import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import edu.utsa.cs3443.trivia.model.Trivia;


import java.util.List;

public class TrickController extends AppCompatActivity
{
    private List<Trivia> triviaList;
    private Trivia currentTrivia;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trick);

        // loads trivia from the csb file
        triviaList = Trivia.loadTrivia(this, "trivia.csv");
        loadNewQuestion();
    }

    private void loadNewQuestion() {
        // rand ques

        currentTrivia = Trivia.getRandomTrivia(triviaList);

        // Gets ui

        TextView questionTextView = findViewById(R.id.questionText);
          Button option1Button = findViewById(R.id.option1Button);
          Button option2Button = findViewById(R.id.option2Button);
        Button option3Button = findViewById(R.id.option3Button);


        questionTextView.setText(currentTrivia.getQuestion());

        option1Button.setText(currentTrivia.getOption1());
        option2Button.setText(currentTrivia.getOption2());
        option3Button.setText(currentTrivia.getOption3());

        // button listeners

        option1Button.setOnClickListener(v -> checkAnswer(1));
        option2Button.setOnClickListener(v -> checkAnswer(2));
        option3Button.setOnClickListener(v -> checkAnswer(3));

    }

    private void checkAnswer(int selectedOption)
    {
        Context context = getApplicationContext();
        if (selectedOption == currentTrivia.getCorrectOption())
        {
            Toast.makeText(context, "Correct! " + currentTrivia.getAnswer(), Toast.LENGTH_LONG).show();

        }

        else
        {
            Toast.makeText(context, "Wrong! " + currentTrivia.getAnswer(), Toast.LENGTH_LONG).show();
        }
        loadNewQuestion();
    }
}
