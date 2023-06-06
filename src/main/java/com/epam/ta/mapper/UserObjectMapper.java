package com.epam.ta.mapper;

import com.epam.ta.models.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class UserObjectMapper {

    public User[] readUsersArrayFromJson(String endpoint) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(
                new URL(endpoint),
                User[].class
        );
    }
}
