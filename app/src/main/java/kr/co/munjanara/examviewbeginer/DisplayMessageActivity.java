package kr.co.munjanara.examviewbeginer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import static kr.co.munjanara.examviewbeginer.MainActivity.EXTRA_MESSAGE;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
//        TextView textView = findViewById(R.id.tv_message);
//        textView.setText(message);

        TextView textView1 = new TextView(this);
        textView1.setTextSize(40);
        textView1.setText(message);

        ViewGroup layout = findViewById(R.id.activity_display_message);
        layout.addView(textView1);
    }
}