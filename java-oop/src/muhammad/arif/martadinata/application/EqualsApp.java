package muhammad.arif.martadinata.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Muhammad";
        first = first +" "+"Arif";
        System.out.println(first);

        String second ="Muhammad Arif";
        System.out.println(second);

        System.out.println(first == second);//hasilnya false dikarnekan == didialam objec itu membandingkan lokasinya,kita memerlukan method equals
        System.out.println(first.equals(second));

        String thrid = "Muhammad Arif Martadinata";
        System.out.println(second == thrid);
        System.out.println(second.equals(thrid));
    }
}
