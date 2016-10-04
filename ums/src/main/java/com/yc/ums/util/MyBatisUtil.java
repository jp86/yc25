package com.yc.ums.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;

public class MyBatisUtil {
	private static SqlSessionFactory factory;
	
	static {
		// 加载mybatis框架的配制文件
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("mybatis.xml");
			LogManager.getLogger().debug("加载mybatis框架的配制文件mybatis.xml成功...");
		} catch (IOException e) {
			LogManager.getLogger().error("加载mybatis框架的配制文件mybatis.xml失败！！！", e);
		}

		// 通过配制文件数据流创建SqlSessionFactory对象
		factory = new SqlSessionFactoryBuilder().build(in);
		LogManager.getLogger().debug("通过配制文件数据流创建SqlSessionFactory对象成功...");

	}
	
	//获得带事务的SqlSession对象
	public static SqlSession getSession(){
		LogManager.getLogger().debug("通过SqlSessionFactory对象获得带事务的SqlSession对象...");
		return factory.openSession();
	}
	
	//获得自动事务的SqlSession对象
	public static SqlSession getAutoTransSession(){
		LogManager.getLogger().debug("通过SqlSessionFactory对象获得自动事务的SqlSession对象...");
		return factory.openSession(true); //自动事务提交
	}
	
	//关闭SqlSession对象
	public static void close(SqlSession session){
		if(session != null){
			session.close();
			LogManager.getLogger().debug("关闭SqlSession对象成功...");
		}
	}
}
