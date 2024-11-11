package com.project.responsi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.project.responsi.databinding.ActivityChangeProfileBinding;
import com.project.responsi.databinding.ActivityRegisterBinding;

public class ChangeProfileActivity extends AppCompatActivity {

    ActivityChangeProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChangeProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnChange.setOnClickListener(view -> {
            finish();
        });

    }
}