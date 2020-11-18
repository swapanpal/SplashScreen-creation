package android.example.com.splashscreenanisulhaq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
    // variable for progreasbar
    private ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Remove the notification bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_ccreen);
        // Find the progressbar from xml file
        progressBar = findViewById(R.id.progressbar_id);
        // Use thread to hold some time
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // call the doSomeWork method() for progressbar update
                doSomeWork();
                // call the startApp method() to start MainActivity after finishing splashActivity.
                startApp();
            }
        });
        thread.start();
    }

    /**
     * method for progress the progressbar
     */
    private void doSomeWork() {
        for (progress = 20; progress <= 100; progress += 20) {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void startApp(){
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}