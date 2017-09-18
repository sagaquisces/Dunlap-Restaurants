package com.epicodus.dunlaprestaurants;

/**
 * Created by Guest on 9/5/17.
 */

import android.support.test.rule.ActivityTestRule;
import android.view.View;

<<<<<<< HEAD:app/src/androidTest/java/com/epicodus/dunlaprestaurants/RestaurantsActivityInstrumentationTest.java
import com.epicodus.dunlaprestaurants.ui.RestaurantsActivity;
=======
import com.epicodus.dunlaprestaurants.ui.RestaurantListActivity;
>>>>>>> 30462435a5170b37157b2b9ed361d742730c4fa8:app/src/androidTest/java/com/epicodus/dunlaprestaurants/RestaurantListActivityInstrumentationTest.java

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.core.IsNot.not;

public class RestaurantListActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<RestaurantListActivity> activityTestRule =
            new ActivityTestRule<>(RestaurantListActivity.class);

    @Test
    public void listItemClickDisplaysToastWithCorrectRestaurant() {
        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
        String restaurantName = "Mi Mero Mole";
        onData(anything())
                .inAdapterView(withId(R.id.listView))
                .atPosition(0)
                .perform(click());
        onView(withText(restaurantName)).inRoot(withDecorView(not(activityDecorView)))
                .check(matches(withText(restaurantName)));
    }
}
