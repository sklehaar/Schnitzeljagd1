package de.paluno.schnitzeljagd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String starte_Jagd = "de.paluno.schnitzeljagd.Jagd";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
   public void starte_Schnitzeljagd(View view){
        Intent intent = new Intent(this, StartSchnitzeljagd.class);
       startActivity(intent);
    }
}
