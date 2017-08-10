
package visithcmcity.com.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("car_idCar")
    @Expose
    private CarIdCar carIdCar;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("dollar")
    @Expose
    private Integer dollar;
    @SerializedName("idRank")
    @Expose
    private Integer idRank;
    @SerializedName("map_idMap")
    @Expose
    private MapIdMap mapIdMap;
    @SerializedName("playerName")
    @Expose
    private String playerName;
    @SerializedName("star")
    @Expose
    private Integer star;

    public CarIdCar getCarIdCar() {
        return carIdCar;
    }

    public void setCarIdCar(CarIdCar carIdCar) {
        this.carIdCar = carIdCar;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDollar() {
        return dollar;
    }

    public void setDollar(Integer dollar) {
        this.dollar = dollar;
    }

    public Integer getIdRank() {
        return idRank;
    }

    public void setIdRank(Integer idRank) {
        this.idRank = idRank;
    }

    public MapIdMap getMapIdMap() {
        return mapIdMap;
    }

    public void setMapIdMap(MapIdMap mapIdMap) {
        this.mapIdMap = mapIdMap;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

}
