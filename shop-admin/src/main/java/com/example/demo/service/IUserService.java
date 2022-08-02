package com.example.demo.service;




import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.User;
import com.example.demo.vo.LoginVo;
import com.example.demo.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author jobob
 * @since 2022-07-24
 */
public interface IUserService extends IService<User> {

    /**
     * 登录
     *
     * @param loginVo
     * @return
     */
    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);


    /**
     * 根据ticket获取用户
     * @param userTicket
     * @return
     */
    User getUserByCookie(String userTicket,HttpServletRequest request, HttpServletResponse response);
}
