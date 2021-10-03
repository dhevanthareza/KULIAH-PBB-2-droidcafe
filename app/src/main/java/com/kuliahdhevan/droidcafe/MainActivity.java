package com.kuliahdhevan.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Context context = getApplicationContext();
        switch (item.getItemId()) {
            case R.id.favorites:

                CharSequence text = "You selected favorite";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();
                return true;
            case R.id.contact:
                CharSequence ctext = "You selected contact";
                int cduration = Toast.LENGTH_SHORT;
                Toast.makeText(context, ctext, cduration).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openMap(View view) {
        Uri gmmIntentUri = Uri.parse("geo:-6.982866,110.4069027");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
}