
package jsonemp;

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
public class JsonEmp {

    @JsonProperty("name")
    private String name;
    @JsonProperty("salary")
    private String salary;
    @JsonProperty("age")
    private String age;

    /**
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
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
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
     * @param salary
     *     The salary
     */
    @JsonProperty("salary")
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
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
     * @param age
     *     The age
     */
    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
     StringBuilder builder = new StringBuilder();
     builder.append("User [name=");
     builder.append(name);
     builder.append(", age=");
     builder.append(age);
     builder.append(", salary=");
     builder.append(salary);
     builder.append("]");
     return builder.toString();
    } 


}
