package com.test.springinfocom;

import com.test.springinfocom.Employees;
import com.test.springinfocom.Inventoryhelper;
import com.test.springinfocom.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T16:23:03")
@StaticMetamodel(Transfer.class)
public class Transfer_ { 

    public static volatile SingularAttribute<Transfer, Date> createdat;
    public static volatile SingularAttribute<Transfer, Employees> empto;
    public static volatile SingularAttribute<Transfer, Integer> actnumber;
    public static volatile SingularAttribute<Transfer, Date> dateofact;
    public static volatile SingularAttribute<Transfer, Inventoryhelper> inventoryid;
    public static volatile SingularAttribute<Transfer, Integer> id;
    public static volatile SingularAttribute<Transfer, Employees> empfrom;
    public static volatile SingularAttribute<Transfer, Users> userid;
    public static volatile SingularAttribute<Transfer, Integer> inventorycount;
    public static volatile SingularAttribute<Transfer, Date> updatedat;

}