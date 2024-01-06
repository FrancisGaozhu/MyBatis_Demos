package gaozhu.francis.pojo;

import java.time.LocalDateTime;

/**
 * 账户信息
 * @author FrancisGaozhu
 * 2023-12-06 15:41:17
 */
public class Account {

    public Account() {
    }

    public Account(Long id, String userName, String password, Integer age, Character sex, String phone, LocalDateTime registerDate) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.registerDate = registerDate;
    }

    /**
     * ID
     */
    private Long id;
    /**
     * 名称
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
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
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
