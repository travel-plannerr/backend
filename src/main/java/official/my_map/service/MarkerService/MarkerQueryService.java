package official.my_map.service.MarkerService;

import official.my_map.domain.Marker;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO;

public interface MarkerQueryService {

    Marker getMarker(MarkerRequestDTO.MapDTO request);

    Marker getMarkerDetail(MarkerRequestDTO.deleteMarkerDTO request);

}
