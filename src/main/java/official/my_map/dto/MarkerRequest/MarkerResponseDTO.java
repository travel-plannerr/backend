package official.my_map.dto.MarkerRequest;


import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import official.my_map.domain.Address;
import official.my_map.domain.Location;
import official.my_map.domain.User;


public class MarkerResponseDTO {

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class markerAddResultDTO{
        Long markerId;
        LocalDateTime createdAt;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class markerInfoResultDTO{
        Long latitude;
        Long longitude;
        String name;
        String imageUrl;
        User user;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class markersResultDTO{
        List<markerInfoResultDTO> markers;
        Integer totalSize;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class markerInfoDetailResultDTO{
        Long latitude;
        Long longitude;
        String name;
        String imageUrl;
        String callNumber;
        User user;
        Address address;

    }



}
