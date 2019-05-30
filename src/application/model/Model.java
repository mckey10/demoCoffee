package application.model;


import application.entities.Users;
import application.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Model implements I_Model {

    @Autowired
    UsersRepo usersRepo;


    @Override
    public boolean addUsers(String nameUser) {
        if (usersRepo.existsById(nameUser)) return false;
        usersRepo.save(new Users(nameUser));
        return true;

    }

}

