

public class SimpleLocation {
    private double latitude;
    private double longitude;
    private String name;

    public SimpleLocation() {
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.name = "Unknown";
    }

    public SimpleLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = "Location";
    }

    public SimpleLocation(double latitude, double longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double distanceTo(SimpleLocation other) {
        return haversine(this.latitude, this.longitude, other.latitude, other.longitude);
    }

    public double distanceTo(double lat, double lon) {
        return haversine(this.latitude, this.longitude, lat, lon);
    }

    private double haversine(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371;
        double latRad1 = Math.toRadians(lat1);
        double latRad2 = Math.toRadians(lat2);
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat/2) * Math.sin(dLat/2)
                + Math.cos(latRad1) * Math.cos(latRad2)
                * Math.sin(dLon/2) * Math.sin(dLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return R * c;
    }
//اعادة ثمتيل نص للكائن Overriding
    @Override
    public String toString() {
        return name + " (" + latitude + ", " + longitude + ")";
    }
}