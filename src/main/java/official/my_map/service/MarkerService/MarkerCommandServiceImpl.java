package official.my_map.service.MarkerService;


import lombok.RequiredArgsConstructor;
import official.my_map.domain.Location;
import official.my_map.domain.Marker;
import official.my_map.domain.Planning;
import official.my_map.domain.User;
import official.my_map.domain.enums.Status;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.addMarkerDTO;
import official.my_map.dto.MarkerRequest.MarkerRequestDTO.deleteMarkerDTO;
import official.my_map.repository.LocationRepository;
import official.my_map.repository.MarkerRepository;
import official.my_map.repository.PlanningRepository;
import official.my_map.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MarkerCommandServiceImpl implements MarkerCommandService {

    private final MarkerRepository markerRepository;
    private final UserRepository userRepository;
    private final LocationRepository locationRepository;
    private final PlanningRepository planningRepository;

    @Override
    public Marker addMarker(addMarkerDTO request) {
        User user = userRepository.findById(request.getUserId()).get();
        Location location = locationRepository.findById(request.getLocationId()).get();
        Planning planning = planningRepository.findById(request.getPlanningId()).get();

        Marker marker = Marker.builder()
            .user(user)
            .location(location)
            .planning(planning)
            .status(Status.ACTIVE)
            .build();

        return markerRepository.save(marker);
    }

    @Override
    public Marker deleteMarker(deleteMarkerDTO request) {
        User user = userRepository.findById(request.getUserId()).get();
        Marker marker = markerRepository.findById(request.getMarkerId()).get();

        if (marker.getUser().getId() != user.getId()){
            System.out.println("유저 정보가 일치하지 않습니다.");
            return null;
        }

        markerRepository.deleteById(marker.getId());
        return marker;
    }
}
