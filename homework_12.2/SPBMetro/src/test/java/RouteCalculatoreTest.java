import core.Line;
import core.Station;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RouteCalculatoreTest extends TestCase {
    StationIndex stationIndex = new StationIndex();
    RouteCalculator calculator = new RouteCalculator(stationIndex);


    @Override
    protected void setUp() throws Exception {

        for (int i = 0; i <9 ; i++)
        {
            if (i<3){
            stationIndex.addLine(new Line(i+1, "Линия" + i+1));
            Line line = stationIndex.getLine(1);
            Station station = new Station("station"+i,line);
            addStationToLine(station,line);
            }
            if (i>=3 && i<6){
                Line line = stationIndex.getLine(2);
                Station station = new Station("station"+i,line);
                addStationToLine(station,line);
            }
            if (i>=6){
                Line line = stationIndex.getLine(3);
                Station station = new Station("station"+i,line);
                addStationToLine(station,line);
            }
        }
        List<Station> connect1 = getList("station2","station3");
        stationIndex.addConnection(connect1);
        List<Station> connect2 = getList("station5","station6");
        stationIndex.addConnection(connect2);

    }
        public void addStationToLine (Station station,Line line){
        line.addStation(station);
        stationIndex.addStation(station);
        }

        public void testCalculateDuration ()
        {
            double actual = RouteCalculator.calculateDuration(getList("station0","station1","station2","station3","station4","station5","station6","station7","station8"));
            double expected = 22;
            assertEquals(expected, actual);
        }

        public void testGetShortestRouteNoTransfer ()
        {

            List<Station> expectedNoTransfer = getList("station0","station1","station2");
            List<Station> actualNoTransfer = calculator.getShortestRoute(stationIndex.getStation("station0"), stationIndex.getStation("station2"));
            assertEquals(expectedNoTransfer,actualNoTransfer);
        }

        public void testGetShortestRouteTwoTransfer ()
        {
            List<Station> actualTwoTransfer = calculator.getShortestRoute(stationIndex.getStation("station0"), stationIndex.getStation("station4"));
            List<Station> expectedTwoTransfer = getList("station0","station1","station2","station3","station4");
            assertEquals(expectedTwoTransfer, actualTwoTransfer);
        }

        public void testGetShortestRouteTreeTransfer ()
        {
            List<Station> actualTreeTransfer = calculator.getShortestRoute(stationIndex.getStation("station0"), stationIndex.getStation("station7"));
            List<Station> expectedTreeTransfer = getList("station0","station1","station2","station3","station4","station5","station6","station7");
            assertEquals(expectedTreeTransfer, actualTreeTransfer);
        }

        public List<Station> getList(String... names){

            List<Station> route =new ArrayList<>();
            List<Station> list = IntStream.range(0, 9).mapToObj(i -> stationIndex.getStation("station" + i)).collect(Collectors.toList());

            for (String name : names) {
                IntStream.range(0, list.size()).forEach(j -> {
                    if (stationIndex.getStation("station" + j).getName().equals(name))   route.add( list.get(j));
                });

            }
        return route;
    }


}