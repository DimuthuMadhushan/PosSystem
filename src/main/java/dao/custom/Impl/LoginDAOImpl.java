package dao.custom.Impl;

import dao.CrudUtil;
import dao.custom.LoginDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAOImpl implements LoginDAO {
    @Override
    public String getPasswordByUserName(String username) {
        try {
            ResultSet resultSet=CrudUtil.executeQuery("SELECT)FROM users WHERE username=?",username);
            if (resultSet.next()){
                return  resultSet.getString("password");
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);


        }
    }

    @Override
    public String getUserFullName(String username) {
        CrudUtil.executeQuery("SELECT*FROM users WHERE username=?",username)
    }
}
