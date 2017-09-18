package com.epicodus.dunlaprestaurants;

import android.os.Build;
import android.widget.TextView;
import android.content.Intent;

import com.epicodus.dunlaprestaurants.ui.MainActivity;
<<<<<<< HEAD
import com.epicodus.dunlaprestaurants.ui.RestaurantsActivity;
=======
import com.epicodus.dunlaprestaurants.ui.RestaurantListActivity;
>>>>>>> 30462435a5170b37157b2b9ed361d742730c4fa8

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;


import static junit.framework.Assert.assertTrue;

/**
 * Created by Guest on 9/5/17.
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent() {
        TextView appNameTextView = (TextView) activity.findViewById(R.id.appNameTextView);
        assertTrue("Dunlap Restaurants".equals(appNameTextView.getText().toString()));
    }

    @Test
    public void secondActivityStarted() {
        activity.findViewById(R.id.findRestaurantsButton).performClick();
        Intent expectedIntent = new Intent(activity, RestaurantListActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
}
