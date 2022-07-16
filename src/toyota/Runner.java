package toyota;

import toyota.car.Camry;
import toyota.car.StartCarException;
import toyota.car.details.*;
import toyota.factory.AssemblyCar;
import toyota.factory.Country;
import toyota.factory.CountyFactoryNotEqualException;
import toyota.factory.DetailsFactory;

public class Runner {

    public static void main(String[] args) {
        try {
            DetailsFactory detailsFactory = new DetailsFactory(Country.RUSSIA);
            AssemblyCar assemblyCar = new AssemblyCar(Country.RUSSIA, detailsFactory);
            Camry camry = assemblyCar.createCamry("black", 10000);
            camry.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
