package visithcmcity.com.retrofit;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by PhongVan on 09-08-2017.
 */
public interface MyInterface {
    @GET("/rank/1")
    void getRank(Callback<Example[]> ex);
}
