package navinpd.github.com.personalfinance.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import navinpd.github.com.personalfinance.R;

/**
 * Created by Navin on 20/06/16.
 */
public class DebitFragment extends Fragment {

    public DebitFragment () {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.input_fragment, container, false);
    }
}
