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

        wordsList.add(new Word("one", "lutti", R.drawable.number_one));
        wordsList.add(new Word("two", "otiiko", R.drawable.number_two));
        wordsList.add(new Word("three", "tolookosu", R.drawable.number_three));
        wordsList.add(new Word("four", "oyyisa", R.drawable.number_four));
        wordsList.add(new Word("five", "massokka", R.drawable.number_five));
        wordsList.add(new Word("six", "temmokka", R.drawable.number_six));
        wordsList.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        wordsList.add(new Word("eight", "kawinta", R.drawable.number_eight));
        wordsList.add(new Word("nine", "wo'e", R.drawable.number_nine));
        wordsList.add(new Word("ten", "na'aacha", R.drawable.number_ten));

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
