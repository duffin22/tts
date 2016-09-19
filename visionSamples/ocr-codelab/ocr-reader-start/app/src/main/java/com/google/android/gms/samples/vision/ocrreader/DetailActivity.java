package com.google.android.gms.samples.vision.ocrreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.samples.vision.ocrreader.R;
import com.google.android.gms.vision.text.Text;

import java.util.ArrayList;

public class DetailActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);

    Intent i = getIntent();
//    ArrayList<String> listy = i.getStringArrayListExtra("list");
//
    TextView textyView = (TextView) findViewById(R.id.detail_activity_text_view);
//    StringBuilder stringyB = new StringBuilder();
//    for (String s: listy) {
//      String str = s.replaceAll("[^.0-9]+", " ");
//      String[] val = str.split(" ");
//      stringyB.append(s);
//      stringyB.append(System.getProperty("line.separator"));
//    }

    String text = i.getStringExtra("sb");

    textyView.setText(text);

  }
}
