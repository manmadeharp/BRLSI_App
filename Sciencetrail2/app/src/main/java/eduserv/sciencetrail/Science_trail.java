package eduserv.sciencetrail;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;


public class Science_trail extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.


    private List<MapInformationObject> scienceTrial;
    private List<MapInformationObject> treeTrial;
    private List<MapInformationObject> adelardTrial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_trail);
        setUpMapIfNeeded();
        LatLng myCoordinates = new LatLng(51.3828167, -2.3627043);
        CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(myCoordinates, 16);
        mMap.animateCamera(yourLocation);


    }



    private void loadData(){

        //science
        scienceTrial = new ArrayList<>();


        scienceTrial.add(new MapInformationObject(1,"science", "Dr William Oliver", "name\\n\\ndate\\n\\nOliver became the leading physician in the city and a founder of the Mineral Water Hospital.\n "  +
                "His wrote a book on the water of Bath with an emphasis on drinking as well as bathing, and this helped increase the attract of the city to visitors.\n " +
                "His interest in diet and health led to the invention of the famous Bath Oliver biscuit.\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(2,"science", "W. H. Fox Talbot", "Fox Talbot discovered the processes that became the foundations of modern photography,\n " +
                "developing negatives from which an infinite number of prints could be produced,\n " +
                "a process which was patented in 1841 as the calotype Although most closely connected to his family home,\n " +
                "Lacock Abbey, he lived at No 4 between 1871–76.", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(3,"science", "Dr David Livingstone", "The famous explorer travelled in Africa for 30 years as a missionary doctor.\n " +
                "His meeting with Stanley in the depths of Tanzania gave rise to the popular quotation, “Dr. Livingstone, I presume?”\n " +
                "He came to Bath to talk about Africa at a meeting of the British Association for the Advancement of Science in 1864.\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(4,"science", "Dr Caleb Hillier Parry", "Parry became a wealthy and successful doctor in Bath experimenting on sheep for the purposes of research into human angina.\n " +
                "As a pioneering balloonist he probably carried out the first flight of an unmanned balloon in the West Country.", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(5,"science", "Dr William Falconer", "Falconer was a physician at the Royal Mineral Water Hospital (opened 1742).\n " +
                "He wanted to find out how effective the Bath mineral water treatment was on rheumatism, gout and spinal problems. He was the first 18th century doctor to carefully record how his patients had benefited,\n " +
                "although his study lacked a ‘control’ to check whether the spa water was really superior to ordinary water.\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(6,"science", "William Harbutt", "A Director of Bath Art School, Harbutt invented a flexible modelling clay for his students in 1897,\n " +
                "concocted from Fuller’s earth clay, oil and chalk.\n  " +
                "He used a garden roller to squeeze out the water from the clay. Plasticine was made in a factory in Bathampton until 1983.\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(7,"science", "Josiah Wedgwood", "Wedgwood opened a shop in Milsom Street to display his company’s celebrated ceramic wares,\n " +
                "while his wife took the waters in the city in 1772. " +
                "His experiments in chemistry led to major innovations in the manufacture of ceramics.\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(8,"science", "William Smith", "As an engineer for the Somerset Coal Canal. Smith came to realise that rocks were laid down in a consistent order through time,\n " +
                "regardless of where they were. He developed the theory of the order of geological strata,\n " +
                "and published a famous map of British geology in 1815.", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(9,"science", "Arthur Roebuck Rudge & William Friese-Greene", "These two men worked closely developing new ideas in cinematography.\n " +
                "Rudge was a scientific instrument maker and inventor who experimented with new types of Magic Lantern apparatus and collaborated with Friese Greene, a pioneer of the moving image,\n " +
                "who had a photographic shop in Bath.", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(10,"science", "John Harington", "John Harington, godson of Queen Elizabeth l, " +
                "is credited with inventing the first flushing toilet in 1594 although it never replaced the chamber pot. " +
                "A water tank emptied to flush an open pan and the contents were sent into a vault below. His design was not widely used and few people in Bath would have ever seen such a thing until the mass production of toilets in the 19th century.zn ", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(11,"science", "Adelard", "Born in Bath and world-famous in his day, Adelard was one of the great minds of the Middle Ages. He was a very early interpreter of scientific knowledge,zn " +
                "writing treatises on the abacus and the astrolabe.\n " +
                "He translated works on astronomy and mathematics\n " +
                "(particularly Euclid’s Elements) from Arabic into Latin and helped introduce Arabic numerals to the west.\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(12,"science", "Thomas Malthus", "Malthus was sent to Bath to be taught Latin and good behaviour by Richard Graves of Claverton Manor.\n " +
                "He married his Bath cousin, Harriet, and died in Bath in 1834.\n " +
                "Renowned as an economist,\n " +
                "his famous Essay on Population influenced Charles Darwin when he was developing his theory of evolution\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(13,"science", "Isaac Pitman", "Pitman invented Pitman’s shorthand in 1837 to allow him to write as fast as he could think. \n" +
                "He marketed the system very effectively and set up a publishing company to print his own training materials.\n " +
                "His advertising slogan was ‘Time saved is life prolonged’.\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(14,"science", "William & Caroline Herschel", "William Herschel came to Bath as a musician but his passion for astronomy led him to the discovery of Uranus in 1781,\n " +
                "from his back garden, using a telescope he designed.\n " +
                "George III appointed him as the ‘King’s Astronomer’ a year later. Caroline Herschel, his sister,\n " +
                "was the first woman scientist and astronomer to be elected to the Royal Society. With a small telescope she detected a number of unknown comets and nebulae.\n " +
                "The house they occupied in Bath is now the Herschel Museum of Astronomy.\n", 0.0f, 0.0f));
        scienceTrial.add(new MapInformationObject(15,"science", "Leonard Jenyns", "Jenyns was invited to be the naturalist aboard The Beagle but turned it down and his friend Charles Darwin went instead. \n" +
                "The observations Darwin made on this voyage led to his famous work ‘On the Origin of Species’ introducing his theory of evolution. \n" +
                "Jenyns wrote the report on the many new species of fish Darwin brought back.\n " +
                "There are letters at BRLSI to Jenyns from Darwin.\n", 0.0f, 0.0f));



    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    /**
     * 1 is Dr William Oliver
     *made biscuit
     */
    private void setUpMap() {
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.beaker))
                .position(new LatLng(51.3829507, -2.363863))
                .title("Dr William Oliver")
                .snippet("Oliver became the leading physician in the city and a founder of the Mineral Water Hospital. " +
                        "His wrote a book on the water of Bath with an emphasis on drinking as well as bathing, " +
                        "and this helped increase the attract of the city to visitors. " +
                        "His interest in diet and health led to the invention of the famous Bath Oliver biscuit."));
        /**
         * 2 Fox Talbot
         *made camera
         */
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.beaker))
                .position(new LatLng(51.3858165, -2.3645067))
                .title("Fox Talbot")
                .snippet("Fox Talbot discovered the processes that became the foundations of modern photography, " +
                        "developing negatives from which an infinite number of prints could be produced," +
                        " a process which was patented in 1841 as the calotype Although most closely connected to his family home, " +
                        "Lacock Abbey, he lived at No 4 between 1871–76."));
        /**
         * 3 Livingstone
         *
         */

        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.beaker))
                .position(new LatLng(51.3861914, -2.3642492))
                .title("Davao City")
                .snippet("Ateneo de Davao University"));
        /**
         *4 Parry
         */

        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.beaker))
                .position(new LatLng(51.3859905, -2.3635626))
        .title("Davao City")
                .snippet("Ateneo de Davao University"));
        /**
         *
         */



    }
}

