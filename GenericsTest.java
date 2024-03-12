import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args) {

        ArrayList<String> lstNames = new ArrayList<>();
        lstNames.add("Frank");
        lstNames.add("Julie");
        lstNames.remove(0);
        System.out.println(lstNames.get(0));


        Pair<String,Double> stock1 = new Pair<>("msft", 23.57);
        Pair<String,Double> stock2 = new Pair<>("aapl", 16.92);

        System.out.println("Microsoft details: " + stock1.getFirst() + ": " + stock1.getSecond());

        System.out.println("Apple details: " + stock2.getFirst() + ": " + stock2.getSecond());

        ArrayList<Pair<String,Double>> lstStocks = new ArrayList<>();

        lstStocks.add(stock1);
        lstStocks.add(stock2);

        for(int x = 0;x < lstStocks.size(); x++) {
            Pair<String,Double> stock = lstStocks.get(x);
            System.out.println("stock details -- " + stock.getFirst() + ": " + stock.getSecond());
        }

    }
}
