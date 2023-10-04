package introductionOOP.Seminars.Sem003;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

    private SortType sortType;

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public IdComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (sortType == SortType.Ascending)
            return Integer.compare(o1.getId(), o2.getId());
        else
            return Integer.compare(o2.getId(), o1.getId());
    }
}
