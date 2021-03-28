package com.nowcoder.community.community;

        import com.nowcoder.community.community.dao.AlphaDao;
        import com.nowcoder.community.community.service.AlphaService;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.BeansException;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.ApplicationContextAware;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.text.SimpleDateFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)   //将该类作为配置类
public class CommunityApplicationTests implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Test
    public void testApplicationContext(){
        System.out.println(applicationContext);
        AlphaDao alphaDao1 =applicationContext.getBean(AlphaDao.class);
        System.out.println(alphaDao1.Select());
        AlphaDao alphaDao =applicationContext.getBean("alphaHibernate",AlphaDao.class);
        System.out.println(alphaDao.Select());

    }

    @Test
    public void testBeanManager(){
        AlphaService alphaService = applicationContext.getBean(AlphaService.class);
        System.out.println(alphaService);
    }

    @Test
    public void testBeanConfig(){
        SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
        System.out.println(simpleDateFormat);
    }

    @Autowired
    @Qualifier("alphaHibernate")
    private AlphaDao alphaDao;

    @Autowired
    private SimpleDateFormat simpleDateFormat;

    @Test
    public void testDI(){
        System.out.println(alphaDao);
        System.out.println("时间是："+simpleDateFormat);
    }










}
