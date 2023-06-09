/*
    Name: Casey Spaulding
    Company: SkillStorm
    Programmer.java
 */
import java.util.ArrayList;

public class Programmer {
    private String name;
    private String company;
    private ArrayList<String> languages;

    public Programmer(String name, String company, ArrayList<String> languages) {
        this.name = name;
        this.company = company;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void addLanguage(String language) {
        if(language != null) {
            languages.add(language);
        }else {
            System.out.println("Language is null. We don't allow null values to be added at SkillStorm.");
        }
    }

    public void forgetLanguage(String language) {
        System.out.println( name + " Forgot the programming language " + language + ".");
        languages.remove(language);
        System.out.println("");
    }

    public void learnedLanguage(String language) {
        System.out.println(name + " learned the programming language " + language + ".");
        languages.add(language);
        System.out.println("");
    }

    public void changeCompany(String company) {
        this.company = company;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void printProgrammer() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println("Languages: " + languages);
    }

    public static void main(String[] args) {
        System.out.println("Name: Casey Spaulding");
        System.out.println("Company: SkillStorm");
        System.out.println("Programmer.java");
        System.out.println("__________________________________________________________");
        System.out.println();


        ArrayList<String> languages = new ArrayList<String>();

        Programmer programmer = new Programmer("Casey Spaulding", "SkillStorm", languages);
        Programmer programmer2 = new Programmer("Bruce Wayne", "DC", languages);
        System.out.println("Programmer 1");
        programmer.printProgrammer();
        System.out.println("");
        System.out.println("Programmer 2");
        programmer2.printProgrammer();
        System.out.println("");
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("CSS");
        programmer.learnedLanguage("C++");
        programmer.learnedLanguage("JavaScript");
        programmer.learnedLanguage("CSS");
        programmer.learnedLanguage("Python");
        programmer2.learnedLanguage("C++");
        programmer.learnedLanguage("Java");
        programmer.forgetLanguage("Python");
        programmer.forgetLanguage("C#");
        programmer2.forgetLanguage("Java");
        programmer.printProgrammer();
        programmer2.printProgrammer();











    }





}
