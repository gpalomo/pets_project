package com.example.petsinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PetsCrudActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets_crud);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_to_list_btn:
                back_to_start();
                break;

        }
    }

    public void back_to_start()
    {
        // Do something in response to button click
        Intent intent = new Intent(this,activity_menu_principal.class);
        startActivity(intent);

    }
}
