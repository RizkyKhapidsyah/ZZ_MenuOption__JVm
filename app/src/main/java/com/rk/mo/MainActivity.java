package com.rk.mo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView TV_1_IDJAVA;
    RelativeLayout RLout_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);
        RLout_1_IDJAVA = findViewById(R.id.RLout_1_IDXML);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu1:
                TV_1_IDJAVA.setText("Profile");
                RLout_1_IDJAVA.setBackgroundColor(Color.CYAN);
                Toast.makeText(getApplicationContext(),"Kamu Memilih Menu 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                TV_1_IDJAVA.setText("Settings");
                RLout_1_IDJAVA.setBackgroundColor(Color.MAGENTA);
                Toast.makeText(getApplicationContext(),"Kamu Memilih Menu 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
