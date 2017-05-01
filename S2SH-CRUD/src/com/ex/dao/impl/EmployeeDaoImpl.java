package com.ex.dao.impl;

import java.util.List;
import com.ex.dao.EmployeeDao;
import com.ex.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	private SessionFactory sessionFactory;

	public void setFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getFactory() {

		return this.sessionFactory;
	}

	public void add(Employee employee){

		this.getHibernateTemplate().save(employee);
	}

	public Employee getEmployee(Long id) {

		return (Employee) this.getHibernateTemplate().get(Employee.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees() {

		return this.getHibernateTemplate().find("from Employee order by id");
	}

	public void delete(Long id) {

		this.getHibernateTemplate().delete(this.getEmployee(id));
	}

	public void saveOrUpdate(Employee employee) {

		this.getHibernateTemplate().saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployee(String name, String phone) {

		Object values[] = { name, phone };
		System.out.println("查询的结果是：" + name + "   " + phone);
		return this.getHibernateTemplate().find(
				"from Employee e where e.name=? and e.phone=? order by id",
				values);

	}

}
