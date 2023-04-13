package coatocl.exaatocl.bottomnavaigationtoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_nav = findViewById(R.id.bottom_nav);

        bottom_nav.setOnItemSelectedListener(item -> {

            switch (item.getItemId())
            {
                case R.id.home:
                    Toast.makeText(MainActivity.this,"HOME",Toast.LENGTH_SHORT).show();
                    break;

                case R.id.profile:
                    Toast.makeText(MainActivity.this,"PROFILE",Toast.LENGTH_SHORT).show();
                    break;

                case R.id.scan:
                    Toast.makeText(MainActivity.this,"SCAN",Toast.LENGTH_SHORT).show();
                    break;

                case R.id.office:
                    Toast.makeText(MainActivity.this,"MY OFFICE",Toast.LENGTH_SHORT).show();
                    break;

                case R.id.setting:
                    Toast.makeText(MainActivity.this,"SETTING",Toast.LENGTH_SHORT).show();
                    break;

                default:
            }

            return true;
        });

    }
}
