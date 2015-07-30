package eduserv.sciencetrail;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
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
    private ImageView image;
    private TextView longdescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        mapItem = (MapInformationObject)getIntent().getSerializableExtra("MAP_ITEM");
        background = (RelativeLayout)findViewById(R.id.background);
        image = (ImageView)findViewById((R.id.image));
        lblTtitle = (TextView)findViewById(R.id.title);
        longdescription = (TextView)findViewById(R.id.longdescription);

        lblTtitle.setText(mapItem.getTitle());
        longdescription.setText(mapItem.getLongDescription());

        if (mapItem.getTrialName().equals("tree")){
            //set background color
            image.setImageResource(R.drawable.tree);
            background.setBackgroundColor(Color.parseColor("#2ecc71"));
            // set image
        }
        if (mapItem.getTrialName().equals("science")){
            //set background color
            background.setBackgroundColor(Color.parseColor("#3498db"));
            // set image
            image.setImageResource(R.drawable.telesc);
        }
        if (mapItem.getTrialName().equals("adelard")){
            //set background color
            background.setBackgroundColor(Color.parseColor("#e74c3c"));
            image.setImageResource(R.drawable.medieval);

        }

    }

}
