package roller.main.roller3;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	public static final String NoTypeString = "Select a type";
	public String type = NoTypeString;
	public int dice = 0;
	public int roll = 0;
	int min = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void updateText(){
		TextView view = (TextView) findViewById(R.id.dice_type);
		view.setText(type);
	}
	
	public void roll(View view){
		TextView currentRollValue = (TextView) findViewById(R.id.dice_throw);
		TextView LastRollValue = (TextView) findViewById(R.id.last_roll_text);
		
		if (type.equals(NoTypeString)) {
			updateText();
		} else {
			String rollString = "Last roll:" + roll;
			LastRollValue.setText(rollString);
			Random r = new Random();
			int i1 = r.nextInt(dice - min + 1) + min;
			roll = i1;
			rollString = "" + roll;
			currentRollValue.setText(rollString);
		}
		
	}
	
	public void d20(View view){
		dice = 20;
		type = "d20";
		updateText();
	}
	
	public void d12(View view){
		dice = 12;
		type = "d12";
		updateText();
	}
	public void d10(View view){
		dice = 10;
		type = "d10";
		updateText();
	}
	public void d8(View view){
		dice = 8;
		type = "d8";
		updateText();
	}
	public void d6(View view){
		dice = 6;
		type = "d6";
		updateText();
	}
	public void d4(View view){
		dice = 4;
		type = "d4";
		updateText();
	}

}
