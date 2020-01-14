public class FreshJuice {
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

 class FreshJuiceTest {
public static void main(String[]arg){
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    System.out.println("Size:" + juice.size);
}
}
