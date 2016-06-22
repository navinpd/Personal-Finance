package navinpd.github.com.personalfinance.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import navinpd.github.com.personalfinance.R;

/**
 * Created by Navin on 21/06/16.
 */
public class EnterAmountFragment extends BaseFragment {
    TextInputLayout inputAmountLayout;
    EditText amountEt;
    TextView currencyTxt;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_enter_amount, container, false);
        amountEt = (EditText) view.findViewById(R.id.et_amount);
        currencyTxt = (TextView) view.findViewById(R.id.txt_currency);
        inputAmountLayout = (TextInputLayout) view.findViewById(R.id.txt_in_amount);

        return view;
    }

    private boolean validateAmount() {
        if(amountEt.getText().toString().trim().isEmpty()) {
            inputAmountLayout.setError("Please enter amount");
            requestFocus(amountEt);
            return false;
        }
        return true;
    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

}
