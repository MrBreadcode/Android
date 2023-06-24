package com.example.labb1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView author;
    private TextView year;
    private ImageView imageView;
    private FrameLayout fl;

    private Button button;

    String[] authors = { "Jennifer L. Armentrout", "Brandon Sanderson", "Terry Pratchett", "Robert Jordan"};
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        author = (TextView)findViewById(R.id.author);
        year = (TextView)findViewById(R.id.year);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, authors);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

        //fl = (FrameLayout)findViewById(R.id.frame_layout);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageDrawable(getDrawable(R.drawable.jordan_2012));

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            RadioButton radioButton = findViewById(R.id.radioButton);

            @SuppressLint("ResourceType")
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (rb != null && checkedId > -1) {
                    year.setText("Year: " + rb.getText());
                }
            }

        });
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
   public void onClickListener(View view)
    {
        Spinner spinner = findViewById(R.id.spinner);
        String selected = spinner.getSelectedItem().toString();
        author.setText("Author: " + selected);
        //button.setActivated();
    }
}