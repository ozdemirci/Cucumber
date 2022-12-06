package pojos;

public class CountryInner {
    private Integer id;
    private String name;

    public CountryInner() {
    }

    public CountryInner(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Country_{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}