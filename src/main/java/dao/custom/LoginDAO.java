package dao.custom;

public interface LoginDAO {
    public String getPasswordByUserName(String username);
    public String getUserFullName(String username);
}
