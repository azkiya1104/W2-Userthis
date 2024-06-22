public class UserApp {
    public static void main(String[] args) throws Exception{
        var user = new User();
            user.username = "Azkiya";
            user.password = "123456";

            System.out.println("Username : "+user.username);
            System.out.println("Password : "+user.password);

            var user8 = new User();
                user8.UserMe();
                user8.login("Azkiya", "123456");
    }
}
