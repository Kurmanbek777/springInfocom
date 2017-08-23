package com.test.springinfocom;

import com.test.springinfocom.Departments;
import com.test.springinfocom.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T16:23:03")
@StaticMetamodel(Offices.class)
public class Offices_ { 

    public static volatile SingularAttribute<Offices, Date> createdat;
    public static volatile SingularAttribute<Offices, String> officename;
    public static volatile SingularAttribute<Offices, Integer> id;
    public static volatile CollectionAttribute<Offices, Departments> departmentsCollection;
    public static volatile SingularAttribute<Offices, Users> userid;
    public static volatile SingularAttribute<Offices, Date> updatedat;

}