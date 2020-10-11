package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.M3u8Reader;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class Italia1 extends AppCompatActivity {

    private String URL = "https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(i1)/index.m3u8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italia1);

        WebView finestra = findViewById(R.id.italia1);

        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient());

        String html = M3u8Reader.getHtmlReader(URL);
        finestra.loadData(html, "text/html", null);
    }
}