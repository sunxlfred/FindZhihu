package com.findzhihu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fred on 2017/11/13.
 */

public class FragmentCommon extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_common, container, false);
        return view;
    }

    public static FragmentCommon newInstance(){
        FragmentCommon FragmentFourth = new FragmentCommon();
        return FragmentFourth;
    }
}
