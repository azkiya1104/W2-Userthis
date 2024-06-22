
public class User {
    
        String username;
        String password;
        String phoneNumber;
        Boolean admin;
    
        void UserMe() throws Exception{
            System.out.println("My username is"+this.username+
            "password"+this.password+
            "phoneNumber"+this.phoneNumber+
            (this.admin? "is_admin" : ""));
        }
        void login(String username,String password){
            if (this.username == username && this.password == password){
                System.out.println("Success login with username "+username);
            }else{
                System.out.println("Failed login with username "+username);
            }
    }
        User(String username,String password,String phoneNumber,Boolean admin){
            this.username = username;
            this.password = password;
            this.phoneNumber = phoneNumber;
            this.admin = admin;
        }
    
        User(String username,String password,Boolean admin){
            this(username, password, null, admin);
        }
        User(String username,String password){
            this(username,password,false);
        }
        
    
        User(String username){
            this(username, "null");
        }
    
        User(){
            this(null);
        }
    
        }
    
    
    
