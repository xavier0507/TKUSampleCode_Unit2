package com.tku.unit2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Xavier on 2015/3/19.
 */
public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);

		final Button originalButton = (Button) this.findViewById(R.id.button_original);
		final Button myStyleButton = (Button) this.findViewById(R.id.button_my_style);
		final Button customButton = (Button) this.findViewById(R.id.button_custom);
		final Button customClickableButton = (Button) this.findViewById(R.id.button_custom_clickable);
		final ImageButton imgClckableButton = (ImageButton) this.findViewById(R.id.button_image_clickable);

		originalButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ResultActivity.class);
				intent.putExtra(Constant.EXTRA_TEXT, originalButton.getText());
				startActivity(intent);
			}
		});

		myStyleButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ResultActivity.class);
				intent.putExtra(Constant.EXTRA_TEXT, myStyleButton.getText());
				startActivity(intent);
			}
		});

		customButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ResultActivity.class);
				intent.putExtra(Constant.EXTRA_TEXT, customButton.getText());
				startActivity(intent);
			}
		});

		customClickableButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ResultActivity.class);
				intent.putExtra(Constant.EXTRA_TEXT, customClickableButton.getText());
				startActivity(intent);
			}
		});

		imgClckableButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ResultActivity.class);
				startActivity(intent);
			}
		});
	}
}
