package in.silive.pellucidwriter.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import in.silive.pellucidwriter.Fragments.DialogFileDir;
import in.silive.pellucidwriter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DialogFileDir dialogFileDir = new DialogFileDir();
        dialogFileDir.show(getSupportFragmentManager(), "File Dialog");
        dialogFileDir.setListener(new DialogFileDir.Listener() {
            @Override
            public void onDirSelected(String addr) {
                Log.d("Bytepad", "Directory added "+ addr);
            }
        });
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                SharedPreferences getPrefs = PreferenceManager
                        .getDefaultSharedPreferences(getBaseContext());
                boolean isFirstStart = getPrefs.getBoolean("firstStart", true);
                if (isFirstStart) {
                    Intent i = new Intent(MainActivity.this, PWIntroActivity.class);
                    startActivity(i);
                    SharedPreferences.Editor e = getPrefs.edit();
                    e.putBoolean("firstStart", false);
                    e.apply();
                }
            }
        });
        // Start the thread
        t.start();
    }
}
