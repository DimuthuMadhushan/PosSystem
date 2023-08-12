package bo.custom.impl;

import bo.custom.LoginBo;
import dao.custom.DAOFactroy;
import dao.custom.LoginDAO;

public class LoginBoImpl implements LoginBo {
    LoginDAO loginDAO=DAOFactroy.getDaoFactroy().getDAO(DAOFactroy.DAOTypes.LOGIN);
    @Override
    public boolean checkPassword(String username,String password) {

        String passwordByUsername=loginDAO.getPasswordByUserName(username);
        if(passwordByUsername==null){
            return false;
        }else {
            return passwordByUsername.equals(password);
        }
    }
}
