package com.androidsample.menu_helpabouticon;

import android.os.Bundle;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import  com.androidsample.menu_helpabouticon.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater M = getMenuInflater();
        M.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            Toast.makeText(getApplicationContext(), "clicked on About", Toast.LENGTH_LONG).show();
            return true;
          }
        else if (id == R.id.help) {
            Toast.makeText(getApplicationContext(), "clicked on Help", Toast.LENGTH_LONG).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
