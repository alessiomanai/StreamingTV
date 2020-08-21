package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;

public class RsiLa2 extends AppCompatActivity {

    String URL = "http://alethelegend.altervista.org/streaming/rsila2.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsi_la2);

        WebView finestra = findViewById(R.id.rsila2canale);

        finestra.getSettings().setJavaScriptEnabled(true);
        finestra.getSettings().setLoadsImagesAutomatically(true);
        finestra.setWebViewClient(new WebViewClient());

        finestra.setHorizontalScrollBarEnabled(true);
        finestra.setVerticalScrollBarEnabled(true);

        finestra.loadUrl(this.URL);
    }
}