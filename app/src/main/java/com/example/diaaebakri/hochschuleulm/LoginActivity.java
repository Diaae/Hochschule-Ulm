package com.example.diaaebakri.hochschuleulm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText login, pass;
    Button login_b;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        /* ----------------------------------------------------- */

        sp = getSharedPreferences("hsulm", MODE_PRIVATE);
        if(!sp.getBoolean("logged", false)){
            login = (EditText) findViewById(R.id.login_text);
            pass = (EditText) findViewById(R.id.login_password);
            login_b = (Button) findViewById(R.id.login_button);
            //Login Function
            login_b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (login.getText().toString().equals("Student") && pass.getText().toString().equals("Informatik")){
                        Toast.makeText(getApplicationContext(),"Logged in",Toast.LENGTH_SHORT).show();
                        Intent mainA = new Intent(getApplicationContext(),home_activity.class);
                        sp.edit().putBoolean("logged", true).apply();
                        startActivity(mainA);
                        finish();
                    }else {
                        Toast.makeText(getApplicationContext(),"Wrong credentials.",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else{
            Intent intent = new Intent(this, home_activity.class);
            startActivity(intent);
            finish();
        }


    }
}

