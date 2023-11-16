import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GoldGenerator());
        generators.add(new GemGenerator());
        generators.add(new SilverGenerator());
        generators.add(new RubyGenerator());
        generators.add(new PlatinumGenerator());
        generators.add(new SapphireGenerator());
        generators.add(new PearlGenerator());

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 50; i++) {
            int index = random.nextInt(7);
            generators.get(index).openReward();
        }

    }
}