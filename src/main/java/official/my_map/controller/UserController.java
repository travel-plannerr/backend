package official.my_map.controller;

import lombok.AllArgsConstructor;
import official.my_map.common.response.ApiResponse;
import official.my_map.common.response.code.status.SuccessStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    @GetMapping("/test")
    public ApiResponse<?> test(){
        return ApiResponse.onSuccess(SuccessStatus.OK, null);
    }
}
