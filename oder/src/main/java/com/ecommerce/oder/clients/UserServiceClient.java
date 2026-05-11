package com.ecommerce.oder.clients;

import com.ecommerce.oder.dto.ProductResponse;
import com.ecommerce.oder.dto.UserResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface UserServiceClient {
    @GetExchange("/api/users/{id}")
    UserResponse getUserDetails(@PathVariable String id);
}
