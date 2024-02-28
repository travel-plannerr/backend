package official.my_map.service.MapService;

import official.my_map.domain.Marker;
import official.my_map.dto.MapRequest.MapRequestDTO;

public interface MapQueryService {

    Marker getMarker(MapRequestDTO.MapDTO request);

    Marker getMarkerDetail(MapRequestDTO.MapDeleteMarkerDTO request);

}
