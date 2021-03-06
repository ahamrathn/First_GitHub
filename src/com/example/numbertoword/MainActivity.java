package com.example.numbertoword;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button submit;
	Button reset;
	
	EditText get;
	TextView result;
	
	public int given;
	
	public String value;
	
	public String enter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		submit=(Button)findViewById(R.id.button01);
		reset=(Button)findViewById(R.id.button02);
		
		submit.setOnClickListener(this);
		reset.setOnClickListener(this);
		
		get=(EditText)findViewById(R.id.editText1);
		
		result=(TextView)findViewById(R.id.textView2);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v==submit)
		{
			enter=get.getText().toString();
			given = Integer.parseInt(enter);
			
			Conversion cc = new Conversion();
			
			value=cc.convert(given);
			
			result.setText(value);
		}
		else if(v==reset)
		{
			result.setText("");
			get.setText("");
		}
		else
		{
			
		}
	}
}
