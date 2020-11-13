package biyesheji.domain;

public class Jurisdiction {
    Long id;//t_customer_authority表ID
    Long customer_id;//用户ID
    Long authority_id;//权限ID

    public Jurisdiction(Long customer_id, Long authority_id) {
        this.customer_id = customer_id;
        this.authority_id = authority_id;
    }

    @Override
    public String toString() {
        return "Jurisdiction{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", authority_id=" + authority_id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getAuthority_id() {
        return authority_id;
    }

    public void setAuthority_id(Long authority_id) {
        this.authority_id = authority_id;
    }
}
