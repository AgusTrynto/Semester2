import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

    public class FirstConnect {
        public static void main(String[] args) throws IOException {
            ConnectURL koneksisaya = new ConnectURL();
            URL myAddress = koneksisaya.buildURL
                    ("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM");
            String response = koneksisaya.getResponseFromHttpUrl(myAddress);
            assert response != null;
            JSONArray responseJSON = new JSONArray(response);
            ArrayList<ResponModel> responseModels =
                    new ArrayList<>();
            for (int i = 0; i < responseJSON.length(); i++) {
                ResponModel resModel = new ResponModel();
                JSONObject myJSONObject = responseJSON.getJSONObject(i);
                resModel.setI_name(myJSONObject.
                        getString("i_name"));
                resModel.setI_sell(myJSONObject.
                        getInt("i_sell"));
                resModel.setI_qty(myJSONObject.
                        getString("i_qty"));
                responseModels.add(resModel);
            }
            for (int index = 0; index < responseModels.size(); index++) {
                Long Stok = Long.parseLong(responseModels.get(index).getI_qty());
                int Harga = responseModels.get(index).getI_sell();
                String Nama = String.valueOf(responseModels.get(index).getI_name().charAt(0));

                if (Nama.contains("S")&& Harga<7000) {
                    if (Stok>0) {
                        System.out.println("Nama " + responseModels.get(index).getI_name());
                        System.out.println("Harga " + responseModels.get(index).getI_sell());
                        System.out.println("Stok Barang " + responseModels.get(index).getI_qty());
                        }
                    }
                }
            }
        }