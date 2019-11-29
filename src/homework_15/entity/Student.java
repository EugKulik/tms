package homework_15.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

//У каждого студента есть номер группы, имя, фамилия, факультет
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student implements Serializable {
    @JsonProperty("groupNum")
    private String groupNum;
    @JsonProperty("name")
    private String name;
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("faculty")
    private String faculty;
    @JsonProperty("favoriteSubjects")
    private List<String> favoriteSubjects;

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<String> getFavoriteSubjects() {
        return favoriteSubjects;
    }

    public void setFavoriteSubjects(List<String> favoriteSubjects) {
        this.favoriteSubjects = favoriteSubjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupNum='" + groupNum + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", favoriteSubjects=" + favoriteSubjects +
                '}' + "\n";
    }
}
