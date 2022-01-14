package site.daishuyang.proxy;

/**
 * 用户管理实现
 * @author steven
 * @date 2021-11-09 10:21
 */
public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String userName, String password) {
        System.out.println("添加了一个用户，"+userName);
    }

    @Override
    public void delUser(String userName) {
        System.out.println("删除了一个用户，"+userName);
    }
}
