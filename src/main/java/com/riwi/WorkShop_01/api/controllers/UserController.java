package com.riwi.WorkShop_01.api.controllers;

import com.riwi.WorkShop_01.domain.entities.User;
import com.riwi.WorkShop_01.infraestructure.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    //SWAGGER
    @Operation(
            summary = "creates a new user",
            description = "create a new user by entering the required data"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created User"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "401", description = "Not authorized to create a user. Invalid token"),
            @ApiResponse(responseCode = "403", description = "Forbidden access"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error. Please contact support")
    })
    @PostMapping
    public ResponseEntity<User> createUser (@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    //SWAGGER
    @Operation(
            summary = "Displays one user by id",
            description = "Shows the user by the ID sent or requested by path,value cannot be less than 1."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved User"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "401", description = "Not authorized to view the user. Invalid token"),
            @ApiResponse(responseCode = "403", description = "Forbidden access"),
            @ApiResponse(responseCode = "404", description = "User not found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error. Please contact support")
    })
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById (@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    //SWAGGER
    @Operation(
            summary = "update  user by ID",
            description = "updates a previously created user and the ID and the new modified parameters must be sent through the Path, value cannot be less than 1"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully updated User"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "401", description = "Not authorized to update the user. Invalid token"),
            @ApiResponse(responseCode = "403", description = "Forbidden access"),
            @ApiResponse(responseCode = "404", description = "User not found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error. Please contact support")
    })
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser (@PathVariable Long id, @RequestBody User userDetails){
        return ResponseEntity.ok(userService.updateUser(id, userDetails));
    }

    //SWAGGER
    @Operation(
            summary = "Delete user by ID",
            description = "deletes an user based on an ID to be sent by Path,value cannot be less than 1"
    )

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully deleted User"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "401", description = "Not authorized to delete the user. Invalid token"),
            @ApiResponse(responseCode = "403", description = "Forbidden access"),
            @ApiResponse(responseCode = "404", description = "User not found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error. Please contact support")
    })
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Void> deletUser (@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    //SWAGGER
    @Operation(
            summary = "Displays all Services with pagination and SORT",
            description = "Displays the service in a list, it is configured to display 10 items per page. And can be sorted by NONE, ASC, DESC "
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved Service List"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "401", description = "Not authorized to view the list of services. Invalid token"),
            @ApiResponse(responseCode = "403", description = "Forbidden access"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error. Please contact support")
    })
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers () {
        return ResponseEntity.ok(userService.getAllUser());
    }
}
