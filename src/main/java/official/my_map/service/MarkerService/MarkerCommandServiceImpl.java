package official.my_map.service.MarkerService;


import lombok.RequiredArgsConstructor;
import official.my_map.domain.Marker;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.addMarkerDTO;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.deleteMarkerDTO;
import official.my_map.repository.MarkerRepository;
import official.my_map.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MarkerCommandServiceImpl implements MarkerCommandService {

    private final MarkerRepository markerRepository;
    private final UserRepository userRepository;

    @Override
    public Marker addMarker(addMarkerDTO request) {
        return null;
    }

    @Override
    public void deleteMarker(deleteMarkerDTO request) {

    }
}
