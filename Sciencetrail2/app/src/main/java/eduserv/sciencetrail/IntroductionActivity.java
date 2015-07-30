package eduserv.sciencetrail;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class IntroductionActivity extends ActionBarActivity {

    private Button btnScience;
    private Button btnTree;
    private Button btnAdelard;
    //add in other buttons

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        btnScience = (Button)findViewById(R.id.btnScience);
        btnTree = (Button)findViewById(R.id.btnTree);
        btnAdelard = (Button)findViewById(R.id.btnAdelard);
        //hook them up to the lyout


        btnScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroductionActivity.this, Science_trail.class);
                i.putExtra(Science_trail.EXTRA_TRIAL_NAME, "SCIENCE");
                startActivity(i);
            }
        });

        btnTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroductionActivity.this, Science_trail.class);
                i.putExtra(Science_trail.EXTRA_TRIAL_NAME, "TREE");
                startActivity(i);
            }
        });

        btnAdelard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroductionActivity.this, Science_trail.class);
                i.putExtra(Science_trail.EXTRA_TRIAL_NAME, "ADELARD");
                startActivity(i);
            }
        });

            //more onclick listeners
        //which go to new activity


    }


}
