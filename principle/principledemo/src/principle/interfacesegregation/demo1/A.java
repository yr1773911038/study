package principle.interfacesegregation.demo1;

public class A {
    public void depend1(B b){
        b.operate1();
    }
    public void depend2(B b){
        b.operate2();
    }
    public void depend3(B b){
        b.operate3();
    }

}
