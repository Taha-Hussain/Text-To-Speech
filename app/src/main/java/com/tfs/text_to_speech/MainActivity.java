package com.tfs.text_to_speech;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    ImageView Alphabet_a;
    ImageView Alphabet_b;
    ImageView Alphabet_c;
    ImageView Alphabet_d;
    ImageView Alphabet_e;
    ImageView Alphabet_f;
    TextToSpeech MyAlphabets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Alphabet_a = (ImageView) findViewById(R.id.Alphabet_a);
        Alphabet_b = (ImageView) findViewById(R.id.Alphabet_b);
        Alphabet_c = (ImageView) findViewById(R.id.Alphabet_c);
        Alphabet_d = (ImageView) findViewById(R.id.Alphabet_d);
        Alphabet_e = (ImageView) findViewById(R.id.Alphabet_e);
        Alphabet_f = (ImageView) findViewById(R.id.Alphabet_f);

        MyAlphabets=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    MyAlphabets.setLanguage(Locale.UK);
                }
            }
        });


    }

    public void Alphabet_click(View view) {
        switch (view.getId()) {
            case R.id.Alphabet_a:
//                Toast.makeText(MainActivity.this, "A is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("A", TextToSpeech.QUEUE_FLUSH, null);
                break;

            case R.id.Alphabet_b:
//                Toast.makeText(MainActivity.this, "B is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("B", TextToSpeech.QUEUE_FLUSH, null);
                break;

            case R.id.Alphabet_c:
//                Toast.makeText(MainActivity.this, "C is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("C", TextToSpeech.QUEUE_FLUSH, null);
                break;

            case R.id.Alphabet_d:
//                Toast.makeText(MainActivity.this, "D is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("D", TextToSpeech.QUEUE_FLUSH, null);
                break;

            case R.id.Alphabet_e:
//                Toast.makeText(MainActivity.this, "E is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("E", TextToSpeech.QUEUE_FLUSH, null);
                break;

            case R.id.Alphabet_f:
//                Toast.makeText(MainActivity.this, "F is clicked", Toast.LENGTH_SHORT).show();
                MyAlphabets.speak("F", TextToSpeech.QUEUE_FLUSH, null);
                break;

        }
    }

}