import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Австралия");
        countries.add("Австрия");
        countries.add("Азербайджан");
        countries.add("Албания");
        countries.add("Алжир");
        countries.add("Ангола");
        countries.add("Андорра");
        countries.add("Антигуа и Барбуда");
        countries.add("Аргентина");

        for(String country : countries) {
            System.out.println(country);
        }


    }
}
