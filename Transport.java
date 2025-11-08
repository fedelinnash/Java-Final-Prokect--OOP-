public class Transport {
    private String vehicles;
    private String route;

    public Transport(String vehicles, String route) {
        this.vehicles = vehicles;
        this.route = route;
    }

    public String getVehicles() {
        return vehicles;
    }
    public void setVehicles(String vehicles) {
        this.vehicles = vehicles;
    }

    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }
}
