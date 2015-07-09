package dylan.borders;

import android.graphics.drawable.Drawable;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;


/**
 * Created by April on 6/16/15.
 */

public class Countries
{

    private static final String TAG = Countries.class.getSimpleName();

    private static String [] countryNamesArray =
        {
            "Afghanistan",
            "Armenia",
            "Azerbaijan",
            "Bangladesh",
            "Bhutan",
            "Brunei",
            "Cambodia",
            "China",
            "Georgia",
            "India",
            "Indonesia",
            "Iran",
            "Iraq",
            "Israel",
            "Jordan",
            "Kazakhstan",
            "Kuwait",
            "Kyrgyzstan",
            "Laos",
            "Lebanon",
            "Malaysia",
            "Mongolia",
            "Myanmar",
            "Nepal",
            "North Korea",
            "Oman",
            "Pakistan",
            "Papua New Guinea",
            "Qatar",
            "Saudi Arabia",
            "South Korea",
            "Syria",
            "Tajikistan",
            "Thailand",
            "Timor-Leste",
            "Turkey",
            "Turkmenistan",
            "United Arab Emirates",
            "Uzbekistan",
            "Vietnam",
            "Yemen",
            "Albania",
            "Andorra",
            "Austria",
            "Belarus",
            "Belgium",
            "Bosnia and Herzegovina",
            "Bulgaria",
            "Croatia",
            "Czech Republic",
            "Denmark",
            "Estonia",
            "Finland",
            "France",
            "Germany",
            "Greece",
            "Hungary",
            "Ireland",
            "Italy",
            "Latvia",
            "Liechtenstein",
            "Lithuania",
            "Luxembourg",
            "Macedonia",
            "Moldova",
            "Monaco",
            "Montenegro",
            "Netherlands",
            "Norway",
            "Poland",
            "Portugal",
            "Romania",
            "Russia",
            "San Marino",
            "Serbia",
            "Slovakia",
            "Slovenia",
            "Spain",
            "Sweden",
            "Switzerland",
            "Ukraine",
            "United Kingdom",
            "Vatican City",
            "Argentina",
            "Belize",
            "Bolivia",
            "Brazil",
            "Canada",
            "Chile",
            "Colombia",
            "Costa Rica",
            "Dominican Republic",
            "Ecuador",
            "El Salvador",
            "Guatemala",
            "Guyana",
            "Haiti",
            "Honduras",
            "Mexico",
            "Nicaragua",
            "Panama",
            "Paraguay",
            "Peru",
            "Suriname",
            "United States",
            "Uruguay",
            "Venezuela",
            "Algeria",
            "Angola",
            "Benin",
            "Botswana",
            "Burkina Faso",
            "Burundi",
            "Cameroon",
            "Central African Republic",
            "Chad",
            "Congo, Republic of",
            "Democratic Republic of the Congo",
            "Djibouti",
            "Egypt",
            "Equatorial Guinea",
            "Eritrea",
            "Ethiopia",
            "Gabon",
            "Gambia",
            "Ghana",
            "Guinea",
            "Guinea-Bissau",
            "Ivory Coast",
            "Kenya",
            "Lesotho",
            "Liberia",
            "Libya",
            "Malawi",
            "Mali",
            "Mauritania",
            "Morocoo",
            "Mozambique",
            "Namibia",
            "Niger",
            "Nigeria",
            "Rwanda",
            "Senegal",
            "Sierra-Leone",
            "Somalia",
            "South Africa",
            "South Sudan",
            "Sudan",
            "Swaziland",
            "Tanzania",
            "Togo",
            "Tunisia",
            "Uganda",
            "Zambia",
            "Zimbabwe"
        };


    private static  String [] continentNamesArray =
        {
            "Asia",
            "Europe",
            "Americas",
            "Africa"
        };


    final int CONTINENT_ASIA = 0;
    final int CONTINENT_EUROPE = 1;
    final int CONTINENT_AMERICAS = 2;
    final int CONTINENT_AFRICA = 3;





    //Countries on border of Europe and Asia
    final int AZERBAIJAN    = 2;
    final int CHINA         = 7;
    final int GEORGIA       = 8;
    final int KAZAKHSTAN    = 15;
    final int MONOGOLIA     = 21;
    final int NORTH_KOREA   = 24;
    final int TURKEY        = 35;
    final int BULGARIA      = 47;
    final int GREECE        = 55;
    final int RUSSIA        = 72;

    //Countries on border of Africa and Asia
    final int ISRAEL        = 13;
    final int EGYPT         = 119;

    // indexs 0 - 40 Asia
    // indexs 41 - 82 Europe
    // indexs 83 - 106 Americas
    // indexs 107 - 154 Africastatic final int
    static final int FIRST_ASIA_COUNTRY = 0;
    static final int NUM_ASIA_COUNTRIES = 41;
    static final int LAST_ASIA_COUNTRY = 40;

    static final int FIRST_EUROPE_COUNTRY = 41;
    static final int NUM_EUROPE_COUNTRIES = 42;
    static final int LAST_EUROPE_COUNTRY = 82;

    static final int FIRST_AMERICA_COUNTRY = 83;
    static final int NUM_AMERICA_COUNTRIES = 24;
    static final int LAST_AMERICA_COUNTRY = 106;

    static final int FIRST_AFRICA_COUNTRY = 107;
    static final int NUM_AFRICA_COUNTRIES = 48;
    static final int LAST_AFRICA_COUNTRY = 154;

    static final int NUM_COUNTRIES = 155;

    private static Countries countriesObj;
    private BorderCountries borderCountries;

    private static  ArrayList<String> countryNames;
    private static  ArrayList<String> continentNames;


    //***********************************************************************





    public Countries()
    {

        Log.d(TAG, "Start Create");

        borderCountries = BorderCountries.getInstance();


        //    Integer[] integers = ArrayUtils.toObject(factors);
        //    ArrayList<Integer> f = new ArrayList<Integer>(Arrays.asList(integers));
        countryNames = new ArrayList<String>(Arrays.asList(countryNamesArray));
        continentNames = new ArrayList<String>(Arrays.asList(continentNamesArray));

        Log.d(TAG, "End Create");

    }

    public static Countries getInstance(){
        if(countriesObj == null){
            countriesObj = new Countries();
        }
        return countriesObj;
    }
    public String getName(int idxCountry) {
        if (idxCountry < 0 || idxCountry >= NUM_COUNTRIES)
            idxCountry = 0;
        return countryNames.get(idxCountry);}

    public Drawable getSmallImage(int idxCountry) {
        if (idxCountry < 0 || idxCountry >= NUM_COUNTRIES)
            idxCountry = 0;
        return (Drawable.createFromPath("smallMaps/" + getName(idxCountry) + "png"));
    }

    public Drawable getLargeImage(int idxCountry) {
        if (idxCountry < 0 || idxCountry >= NUM_COUNTRIES)
            idxCountry = 0;
        return (Drawable.createFromPath("largeMaps/" + getName(idxCountry) + "png"));
    }

    public ArrayList<String> getContinentNames() { return (continentNames);}

    public String getContinentNames(int idxContinent) {return continentNames.get(idxContinent);}

    public static int getFirstAfricaCountry() {
        return FIRST_AFRICA_COUNTRY;
    }

    public static int getFirstAmericaCountry() {
        return FIRST_AMERICA_COUNTRY;
    }

    public static int getFirstAsiaCountry() {
        return FIRST_ASIA_COUNTRY;
    }

    public static int getFirstEuropeCountry() {
        return FIRST_EUROPE_COUNTRY;
    }

    public int getFirstContinentCountry(int idxContinent)
    {
        int idx = -1;
        switch(idxContinent)
        {
            case CONTINENT_ASIA:
                idx = FIRST_ASIA_COUNTRY;
                break;
            case CONTINENT_AFRICA:
                idx = FIRST_AFRICA_COUNTRY;
                break;
            case CONTINENT_AMERICAS:
                idx =  FIRST_AMERICA_COUNTRY;
                break;
            case CONTINENT_EUROPE:
                idx =  FIRST_EUROPE_COUNTRY;
                break;
            default:
                Log.d(TAG, "ERROR: [[Could not find the continent]]");
        }
        return idx;

    }

    public List<String> getCountryNamesInContinent(int idxContinent) {
        List<String> countryNamesForThisCountry;

        if(idxContinent == CONTINENT_ASIA) {
            countryNamesForThisCountry = countryNames.subList(FIRST_ASIA_COUNTRY, FIRST_EUROPE_COUNTRY);
            Log.d(getClass().getName(), "ASIA Names");
            }
        else if(idxContinent == CONTINENT_EUROPE) {
            countryNamesForThisCountry = countryNames.subList(FIRST_EUROPE_COUNTRY, FIRST_AMERICA_COUNTRY);
            Log.d(getClass().getName(), "EUROPE Names");
        }
        else if(idxContinent == CONTINENT_AMERICAS) {
            countryNamesForThisCountry = countryNames.subList(FIRST_AMERICA_COUNTRY, FIRST_AFRICA_COUNTRY);
            Log.d(getClass().getName(), "AMERICAS Names");
        }
        else if(idxContinent == CONTINENT_AFRICA) {
            countryNamesForThisCountry = countryNames.subList(FIRST_AFRICA_COUNTRY, NUM_COUNTRIES);
            Log.d(getClass().getName(), "AFRICA Names");
        }
        else {
            countryNamesForThisCountry = (List<String>) countryNames;
        }
        return (countryNamesForThisCountry);
    }


     public int getQuestCountry(int setCountry) {

        int questCountry = setCountry;

        while (questCountry == setCountry)
        {

            if (setCountry ==(1))
                questCountry = (2);

            //Limit countries available to be questCountry by continent
            else if(setCountry == AZERBAIJAN
                    || setCountry == CHINA
                    || setCountry == GEORGIA
                    || setCountry == KAZAKHSTAN
                    || setCountry == MONOGOLIA
                    || setCountry == NORTH_KOREA
                    || setCountry == TURKEY
                    || setCountry == BULGARIA
                    || setCountry == GREECE
                    || setCountry == RUSSIA)
                questCountry = (int)(Math.random()*(NUM_ASIA_COUNTRIES + NUM_EUROPE_COUNTRIES));
                //Europe or Asia
            else if(setCountry == ISRAEL
                    || setCountry == EGYPT)
                questCountry = (int)(Math.random()*(NUM_ASIA_COUNTRIES + NUM_AFRICA_COUNTRIES)
                        + FIRST_AFRICA_COUNTRY)%NUM_COUNTRIES;
                //Asia or Africa
            else if(setCountry <= LAST_ASIA_COUNTRY)
                questCountry = (int)(Math.random()*NUM_ASIA_COUNTRIES);			     //Asia
            else if(setCountry <= LAST_EUROPE_COUNTRY)
                questCountry = (int)(Math.random()*NUM_EUROPE_COUNTRIES
                        + FIRST_EUROPE_COUNTRY); //Europe
            else if(setCountry <= LAST_AMERICA_COUNTRY)
                questCountry = (int)(Math.random()*NUM_AMERICA_COUNTRIES
                        + FIRST_AMERICA_COUNTRY);//Americas
            else if(setCountry <= LAST_AFRICA_COUNTRY)
                questCountry = (int)(Math.random()*NUM_AFRICA_COUNTRIES
                        + FIRST_AFRICA_COUNTRY);  //Africa
        }
         Log.d(TAG, "test: " + setCountry +  " quest: " + questCountry);
        return (questCountry);
    }

    public boolean isBorderOfCountry(int idxCountry, int idxQuestCountry)
    {
        return (borderCountries.isBorderOfCountry(idxCountry, idxQuestCountry));
    }




}