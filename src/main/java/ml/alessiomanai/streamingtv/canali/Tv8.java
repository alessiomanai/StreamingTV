package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class Tv8 extends AppCompatActivity {

    String URL = "https://tv8.it/streaming.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv8);

        WebView finestra = findViewById(R.id.tv8canale);

        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                view.loadUrl("javascript:(function() { " +
                        "document.getElementById('bannerprivacy').style.display='none'; " +
                        "})()");
            }
        });

        finestra.loadUrl(this.URL);
    }
}