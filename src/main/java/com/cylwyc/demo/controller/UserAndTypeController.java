package com.cylwyc.demo.controller;

import com.cylwyc.demo.domain.Type;
import com.cylwyc.demo.service.UserAndTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userAndType")
public class UserAndTypeController {

    @Autowired
    private UserAndTypeService userAndTypeService;

    @GetMapping(value = "/type")
    public List<Type> queryAllType(){
        return userAndTypeService.queryAllType();
    }

    @GetMapping(value = "/userId/{userId}")
    public List<Type> getTypeByUserId(@PathVariable("userId") int userId) {
        return userAndTypeService.getTypeByUserId(userId);
    }

    @GetMapping(value = "/userId/{userId}/typeId/{typeId}")
    public int getUserAndType(@PathVariable("userId") int userId,
                              @PathVariable("typeId") int typeId){
        return userAndTypeService.getUserAndType(userId, typeId);
    }

    @PostMapping(value = "/userId/{userId}/typeId/{typeId}")
    public int insertUserAndType(@PathVariable("userId") int userId,
                                 @PathVariable("typeId") int typeId){
        return userAndTypeService.insertUserAndType(userId, typeId);
    }

    @DeleteMapping(value = "/userId/{userId}/typeId/{typeId}")
    public int deleteUserAndType(@PathVariable("userId") int userId,
                                 @PathVariable("typeId") int typeId){
        return userAndTypeService.deleteUserAndType(userId, typeId);
    }
}
