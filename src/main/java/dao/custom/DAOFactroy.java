package dao.custom;
import dao.custom.impl.LoginDAOImpl;

public class DAOFactroy {
    private static DAOFactroy daoFactroy;

    public enum DAOTypes {
        LOGIN
    }

    public static DAOFactroy getDaoFactroy() {
        if (daoFactroy == null) {
            return daoFactroy = new DAOFactroy();
        } else {
            return daoFactroy;
        }
    }

    public LoginDAO getDAO(DAOTypes daoTypes) {
        switch (daoTypes) {
            case LOGIN:
                return new LoginDAOImpl();
            default:
                return null;
        }
    }
    private DAOFactroy(){}
}
