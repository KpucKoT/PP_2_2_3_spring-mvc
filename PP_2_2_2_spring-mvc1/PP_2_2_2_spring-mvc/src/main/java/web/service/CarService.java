package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface CarService {

    List<Car> carList(int count);
}
