package official.my_map.service.MarkerService;

import java.util.List;
import official.my_map.domain.Marker;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO;

public interface MarkerQueryService {

    List<Marker> getMarkers(MarkerRequestDTO.MapDTO request);

    Marker getMarkerDetail(Long markerId);

}
