package visithcmcity.com.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestAdapter adapter = new RestAdapter.Builder().setEndpoint("http://192.168.43.192:8080/GameRacing/webresources/generic").build();
        MyInterface ex = adapter.create(MyInterface.class);
        ex.getRank(new Callback<Example[]>() {
            @Override
            public void success(Example[] examples, Response response) {
                for (Example e:examples){
                    Log.e("JSON", e.getPlayerName());
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("ERR", error.toString());
            }
        });
//                (new Callback<List<Example>>() {
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e("ERR", error.toString());
//            }
//
//            @Override
//            public void success(List<Example> examples, Response response) {
//                for (Example e:examples){
//                    Log.e("JSON", e.getPlayerName());
//                }
//            }
//        });
    }
}
