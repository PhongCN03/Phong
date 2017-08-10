
package visithcmcity.com.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarIdCar {

    @SerializedName("carName")
    @Expose
    private String carName;
    @SerializedName("idCar")
    @Expose
    private Integer idCar;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

}
