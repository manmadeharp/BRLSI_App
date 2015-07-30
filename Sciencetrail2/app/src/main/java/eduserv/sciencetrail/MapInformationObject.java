package eduserv.sciencetrail;

import java.io.Serializable;

/**
 * Created by Helen on 29/07/2015.
 */
public class MapInformationObject implements Serializable {

    private Integer number; //e.g.1
    private String trialName; //e.g. science

    private String title;
    private String longDescription;

    private float longitude;
    private float latitude;


    public MapInformationObject(Integer number, String trialName, String title, String longDescription, float longitude, float latitude) {
        this.number = number;
        this.trialName = trialName;
        this.title = title;
        this.longDescription = longDescription;
        this.longitude = longitude;
        this.latitude = latitude;
    }


    public Integer getNumber() {
        return number;
    }

    public String getTrialName() {
        return trialName;
    }

    public String getTitle() {
        return title;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }
}

