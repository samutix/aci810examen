package com.example.examen;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class AjustesActivity extends Activity {
	
	public final static String COMENTARIO_VALUE = "com.androidexamen.NAME_VALUE";



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ajustes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ajustes, menu);
		return true;
	}

	public void pasoboton(View view) {

		Intent i = new Intent(this, AjustesActivity2.class);

		EditText comentarioEditText = (EditText) findViewById(R.id.comentariosAjustes);
		String comentario = comentarioEditText.getText().toString();


		

		SharedPreferences sharedPref = getSharedPreferences("app",
				Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPref.edit();

		editor.putString(COMENTARIO_VALUE, comentario);


		editor.commit();

		startActivity(i);
	}

}