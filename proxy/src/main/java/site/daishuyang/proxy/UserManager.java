package site.daishuyang.proxy;

/**
 * 用户管理接口
 * @author steven
 * @date 2021-11-09 09:51
 */
public interface UserManager {

    /**
     * 新增用户
     * @param userName
     * @param password
     */
    void addUser(String userName,String password);

    /**
     * 删除用户
     * @param userName
     */
    void delUser(String userName);
}
