package com.example.myapplication.ui.linkliste;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LinklisteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LinklisteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Link-Liste fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
