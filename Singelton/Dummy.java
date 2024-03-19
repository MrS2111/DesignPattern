package Singelton;
public class Dummy {
    public Dummy() {
        Singelton singelton = Singelton.getInstance();
        singelton.setUsername("Alek");
        singelton.setPassword("123");
        singelton.setNama("Alexander");
        singelton.setAlamat("Nawawi No 1");
        singelton.setEmail("alex@gmail.com");
    }
}
