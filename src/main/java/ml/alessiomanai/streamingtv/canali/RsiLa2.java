package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class RsiLa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsi_la2);

        WebView finestra = findViewById(R.id.rsila2canale);

        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient());

        String html = "<html><body><div style=\"left: 0; width: 100%; height: 0; position: relative; padding-bottom: 56.0081%;\"><iframe src=\"https://ok.ru/videoembed/1853471530724?autoplay=1\" style=\"border: 0; top: 0; left: 0; width: 100%; height: 100%; position: absolute;\" allowfullscreen scrolling=\"no\" allow=\"encrypted-media\" ></iframe></div></body></html>";
        finestra.loadData(html, "text/html", null);
    }
}