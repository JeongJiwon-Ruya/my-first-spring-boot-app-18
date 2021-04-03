package org.cnu.realcoding.controller;

import org.cnu.realcoding.domain.Dog;
import org.cnu.realcoding.service.DogManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/*spring에게 객체 생성을 위임*/
@RestController
public class DogController {

    @Autowired //dogmanagementService 실행한거 아니까 dogmanagement에 넣어달라.
    private DogManagementService dogManagementService;

    /*post역할을 해서 post, delete 등등 가능*/
    @PostMapping("/dogs")
    @ResponseStatus(HttpStatus.CREATED)
    public void createDogs(@RequestBody Dog dog){
        dogManagementService.insertDog(dog);
    }

    @GetMapping("/dogs")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Dog> getAllDogs(){
        return dogManagementService.getDogs();
    }

    // Localhost:8018/dogs?na
    @GetMapping("/dogs/{name}")
    public Dog getDogByName(@PathVariable String name) {
        return dogManagementService.getDogByName(name);
    }
}
