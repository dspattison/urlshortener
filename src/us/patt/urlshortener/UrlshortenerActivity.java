package us.patt.urlshortener;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UrlshortenerActivity extends Activity {
    /** Called when the activity is first created. */
	
	private Intent data;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent intent = getIntent();
        System.out.println(intent.getAction());
        Uri uri = intent.getData();
        System.out.println(uri);
        
        
        setContentView(R.layout.main); 
        
        //set url text if available
        final EditText urlEditField = (EditText) findViewById(R.id.editText1);
        if (null != urlEditField && null != uri) {
        	urlEditField.setText(uri.toString());
        }
        
        //set listiner for button click
        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	System.out.println("Got here!");
            	//get the target url
            	CharSequence uriString = null; 
            	if (urlEditField != null) {
            		System.out.println(urlEditField);
            		uriString = urlEditField.getText();
            	}
            	System.out.println(uriString);
            }
        });
    }
    
}
