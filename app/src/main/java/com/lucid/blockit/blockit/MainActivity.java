package com.lucid.blockit.blockit;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String values[] = {"052-6290696", "054-7836876", "09-7413090"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row_layout, R.id.phoneNumber, values);
        setListAdapter(adapter);

    }
}
