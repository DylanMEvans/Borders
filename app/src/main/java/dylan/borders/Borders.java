package dylan.borders;
//Dylan Evans
//2015-05-07
//Borders

import android.util.Log;




public class Borders  {

    private static Borders bordersObj;
    private Countries countries;

    private static final String TAG = Borders.class.getSimpleName();
/*
    private static int idx;
    private static String name;
    private static Drawable imageSmall;
    private static Drawable imageLarge;
    private static boolean[][] bordersByCountry;
    private static ArrayList<Countries> questCountries;//subList of countries

    private static int[][] loc;
*/

    private int testContinent; //test continent
    private int testCountry; //test country
    private int questCountry;  //question country
     //public BorderCountries borderCountries;


    //***********************************************************************

    private Borders() {
        testContinent = -1;
        testCountry = -1;
        questCountry = -1;

        String name;

        Log.d(TAG, "CreateBorders");

        countries = Countries.getInstance();

       // borderCountries = new BorderCountries();  //move to Countries??


      /*       name = countries.getName(1);
        Log.d(TAG, "country 1 " + name);
         name = countries.getName(3);
        Log.d(TAG, "country 3 " + name);
         name = countries.getName(5);
        Log.d(TAG, "country 5 " + name);
*/
    }

    public static Borders getInstance(){
        if(bordersObj == null){
            bordersObj = new Borders();
        }
        return bordersObj;
    }

    public int getTestContinent() {return(testContinent);}
    public int getTestCountry() {return(testCountry);}
    public void setTestContinent(int idx) {testContinent = idx;}
    public void setTestCountry(int idx) {testCountry = idx;}

/*
    BordersPanel p = new BordersPanel();


    private static TitleFrame card1;
    private static SelectionFrame card2;
    private static GamePanel card3;
    private static DragPanel card4;
    private static JPanel card5;


    public void paintComponent(Graphics g)
    // paintcomponent
    {
        g.setColor(Color.RED);
        super.paintComponent(g);
        int[] heartTrix = new int[3];
        int[] heartTriy = new int[3];

        for (int w = 0; w < life; w++) {

            w *= 29;
            g.fillArc(w, 2, 10, 12, 0, 180);
            g.fillArc(w + 10, 2, 10, 12, 0, 180);
            heartTrix[0] = w;
            heartTriy[0] = 7;
            heartTrix[1] = w + 20;
            heartTriy[1] = 7;
            heartTrix[2] = w + 10;
            heartTriy[2] = 17;
            g.fillPolygon(heartTrix, heartTriy, 3);
            w /= 29;

        }
        // use loop (counter is variable life) to draw hearts
        // use coordinates of heart that was designed on graph paper
    }
}

final static MAX_LIVES=7;
        life=MAX_LIVES;

*/

    public boolean isBorderAnswerCorrect(boolean isBorderAnswer)
    {
        boolean isCorrect = false;
        boolean isBorder = false;

        isBorder = countries.isBorderOfCountry(testCountry, questCountry);
        // if resp is equal to index for setCountry and qCountry's
        // border, set c to green, done is true


        Log.d(TAG, isBorder + " " + isBorderAnswer);
        if (isBorderAnswer == isBorder) {
              isCorrect = true;
//            if (scw++ == numBorder(testCountry) {
//                "win"
        }
        else {
              isCorrect = false;
//            life--;
//            if(life==0) {
//                life=MAX_LIVES;
//            }
//                "start game over -lose"
         }
//         // cancel timer
         return (isCorrect);
     }


//
//    @Override
//    public void onListItemClick(ListView listView, View v, int position, long id) {
//        String item = (String) listView.getItemAtPosition(position);
//
//        // Show a toast if the user clicks on an item
//        Toast.makeText(getActivity(), "Item Clicked: " + item, Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onClick(final View view) {
//        // We need to post a Runnable to show the popup to make sure that the PopupMenu is
//        // correctly positioned. The reason being that the view may change position before the
//        // PopupMenu is shown.
//        view.post(new Runnable() {
//            @Override
//            public void run() {
//                //showPopupMenu(view);
//            }
//        });
//    }

//    // BEGIN_INCLUDE(show_popup)
//    private void showPopupMenu(View view) {
//        final PopupAdapter adapter = (PopupAdapter) getListAdapter();
//
//        // Retrieve the clicked item from view's tag
//        final String item = (String) view.getTag();
//
//        // Create a PopupMenu, giving it the clicked view for an anchor
//        PopupMenu popup = new PopupMenu(getActivity(), view);
//
//        // Inflate our menu resource into the PopupMenu's Menu
//        popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());
//
//        // Set a listener so we are notified if a menu item is clicked
//        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
//                switch (menuItem.getItemId()) {
//                    case R.id.menu_remove:
//                        // Remove the item from the adapter
//                        adapter.remove(item);
//                        return true;
//                }
//                return false;
//            }
//        });
//
//        // Finally show the PopupMenu
//        popup.show();
//    }
        // END_INCLUDE(show_popup)

//    /**
//     * A simple array adapter that creates a list of cheeses.
//     */
//    class PopupAdapter extends ArrayAdapter<String> {
//
//        PopupAdapter(ArrayList<String> items) {
//            super(getActivity(), R.layout.list_item, android.R.id.text1, items);
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup container) {
//            // Let ArrayAdapter inflate the layout and set the text
//            View view = super.getView(position, convertView, container);
//
//            // BEGIN_INCLUDE(button_popup)
//            // Retrieve the popup button from the inflated view
//            View popupButton = view.findViewById(R.id.button_popup);
//
//            // Set the item as the button's tag so it can be retrieved later
//            popupButton.setTag(getItem(position));
//
//            // Set the fragment instance as the OnClickListener
//            popupButton.setOnClickListener(CountrySelection.this);
//            // END_INCLUDE(button_popup)
//
//            // Finally return the view to be displayed
//            return view;
//        }
//    }
//
//
//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        // We want to allow modifications to the list so copy the dummy data array into an ArrayList
//        ArrayList<String> items = new ArrayList<String>();
//        for (int i = 0, z = Cheeses.CHEESES.length ; i < z ; i++) {
//            items.add(Cheeses.CHEESES[i]);
//        }
//
//        // Set the ListAdapter
//        setListAdapter(new PopupAdapter(items));
//    }


        }
