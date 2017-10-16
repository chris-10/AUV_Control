package com.hydra.christendsouza.auvcontrol;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IMUActivity extends AppCompatActivity {

    JSONParser jsonParser = new JSONParser();
    private ProgressDialog pDialog;
    EditText editText;
    EditText editText2;
    String String_name;
    String Int_Part;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imu);
        editText = (EditText) findViewById(R.id.Name);
        editText2 = (EditText) findViewById(R.id.part_nr);
        b=(Button) findViewById(R.id.button);
        String_name = editText.getText().toString();
        Int_Part = editText2.getText().toString();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Create_Part().execute();
            }
        });
    }
    class Create_Part extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(IMUActivity.this);
            pDialog.setMessage("Sending part to the database...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... args) {

            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("Name", String_name));
            params.add(new BasicNameValuePair("part_nr", Int_Part));

            JSONObject json = jsonParser.makeHttpRequest("http://192.168.43.12:80/db_create.php", "POST", params);

            try {
                int success = json.getInt("success");

                if(success == 1){
                    //Toast.makeText(c,"Success!",Toast.LENGTH_LONG);
                    //System.out.println("Success!");
                    //Intent i = new Intent(getApplicationContext(), ConfirmActivity.class);
                    //startActivity(i);
                    JSONArray jArray = json.getJSONArray("posts");
                    ArrayList<HashMap<String, String>> mylist =
                            new ArrayList<HashMap<String, String>>();

                    for (int i = 0; i < jArray.length(); i++) {
                        HashMap<String, String> map = new HashMap<String, String>();
                        JSONObject e = jArray.getJSONObject(i);
                        String s = e.getString("post");
                        JSONObject jObject = new JSONObject(s);

                        map.put("idusers", jObject.getString("idusers"));
                        map.put("UserName", jObject.getString("UserName"));
                        map.put("FullName", jObject.getString("FullName"));

                        mylist.add(map);
                    }
                    Toast.makeText(getApplicationContext(), json.toString(), Toast.LENGTH_SHORT).show();
                    finish();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        protected void onPostExecute(String file_url){
            pDialog.dismiss();
        }
    }
}
