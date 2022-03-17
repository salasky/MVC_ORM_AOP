package com.Migranov.MVC.dao;

import com.Migranov.MVC.entity.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImp implements EmployeeDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Employee> getAllEmployees() {
        Session session=sessionFactory.getCurrentSession();
       /* List<Employee> allEmployee=session.createQuery("from Employee ",Employee.class).getResultList();*/
        Query<Employee> query=session.createQuery("from Employee ",Employee.class);
        List<Employee> allEmploye=query.getResultList();
        return allEmploye;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session=sessionFactory.getCurrentSession();
        session.save(employee);
    }
}
