public class Country {
//    Country деген класс тузунуз .
//Анын поляларын бериниз.
//Аты , калкы, аянты , тили ушундай полялары болсун .
//Маанилерин конструктор аркылуу бериниз. 3 объект тузунуз . Ошондой эле 1 static метод кошунуз.
//Mетод параметирине Country-нин массивин алып бизге аянты боюнча эн чон олкону таап берсин.

    private String name;
    private int people;
    private int area;
    private String language;

    public Country() {

    }

    public Country(String name, int people, int area, String language) {
        this.name = name;
        this.people = people;
        this.area = area;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static Country bigCountry(Country[] countries) {
        Country big = countries[0];
        for (int i = 1; i < countries.length; i++) {
            if (countries[i].area > big.area) {
                big = countries[i];

            }
        }
        return big;
    }
}

