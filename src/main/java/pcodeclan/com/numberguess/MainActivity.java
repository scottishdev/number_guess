package pcodeclan.com.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guessFunction(View view){
        Log.i("Works", "It works!");
        Log.i("Random number", String.valueOf(randomNumber));

        EditText numberEnter = (EditText) findViewById(R.id.numberEnterEditTextNumber);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20)+1;
    }
}