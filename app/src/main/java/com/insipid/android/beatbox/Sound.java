package com.insipid.android.beatbox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Terry on 10/5/2017.
 */

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");

    }
    public String getAssetPath(){
        return mAssetPath;
    }
    public String getName(){
        return mName;
    }
}

