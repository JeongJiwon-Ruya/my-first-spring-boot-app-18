package org.cnu.realcoding.service;

import lombok.Getter;
import org.cnu.realcoding.domain.Dog;
import org.cnu.realcoding.exception.NotFoundException;
import org.cnu.realcoding.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogManagementService {

    @Autowired
    private DogRepository dogRepository;

    @Getter
    private List<Dog> dogs = new ArrayList<>();

    public void insertDog(Dog dog) {
    //    dogRepository.insertDog(dog);
        dogs.add(dog);
    }

    public Dog getDogByName(String name) {
    //    Dog dog = dogRepository.findDog(name);

   //     if (dog == null){
    //        throw new NotFoundException();
    //    }
        Dog dog = null;
        return dog;

    }




    /* = @Getter
    public List<Dog> getAllDogs(){
        return dogs;
    }
     */
}
