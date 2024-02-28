package official.my_map.controller;


import lombok.AllArgsConstructor;
import official.my_map.common.response.ApiResponse;
import official.my_map.common.response.code.status.SuccessStatus;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/travel-planing")
public class MapController {

    @GetMapping("/")
    public ApiResponse<?> mainPage(@RequestBody MarkerRequestDTO.MapDTO request){
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, null);
    }

    @PostMapping("/marker")
    public ApiResponse<?> addMarker(@RequestBody MarkerRequestDTO.addMarkerDTO request){
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, null);
    }

    @GetMapping("/marker")
    public ApiResponse<?> getMarker(@RequestBody MarkerRequestDTO.getMarkerDetailDTO request){
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, null);
    }
    @DeleteMapping("/marker")
    public ApiResponse<?> deleteMarker(@RequestBody MarkerRequestDTO.deleteMarkerDTO request){
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, null);
    }
    @GetMapping("/marker/{markerId}")
    public ApiResponse<?> getMarkerInfo(@PathVariable Long markerId){
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, null);
    }








}
