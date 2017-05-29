import java.util.Scanner;

/**
 * Created by Elizabeth on 29.05.2017.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GarageCompany company = new GarageCompany();

        boolean work = true;
        while (work) {
            System.out.println("Список операций:\n" + "1) Добавить квартиру в обслуживание компании\n" +
                    "2) Исключить квартиру из абонентов компании\n" + "3) Проверить обслуживает ли квартира компанией\n" +
                    "4) Вывести список всех квартир, обсуживающихся этой компанией и находящихся в запрашиваемом доме.\n" +
                    "5) стоп");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Введите адрес");
                    company.add(getFlat());
                    break;
                case 2:
                    System.out.println("Введите адрес");
                    company.remove(getFlat());
                    break;
                case 3:
                    System.out.println("Введите адрес");
                    company.isServiceFlat(getFlat());
                    break;
                case 4:
                    company.listOfCertainFlats();
                    break;
                case 5:
                    work = false;
                    break;
                default:
                    System.out.println("Операция не найдена");
            }

        }
    }

    public static Flat getFlat() {
        //если нет корпуса или строения, пишем "0"
        System.out.println("Введите номер дома: ");
        int houseNumber = sc.nextInt();
        System.out.println("Введите корпус: ");
        String housingNumber = sc.next();
        System.out.println("Введите номер строения: ");
        int buildingNumber = sc.nextInt();
        System.out.println("Введите номер квартиры: ");
        int apartmentNumber = sc.nextInt();

        if (houseNumber != 0 & apartmentNumber != 0) {
            if (!housingNumber.equalsIgnoreCase("0") & buildingNumber != 0) {
                return new Flat(houseNumber, housingNumber, buildingNumber, apartmentNumber);
            } else if (!housingNumber.equalsIgnoreCase("0")) {
                return new Flat(houseNumber, housingNumber, apartmentNumber);
            } else if (buildingNumber != 0) {
                return new Flat(houseNumber, buildingNumber, apartmentNumber);
            }
        } else {
            System.out.println("Неверный ввод");
        }
        return new Flat(houseNumber, apartmentNumber);
    }
}
