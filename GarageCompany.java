import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Elizabeth on 29.05.2017.
 */
public class GarageCompany {
    private List<Flat> abonents = new ArrayList();

    public void add(Flat flat) {
        abonents.add(flat);
        flat.setService(true);
        System.out.println("выполнено");
    }

    public void remove(Flat flat) {
        abonents.remove(flat);
        flat.setService(false);
        System.out.println("выполнено");
    }

    public void isServiceFlat(Flat flat) {
        if(abonents.contains(flat)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void listOfCertainFlats() {
        System.out.println("Введите номер дома: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (Flat elem : abonents) {
            if(elem.getHouseNumber() == n) {
                System.out.println("кв. " + elem.getApartmentNumber());
            } else {
                System.out.println("в данном доме нет обслуживаемых квартир");
            }
        }
    }

    public List getAbonents() {
        return abonents;
    }

    public void setAbonents(List abonents) {
        this.abonents = abonents;
    }
}
