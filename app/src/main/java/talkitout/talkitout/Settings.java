package talkitout.talkitout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;

import talkitout.talkitout.R;

public class Settings extends AppCompatActivity {

    Spinner quotesselect, altselect, sobselect;
    Button savebtn;
    TabHost mytab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        quotesselect = (Spinner) findViewById(R.id.quotesmenu);
        altselect = (Spinner) findViewById(R.id.alternativesmenu);
        sobselect = (Spinner) findViewById(R.id.sobrietymenu);
        savebtn = (Button) findViewById(R.id.savebutton);
        mytab = (TabHost) findViewById(R.id.tabHost);
        mytab.setup();
        TabHost.TabSpec tabSpec = mytab.newTabSpec("Alerts");
        tabSpec.setContent(R.id.Alerts);
        tabSpec.setIndicator("Alerts");
        mytab.addTab(tabSpec);

        TabHost.TabSpec tabSpec2 = mytab.newTabSpec("Account");
        tabSpec2.setContent(R.id.Account);
        tabSpec2.setIndicator("Account");
        mytab.addTab(tabSpec2);
    }
}
