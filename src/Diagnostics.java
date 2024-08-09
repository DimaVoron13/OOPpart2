public class Diagnostics {

    public void check(ServiceStationOfTransport... transports) {
        for (ServiceStationOfTransport transport : transports) {
            transport.repair();
        }
    }
}

