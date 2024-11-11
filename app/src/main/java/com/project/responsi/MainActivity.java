package com.project.responsi;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.project.responsi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        HomeFragment homeFragment = new HomeFragment();
        AkunFragment akunFragment = new AkunFragment();

        replaceFragment(homeFragment);

        binding.navigation.setOnNavigationItemSelectedListener(
                item -> {
                    if (item.getItemId() == R.id.menu_setting) {
                        replaceFragment(akunFragment);
                    } else if (item.getItemId() == R.id.menu_logout) {
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    } else {
                        replaceFragment(homeFragment);
                    }
                    return true;
                });

    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}