package com.appndroid.crick20.ui;

import com.appndroid.crick20.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class About extends Activity
{
	 private final static String APP_PNAME = "com.appndroid.crick20";

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        // TODO Auto-generated method stub
        super.onCreate( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE );
        setContentView( R.layout.about );

        Utils.setContext( this );
        TextView txtFeedBack = (TextView) findViewById( R.id.txtFeedBack );
        
        txtFeedBack.setOnClickListener( new OnClickListener()
        {

            @Override
            public void onClick( View v )
            {
                // TODO Auto-generated method stub
                Intent intent = new Intent( About.this, FeedBack.class );
                startActivity( intent );
            }
        } );
        
        TextView txtRateUs = (TextView) findViewById( R.id.txtRateUs );
        txtRateUs.setOnClickListener( new OnClickListener()
        {

            @Override
            public void onClick( View v )
            {
                // TODO Auto-generated method stub
            	 About.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + APP_PNAME)));
            }
        } );
        

    }
}
