package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;

public class TgrSardegna extends AppCompatActivity {

    String URL = "https://www.rainews.it/tgr/sardegna/notiziari/index.html?/tgr/rainews.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tgr_sardegna);

        WebView finestra = findViewById(R.id.tgrsardegna);

        finestra.getSettings().setJavaScriptEnabled(true);
        finestra.getSettings().setLoadsImagesAutomatically(true);
        finestra.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                view.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('iubenda-cs-content')[0].style.display='none'; " +
                        "})()");
            }
        });

        finestra.setHorizontalScrollBarEnabled(true);
        finestra.setVerticalScrollBarEnabled(true);

        finestra.loadUrl(this.URL);
    }
}
