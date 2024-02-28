package official.my_map.controller;


import java.util.List;
import lombok.AllArgsConstructor;
import official.my_map.common.converter.MarkerConverter;
import official.my_map.common.response.ApiResponse;
import official.my_map.common.response.code.status.SuccessStatus;
import official.my_map.domain.Marker;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO;
import official.my_map.dto.MarkerRequest.MarkerResponseDTO;
import official.my_map.service.MarkerService.MarkerCommandService;
import official.my_map.service.MarkerService.MarkerQueryService;
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
public class MarkerController {

    private final MarkerCommandService markerCommandService;
    private final MarkerQueryService markerQueryService;

    @GetMapping("/")
    public ApiResponse<?> mainPage(@RequestBody MarkerRequestDTO.MapDTO request){
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, null);
    }

    @PostMapping("/marker")
    public ApiResponse<MarkerResponseDTO.markerAddResultDTO> addMarker(@RequestBody MarkerRequestDTO.addMarkerDTO request){
        Marker marker = markerCommandService.addMarker(request);
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, MarkerConverter.toMarkerAddResultDTO(marker));
    }

    @GetMapping("/marker")
    public ApiResponse<MarkerResponseDTO.markersResultDTO> getMarker(@RequestBody MarkerRequestDTO.MapDTO request){
        List<Marker> markers = markerQueryService.getMarkers(request);
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, MarkerConverter.toMarkerInfoResultDTO(markers));
    }

    @DeleteMapping("/marker")
    public ApiResponse<?> deleteMarker(@RequestBody MarkerRequestDTO.deleteMarkerDTO request){
        Marker marker = markerCommandService.deleteMarker(request);
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, null);
    }

    @GetMapping("/marker/{markerId}")
    public ApiResponse<MarkerResponseDTO.markerInfoDetailResultDTO> getMarkerInfo(@PathVariable Long markerId){
        Marker marker = markerQueryService.getMarkerDetail(markerId);
        return ApiResponse.onSuccess(SuccessStatus.MAP_OK, MarkerConverter.toMarkerInfoDetailResultDTO(marker));
    }
}
