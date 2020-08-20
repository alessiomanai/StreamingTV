package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;

public class Tv8 extends AppCompatActivity {

    String URL = "https://tv8.it/streaming.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv8);

        WebView finestra = findViewById(R.id.tv8canale);

        finestra.getSettings().setJavaScriptEnabled(true);
        finestra.getSettings().setLoadsImagesAutomatically(true);
        finestra.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                /*view.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('sc-dnqmqq fQAqln qc-cmp-cleanslate')[0].style.display='none'; " +
                        "document.getElementsByClassName('widget_custom_html')[0].style.display='none'; " +
                        "document.getElementsByClassName('cactus-sidebar')[0].style.display='none'; " +
                        "document.document.getElementById('header-navigation').style.display='none'; " +
                        "})()");
            */}
        });

        finestra.setHorizontalScrollBarEnabled(true);
        finestra.setVerticalScrollBarEnabled(true);

        finestra.loadUrl(this.URL);
    }
}