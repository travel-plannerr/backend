package official.my_map.dto.MapRequest;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import official.my_map.domain.Address;
import official.my_map.domain.User;


public class MapResponseDTO {

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MarkerAddResultDTO{
        Long markerId;
        LocalDateTime createdAt;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MarkerInfoResultDTO{
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
    public static class MarkerInfoDetailResultDTO{
        Long latitude;
        Long longitude;
        String name;
        String imageUrl;
        String callNumber;
        User user;
        Address address;

    }



}
