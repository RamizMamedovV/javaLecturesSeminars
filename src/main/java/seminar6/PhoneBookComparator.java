package seminar6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class PhoneBookComparator implements Comparator<Map.Entry<String, ArrayList<String>>> {
    @Override
    public int compare(Map.Entry<String, ArrayList<String>> o1
            , Map.Entry<String, ArrayList<String>> o2) {
        if (o1.getValue().size() > o2.getValue().size()) return -1;
        else if (o1.getValue().size() < o2.getValue().size()) return 1;
        return 0;
    }
}
