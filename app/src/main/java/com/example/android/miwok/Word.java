package com.example.android.miwok;

public class Word {

    // Default (English) transaltion for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    // Image Resource ID for the word
    private int mImageResourceId;

    // Create a new Word object (phrases)
    // @param defaultTranslation is the word in a language that the user is already familiar with
    //     *                           (such as English)
    //@param miwokTranslation is the word in the Miwok language

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Create a new Word object
    // @param imageResourceId is the drawable resource ID for the image associated with the word

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    // Get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get the Image Resource ID of the word
    public int getmImageResourceId() { return mImageResourceId; }

}
