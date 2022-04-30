package cn.edu.service.impl;

import cn.edu.dao.User_AddCar;
import cn.edu.dao.impl.User_AddCarImpl;
import cn.edu.domain.CarTea;
import cn.edu.service.User_AddCarService;

import java.util.List;

public class User_AddCarServiceImpl implements User_AddCarService {
    User_AddCar user_addCar= new User_AddCarImpl();


    @Override
    public List<CarTea> getTea() {
        List<CarTea> tea = user_addCar.getTea();

        return tea;
    }

    @Override
    public boolean addTea(CarTea carTea) {
        boolean addTea=user_addCar.addTea(carTea);
        return addTea;
    }

    @Override
    public List<CarTea> getCarTea() {
        List<CarTea> tea = user_addCar.getCarTea();

        return tea;
    }


}
