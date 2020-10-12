package ml.alessiomanai.streamingtv.utils;

public class M3u8Reader {

    public static String getHtmlReader(String url){

        return "<html>\n" +
                "  <body style="margin: 0; padding: 0;">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/hls.js@latest\"></script>\n" +
                "    <video id=\"video\" controls style=\"width: 100%    !important; height: 100%   !important;\"></video>\n" +
                "    <script>\n" +
                "    if(Hls.isSupported())\n" +
                "    {\n" +
                "        var video = document.getElementById('video');\n" +
                "        var hls = new Hls();\n" +
                "        hls.loadSource('" + url + "');\n" +
                "        hls.attachMedia(video);\n" +
                "        hls.on(Hls.Events.MANIFEST_PARSED,function()\n" +
                "        {\n" +
                "            video.play();\n" +
                "        });\n" +
                "    }\n" +
                "    else if (video.canPlayType('application/vnd.apple.mpegurl'))\n" +
                "    {\n" +
                "        video.src = '" + url + "';\n" +
                "        video.addEventListener('canplay',function()\n" +
                "        {\n" +
                "            video.play();\n" +
                "        });\n" +
                "    }\n" +
                "    </script>\n" +
                "  </body>\n" +
                "</html>";

    }
}
