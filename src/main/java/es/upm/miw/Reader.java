package es.upm.miw;

public class Reader {
    private String id;
    private String name;
    private Integer age;

    public  Reader(String name, Integer age){
        this.id = "";
        this.name = name;
        this.age = age;
    }

    public Reader(String id){
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }
}
