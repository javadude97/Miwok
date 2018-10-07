package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // an string of ArrayList of words

        ArrayList<Word> wordsList = new ArrayList<Word>();

        // initialize the elements of the string array of family words

        wordsList.add(new Word("father", "әpә", R.drawable.family_father));
        wordsList.add(new Word("mother", "әṭa", R.drawable.family_mother));
        wordsList.add(new Word("son", "angsi", R.drawable.family_son));
        wordsList.add(new Word("daughter", "tune", R.drawable.family_daughter));
        wordsList.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        wordsList.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        wordsList.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        wordsList.add(new Word("younger sister", "kollita", R.drawable.family_younger_sister));
        wordsList.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        wordsList.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

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
