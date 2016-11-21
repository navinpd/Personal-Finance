package navinpd.github.com.personalfinance.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import navinpd.github.com.personalfinance.R;

/**
 * Created by Navin on 20/06/16.
 */
public class DebitActivity extends AppCompatActivity {
    EditText amountET;
    TextView currencyText;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        setContentView(R.layout.activity_input_data);
        currencyText = (TextView) findViewById(R.id.amount_currency);
        amountET = (EditText) findViewById(R.id.input_amount);
        amountET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
            Intent in = new Intent();
        in.putExtra("",in);
        super.onCreate(savedInstanceState, persistentState);
    }


}
