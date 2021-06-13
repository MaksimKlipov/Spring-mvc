package web.service;

import org.springframework.stereotype.Component;
import web.Dao.CarDao;
import web.models.Car;

import java.util.List;

@Component
public class CarService {

    private CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> listCars() {
        return carDao.getListCar();
    }

    public List<Car> listCountCar(int count){
        return carDao.getCountCar(count);
    }
}
