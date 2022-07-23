package toyota;

import toyota.car.Camry;
import toyota.car.Car;
import toyota.car.Hiance;
import toyota.factory.AssemblyCar;
import toyota.factory.Country;
import toyota.factory.CountyFactoryNotEqualException;
import toyota.factory.DetailsFactory;
import toyota.storage.CarStorage;
import toyota.storage.Test;

public class Task3 {
    public static void main(String[] args) throws CountyFactoryNotEqualException {
//        Задание №3
//        Мы с вами продвинулись в создании машин, но машины должны где то храниться!
//                Для этого нам потребуется создать склад машин.
//                Каждый склад может хранить в себе до 1000 машин разных типов.
//                Поэтому необходимо:
//        1. Создать новый класс склад. Который имеет количество машин при создании - 0.
//        2. Создать в нем переменные, которые будут отвечать за хранение конкретного типа машин.
//        3. Создать методы добавления машин по каждому типу в переменные из шага два.
//        При добавлении машины, свободное место на складе должно уменьшаться.
//        4. Создать методы взятия машин со склада: общий счетчик уменьшается на 1,
//        а в переменной ответственной за хранение машины определенной модели должна быть удалена конкретная машина.
//        Методы возвращают экземпляр модели.
//        5. Написать методы, которые будут показывать количество машин по каждой модели.
//        6. Расширить абстрактный класс Car, добавив атрибут Country (страна сборки).
//        При сборке машины указать ее страну.
//        Внимание! Запрещено использовать arrayList. Только массивы.
        DetailsFactory detailsFactory = new DetailsFactory(Country.RUSSIA);
        AssemblyCar assemblyCar = new AssemblyCar(Country.RUSSIA, detailsFactory);
        Camry black = assemblyCar.createCamry("Black", 10000);
        Camry white = assemblyCar.createCamry("White", 10000);
        Hiance hiance = assemblyCar.createHiance("Red", 12000);

        CarStorage carStorage = new CarStorage();
        carStorage.addCar(black);
        carStorage.addCar(white);
        carStorage.addCar(hiance);

        Camry car2 = carStorage.getCar2(Camry.class);
        System.out.println(car2);

        Car[] cars = {hiance, null, null};
    }
}
