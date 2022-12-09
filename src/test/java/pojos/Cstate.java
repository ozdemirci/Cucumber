package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cstate {
    private Integer id;
    private String name;
    private CountryInner country;

    public Cstate() {
    }

    @Override
    public String toString() {
        return "Cstate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }

    public Cstate(Integer id, String name, CountryInner country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CountryInner getCountry() {
        return country;
    }
    public void setCountry(CountryInner country) {
        this.country = country;
    }
}

