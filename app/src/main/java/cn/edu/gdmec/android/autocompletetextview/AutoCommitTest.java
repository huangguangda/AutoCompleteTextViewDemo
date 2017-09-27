package cn.edu.gdmec.android.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCommitTest extends AppCompatActivity {
    private static final String[] autoString=new String[]{"welcome","well","weatch","weexeview","werap"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_auto_commit_test );
        ArrayAdapter<String> adapter=new ArrayAdapter<String> ( this, android.R.layout.simple_dropdown_item_1line, autoString );
        AutoCompleteTextView autocomplete=(AutoCompleteTextView)findViewById ( R.id.auto );
        autocomplete.setAdapter ( adapter );
        MultiAutoCompleteTextView multi=(MultiAutoCompleteTextView)findViewById ( R.id.multi );
        multi.setAdapter ( adapter );
        multi.setTokenizer ( new MultiAutoCompleteTextView.CommaTokenizer () );
    }
}
