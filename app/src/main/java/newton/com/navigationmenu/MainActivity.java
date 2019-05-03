package newton.com.navigationmenu;

import android.content.Intent;
import android.media.audiofx.Equalizer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
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
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title =item.getTitle().toString();
        if (title.equalsIgnoreCase("logout")){
            Toast.makeText(this, "Logging out", Toast.LENGTH_SHORT).show();
        }
        else if(title.equalsIgnoreCase("help")){
            Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
        }
        else if(title.equalsIgnoreCase("profile")){
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void about(View view) {
        Intent x = new Intent(this, AboutActivity.class);
        startActivity(x);
    }

    public void services(View view) {
        Intent x = new Intent(this, ProductsActivity.class);
        startActivity(x);
    }

    public void products(View view) {
        Intent x = new Intent(this, ServicesActivity.class);
        startActivity(x);
    }

    public void settings(View view) {
        Intent x = new Intent(this, SettingsActivity.class);
        startActivity(x);
    }
}
