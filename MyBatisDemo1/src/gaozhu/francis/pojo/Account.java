package gaozhu.francis.pojo;

import java.time.LocalDateTime;

/**
 * @author FrancisGaozhu
 * 2023-11-29 22:25:04
 */
public class Account {

    public Account() {
    }

    public Account(Integer a_id, String a_user_name, String a_user_password, Integer a_age, Character a_sex, String a_phone, LocalDateTime a_register_date) {
        this.a_id = a_id;
        this.a_user_name = a_user_name;
        this.a_user_password = a_user_password;
        this.a_age = a_age;
        this.a_sex = a_sex;
        this.a_phone = a_phone;
        this.a_register_date = a_register_date;
    }

    private Integer a_id;

    private String a_user_name;

    private String a_user_password;

    private Integer a_age;

    private Character a_sex;

    private String a_phone;

    private LocalDateTime a_register_date;

    @Override
    public String toString() {
        return "Account{" +
                "a_id=" + a_id +
                ", a_user_name='" + a_user_name + '\'' +
                ", a_user_password='" + a_user_password + '\'' +
                ", a_age=" + a_age +
                ", a_sex=" + a_sex +
                ", a_phone='" + a_phone + '\'' +
                ", a_register_date=" + a_register_date +
                '}';
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_user_name() {
        return a_user_name;
    }

    public void setA_user_name(String a_user_name) {
        this.a_user_name = a_user_name;
    }

    public String getA_user_password() {
        return a_user_password;
    }

    public void setA_user_password(String a_user_password) {
        this.a_user_password = a_user_password;
    }

    public Integer getA_age() {
        return a_age;
    }

    public void setA_age(Integer a_age) {
        this.a_age = a_age;
    }

    public Character getA_sex() {
        return a_sex;
    }

    public void setA_sex(Character a_sex) {
        this.a_sex = a_sex;
    }

    public String getA_phone() {
        return a_phone;
    }

    public void setA_phone(String a_phone) {
        this.a_phone = a_phone;
    }

    public LocalDateTime getA_register_date() {
        return a_register_date;
    }

    public void setA_register_date(LocalDateTime a_register_date) {
        this.a_register_date = a_register_date;
    }
}
