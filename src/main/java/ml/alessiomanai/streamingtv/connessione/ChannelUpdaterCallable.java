package ml.alessiomanai.streamingtv.connessione;

import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ChannelUpdaterCallable implements Callable<ArrayList<JSONObject>> {

    public ArrayList<JSONObject> getAssetJsonData(String json){

        JSONArray jobj;
        ArrayList<JSONObject> list = new ArrayList<>();

        try {
            jobj = new JSONArray(json);

            for (int i = 0; i < jobj.length(); i++) {
                JSONObject temp = jobj.getJSONObject(i);
                list.add(temp);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public ArrayList<JSONObject> call(){
        WebRequest webreq = new WebRequest();

        String URL = "http://alessiomanai.altervista.org/streamingtv/channels.json";
        String jsonStr = webreq.makeWebServiceCall(URL, WebRequest.GET);

        return this.getAssetJsonData(jsonStr);
    }
}
