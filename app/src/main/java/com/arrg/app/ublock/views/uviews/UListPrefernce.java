package com.arrg.app.ublock.views.uviews;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.afollestad.appthemeengine.prefs.ATEListPreference;
import com.arrg.app.ublock.Constants;
import com.arrg.app.ublock.util.SharedPreferencesUtil;
import com.arrg.app.ublock.util.Util;

/*
 * Created by albert on 3/01/2016.
 */
public class UListPrefernce extends ATEListPreference {

    public UListPrefernce(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UListPrefernce(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public UListPrefernce(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);

        SharedPreferences settings = getContext().getSharedPreferences(Constants.SETTINGS_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferencesUtil util = new SharedPreferencesUtil(getContext());

        TextView title = (TextView) view.findViewById(android.R.id.title);
        TextView summary = (TextView) view.findViewById(android.R.id.summary);

        title.setTypeface(Util.getTypeface(getContext(), util, settings));
        summary.setTypeface(Util.getTypeface(getContext(), util, settings));
    }
}
