package eduserv.sciencetrail;

/**
 * Created by Helen on 29/07/2015.
 */
public class MapInformationObject {

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
}
