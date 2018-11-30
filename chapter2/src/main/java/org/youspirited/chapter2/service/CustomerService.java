package org.youspirited.chapter2.service;
import org.youspirited.chapter2.helper.DatabaseHelper;
import org.youspirited.chapter2.model.Customer;
import org.youspirited.chapter2.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * ----------------------------------------------
 * ${DESCRIPTION}
 * 简单实现，未定义接口；此service层作为model及controller之间的桥接层
 * ----------------------------------------------
 *
 * @Author: Wang Dongxu
 * @Date: Created in 15:11 2018/11/29
 * @Modified By:
 * ----------------------------------------------
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    public List<Customer> getCustomerList(){
        //执行SQL, 取得ResultSet,将结果存入List
//        Connection conn=null;
        try{
            List<Customer> customerList = new ArrayList<Customer>();
            String sql = "select * from customer";
          //  conn =DatabaseHelper.getConnection();
            return DatabaseHelper.queryEntityList(Customer.class,sql);
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//            while(rs.next()){
//                Customer customer = new Customer();
//                customer.setId(rs.getLong("id"));
//                customer.setName(rs.getString("Name"));
//                customer.setContact(rs.getString("contact"));
//                customer.setTelephone(rs.getString("telephone"));
//                customer.setEmail(rs.getString("email"));
//                customer.setRemark(rs.getString("remark"));
//                customerList.add(customer);
//            }
//            return customerList;
        }catch(Exception e){
            LOGGER.error("execute sql failure",e);
//        }finally {
//            if(conn != null){
//                try{
//                    DatabaseHelper.closeConnection(conn);
//                }catch(Exception e){
//                    LOGGER.error("close connection failure",e);
//                }
//
//            }
        }
        return null;
    }
    public List<Customer> getCustomerList(String keyword){
        return null;
    }
    public Customer getCustomer(long id){
        return null;
    }
    public boolean createCustomer(Map<String,Object> fieldMap){
        return false;
    }
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return  false;
    }
    public boolean deleteCustomer(long id){
        return false;
    }
}
