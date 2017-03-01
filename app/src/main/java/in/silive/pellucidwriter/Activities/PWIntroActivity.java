package in.silive.pellucidwriter.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;

import in.silive.pellucidwriter.Fragments.PWIntroScreenOne;
import in.silive.pellucidwriter.Fragments.PWIntroScreenThree;
import in.silive.pellucidwriter.Fragments.PWIntroScreenTwo;

public class PWIntroActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new PWIntroScreenOne());
        addSlide(new PWIntroScreenTwo());
        addSlide(new PWIntroScreenThree());
        //showSkipButton(true);
        setProgressButtonEnabled(true);
        setVibrate(true);

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        // Do something when users tap on Done button.
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
