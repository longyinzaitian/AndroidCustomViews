package com.example.customview.rvpg;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.customview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *
 *
 * @author husy
 * @date 2019年2月17日
 */
public class CardDetailFragment extends Fragment {

    @BindView(R.id.btn_normal)
    Button btnNormal;

    @BindView(R.id.btn_exp_1)
    Button btnExp1;

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
        View view = inflater.inflate(R.layout.fragment_card_detail, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.btnNormal.setOnClickListener((View v) -> System.out.println("card detail fragment."));
        this.btnExp1.setOnClickListener((View v) -> System.out.println("car detail fragment. btx exp1"));
    }
}
