package com.txt.MybatisDemo;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.txt.MybatisDemo.pojo.User;

public class App {
	public static void main(String[] args) {
		
		String  resource = "mybatis_conf.xml";
		
		InputStream is = App.class.getClassLoader().getResourceAsStream(resource);
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	
		SqlSession session = sessionFactory.openSession();
		
		String statement;
		
		User user = new User();
		user.setCode("2344");
		user.setName("boooom44");
		user.setPassword("qwr12344");
		user.setUserId(4);
//		statement = "com.txt.MybatisDemo.mapping.userMapper.insertUser";
//		statement = "com.txt.MybatisDemo.mapping.userMapper.insertUser2";
//		statement = "com.txt.MybatisDemo.mapping.userMapper.updateUser";
		statement = "com.txt.MybatisDemo.mapping.userMapper.deleteUser";
//		int count = session.insert(statement, user);
//		int count =session.update(statement,user);
		int count = session.delete(statement,user);
		session.commit();
		System.out.println(count);
		System.out.println(user);
		
		
//		statement = "com.txt.MybatisDemo.mapping.studentClassMapper.getStudentById";
//		Student student = session.selectOne(statement,1);
//		System.out.println(student.toString());
//		System.out.println(student.getClazz().toString());
//		
//		statement = "com.txt.MybatisDemo.mapping.studentClassMapper.getClassById";
//		MyClass mc = session.selectOne(statement,1);
//		System.out.println(mc);
//		for(Student s:mc.getStudents()){
//			System.out.println(s.toString());
//		}
		
		
//		System.out.println("getAllUser:");
//		statement = "com.txt.MybatisDemo.mapping.userMapper.getAllUsers";
//		List<User> users = session.selectList(statement);
//		for(User user:users){
//			System.out.println(user.toString());
//		}
//		
//		System.out.println("getUserById:");
//		statement ="com.txt.MybatisDemo.mapping.userMapper.getUserById";
//		User user = session.selectOne(statement,1);
//		System.out.println(user.toString());
		
//		statement = "com.txt.MybatisDemo.mapping.userMapper.getUserAttrMapById";
//		Map<String, Object> users = session.selectOne(statement,1);
//		for(String key:users.keySet()){
//			System.out.println("key:"+key+",value="+users.get(key)+",vt="+users.get(key).getClass());
//		}
		
		
		session.close();
	}
}
