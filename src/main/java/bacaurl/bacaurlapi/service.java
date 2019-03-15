/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacaurl.bacaurlapi;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import util.OkHttpUtil;

/**
 *
 * @author chochong
 */
public class service {
    public String Siloamkonfirmasi_data() {
                try {
                    OkHttpUtil okHttpUtil = new OkHttpUtil();
                    okHttpUtil.init(true);
                    Request request = new Request.Builder().url("https://blablabla").get().build();
                    Response response = okHttpUtil.getClient().newCall(request).execute();
                    JSONObject jsonobj = new JSONObject(response.body().string());
                    JSONArray data = jsonobj.getJSONArray("data");
                    int leng;
                } catch (Exception e) {

                }
        return "";
    }
}
