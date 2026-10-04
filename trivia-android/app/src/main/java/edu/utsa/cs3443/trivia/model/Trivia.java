package edu.utsa.cs3443.trivia.model;

import android.content.Context;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


    public class Trivia {
        private String question;
     private String option1;
     private String option2;
     private String option3;
     private String answer;
    private int correctOption;

    // construvctor
    public Trivia(String question, String option1, String option2, String option3, String answer)
    {
        this.question = question;

        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;

        this.answer = answer;
        this.correctOption = determineCorrectOption();
    }

    // Getters
    public String getQuestion() { return question; }
    public String getOption1() { return option1; }
    public String getOption2() { return option2; }
    public String getOption3() { return option3; }
    public String getAnswer() { return answer; }


    public int getCorrectOption() { return correctOption; }

    private int determineCorrectOption()
    {
        if (answer.contains(option1)) return 1;
        if (answer.contains(option2)) return 2;
        if (answer.contains(option3)) return 3;
        throw new IllegalArgumentException("nan");
    }

    // csv loading

    public static List<Trivia> loadTrivia(Context context, String fileName)
    {
        List<Trivia> triviaList = new ArrayList<>();
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(context.getAssets().open(fileName)));
            String line;

            while ((line = reader.readLine()) != null)
            {
                String[] parts = splitCsvLine(line);
                if (parts.length == 5) {
                    String question = parts[0].trim();
                    String option1 = parts[1].trim();
                    String option2 = parts[2].trim();
                    String option3 = parts[3].trim();
                    String answer = parts[4].trim();

                    triviaList.add(new Trivia(question, option1, option2, option3, answer));
                }
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        return triviaList;
    }

    // splits csv
    private static String[] splitCsvLine(String line)
    {
        List<String> fields = new ArrayList<>();
        StringBuilder field = new StringBuilder();
        boolean inQuotes = false;



        for (char c : line.toCharArray()) {
            if (c == '"' || c == '\'')
            { // for quotes
                inQuotes = !inQuotes;
            }


            else if (c == ',' && !inQuotes)
            { // commas
                fields.add(field.toString());
                field.setLength(0);

            } else {
                field.append(c);
            }
        }
        fields.add(field.toString());

        return fields.toArray(new String[0]);
    }

    //rand
    public static Trivia getRandomTrivia(List<Trivia> triviaList) {
        Random random = new Random();
        return triviaList.get(random.nextInt(triviaList.size()));
    }
}
