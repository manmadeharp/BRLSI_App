package eduserv.sciencetrail;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class Science_trail extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.


    public static final String EXTRA_TRIAL_NAME = "EXTRA_TRIAL_NAME";

    private List<MapInformationObject> scienceTrial;
    private List<MapInformationObject> treeTrial;
    private List<MapInformationObject> adelardTrial;

    private String mapType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_trail);

        loadData();

        mapType = getIntent().getStringExtra(EXTRA_TRIAL_NAME);

        setUpMapIfNeeded();
//        LatLng myCoordinates = new LatLng(51.3828167, -2.3627043);
//        CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(myCoordinates, 16);
//        mMap.animateCamera(yourLocation);

        mMap.setOnInfoWindowClickListener(getInfoWindowClickListener());

    }


    //below oncreate
    public GoogleMap.OnInfoWindowClickListener getInfoWindowClickListener()
    {
        return new GoogleMap.OnInfoWindowClickListener()
        {
            @Override
            public void onInfoWindowClick(Marker marker)
            {
                Toast.makeText(getApplicationContext(), "Clicked a window with title..." + marker.getTitle(),
                        Toast.LENGTH_SHORT).show();

                MapInformationObject clickedItem = null;


                //todo work out which trial your in

                //find the item in the array

                if (mapType.equals("TREE")){

                    for (MapInformationObject m : treeTrial) {
                        if (marker.getTitle().equals(m.getTitle())) {
                            clickedItem = m;

                        }
                    }
                }



                Intent i = new Intent(Science_trail.this, InformationActivity.class);

                //todo: pass the MapInformaionObject
                startActivity(i);


            }
        };
    }


    private void loadData(){

        //Science Trail
        scienceTrial = new ArrayList<>();


        scienceTrial.add(new MapInformationObject(1,"science", "Dr William Oliver", "name\\n\\ndate\\n\\nOliver became the leading physician in the city and a founder of the Mineral Water Hospital.\n "  +
                "His wrote a book on the water of Bath with an emphasis on drinking as well as bathing, and this helped increase the attract of the city to visitors.\n " +
                "His interest in diet and health led to the invention of the famous Bath Oliver biscuit.\n", 51.3829507f, -2.363863f));
        scienceTrial.add(new MapInformationObject(2,"science", "W. H. Fox Talbot", "Fox Talbot discovered the processes that became the foundations of modern photography,\n " +
                "developing negatives from which an infinite number of prints could be produced,\n " +
                "a process which was patented in 1841 as the calotype Although most closely connected to his family home,\n " +
                "Lacock Abbey, he lived at No 4 between 1871-76.", 51.3858165f, -2.3645067f));
        scienceTrial.add(new MapInformationObject(3,"science", "Dr David Livingstone", "The famous explorer travelled in Africa for 30 years as a missionary doctor.\n " +
                "His meeting with Stanley in the depths of Tanzania gave rise to the popular quotation, \"Dr. Livingstone, I presume?\"\n " +
                "He came to Bath to talk about Africa at a meeting of the British Association for the Advancement of Science in 1864.\n", 51.3861914f, -2.3642492f));
        scienceTrial.add(new MapInformationObject(4,"science", "Dr Caleb Hillier Parry", "Parry became a wealthy and successful doctor in Bath experimenting on sheep for the purposes of research into human angina.\n " +
                "As a pioneering balloonist he probably carried out the first flight of an unmanned balloon in the West Country.", 51.3859905f, -2.3635626f));
        scienceTrial.add(new MapInformationObject(5,"science", "Dr William Falconer", "Falconer was a physician at the Royal Mineral Water Hospital (opened 1742).\n " +
                "He wanted to find out how effective the Bath mineral water treatment was on rheumatism, gout and spinal problems. He was the first 18th century doctor to carefully record how his patients had benefited,\n " +
                "although his study lacked a 'control' to check whether the spa water was really superior to ordinary water.\n", 51.3856658f, -2.3633078f));
        scienceTrial.add(new MapInformationObject(6,"science", "William Harbutt", "A Director of Bath Art School, Harbutt invented a flexible modelling clay for his students in 1897,\n " +
                "concocted from Fuller's earth clay, oil and chalk.\n  " +
                "He used a garden roller to squeeze out the water from the clay. Plasticine was made in a factory in Bathampton until 1983.\n", 51.3858232f, -2.362361f));
        scienceTrial.add(new MapInformationObject(7,"science", "Josiah Wedgwood", "Wedgwood opened a shop in Milsom Street to display his company's celebrated ceramic wares,\n " +
                "while his wife took the waters in the city in 1772. " +
                "His experiments in chemistry led to major innovations in the manufacture of ceramics.\n", 51.384715f, -2.3634017f));
        scienceTrial.add(new MapInformationObject(8,"science", "William Smith", "As an engineer for the Somerset Coal Canal. Smith came to realise that rocks were laid down in a consistent order through time,\n " +
                "regardless of where they were. He developed the theory of the order of geological strata,\n " +
                "and published a famous map of British geology in 1815.", 51.3824016f, -2.3621088f));
        scienceTrial.add(new MapInformationObject(9,"science", "Arthur Roebuck Rudge & William Friese-Greene", "These two men worked closely developing new ideas in cinematography.\n " +
                "Rudge was a scientific instrument maker and inventor who experimented with new types of Magic Lantern apparatus and collaborated with Friese Greene, a pioneer of the moving image,\n " +
                "who had a photographic shop in Bath.", 51.3831348f, -2.3616529f));
        scienceTrial.add(new MapInformationObject(10,"science", "John Harington", "John Harington, godson of Queen Elizabeth l, " +
                "is credited with inventing the first flushing toilet in 1594 although it never replaced the chamber pot. " +
                "A water tank emptied to flush an open pan and the contents were sent into a vault below. His design was not widely used and few people in Bath would have ever seen such a thing until the mass production of toilets in the 19th century.zn ", 51.3829306f, -2.3587587f));
        scienceTrial.add(new MapInformationObject(11,"science", "Adelard", "Born in Bath and world-famous in his day, Adelard was one of the great minds of the Middle Ages. He was a very early interpreter of scientific knowledge,zn " +
                "writing treatises on the abacus and the astrolabe.\n " +
                "He translated works on astronomy and mathematics\n " +
                "(particularly Euclid's Elements) from Arabic into Latin and helped introduce Arabic numerals to the west.\n", 51.3818860f, -2.3580050f));
        scienceTrial.add(new MapInformationObject(12,"science", "Thomas Malthus", "Malthus was sent to Bath to be taught Latin and good behaviour by Richard Graves of Claverton Manor.\n " +
                "He married his Bath cousin, Harriet, and died in Bath in 1834.\n " +
                "Renowned as an economist,\n " +
                "his famous Essay on Population influenced Charles Darwin when he was developing his theory of evolution\n", 51.3818726f, -2.3574042f));
        scienceTrial.add(new MapInformationObject(13,"science", "Isaac Pitman", "Pitman invented Pitman's shorthand in 1837 to allow him to write as fast as he could think. \n" +
                "He marketed the system very effectively and set up a publishing company to print his own training materials.\n " +
                "His advertising slogan was \"Time saved is life prolonged\".\n", 51.3812565f, -2.3587346f));
        scienceTrial.add(new MapInformationObject(14,"science", "William & Caroline Herschel", "William Herschel came to Bath as a musician but his passion for astronomy led him to the discovery of Uranus in 1781,\n " +
                "from his back garden, using a telescope he designed.\n " +
                "George III appointed him as the 'King's Astronomer' a year later. Caroline Herschel, his sister,\n " +
                "was the first woman scientist and astronomer to be elected to the Royal Society. With a small telescope she detected a number of unknown comets and nebulae.\n " +
                "The house they occupied in Bath is now the Herschel Museum of Astronomy.\n", 51.3825723f, -2.3672855f));
        scienceTrial.add(new MapInformationObject(15,"science", "Leonard Jenyns", "Jenyns was invited to be the naturalist aboard The Beagle but turned it down and his friend Charles Darwin went instead. \n" +
                "The observations Darwin made on this voyage led to his famous work \"On the Origin of Species\" introducing his theory of evolution. \n" +
                "Jenyns wrote the report on the many new species of fish Darwin brought back.\n " +
                "There are letters at BRLSI to Jenyns from Darwin.\n", 51.3826092f, -2.3638093f));



        //Tree trail -
        treeTrial = new ArrayList<>();
        treeTrial.add(new MapInformationObject(1,"tree", "Western red cedar/Thuja plicata", "While this is not a champion tree, " +
                "it is of special interest because of the magnificent root system gripping onto the bank as if for dear life. \n" +
                "This is one of the few remaining examples of a Victorian fashion for  showing the beauty of nature by removing the soil from the roots,\n " +
                "which would usually be hidden - here you can see how attractive and extensive it is.\n", 51.3886305555556f, -2.3755293f));
        treeTrial.add(new MapInformationObject(2,"tree", "A Monkey Puzzle/Araucaria Araucana", "longDescripton", 51.3887527777778f, -2.3754998f));
        treeTrial.add(new MapInformationObject(3,"tree", "Spuce/Picea Smithiana", "longDescripton", 51.3887361111111f, -2.3767577f));
        treeTrial.add(new MapInformationObject(4,"tree", "Coastal Redwood/Sequoia Sempervirens", "longDescripton", 51.3885527777778f, -2.3771547f));
        treeTrial.add(new MapInformationObject(5,"tree", "Incense Cedar/calocedrus decurrens", "longDescripton", 51.3888277777778f, -2.377616f));
        treeTrial.add(new MapInformationObject(6,"tree", "Ehretia dicksonii/Ehretia dicksonii", "longDescripton", 51.3879722222222f, -2.3776241f));
        treeTrial.add(new MapInformationObject(7,"tree", "Weeping Ash/Fraxinus excelsior pendula", "longDescripton", 51.3879722222222f, -2.376527f));
        treeTrial.add(new MapInformationObject(8,"tree", "Dawn Redwood/Meetasequoia glyptostroboides", "longDescripton", 51.387675f, -2.3762159f));
        treeTrial.add(new MapInformationObject(9,"tree", "White Mulberry/Morus alba", "longDescripton", 51.38745f, -2.3769026f));
        treeTrial.add(new MapInformationObject(10,"tree", "The Indian Bean Tree/Catalpa bignonioides", "longDescripton",51.3874777777778f, -2.3771842f));
        treeTrial.add(new MapInformationObject(11,"tree", "The Glastonbury Thorn/Crataeis monogyna ", "longDescripton", 51.3874555555556f, -2.3772807f));
        treeTrial.add(new MapInformationObject(12,"tree", "The maidenhair tree/Ginkgo biloba", "longDescripton", 51.3878388888889f, -2.377962f));
        treeTrial.add(new MapInformationObject(13,"tree", "The Silver Pendent Lime/Tilla tomentosa", "longDescripton", 51.3874694444444f, -2.3778145f));
        treeTrial.add(new MapInformationObject(14,"tree", "The Fern-leaved Beech/Fagus heteraphylla", "longDescripton", 51.3880226f, -2.3753026f));



    //Adelard Trail -
    adelardTrial = new ArrayList<>();
    adelardTrial.add(new MapInformationObject(1,"adelard", "BRlSI Shop", "From here Adelard would have seen an untidy piece of ground and the outside walls of the medieval city.", 51.3833277777778f, -2.3642626f));
    adelardTrial.add(new MapInformationObject(2,"adelard", "Gascoyne Tower", "This is the site of Gascoyne Tower, a defensive feature, where the town walls turned south. The invading troops that attacked Bath approached across the open land to your right.", 51.382175f, -2.3625728f));
    adelardTrial.add(new MapInformationObject(3,"adelard", "The Royal Westgate", "The Royal West Gate stood here. All important people entered through it - though it was securely locked at night.", 51.3812388888889f, -2.3622456f));
    adelardTrial.add(new MapInformationObject(4,"adelard", "Abbey precinct", "Adelard would have recognised these streets which housed tradesmen such as bakers, wool merchants, and shoe and candle makers. Walk on to Stall Street, on the right. In Adelard's day, this was a new street, built to provide access to the South Gate. It ran alongside a high wall which marked the Abbey precinct, in which Adelard spent most of his time.", 51.3815666666667f, -2.3612103f));
    adelardTrial.add(new MapInformationObject(5,"adelard", "Medieval Marketplace", "Here was the heart of the town, the medieval market place, which was widened into the triangular site you see today, where the traders could put up stalls and pens for their animals. It led to the North Gate; outside this were the dangerous and smelly industries like tanning and metal working.", 51.3818194444444f, -2.3591611f));
    adelardTrial.add(new MapInformationObject(6,"adelard", "Bath Abbyey", "The old Saxon church was burned down and replaced by a Norman cathedral, one of the largest churches in Europe and far bigger than the one you see now which replaced it. As a teenager, Adelard would have seen this whole area busy with the building of cloisters, dormitories and a Bishop's Palace. Carry on walking between the Abbey and the Roman Baths. Adelard probably stayed in the precinct when he wasn't travelling, even though he wasn't a monk.", 51.3809861111111f, -2.3592469f));
    adelardTrial.add(new MapInformationObject(7,"adelard", "Bishops Palace", "In the far right corner is the site of the Bishop's Palace and ahead is what remains of Abbey Gate. When you get to the modern arch, look down and you can see at ground level some of the old stones of the Abbey Wall.  When you walk under the arch, look back and see one of the hinges of the Abbey Gate itself.", 51.3802888888889f, -2.3591074f));
    adelardTrial.add(new MapInformationObject(8,"adelard", "Stall Street", "You will see that, just as in medieval times, there are stalls, buskers and lots of visitors.", 51.3801069f, -2.33598128f));
    adelardTrial.add(new MapInformationObject(9,"adelard", "Norman Shopping Street", "This was an important Norman shopping street.", 51.3815813f, -2.3603305f));
    adelardTrial.add(new MapInformationObject(10,"adelard", "Medieval Walls", "Remember you are now outside the medieval city walls, unprotected from your enemies and probably walking knee deep in sewage and rubbish!", 51.3827138888889f, -2.3613551f));
    adelardTrial.add(new MapInformationObject(11,"adelard", "Finish", "BRLSI is diagonally ahead of you.", 51.3827527777778f, -2.3625407f));

}

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }


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


    private void setUpMap() {


        if (mapType.equals("SCIENCE")){
            showScienceTrial();
            LatLng myCoordinates = new LatLng(51.3828167, -2.3627043);
            CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(myCoordinates, 16);
            mMap.animateCamera(yourLocation);
        }
        if (mapType.equals("TREE")){
            showtreeTrial();
            LatLng myCoordinates = new LatLng(51.3880259, -2.3768154);
            CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(myCoordinates, 17);
            mMap.animateCamera(yourLocation);
        }
        if (mapType.equals("ADELARD")){
            showadelardTrial();
            LatLng myCoordinates = new LatLng(51.3828167, -2.3627043);
            CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(myCoordinates, 16);
            mMap.animateCamera(yourLocation);
        }

    }


    private void showScienceTrial(){

        //add all the science trial ones
        for(MapInformationObject item : scienceTrial){

            mMap.addMarker(new MarkerOptions().position(new LatLng(item.getLongitude(), item.getLatitude()))
                            .icon(BitmapDescriptorFactory.fromBitmap(drawCircle(item.getNumber(), "#1E88E5", false)))
                            .title(item.getTitle())
                            .snippet("tap here for more information"));
            }};

private void showtreeTrial(){

            //add all the tree trial ones
            for(MapInformationObject item : treeTrial){

                mMap.addMarker(new MarkerOptions().position(new LatLng(item.getLongitude(), item.getLatitude()))
                                .icon(BitmapDescriptorFactory.fromBitmap(drawCircle(item.getNumber(), "#2ecc71", false)))
                                .title(item.getTitle())
                                .snippet("tap here for more information"));
                }};

        //end for each tree trial item
    private void showadelardTrial(){

        //add all the adelard trial ones
        for(MapInformationObject item : adelardTrial){

            mMap.addMarker(new MarkerOptions().position(new LatLng(item.getLongitude(), item.getLatitude()))
                            .icon(BitmapDescriptorFactory.fromBitmap(drawCircle(item.getNumber(), "#e74c3c", false)))
                            .title(item.getTitle())
                            .snippet("tap here for more information"));
        }};

        //end for each adelard trial item






    private Bitmap drawCircle(int number, String colour, boolean textBlack){

        Bitmap.Config conf = Bitmap.Config.ARGB_8888;
        Bitmap bmp = Bitmap.createBitmap(40, 40, conf);
        Canvas canvas = new Canvas(bmp);

        //draw a circle
        Paint color = new Paint();
        color.setColor(Color.parseColor(colour));
        canvas.drawCircle(20, 20, 20, color);

        //draw text
        if (textBlack){
            color.setColor(Color.BLACK);
        } else {
            color.setColor(Color.WHITE);
        }


        color.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));

        if (number < 10){
            color.setTextSize(25);
            canvas.drawText(Integer.toString(number), 15, 30, color);
        } else {
            color.setTextSize(18);
            canvas.drawText(Integer.toString(number), 10, 27, color);
        }

        return bmp;
    }
}

