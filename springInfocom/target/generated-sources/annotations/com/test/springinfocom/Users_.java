package com.test.springinfocom;

import com.test.springinfocom.Departments;
import com.test.springinfocom.Employees;
import com.test.springinfocom.Inventoryhelper;
import com.test.springinfocom.Offices;
import com.test.springinfocom.Transfer;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T16:23:03")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile CollectionAttribute<Users, Employees> employeesCollection;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, Offices> officesCollection;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile CollectionAttribute<Users, Departments> departmentsCollection;
    public static volatile SingularAttribute<Users, String> login;
    public static volatile CollectionAttribute<Users, Transfer> transferCollection;
    public static volatile CollectionAttribute<Users, Inventoryhelper> inventoryhelperCollection;

}