import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Country деген класс тузунуз .
//Анын поляларын бериниз.
//Аты , калкы, аянты , тили ушундай полялары болсун .
//Маанилерин конструктор аркылуу бериниз. 3 объект тузунуз . Ошондой эле 1 static метод кошунуз.
//Mетод параметирине Country-нин массивин алып бизге аянты боюнча эн чон олкону таап берсин.

        Country country1 = new Country();
        System.out.print("Country:\t");
        country1.setName("Kyrgyzstan");
        System.out.println(country1.getName());
        System.out.print("Population: ");
        country1.setPeople(7000000);
        System.out.println(country1.getPeople());
        System.out.print("Area:\t\t");
        country1.setArea(199900);
        System.out.println(country1.getArea());
        System.out.print("Language:   ");
        country1.setLanguage("Kyrgyscha");
        System.out.println(country1.getLanguage());
        System.out.println("~~~~~~~~~~~~~~~~~");

        Country country2 = new Country();
        System.out.print("Country:\t");
        country2.setName("Kazakstan");
        System.out.println(country2.getName());
        System.out.print("Population: ");
        country2.setPeople(19082467);
        System.out.println(country2.getPeople());
        System.out.print("Area:\t\t");
        country2.setArea(2724902);
        System.out.println(country2.getArea());
        System.out.print("Language:   ");
        country2.setLanguage("Kazakcha");
        System.out.println(country2.getLanguage());

        System.out.println("~~~~~~~~~~~~~~~~~");


        Country country3 = new Country();
        System.out.print("Country:\t");
        country3.setName("Germany");
        System.out.println(country3.getName());
        System.out.print("Population: ");
        country3.setPeople(83862225);
        System.out.println(country3.getPeople());
        System.out.print("Area:\t\t");
        country3.setArea(357588);
        System.out.println(country3.getArea());
        System.out.print("Language:   ");
        country3.setLanguage("Deucht");
        System.out.println(country3.getLanguage());


        Country[] countries = {country1, country2, country3};


        Country big = Country.bigCountry(countries);
        System.out.println("\nThe big country " + big.getName());


    }

}