package com.example.examen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.support.v4.app.NavUtils;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class AjustesActivity2 extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_ajustes_activity2);
        
        
         SharedPreferences sharedPref = getSharedPreferences("app", Context.MODE_PRIVATE);        
     
     String comentario = sharedPref.getString(AjustesActivity.COMENTARIO_VALUE, "not set");
     
 
   

     TextView comentarioTextView = (TextView) findViewById(R.id.textComentario);
     comentarioTextView.setText(comentario);


            
}

     
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.ajustes_activity2, menu);
                return true;
        }
        public void botonajustes2(View view) {

    		Intent i = new Intent(this, ApplicationActivity.class);
    		Toast.makeText(this, "ENVIO CORRECTO", Toast.LENGTH_LONG).show();
    		startActivity(i);
        }
         @Override
     public boolean onOptionsItemSelected(MenuItem item) {
             switch (item.getItemId()) {
             case android.R.id.home:
                     
                     NavUtils.navigateUpFromSameTask(this);
                     return true;
             }
             return super.onOptionsItemSelected(item);
     }
}