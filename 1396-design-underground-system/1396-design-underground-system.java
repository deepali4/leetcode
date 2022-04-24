class CheckInStationTime {

  public String name;
  public int t;

  public CheckInStationTime(String name, int t) {
    this.name = name;
    this.t = t;
  }
}

class StationStats {

  public long totalTime;
  public int count;

  public StationStats(long totalTime, int count) {
    this.totalTime = totalTime;
    this.count = count;
  }
}

class UndergroundSystem {

  private final Map<Integer, CheckInStationTime> checkInMap;
  private final Map<String, Map<String, StationStats>> connect;

  public UndergroundSystem() {
    checkInMap = new HashMap<>();
    connect = new HashMap<>();
  }

  public void checkIn(int id, String stationName, int t) {
    checkInMap.put(id, new CheckInStationTime(stationName, t));
  }

  public void checkOut(int id, String stationName, int t) {
    String from = checkInMap.get(id).name;
    connect.computeIfAbsent(from, k -> new HashMap<>());
    StationStats stationStats = connect.get(from).get(stationName);
    if (stationStats == null) {
      stationStats = new StationStats((t - checkInMap.get(id).t), 1);
    } else {
      stationStats.totalTime += (t - checkInMap.get(id).t);
      ++stationStats.count;
    }
    connect.get(from).put(stationName, stationStats);
  }

  public double getAverageTime(String startStation, String endStation) {
    StationStats stationStats = connect.get(startStation).get(endStation);
    return stationStats.totalTime / (double) stationStats.count;
  }
}