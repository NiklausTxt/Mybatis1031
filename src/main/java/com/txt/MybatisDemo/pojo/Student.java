package com.txt.MybatisDemo.pojo;

public class Student {
	private int id;
	private String name;
	private int class_id;
	private MyClass clazz;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassId() {
		return class_id;
	}

	public void setClassId(int classId) {
		this.class_id = classId;
	}

	public MyClass getClazz() {
		return clazz;
	}

	public void setClazz(MyClass clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classId=" + class_id + ", clazz=" + clazz + "]";
	}
	
}
