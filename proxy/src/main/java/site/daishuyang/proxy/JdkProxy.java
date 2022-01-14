package site.daishuyang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author steven
 * @date 2021-11-09 10:23
 */
public class JdkProxy implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk proxy代理开始！");
        Object result = method.invoke(target, args);
        System.out.println("jdk proxy代理结束！");
        return result;
    }

    /**
     * 定义获取代理对象的方法
     * @param targetObject
     * @return
     */
    private Object getJdkProxy(Object targetObject){
        this.target = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        JdkProxy proxy = new JdkProxy();
        UserManager userManager = (UserManager) proxy.getJdkProxy(new UserManagerImpl());
        userManager.addUser("张三","123456");
        userManager.delUser("张三");
    }

}
