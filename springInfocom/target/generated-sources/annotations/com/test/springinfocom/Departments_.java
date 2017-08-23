package com.test.springinfocom;

import com.test.springinfocom.Employees;
import com.test.springinfocom.Offices;
import com.test.springinfocom.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T16:23:03")
@StaticMetamodel(Departments.class)
public class Departments_ { 

    public static volatile CollectionAttribute<Departments, Employees> employeesCollection;
    public static volatile SingularAttribute<Departments, Date> createdat;
    public static volatile SingularAttribute<Departments, Offices> officeid;
    public static volatile SingularAttribute<Departments, String> departmentname;
    public static volatile SingularAttribute<Departments, Integer> id;
    public static volatile SingularAttribute<Departments, Users> userid;
    public static volatile SingularAttribute<Departments, Date> updatedat;

}