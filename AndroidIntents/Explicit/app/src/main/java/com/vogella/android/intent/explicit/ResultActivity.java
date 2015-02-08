package com.vogella.android.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);

        TextView display = (TextView) findViewById(R.id.displayintentextra);
        Bundle extras = getIntent().getExtras();
        display.setText(extras.getString("yourkey"));
    }

    @Override
    public void finish() {
        EditText retval = (EditText) findViewById(R.id.returnValue);

        Intent intent = new Intent();
        intent.putExtra("returnkey", retval.getText().toString());
        setResult(RESULT_OK, intent);
        super.finish();
    }
} 