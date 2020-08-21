package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class Videolina extends AppCompatActivity {

    String URL = "http://videolina.it/live";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolina);

        WebView finestra = findViewById(R.id.videolina);

        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url)
            {
                view.loadUrl("javascript:(function() { " +
                        "document.getElementById('cookie-bar').style.display='none'; " +
                        "document.getElementsByClassName('navbar')[0].style.display='none'; " +
                        "document.getElementsByClassName('video-section')[0].style.display='none'; " +
                        "document.getElementsByClassName('video-bar')[0].style.display='none'; " +
                        "document.getElementsByClassName('grey-section type2')[0].style.display='none'; " +
                        "})()");

            }
        });

        finestra.loadUrl(this.URL);
    }
}
