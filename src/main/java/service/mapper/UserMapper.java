package service.mapper;

import service.entity.User;
import org.springframework.stereotype.Repository;

//import org.apache.ibatis.annotations.Select;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User Sel(int id);
}
