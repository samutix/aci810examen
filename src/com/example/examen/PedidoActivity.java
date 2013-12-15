package com.example.examen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PedidoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pedido);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pedido, menu);
		return true;
		
	}
	
     public void realizarPedido(View view) {	
		
             EditText loginEmailField = (EditText) this.findViewById(R.id.loginEmailField);
             String loginName = loginEmailField.getText().toString();
             
             EditText loginPasswordField = (EditText) this.findViewById(R.id.loginPasswordField);
             String passwordName = loginPasswordField.getText().toString();
             
             EditText tituloField = (EditText) this.findViewById(R.id.tituloField);
             String tituloName = tituloField.getText().toString();
             
             EditText authorField = (EditText) this.findViewById(R.id.authorField);
             String authorName = authorField.getText().toString();
             
             EditText isbnField = (EditText) this.findViewById(R.id.isbnField);
             String isbnName = isbnField.getText().toString();
             
             
             if(tituloName.isEmpty() || authorName.isEmpty() || isbnName.isEmpty() || loginName.isEmpty() || passwordName.isEmpty())
             {
                     Toast.makeText(this, "Complete el formulario antes de guardar", Toast.LENGTH_LONG).show();
                     return;
             }
    	 }
     }
