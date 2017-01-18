package com.android.settings.urom;

/**
 * Created by hitman-xda on 11/1/17.
 */
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.Utils;
import com.android.internal.logging.MetricsProto.MetricsEvent;

public class thedrill extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.the_drill);
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.DISPLAY;
    }
}
