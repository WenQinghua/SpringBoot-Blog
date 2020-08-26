package cn.wenqinghua.blog.service;

import cn.wenqinghua.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
