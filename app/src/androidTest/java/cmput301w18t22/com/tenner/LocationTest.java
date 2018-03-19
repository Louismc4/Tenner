package cmput301w18t22.com.tenner;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Schoolpost on 2018-02-26.
 */

public class LocationTest extends ActivityInstrumentationTestCase2 {

    LocationTest() {
        super(Location.class);
    }

    public void testGetLatitude() {
        Location loc = new Location(14.2f, 15.2f, "new address");
        float lat = 9.92384f;
        loc.setLatitude(lat);

        assertEquals(lat, loc.getLatitude());
    }

    public void testSetLatitude() {
        Location loc = new Location(14.2f, 15.2f, "new address");
        float lat = 9.92384f;
        loc.setLatitude(lat);

        assertEquals(lat, loc.getLatitude());
    }

    public void testGetLongitude() {
        Location loc = new Location(14.2f, 15.2f, "new address");
        float lon = 2.92384f;
        loc.setLongitude(lon);

        assertEquals(lon, loc.getLongitude());
    }

    public void testSetLongitude() {
        Location loc = new Location(14.2f, 15.2f, "new address");
        float lon = 2.92384f;
        loc.setLongitude(lon);

        assertEquals(lon, loc.getLongitude());
    }

    public void testGetAddress() {
        Location loc = new Location(14.2f, 15.2f, "new address");
        String addy = "1245 oak st";
        loc.setAddress(addy);

        assertEquals(addy, loc.getAddress());
    }

    public void testSetAddress() {
        Location loc = new Location(14.2f, 15.2f, "new address");
        String addy = "1245 oak st";
        loc.setAddress(addy);

        assertEquals(addy, loc.getAddress());
    }

}
