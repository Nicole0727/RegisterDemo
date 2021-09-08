package com.register.demo.repositories;

import com.register.demo.models.UserBean;
import org.springframework.data.repository.CrudRepository;


//这里就是你要操作的bean，所以你的bean叫什么这里就写什么，Integer是你的bean的id的类型
public interface UserRepository extends CrudRepository<UserBean,Integer> {

}