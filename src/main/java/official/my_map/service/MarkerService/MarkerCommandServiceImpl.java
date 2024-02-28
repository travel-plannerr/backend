package official.my_map.service.MarkerService;


import lombok.RequiredArgsConstructor;
import official.my_map.domain.Marker;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.addMarkerDTO;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.deleteMarkerDTO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkerCommandServiceImpl implements MarkerCommandService {

    @Override
    public Marker addMarker(addMarkerDTO request) {
        return null;
    }

    @Override
    public void deleteMarker(deleteMarkerDTO request) {

    }
}
