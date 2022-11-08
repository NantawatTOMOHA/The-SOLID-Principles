
import java.util.Comparator;
import java.util.List;

public class AgeSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        people.sort(new Comparator<Person>() {
            public int compare(Person a,Person b){
                return a.getAge() - b.getAge();
            }
            
        });
    }
}
