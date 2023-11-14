package com.example.lab4_ph23924;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new LoginFragment());
    }
    private void loadFragment(Fragment fragment) {
        // Tạo một FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Bắt đầu một giao dịch Fragment
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // Thay thế Fragment hiện tại bằng Fragment mới
        transaction.replace(R.id.fragment_frame, fragment);

        // Đưa giao dịch vào ngăn xếp và thực hiện
        transaction.addToBackStack(null);
        transaction.commit();
    }
}