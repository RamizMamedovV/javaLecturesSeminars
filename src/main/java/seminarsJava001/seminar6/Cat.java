package seminarsJava001.seminar6;

import java.time.LocalDate;
import java.util.Objects;

public class Cat  implements Comparable<Cat> {
    String name;
    LocalDate birthDay;

    public Cat(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }



    @Override
    public boolean equals(Object obj) {
        Cat c = (Cat) obj;
        if (this == obj) {return true; }
        if (obj == null || this.getClass() != obj.getClass()) { return  false;}

        return this.name.equals(c.name) && this.birthDay.equals(c.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.birthDay);
    }

    @Override
    public String toString() {
        return String.format("Cat { name = %s, birthday = %s }", this.name, this.birthDay);
    }

    @Override
    public int compareTo(Cat o) {
        if (this.birthDay.isBefore(o.birthDay)) return  -1;
        else if (this.birthDay.isAfter(o.birthDay)) return  1;

        return 0;
    }
}
