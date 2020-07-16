package pcodeclan.com.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    String message;

    public void randomNumGen(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

    public void guessFunction(View view){
        EditText numberEnter = (EditText) findViewById(R.id.numberEnterEditTextNumber);
        int guessValue = Integer.parseInt(numberEnter.getText().toString());

        if (guessValue > randomNumber){
            message = "Try lower!";
        } else if(guessValue < randomNumber){
            message = "Try higher!";
        } else {
            message = "You got it!";
            randomNumGen();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        // Tests
        Log.i("Works", "It works!");
        Log.i("Entered value", numberEnter.getText().toString());
        Log.i("Random number", String.valueOf(randomNumber));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumGen();
    }
}