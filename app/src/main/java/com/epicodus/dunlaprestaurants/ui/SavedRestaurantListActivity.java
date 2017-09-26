package com.epicodus.dunlaprestaurants.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.epicodus.dunlaprestaurants.Constants;
import com.epicodus.dunlaprestaurants.R;
import com.epicodus.dunlaprestaurants.adapters.FirebaseRestaurantListAdapter;
import com.epicodus.dunlaprestaurants.adapters.FirebaseRestaurantViewHolder;
import com.epicodus.dunlaprestaurants.models.Restaurant;
import com.epicodus.dunlaprestaurants.utils.OnStartDragListener;
import com.epicodus.dunlaprestaurants.utils.SimpleItemTouchHelperCallback;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SavedRestaurantListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_restaurant_list);
    }

}
