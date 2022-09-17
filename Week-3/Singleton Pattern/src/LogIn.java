public class LogIn {

    public void getTheme(){
        Settings obj = Settings.getInstance();

        System.out.println(obj.theme);
        obj.theme = "Light mode";
    }
}
