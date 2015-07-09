package dylan.borders;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;


public class GameActivity extends ActionBarActivity {

    private static final String TAG = GameActivity.class.getSimpleName();

    private Countries countries;
    private Borders borders;
    private ImageView testImageView;
    private ImageView questImageView;
    private Button yesView;
    private Button noView;
    private boolean isBorder = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        String fileName;
        boolean bCorrect = false;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        countries = Countries.getInstance();
        borders = Borders.getInstance();
//EXAMPLE START
//        String uri = "@drawable/myresource.png";
//
//        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
//
//        imageview= (ImageView)findViewById(R.id.imageView);
//        Drawable res = getResources().getDrawable(imageResource);
//        imageView.setImageDrawable(res);
//EXAMPLE END

        // Test Image Display
        testImageView = (ImageView)findViewById(R.id.imageTestCountry);

        int testCountry = borders.getTestCountry();
        fileName = countries.getName(testCountry);
        fileName = fileName.toLowerCase();
        fileName = fileName.replaceAll("\\s\\-", "");

        String uri = "@drawable/" + fileName;
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);

        testImageView.setBackgroundColor(Color.GREEN);
        testImageView.setImageDrawable(res);


        // Question Image Display
        questImageView = (ImageView)findViewById(R.id.imageQuestCountry);

        int questCountry = countries.getQuestCountry(testCountry);
        fileName = countries.getName(questCountry);
        fileName = fileName.toLowerCase();
        fileName = fileName.replaceAll("\\s\\-", "");

        String uri2 = "@drawable/" + fileName;
        int imageResource2 = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res2 = getResources().getDrawable(imageResource2);

        questImageView.setBackgroundColor(Color.GREEN);
        questImageView.setImageDrawable(res2);

        noView = (Button)findViewById(R.id.borderNo);
        yesView = (Button)findViewById(R.id.borderYes);


         View.OnClickListener clickListener = new View.OnClickListener() {
            public void onClick(View v) {
                 if (v.equals(questImageView)) {
                    questImageView.setBackgroundColor(Color.RED);
                    int testCountry = borders.getTestCountry();
                   int questCountry = countries.getQuestCountry(testCountry);
                    String fileName = countries.getName(questCountry);
                    fileName = fileName.toLowerCase();
                    fileName = fileName.replaceAll("\\s\\-", "");

                    String uri2 = "@drawable/" + fileName;
                    int imageResource2 = getResources().getIdentifier(uri2, null, getPackageName());
                     Drawable res2 = getResources().getDrawable(imageResource2);
                    questImageView.setImageDrawable(res2);
                }
            }
        };




//        public void addListenerOnButton() {
//            25
//
//            26
//            //Select a specific button to bundle it with the action you want
//            27
//            button = (Button) findViewById(R.id.button1);
//            28
//
//            29
//            button.setOnClickListener(new OnClickListener() {
//                30
//
//                    31
//                @Override
//                32
//                public void onClick(View view) {
//                    33
//
//                    34
//                    Intent openBrowser =  new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.javacodegeeks.com"));
//                    35
//                    startActivity(openBrowser);
//                    36
//                }
//                37
//
//                    38
//            });
//            39
//
//            40
//        }
//        41


        questImageView.setOnClickListener(clickListener);
        testImageView.setOnClickListener(clickListener);




    }
/******* */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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


    public void setBorderAnswer(View view) {
        boolean isBorder = false;

        if (view == noView){
            isBorder = false;
            Log.d(TAG, "Border Answer is NO");

        }
        else if (view == yesView) {
            isBorder = true;
            Log.d(TAG, "Border Answer is YES");

        }

        if (borders.isBorderAnswerCorrect(isBorder)) {
            Log.d(TAG, "Right");
            questImageView.setBackgroundColor(Color.GREEN);
            testImageView.setBackgroundColor(Color.GREEN);
        }
        else {
            Log.d(TAG, "Wrong");
            questImageView.setBackgroundColor(Color.RED);
            testImageView.setBackgroundColor(Color.RED);
        }


    }
}
