package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Constant;
import muhammad.arif.martadinata.data.Country;
import muhammad.arif.martadinata.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5,6,7,8,9)
        );
        Country.City city = new Country.City();
        System.out.println(city.getName());
    }
}
