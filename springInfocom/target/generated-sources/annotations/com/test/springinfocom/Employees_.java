package com.test.springinfocom;

import com.test.springinfocom.Departments;
import com.test.springinfocom.Transfer;
import com.test.springinfocom.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T16:23:03")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, Date> createdat;
    public static volatile SingularAttribute<Employees, String> firstname;
    public static volatile CollectionAttribute<Employees, Transfer> transferCollection1;
    public static volatile SingularAttribute<Employees, Departments> departmentid;
    public static volatile SingularAttribute<Employees, Integer> id;
    public static volatile SingularAttribute<Employees, Users> userid;
    public static volatile SingularAttribute<Employees, Boolean> enabled;
    public static volatile CollectionAttribute<Employees, Transfer> transferCollection;
    public static volatile SingularAttribute<Employees, String> lastname;
    public static volatile SingularAttribute<Employees, Date> updatedat;

}