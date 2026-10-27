class loginD {
    String username;
    String password;
    loginD(String u, String p){
        username = u;
        password = p;
    }
    void display(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
    public static void main(String[] args){
        loginD user1 = new loginD("user1", "pass1");
        user1.display();
        
        loginD user2 = new loginD("user2", "pass2");
        user2.display();
    }
}
