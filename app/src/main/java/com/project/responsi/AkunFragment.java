package com.project.responsi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.responsi.databinding.FragmentAkunBinding;
import com.project.responsi.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class AkunFragment extends Fragment {

    FragmentAkunBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAkunBinding.inflate(getLayoutInflater());

        binding.llAkun.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), ChangeProfileActivity.class);
            startActivity(intent);
        });

        return binding.getRoot();
    }
}