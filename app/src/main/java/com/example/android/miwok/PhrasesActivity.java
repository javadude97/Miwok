package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // an string of ArrayList of words

        ArrayList<Word> wordsList = new ArrayList<Word>();

        // initialize the elements of the string array of phrases

        wordsList.add(new Word("Where are you going?", "minto wuksus"));
        wordsList.add(new Word("What is your name?", "tinnә oyaase'nә"));
        wordsList.add(new Word("My name is...", "oyaaset..."));
        wordsList.add(new Word("How are you feeling?", "michәksәs?"));
        wordsList.add(new Word("I’m feeling good.", "kuchi achit"));
        wordsList.add(new Word("Are you coming?", "әәnәs'aa?"));
        wordsList.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        wordsList.add(new Word("I’m coming.", "әәnәm"));
        wordsList.add(new Word("Let’s go.", "yoowutis"));
        wordsList.add(new Word("Come here.", "әnni'nem"));

        // LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word. This sample code ListView explanation is here for my understanding, thanks to Udacity

        WordAdapter adapter =
                new WordAdapter(this, wordsList); // R.layout.list_item

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);

    }
}
