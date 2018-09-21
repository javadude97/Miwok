package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.ListView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // an string of ArrayList of words

        ArrayList<Word> wordsList = new ArrayList<Word>();

        // initialize the elements of the string array of words

        wordsList.add(new Word("one", "lutti"));
        wordsList.add(new Word("two", "otiiko"));
        wordsList.add(new Word("three", "tolookosu"));
        wordsList.add(new Word("four", "oyyisa"));
        wordsList.add(new Word("five", "massokka"));
        wordsList.add(new Word("six", "temmokka"));
        wordsList.add(new Word("seven", "kenekaku"));
        wordsList.add(new Word("eight", "kawinta"));
        wordsList.add(new Word("nine", "wo'e"));
        wordsList.add(new Word("ten", "na'aacha"));

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
        // word_listyout file.

       ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

       listView.setAdapter(adapter);

    }
}
