package android.example.com.splashscreenanisulhaq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Create and splash activity
 * edit theme style to No_Progressbar also remove titlebar and notificationbar
 * Use thread to progress the progressbar after 1 second
 * Change SplashScreenActivity to luncherActivity in Manifest.xml file
 * and lastly, create and call a method to to MainActivity after finishing splashScreen also
 *  finish this activity(splashActivity)
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}