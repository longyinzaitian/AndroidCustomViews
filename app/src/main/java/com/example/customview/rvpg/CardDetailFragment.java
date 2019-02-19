package com.example.customview.rvpg;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.customview.R;

/**
 *
 *
 * @author husy
 * @date 2019年2月17日
 */
public class CardDetailFragment extends Fragment {

    private static CardDetailFragment mInstance = null;
    public CardDetailFragment() {
    }

    public static Fragment create() {
        if (mInstance == null) {
            mInstance = CardDetailFragment.newInstance();
        }
        return mInstance;
    }

    public static CardDetailFragment newInstance() {
        CardDetailFragment fragment = new CardDetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_card_detail, container, false);
    }




}
