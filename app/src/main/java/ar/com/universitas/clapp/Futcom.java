package ar.com.universitas.clapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Julian on 12/06/2016.
 */
public class Futcom extends Activity {


    /*comentario en la clase*/

    Button btnvolver;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.futcom);
        btnvolver = (Button) findViewById(R.id.btnvolver);
    }

    public void onClickbtnvolver (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }


}
