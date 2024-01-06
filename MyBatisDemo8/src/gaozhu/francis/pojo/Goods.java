package gaozhu.francis.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author FrancisGaozhu
 * 2023-12-12 15:24:04
 */
public class Goods {

    public Goods() {
    }

    public Goods(String name, BigDecimal price, String brand, LocalDate productDate, String effTime) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.productDate = productDate;
        this.effTime = effTime;
    }

    public Goods(Long id, String name, BigDecimal price, String brand, LocalDate productDate, String effTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.productDate = productDate;
        this.effTime = effTime;
    }

    private Long id;

    private String name;

    private BigDecimal price;

    private String brand;

    private LocalDate productDate;

    private String effTime;


    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", productDate=" + productDate +
                ", effTime='" + effTime + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDate productDate) {
        this.productDate = productDate;
    }

    public String getEffTime() {
        return effTime;
    }

    public void setEffTime(String effTime) {
        this.effTime = effTime;
    }
}
