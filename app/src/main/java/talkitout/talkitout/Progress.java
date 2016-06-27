package talkitout.talkitout;

import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TabHost;
import android.widget.TextView;


public class Progress extends HomePage {

//    yesBtn.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view){
//            if (noBtn.isEnabled()) noBtn.setEnabled(false);
//        }
//    });

    android.graphics.drawable.Drawable back, backh, backr, backrh, backg, backgh;
    EditText numcigs, freeresp;
    SeekBar seeker;
    Button yesBtn, noBtn, submitBtn;

    TextView textView2,
            textView3,
            textView4,
            textView5,
            textView6,
            textView7,
            textView8,
            textView9,
            textView10,
            textView11,
            textView12,
            textView13,
            textView14,
            textView15,
            textView16,
            textView17,
            textView18,
            textView19,
            textView20,
            textView21,
            textView22,
            textView23,
            textView24,
            textView25,
            textView26,
            textView27,
            textView28,
            textView29,
            textView30,
            textView31,
            textView32;

    TabHost mytab;

    private void clearDayHighlights() {
        clearDay(textView2);
        clearDay(textView3);
        clearDay(textView4);
        clearDay(textView5);
        clearDay(textView6);
        clearDay(textView7);
        clearDay(textView8);
        clearDay(textView9);
        clearDay(textView10);
        clearDay(textView11);
        clearDay(textView12);
        clearDay(textView13);
        clearDay(textView14);
        clearDay(textView15);
        clearDay(textView16);
        clearDay(textView17);
        clearDay(textView18);
        clearDay(textView19);
        clearDay(textView20);
        clearDay(textView21);
        clearDay(textView22);
        clearDay(textView23);
        clearDay(textView24);
        clearDay(textView25);
        clearDay(textView26);
        clearDay(textView27);
        clearDay(textView28);
        clearDay(textView29);
        clearDay(textView30);
        clearDay(textView31);
        clearDay(textView32);
    }
    private void clearDay(final TextView day) {
        if(day.getHint() == "backh") {
            day.setHint("@drawable/back");
            day.setBackgroundDrawable(back);
        }
        else if(day.getHint() == "backrh") {
            day.setHint("@drawable/backr");
            day.setBackgroundDrawable(backr);
        }
        else if(day.getHint() == "backgh") {
            day.setHint("@drawable/backg");
            day.setBackgroundDrawable(backg);
        }
    }

    public void onClick29(View v) {
        clearDayHighlights();
        //SET SAMPLE DAILY LOGS
        noBtn.setEnabled(true);
        seeker.setProgress(2);
        yesBtn.setEnabled(false);
        numcigs.setText(" ");
        freeresp.setText("Read resources");

        //SELECT/DESELECT CALENDAR DAY
        if (textView29.getHint() == "back") {
            textView29.setHint("@drawable/backh");
            textView29.setBackgroundDrawable(backh);
        } else if (textView29.getHint() == "backr") {
            textView29.setHint("@drawable/backrh");
            textView29.setBackgroundDrawable(backrh);
        } else if (textView29.getHint() == "backg") {
            textView29.setHint("@drawable/backgh");
            textView29.setBackgroundDrawable(backgh);
        }
    }
    public void onClick31(View v) {
        clearDayHighlights();
        //SET SAMPLE DAILY LOGS
        noBtn.setEnabled(true);
        seeker.setProgress(3);
        yesBtn.setEnabled(false);
        numcigs.setText(" ");
        freeresp.setText("Used the chat");

        //SELECT/DESELECT CALENDAR DAY
        if (textView31.getHint() == "back") {
            textView31.setHint("@drawable/backh");
            textView31.setBackgroundDrawable(backh);
        } else if (textView31.getHint() == "backr") {
            textView31.setHint("@drawable/backrh");
            textView31.setBackgroundDrawable(backrh);
        } else if (textView31.getHint() == "backg") {
            textView31.setHint("@drawable/backgh");
            textView31.setBackgroundDrawable(backgh);
        }
    }
    public void onClick30(View v) {
        clearDayHighlights();
        //SET SAMPLE DAILY LOGS
        noBtn.setEnabled(false);
        seeker.setProgress(4);
        yesBtn.setEnabled(true);
        numcigs.setText("3");
        freeresp.setText(" ");

        //SELECT/DESELECT CALENDAR DAY
        if (textView30.getHint() == "back") {
            textView30.setHint("@drawable/backh");
            textView30.setBackgroundDrawable(backh);
        } else if (textView30.getHint() == "backr") {
            textView30.setHint("@drawable/backrh");
            textView30.setBackgroundDrawable(backrh);
        } else if (textView30.getHint() == "backg") {
            textView30.setHint("@drawable/backgh");
            textView30.setBackgroundDrawable(backgh);
        }
    }
    public void onClick0(View v) {
        clearDayHighlights();
        //SET SAMPLE DAILY LOGS
        noBtn.setEnabled(false);
        seeker.setProgress(0);
        yesBtn.setEnabled(false);
        numcigs.setText(" ");
        freeresp.setText(" ");

//        //SELECT/DESELECT CALENDAR DAY
//        if (day.getHint() == "back") {
//            day.setHint("@drawable/backh");
//            day.setBackgroundDrawable(backh);
//        } else if (day.getHint() == "backr") {
//            day.setHint("@drawable/backrh");
//            day.setBackgroundDrawable(backrh);
//        } else if (day.getHint() == "backg") {
//            day.setHint("@drawable/backgh");
//            day.setBackgroundDrawable(backgh);
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        back = ResourcesCompat.getDrawable(getResources(), R.drawable.back, null);
        backr = ResourcesCompat.getDrawable(getResources(), R.drawable.backr, null);
        backrh = ResourcesCompat.getDrawable(getResources(), R.drawable.backrh, null);
        backg = ResourcesCompat.getDrawable(getResources(), R.drawable.backg, null);
        backgh = ResourcesCompat.getDrawable(getResources(), R.drawable.backgh, null);
        backh = ResourcesCompat.getDrawable(getResources(), R.drawable.backh, null);

        mytab = (TabHost) findViewById(R.id.tabHost);
        mytab.setup();
        TabHost.TabSpec tabSpec = mytab.newTabSpec("Calendar");
        tabSpec.setContent(R.id.Calendar);
        tabSpec.setIndicator("Calendar");
        mytab.addTab(tabSpec);

        TabHost.TabSpec tabSpec2 = mytab.newTabSpec("Summary");
        tabSpec2.setContent(R.id.Summary);
        tabSpec2.setIndicator("Summary");
        mytab.addTab(tabSpec2);

        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView15 = (TextView) findViewById(R.id.textView15);
        textView16 = (TextView) findViewById(R.id.textView16);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView18 = (TextView) findViewById(R.id.textView18);
        textView19 = (TextView) findViewById(R.id.textView19);
        textView20 = (TextView) findViewById(R.id.textView20);
        textView21 = (TextView) findViewById(R.id.textView21);
        textView22 = (TextView) findViewById(R.id.textView22);
        textView23 = (TextView) findViewById(R.id.textView23);
        textView24 = (TextView) findViewById(R.id.textView24);
        textView25 = (TextView) findViewById(R.id.textView25);
        textView26 = (TextView) findViewById(R.id.textView26);
        textView27 = (TextView) findViewById(R.id.textView27);
        textView28 = (TextView) findViewById(R.id.textView28);
        textView29 = (TextView) findViewById(R.id.textView29);
        textView30 = (TextView) findViewById(R.id.textView30);
        textView31 = (TextView) findViewById(R.id.textView31);
        textView32 = (TextView) findViewById(R.id.textView32);

        //textView30.setOnClickListener(new CalListener(textView30));
//        calOnClick(textView2);
//        calOnClick(textView3);
//        calOnClick(textView4);
//        calOnClick(textView5);
//        calOnClick(textView6);
//        calOnClick(textView7);
//        calOnClick(textView8);
//        calOnClick(textView9);
//        calOnClick(textView10);
//        calOnClick(textView11);
//        calOnClick(textView12);
//        calOnClick(textView13);
//        calOnClick(textView14);
//        calOnClick(textView15);
//        calOnClick(textView16);
//        calOnClick(textView17);
//        calOnClick(textView18);
//        calOnClick(textView19);
//        calOnClick(textView20);
//        calOnClick(textView21);
//        calOnClick(textView22);
//        calOnClick(textView23);
//        calOnClick(textView24);
//        calOnClick(textView25);
//        calOnClick(textView26);
//        calOnClick(textView27);
//        calOnClick(textView28);
//        calOnClick(textView29);
//        calOnClick(textView30);
//        calOnClick(textView31);
//        calOnClick(textView32);

        yesBtn = (Button) findViewById(R.id.yesbutton);
        noBtn = (Button) findViewById(R.id.nobutton);
        numcigs = (EditText) findViewById(R.id.numcigs);
        seeker = (SeekBar) findViewById(R.id.seekBar);
        freeresp = (EditText) findViewById(R.id.avoidanswer);
        submitBtn = (Button) findViewById(R.id.submit);
    }
}