package com.tku.unit2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Xavier on 2015/3/23.
 */
public class ResultActivity extends Activity {
	private String result = "";
	private String editTextResult = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_show_result);

		Intent intent = this.getIntent();
		if (intent.getStringExtra(Constant.EXTRA_TEXT) != null) {
			result = intent.getStringExtra(Constant.EXTRA_TEXT);
		} else {
			result = this.getString(R.string.text_no_result);
		}

		TextView resultText = (TextView) this.findViewById(R.id.text_result);
		final EditText resultEdit = (EditText) this.findViewById(R.id.edit_result);
		Button exitButton = (Button) this.findViewById(R.id.button_exit);

		resultText.setText(this.getString(R.string.text_result, result));

		exitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				editTextResult = resultEdit.getText().toString();

				if (editTextResult.equals("yes")) {
					finish();
				} else {
					Toast.makeText(getBaseContext(), getString(R.string.text_notification), Toast.LENGTH_LONG).show();
				}
			}
		});
	}
}
