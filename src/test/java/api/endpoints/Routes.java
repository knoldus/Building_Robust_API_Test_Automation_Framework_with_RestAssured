package api.endpoints;

public class Routes {
   public static String base_URL = "https://petstore.swagger.io/v2";
   public static String post_URL = base_URL+"/user";
    //public static String post_URL = "https://reqres.in/api/users";
    public static String get_URL = base_URL+"/user/{username}";
    public static String update_URL = base_URL+"/user/{username}";
    public static String delete_URL = base_URL+"/user/{username}";
}
