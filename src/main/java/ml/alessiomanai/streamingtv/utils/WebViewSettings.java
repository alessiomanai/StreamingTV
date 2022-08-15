package ml.alessiomanai.streamingtv.utils;

import android.annotation.SuppressLint;
import android.webkit.WebView;

public class WebViewSettings {

    @Deprecated
    @SuppressLint("SetJavaScriptEnabled")
    public static WebView doSettings(WebView finestra){

        finestra.clearCache(true);
        finestra.clearFormData();
        finestra.clearHistory();
        finestra.clearMatches();
        finestra.clearSslPreferences();
        finestra.getSettings().setAppCacheEnabled(true);
        finestra.getSettings().setJavaScriptEnabled(true);
        finestra.getSettings().setLoadsImagesAutomatically(true);
        finestra.getSettings().setMediaPlaybackRequiresUserGesture(false);

        finestra.setHorizontalScrollBarEnabled(true);
        finestra.setVerticalScrollBarEnabled(true);

        return finestra;
    }

}
