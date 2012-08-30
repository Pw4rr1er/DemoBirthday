package com.appndroid.crick20;

import android.app.TabActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TextView;

public class GroupTab extends TabActivity {
	public static TabHost.TabSpec spec1;
	public static TabHost.TabSpec spec2;
	public static TabHost.TabSpec spec3;
	public static TabHost.TabSpec spec4;
	public static TabHost.TabSpec spec5;
	public static TabHost tabHost;
	public SharedPreferences myPrefs;

	public void onCreate(Bundle paramBundle) {
		try {
			super.onCreate(paramBundle);
			// this.myPrefs = getSharedPreferences("preference", 0);
			setContentView(R.layout.group_tab);
			getResources();
			tabHost = getTabHost();
			tabHost.getTabWidget().setDividerDrawable(R.drawable.tab_divider);

			View localView1 = LayoutInflater.from(this).inflate(
					R.layout.tab_indicator, getTabWidget(), false);
			((TextView) localView1.findViewById(R.id.title)).setText("Group A");
			((ImageView) localView1.findViewById(R.id.icon))
					.setImageResource(R.drawable.ic_tab_travel);
			Intent localIntent1 = new Intent().setClass(this, GroupDetail.class);

			localIntent1.putExtra("teamnames",
					"Group A - saldasdlk halksd lsahdlksadl kasdlk sad");
			localIntent1.putExtra("group","GroupA");
			spec1 = tabHost.newTabSpec("Group A").setIndicator(localView1)
					.setContent(localIntent1);
			tabHost.addTab(spec1);

			View localView2 = LayoutInflater.from(this).inflate(
					R.layout.tab_indicator, getTabWidget(), false);
			((TextView) localView2.findViewById(R.id.title)).setText("Group B");
			((ImageView) localView2.findViewById(R.id.icon))
					.setImageResource(R.drawable.ic_tab_travel);
			Intent localIntent2 = new Intent().setClass(this, GroupDetail.class);
			localIntent2.putExtra("teamnames",
					"Group B - saldasdlk halksd lsahdlksadl kasdlk sad");
			localIntent2.putExtra("group","GroupB");
			spec2 = tabHost.newTabSpec("Group B").setIndicator(localView2)
					.setContent(localIntent2);
			tabHost.addTab(spec2);

			View localView3 = LayoutInflater.from(this).inflate(
					R.layout.tab_indicator, getTabWidget(), false);
			((TextView) localView3.findViewById(R.id.title)).setText("Group C");
			((ImageView) localView3.findViewById(R.id.icon))
					.setImageResource(R.drawable.ic_tab_travel);
			Intent localIntent3 = new Intent().setClass(this, GroupDetail.class);
			localIntent3.putExtra("teamnames",
					"Group C - saldasdlk halksd lsahdlksadl kasdlk sad");
			localIntent3.putExtra("group","GroupC");
			spec3 = tabHost.newTabSpec("Group C").setIndicator(localView3)
					.setContent(localIntent3);
			tabHost.addTab(spec3);

			View localView4 = LayoutInflater.from(this).inflate(
					R.layout.tab_indicator, getTabWidget(), false);
			((TextView) localView4.findViewById(R.id.title)).setText("Group D");
			((ImageView) localView4.findViewById(R.id.icon))
					.setImageResource(R.drawable.ic_tab_travel);
			Intent localIntent4 = new Intent().setClass(this, GroupDetail.class);
			localIntent4.putExtra("teamnames",
					"Group D - saldasdlk halksd lsahdlksadl kasdlk sad");
			localIntent4.putExtra("group","GroupD");
			spec4 = tabHost.newTabSpec("Group D").setIndicator(localView4)
					.setContent(localIntent4);
			tabHost.addTab(spec4);

			View localView5 = LayoutInflater.from(this).inflate(
					R.layout.tab_indicator, getTabWidget(), false);
			((TextView) localView5.findViewById(R.id.title)).setText("Super 8");
			((ImageView) localView5.findViewById(R.id.icon))
					.setImageResource(R.drawable.ic_tab_travel);
			Intent localIntent5 = new Intent().setClass(this, tabtest.class);
			localIntent5.putExtra("teamnames",
					"Super 8 - saldasdlk halksd lsahdlksadl kasdlk sad");
			localIntent5.putExtra("group","Super 8");
			spec5 = tabHost.newTabSpec("Super 8").setIndicator(localView5)
					.setContent(localIntent5);
			tabHost.addTab(spec5);
			
			

		} catch (Exception localException) {
			while (true) {
				localException.printStackTrace();
				Log.i(toString(), "length" + localException);
			}
		}

		tabHost.setOnTabChangedListener(new OnTabChangeListener() {

			@Override
			public void onTabChanged(String tabId) {
				// TODO Auto-generated method stub
				Log.d("universalIM", "Tab Changed : " + tabId);

				// TextView t1 = (TextView) findViewById(R.id.title);

				if (tabId.equals("Group A")) {
				} else if (tabId.equals("Group B")) {
				} else if (tabId.equals("Group C")) {
				} else if (tabId.equals("Group D")) {
				} else if (tabId.equals("Super 8")) {
				}
			}
		});

	}
}