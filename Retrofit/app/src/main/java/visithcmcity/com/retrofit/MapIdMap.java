
package visithcmcity.com.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MapIdMap {

    @SerializedName("idMap")
    @Expose
    private Integer idMap;
    @SerializedName("mapName")
    @Expose
    private String mapName;

    public Integer getIdMap() {
        return idMap;
    }

    public void setIdMap(Integer idMap) {
        this.idMap = idMap;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

}
