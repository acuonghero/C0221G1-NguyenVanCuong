package model.service.impl;

import model.bean.User;
import model.repository.BaseRepository;
import model.repository.UserRepository;
import model.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) {
        insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepository.updateUser(user);
    }

    @Override
    public List<User> findByCountry(String country) {
        return userRepository.findByCountry(country);
    }

    @Override
    public List<User> selectByProceduce() {
        return userRepository.selectByProcedure();
    }

    @Override
    public boolean updateByProcedure(User user) {
        return userRepository.updateByProcedure(user);
    }

    @Override
    public boolean deleteUserByProcedure(int id) {
        return userRepository.deleteUserByProcedure(id);
    }

    @Override
    public void insertUpdateUseTransaction() {
       userRepository.insertUpdateUseTransaction();
    }

    @Override
    public List<User> sortAllUsers() {
        return userRepository.sortAllUsers();
    }



}
