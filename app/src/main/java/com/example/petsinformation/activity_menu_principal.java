package com.example.petsinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity_menu_principal extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sign_out_btn:
                Toast.makeText(this, "Register",Toast.LENGTH_SHORT).show();
                signOut();
                break;
            case R.id.reg_user_btn:
                Toast.makeText(this, "Login",Toast.LENGTH_SHORT).show();
                registerUser();
                break;
            case R.id.reg_mascota_btn:
                Toast.makeText(this, "Login",Toast.LENGTH_SHORT).show();
                registerPet();
                break;
        }
    }

    public void signOut()
    {
        // Do something in response to button click
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void registerUser()
    {
        // Do something in response to button click
        Intent intent = new Intent(this,menuopcions.class);
        startActivity(intent);

    }

    public void registerPet()
    {
        // Do something in response to button click
        Intent intent = new Intent(this,PetsCrudActivity.class);
        startActivity(intent);

    }
}
