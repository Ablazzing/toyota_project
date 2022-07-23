package toyota.storage;

import toyota.car.*;

public class CarStorage {
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
    private int freeSpace = 1_000;
    private int countCar = 0;
    private Car[] cars = new Car[1000];

    public CarStorage() {
    }

    public static <T> T getCar(CarStorage carStorage, Class<T> tClass) {
        for (int i = carStorage.getFreeSpace(); i > 0 ; i--) {
            if (tClass.isInstance(carStorage.getCars()[i - 1])) {
                T car = (T) carStorage.getCars()[i - 1];
                carStorage.getCars()[i - 1] = null;
                carStorage.setCountCar(carStorage.getCountCar() - 1);
                carStorage.setFreeSpace(carStorage.getFreeSpace() - 1);
                return car;
            }
        }
        throw new RuntimeException("Машин с таким типом - нет");
    }

    public <K> K getCar2(Class<K> tClass) {
        for (int i = freeSpace; i > 0 ; i--) {
            if (tClass.isInstance(cars[i - 1])) {
                K car = (K) cars[i - 1];
                cars[i - 1] = null;
                countCar--;
                freeSpace++;
                return car;
            }
        }
        throw new RuntimeException("Машин с таким типом - нет");
    }

    public void addCar(Car car) {
        if (freeSpace > 0) {
            cars[countCar]  = car;
            countCar++;
            freeSpace--;
        }
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public int getCountCar() {
        return countCar;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }

    public void setCountCar(int countCar) {
        this.countCar = countCar;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}
