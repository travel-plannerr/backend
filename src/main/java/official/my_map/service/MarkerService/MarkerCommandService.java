package official.my_map.service.MarkerService;

import official.my_map.domain.Marker;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO;

public interface MarkerCommandService {

    Marker addMarker(MarkerRequestDTO.addMarkerDTO request);

    void deleteMarker(MarkerRequestDTO.deleteMarkerDTO request);






}
