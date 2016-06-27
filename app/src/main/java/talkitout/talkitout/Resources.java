package talkitout.talkitout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Resources extends AppCompatActivity {

    Button Article1;
    Button Article2;
    Button Article3;
    Button Article4;
    Button Article5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        Article1 = (Button) findViewById(R.id.button);
        Article2 = (Button) findViewById(R.id.button2);
        Article3 = (Button) findViewById(R.id.button3);
        Article4 = (Button) findViewById(R.id.button4);
        Article5 = (Button) findViewById(R.id.button5);

        Article1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(Resources.this, Article1.class));
            }
        });

        Article2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(Resources.this, Article2.class));
            }
        });

        Article3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(Resources.this, Article3.class));
            }
        });

        Article4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(Resources.this, Article4.class));
            }
        });

        Article5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(Resources.this, Article5.class));
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
