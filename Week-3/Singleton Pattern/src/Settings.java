public class Settings {
    private static Settings uniqueInstance;

    public String theme = "Dark theme";

    private Settings(){}

    public static Settings getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Settings();
        }
        return uniqueInstance;
    }
}
