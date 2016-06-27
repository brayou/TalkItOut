package talkitout.talkitout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class DailyLog extends HomePage {

    EditText numcigs, freeresp;
    SeekBar seeker;
    Button yesBtn, noBtn, submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_log);

        yesBtn = (Button) findViewById(R.id.yesbutton);
        noBtn = (Button) findViewById(R.id.nobutton);
        numcigs = (EditText) findViewById(R.id.numcigs);
        seeker = (SeekBar) findViewById(R.id.seekBar);
        freeresp = (EditText) findViewById(R.id.avoidanswer);
        submitBtn = (Button) findViewById(R.id.submit);


        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (noBtn.isEnabled()) noBtn.setEnabled(false);
            }
        });
        noBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (yesBtn.isEnabled()) yesBtn.setEnabled(false);
            }
        });

        freeresp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                submitBtn.setEnabled(!freeresp.getText().toString().trim().isEmpty());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        seeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progressChanged = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}