package dylan.borders;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


public class CountrySelectActivity extends ActionBarActivity {


    private Countries countries;
    private Borders borders;
    public CountrySelectActivity countrySelectActivity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_select);

        borders = Borders.getInstance();
        countries = Countries.getInstance();
        int testContinent = borders.getTestContinent();
        List<String> names = countries.getCountryNamesInContinent(testContinent);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,names )  ;
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setBackgroundColor(Color.YELLOW);
        listView.setAdapter(adapter);


                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        borders.setTestCountry(position + countries.getFirstContinentCountry(borders.getTestContinent()));
                        Intent intent =   new Intent(countrySelectActivity, GameActivity.class);
//                //If you wanna send any data to nextActicity.class you can use
//                //intent.putExtra("testContinent", position); //PASS BETWEEN ACTIVITIES - SEND
//                Borders.getInstance().setCountry(position);
                        startActivity(intent);

                //Bundle extras = getIntent().getExtras(); //PASS BETWEEN ACTIVITIES-RX
                //int testContinent = extras.getInt("testContinent"); //PASS BETWEEN ACTIVITIES-RX
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_country_select, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
