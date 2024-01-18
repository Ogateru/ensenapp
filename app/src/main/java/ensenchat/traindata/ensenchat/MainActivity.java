// MainActivity.java
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_Allchat:
                    // チャットタブが選択されたときの処理
                    Toast.makeText(MainActivity.this, "Chat Tab Selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_articles:
                    // 記事タブが選択されたときの処理
                    Toast.makeText(MainActivity.this, "Articles Tab Selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_settings:
                    // 設定タブが選択されたときの処理
                    Toast.makeText(MainActivity.this, "Settings Tab Selected", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        });
    }
}
