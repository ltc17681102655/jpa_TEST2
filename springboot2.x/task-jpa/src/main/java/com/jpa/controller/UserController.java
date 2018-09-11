package com.jpa.controller;

import com.jpa.entity.UserEntity;
import com.jpa.repository.UserEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {


    @Autowired
    private UserEntityRepo userEntityRepo;

    @RequestMapping("bug")
    public void demo(){
        Optional<UserEntity> byId = userEntityRepo.findById(1);
        UserEntity userEntity = byId.get();
        userEntity.setName("yym");
        userEntityRepo.save(userEntity);

    }

    @RequestMapping("bug2")
    public void bug2(){
        Optional<UserEntity> byId = userEntityRepo.findFirstByAge(20);
        UserEntity userEntity = byId.get();
        userEntity.setName("ltc");
        userEntityRepo.save(userEntity);

    }

    @RequestMapping("bug3")
    public void bug3(){
        Optional<UserEntity> byId = userEntityRepo.findFirstByOpenid("oiZ3C1R9P2m-10SN4RNbBPoDrH00");
        UserEntity userEntity = byId.get();
        userEntity.setName("ltc");
        userEntityRepo.save(userEntity);

    }

    @RequestMapping("/findById")
    public UserEntity findById() {
        Optional<UserEntity> byId = userEntityRepo.findById(1);
        if (byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    @RequestMapping("/findAll")
    public Iterable<UserEntity> findAll() {
        Iterable<UserEntity> all = userEntityRepo.findAll();
        return all;
    }

    @RequestMapping("/save")
    public UserEntity findOne() {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(23);
        userEntity.setName("周悦");
        userEntity.setDesc("女友");

        UserEntity save = userEntityRepo.save(userEntity);

        return save;
    }

    @RequestMapping("/delete")
    public void delete() {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(23);
        userEntity.setName("周悦");
        userEntity.setDesc("女友");

        userEntityRepo.deleteById(4);

    }

}
