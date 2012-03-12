package us.patt.urlshortener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class UrlshortenerActivity extends Activity {
    /** Called when the activity is first created. */
	
	private Intent data;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent intent = getIntent();
        System.out.println(intent.getAction());
        System.out.println(intent.getData());
        setContentView(R.layout.main); 
    }
    
}