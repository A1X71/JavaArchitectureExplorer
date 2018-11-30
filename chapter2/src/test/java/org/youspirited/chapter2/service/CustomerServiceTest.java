package org.youspirited.chapter2.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.youspirited.chapter2.model.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * ----------------------------------------------
 * ${DESCRIPTION}
 * ----------------------------------------------
 *
 * @Author: Wang Dongxu
 * @Date: Created in 15:40 2018/11/29
 * @Modified By:
 * ----------------------------------------------
 */
//@RunWith(Arquillian.class)
public class CustomerServiceTest {
//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(CustomerService.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }
    private  CustomerService customerService;
    @Before
    public void setUp() throws Exception {
        customerService = new CustomerService();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCustomerList() throws Exception{
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2,customerList.size());
    }

    @Test
    public void getCustomer() throws Exception{
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomer() throws Exception{
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("name","customer100");
        fieldMap.put("contact","John");
        fieldMap.put("telephone","13512345678");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomer() {
    }

    @Test
    public void deleteCustomer() {
    }
}
