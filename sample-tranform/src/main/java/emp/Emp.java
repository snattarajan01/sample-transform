
package emp;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "salary",
    "age"
})
public class Emp {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salary")
    private String salary;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("age")
    private String age;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The salary
     */
    @JsonProperty("salary")
    public String getSalary() {
        return salary;
    }

    /**
     * 
     * (Required)
     * 
     * @param salary
     *     The salary
     */
    @JsonProperty("salary")
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The age
     */
    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    /**
     * 
     * (Required)
     * 
     * @param age
     *     The age
     */
    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

}
