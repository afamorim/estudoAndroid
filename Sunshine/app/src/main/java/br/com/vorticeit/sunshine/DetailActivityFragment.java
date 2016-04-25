package br.com.vorticeit.sunshine;

import android.app.Fragment;
import android.content.Intent;
//import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.Intent.getIntent;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Intent intent = getActivity().getIntent();;
        View viewRoot = inflater.inflate(R.layout.fragment_detail, container, false);

        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)){
            String foreCast = intent.getStringExtra(Intent.EXTRA_TEXT);
            TextView textView = (TextView)viewRoot.findViewById(R.id.text_forecast);
            textView.setText(foreCast);
        }

        return viewRoot;
    }
}
