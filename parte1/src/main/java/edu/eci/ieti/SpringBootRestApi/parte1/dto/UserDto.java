package edu.eci.ieti.SpringBootRestApi.parte1.dto;

public class UserDto {

    private final String name;
    private final String email;
    private final String lastName;
    private final String createdAt;
    private final String id;


    public String getId() {
        return id;
    }

    public UserDto(String name, String email, String lastName, String createdAt, String id) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
