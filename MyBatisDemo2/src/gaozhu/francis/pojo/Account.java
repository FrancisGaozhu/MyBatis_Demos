package gaozhu.francis.pojo;

import java.time.LocalDateTime;

/**
 * 账户信息
 * @author FrancisGaozhu
 * 2023-11-29 22:58:05
 */
public class Account {

    public Account() {
    }

    public Account(Integer id, String userName, String userPassword, Integer age, Character sex, String phone, LocalDateTime registerDate) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.registerDate = registerDate;
    }

    /**
     * 账户ID
     */
    private Integer id;
    /**
     * 账户名
     */
    private String userName;
    /**
     * 账户密码
     */
    private String userPassword;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Character sex;
    /**
     * 电话号
     */
    private String phone;
    /**
     * 注册时间
     */
    private LocalDateTime registerDate;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (!getId().equals(account.getId())) return false;
        if (!getUserName().equals(account.getUserName())) return false;
        if (!getUserPassword().equals(account.getUserPassword())) return false;
        if (!getAge().equals(account.getAge())) return false;
        if (!getSex().equals(account.getSex())) return false;
        if (!getPhone().equals(account.getPhone())) return false;
        return getRegisterDate().equals(account.getRegisterDate());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getUserName().hashCode();
        result = 31 * result + getUserPassword().hashCode();
        result = 31 * result + getAge().hashCode();
        result = 31 * result + getSex().hashCode();
        result = 31 * result + getPhone().hashCode();
        result = 31 * result + getRegisterDate().hashCode();
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }
}
