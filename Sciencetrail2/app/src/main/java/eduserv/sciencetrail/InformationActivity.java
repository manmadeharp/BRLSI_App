package eduserv.sciencetrail;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class InformationActivity extends ActionBarActivity {


    private TextView lblTtitle;
    private MapInformationObject mapItem;
    private RelativeLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        mapItem = (MapInformationObject)getIntent().getSerializableExtra("MAP_ITEM");
        background = (RelativeLayout)findViewById(R.id.background);

        lblTtitle = (TextView)findViewById(R.id.title);


        lblTtitle.setText(mapItem.getTitle());

        if (mapItem.getTrialName().equals("TREE")){
            //set background color
            background.setBackgroundColor(Color.parseColor("#cc0000"));
            // set image
        }
        if (mapItem.getTrialName().equals("SCIENCE")){
            //set background color
            background.setBackgroundColor(Color.parseColor("#cc0500"));
            // set image
        }
        if (mapItem.getTrialName().equals("ADELARD")){
            //set background color
            background.setBackgroundColor(Color.parseColor("#cc8000"));
            // set image
        }

    }

}
