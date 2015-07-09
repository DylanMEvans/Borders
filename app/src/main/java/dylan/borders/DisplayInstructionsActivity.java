package dylan.borders;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class DisplayInstructionsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_instructions);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_instructions, menu);
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


/*
        setBackground(Color.YELLOW);// will paint all the words in the correct place
super.paintComponent(g);
        g.setFont(new Font("Times",Font.BOLD,50));//in the first box set font to plain and font size to 400 and write BORDERS;
        g.drawString("Borders",200,50);
        g.setFont(new Font("Times",Font.PLAIN,20));
        //g.drawString("Use the Slider to adjust difficulty,",690,600);
        //g.drawString("and select the checkbox's for your visual settings",690,610)
        g.drawString("Welcome to Borders, a game about countries and their neighbors",40,80);
        g.drawString("Instructions:",230,120);
        g.setFont(new Font("Times",Font.PLAIN,15));
        g.drawString("You will be given a country at the top. Below that country you will given another one.",5,140);
        g.drawString("To say the lower country does border the upper country, click the left mouse button.",5,160);
        g.drawString("To say the lower country does NOT border the upper country, click the right mouse button.",5,180);
        g.drawString("If you get an answer wrong, you will lose a life.",5,200);
        g.drawString("You keep playing until you lose all your lives.",5,220);
        g.setFont(new Font("Times",Font.PLAIN,20));
        g.drawString("Good Luck",240,260);
*/