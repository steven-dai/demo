package site.daishuyang.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author steven
 * @date 2021-11-09 23:20
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 需要代理的目标对象
     */
    private Object target;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib动态代理，监听开始！");
        //方法执行，参数：target 目标对象 objects参数数组
        Object invoke = method.invoke(target, objects);
        System.out.println("Cglib动态代理，监听结束！");
        return invoke;
    }

    private Object getCglibProxy(Object objectTarget){
        //为目标对象target赋值
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        //设置回调
        enhancer.setCallback(this);
        //创建并返回代理对象
        return enhancer.create();
    }

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        UserManager userManager = (UserManager) proxy.getCglibProxy(new UserManagerImpl());
        userManager.addUser("李四","123456");
        userManager.delUser("李四");
    }
}
