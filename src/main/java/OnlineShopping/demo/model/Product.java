package OnlineShopping.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 10L;
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long productId;
    @NotEmpty
    private String productName;
    @NotEmpty
    private String productBrand;
    @NotEmpty
    private String productModel;
    @Range(min=0)
    @NotNull
    private Double ProductPrice;
    @Range(min=0)
    @NotNull
    private Integer unitInStock;
    private String productCategory;
    @NotEmpty
    private String productDescription;
    private String productStatus;
    @Range(min=0)
    @NotNull
    private Double discount;
    @Transient
    private MultipartFile productImage;
    @Transient
    private Map<String, String> categoryList;
    @OneToMany(mappedBy="product",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JsonIgnore
    private List<CartItem> cartItems;

    public Product(long productId, String productName, String productBrand, String productModel, Double productPrice, Integer unitInStock, String productCategory, String productDescription, String productStatus, Double discount, MultipartFile productImage) {
        this.productId = productId;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productModel = productModel;
        ProductPrice = productPrice;
        this.unitInStock = unitInStock;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productStatus = productStatus;
        this.discount = discount;
        this.productImage = productImage;
    }

    public Product() {
        categoryList=new HashMap<>();
        categoryList.put("Laptop", "Laptop");
        categoryList.put("Mobile", "Mobile");
        categoryList.put("Camera", "Camera");
        categoryList.put("TV", "TV");
        categoryList.put("Refrigerator", "Refrigerator");
        categoryList.put("Tablet", "Tablet");
        categoryList.put("Micro Oven", "MicroOven");
        categoryList.put("DVD Player", "DVDPlayer");
        categoryList.put("Fan", "Fan");
        categoryList.put("Printer", "Printer");
        categoryList.put("Desktop", "Desktop");
        categoryList.put("Washing Machine", "Washing Machine");
        categoryList.put("ipad", "ipad");
        categoryList.put("Game console", "Game console");
        categoryList.put("Router", "Router");
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public Double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Double productPrice) {
        ProductPrice = productPrice;
    }

    public Integer getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(Integer unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    public Map<String, String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(Map<String, String> categoryList) {
        this.categoryList = categoryList;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
