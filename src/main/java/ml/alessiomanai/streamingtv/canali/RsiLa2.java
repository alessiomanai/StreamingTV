package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;

public class RsiLa2 extends AppCompatActivity {

    String URL = "https://ok.ru/video/1829307424484";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsi_la2);

        WebView finestra = findViewById(R.id.rsila2canale);

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