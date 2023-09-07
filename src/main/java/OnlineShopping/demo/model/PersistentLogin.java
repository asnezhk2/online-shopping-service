package OnlineShopping.demo.model;

import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="persistent_login")
public class PersistentLogin {
    @Column(nullable=false,length=64)
    private String username;
    @Id
    @Column(nullable=false,length=64)
    private String series;
    @Column(nullable=false,length=64)
    private String token;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_used",nullable=false)
    private Date date;

    public PersistentLogin(PersistentRememberMeToken token) {

    }

    public PersistentLogin(String username, String series, String token, Date date) {
        this.username = username;
        this.series = series;
        this.token = token;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
