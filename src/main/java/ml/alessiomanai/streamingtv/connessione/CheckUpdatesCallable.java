package ml.alessiomanai.streamingtv.connessione;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.concurrent.Callable;

import ml.alessiomanai.streamingtv.BuildConfig;
import ml.alessiomanai.streamingtv.utils.StreamingTVConstants;

public class CheckUpdatesCallable implements Callable<Boolean> {

    private String getLatestVersion() throws IOException {

        Document doc = Jsoup.connect(StreamingTVConstants.LATEST_VERSION).get();

        Elements elements = doc.getElementsByClass("css-truncate css-truncate-target");

        return elements.text();
    }

    @Override
    public Boolean call() throws Exception {

        if (getLatestVersion().equals(BuildConfig.VERSION_NAME)){
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }

    }

}
