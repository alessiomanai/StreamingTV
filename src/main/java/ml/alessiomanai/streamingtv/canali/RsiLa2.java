package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class RsiLa2 extends AppCompatActivity {

    String URL = "http://alethelegend.altervista.org/streaming/rsila2.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsi_la2);

        WebView finestra = findViewById(R.id.rsila2canale);

        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient());

        finestra.loadUrl(this.URL);
    }
}