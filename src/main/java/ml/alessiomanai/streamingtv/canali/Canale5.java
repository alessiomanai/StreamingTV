package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;

public class Canale5 extends AppCompatActivity {

    String URL = "https://easysite.one/z/Player/embed/Native/Ch5.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canale5);

        WebView finestra = findViewById(R.id.canalecinque);

        finestra.getSettings().setJavaScriptEnabled(true);
        finestra.getSettings().setLoadsImagesAutomatically(true);
        finestra.setWebViewClient(new WebViewClient());

        finestra.setHorizontalScrollBarEnabled(true);
        finestra.setVerticalScrollBarEnabled(true);

        finestra.loadUrl(this.URL);

    }
}