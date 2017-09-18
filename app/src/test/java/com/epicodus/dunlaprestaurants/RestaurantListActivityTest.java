package com.epicodus.dunlaprestaurants;

/**
 * Created by Guest on 9/5/17.
 */

import android.os.Build;
import android.widget.ListView;

<<<<<<< HEAD:app/src/test/java/com/epicodus/dunlaprestaurants/RestaurantsActivityTest.java
import com.epicodus.dunlaprestaurants.ui.RestaurantsActivity;
=======
import com.epicodus.dunlaprestaurants.ui.RestaurantListActivity;
>>>>>>> 30462435a5170b37157b2b9ed361d742730c4fa8:app/src/test/java/com/epicodus/dunlaprestaurants/RestaurantListActivityTest.java

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class RestaurantListActivityTest {
    private RestaurantListActivity activity;
    private ListView mRestaurantListView;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(RestaurantListActivity.class);
        mRestaurantListView = (ListView) activity.findViewById(R.id.listView);
    }

    @Test
    public void restaurantListViewPopulates() {
        assertNotNull(mRestaurantListView.getAdapter());
        assertEquals(mRestaurantListView.getAdapter().getCount(), 15);
    }
}
