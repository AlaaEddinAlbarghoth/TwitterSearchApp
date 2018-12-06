package org.alaaeddin.twittersearchapp.view.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import org.alaaeddin.twittersearchapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.search_menu, menu);
        MenuItem item = (MenuItem) menu.findItem(R.id.search_tweets);

        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.screen_container, ListFragment.newInstance(query))
                        .commit();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                return false;
            }
        });
//
        return super.onCreateOptionsMenu(menu);
    }
}
