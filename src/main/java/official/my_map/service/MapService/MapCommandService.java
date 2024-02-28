package official.my_map.service.MapService;

import official.my_map.domain.Marker;
import official.my_map.dto.MapRequest.MapRequestDTO;
import org.yaml.snakeyaml.error.Mark;

public interface MapCommandService {

    Marker addMarker(MapRequestDTO.MapAddMarkerDTO request);

    void deleteMarker(MapRequestDTO.MapDeleteMarkerDTO request);






}
