package web.Dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private List<Car> listCar;

    {
        listCar = new ArrayList<>();
        listCar.add(new Car("Tesla", "red", 100000));
        listCar.add(new Car("Dodge", "Blue", 75000));
        listCar.add(new Car("Lexus", "Grey",55000));
        listCar.add(new Car("Opel", "Green", 5000));
        listCar.add(new Car("Toyota", "Black", 10000));
    }

    public List<Car> getListCar() {
        return listCar;
    }

    public List<Car> getCountCar(int count) {
        List<Car> listCar2 = new ArrayList<>();
        for(int i = 0; i < count; i ++) {
            listCar2.add(listCar.get(i));
        }
        return listCar2;
    }
}
