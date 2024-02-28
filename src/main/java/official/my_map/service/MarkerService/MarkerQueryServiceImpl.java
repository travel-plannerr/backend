package official.my_map.service.MarkerService;

import java.util.List;
import lombok.RequiredArgsConstructor;
import official.my_map.domain.Marker;
import official.my_map.domain.User;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.MapDTO;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.deleteMarkerDTO;
import official.my_map.repository.MarkerRepository;
import official.my_map.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MarkerQueryServiceImpl implements MarkerQueryService {

    private final MarkerRepository markerRepository;
    private final UserRepository userRepository;

    @Override
    public List<Marker> getMarkers(MapDTO request) {
        Long userId = request.getUserId();
        User user = userRepository.findById(userId).get();
        return markerRepository.findAllByUser(user);
    }

    @Override
    public Marker getMarkerDetail(Long markerId) {
        return markerRepository.findById(markerId).get();
    }
}
