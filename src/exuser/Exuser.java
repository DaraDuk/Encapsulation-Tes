package exuser;
public class Exuser {
    public static void main(String[] args) {
        // TODO code application logic here
        User u1=new User();
        
        u1.setId(3);
        u1.setUsername("DukDara");
        u1.setEmail("aramb4131@gmail.com");
        u1.setPassword("k1111");
        
        ////out put valu
        
        System.out.println("Your ID:"+u1.getId());
        System.out.println("Your username:"+u1.getUsername());
        System.out.println("your email:"+u1.getEmail());
        System.out.println("your password:"+u1.getpassword());
    }
    
}
