package com.insipid.android.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Terry on 10/5/2017.
 */

public class SoundViewModel extends BaseObservable{
    private Sound mSound;
    private BeatBox mBeatbox;

    public SoundViewModel(BeatBox beatBox){
        mBeatbox = beatBox;
    }
    @Bindable
    public String getTitle(){
        return mSound.getName();
    }
    public Sound getSound(){
        return mSound;
    }
    public void setSound(Sound sound){
        mSound = sound;
        notifyChange();
    }

}
