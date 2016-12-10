package edu.mnstate.cw3967me.exmenus;
/*
show up menu
Mariko Nguchi
10/10/2016
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_options_menu,menu);
        return true;
    }
    /*public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(MainActivity.this,
                "User Clicked one of the menu items",
                Toast.LENGTH_SHORT).show();
        return true;
    }*/
    /*public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.about:
                Toast.makeText(MainActivity.this,
                        "Selected ABOUT menu item",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Toast.makeText(MainActivity.this,
                        "Selected HELP menu item",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about: //if ABOUT was presssed
                startActivity(new Intent(this, About.class));
                return true;
            case R.id.help: //if HELP was pressed
                //toast message here unless optionally, you want to develop a second activity for this
                Toast.makeText(MainActivity.this,
                        "Selected HELP menu item",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
