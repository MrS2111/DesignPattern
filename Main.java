import Adapter.Adaptee;
import Adapter.Adapter;
import Adapter.Target;
import Observer.ConcreteObserver;
import Observer.ConcreteSubject;
import Singelton.Dummy;
import Singelton.Singelton;

public class Main {
    public static void main(String[] args) {
        new Dummy();
        Singelton singelton = Singelton.getInstance();
        System.out.println(singelton.getUsername());
        System.out.println(singelton.getPassword());
        System.out.println(singelton.getNama());
        System.out.println(singelton.getAlamat());
        System.out.println(singelton.getEmail());

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setMessage("Pesan pertama!");

        subject.removeObserver(observer2);

        subject.setMessage("Pesan kedua!");
        Adaptee adaptee = new Adaptee();

        Target target = new Adapter(adaptee);

        target.request();
    }
}
