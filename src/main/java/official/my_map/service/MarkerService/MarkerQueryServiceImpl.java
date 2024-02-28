package official.my_map.service.MarkerService;

import lombok.RequiredArgsConstructor;
import official.my_map.domain.Marker;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.MapDTO;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.deleteMarkerDTO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkerQueryServiceImpl implements MarkerQueryService {

    @Override
    public Marker getMarker(MapDTO request) {
        return null;
    }

    @Override
    public Marker getMarkerDetail(deleteMarkerDTO request) {
        return null;
    }
}
