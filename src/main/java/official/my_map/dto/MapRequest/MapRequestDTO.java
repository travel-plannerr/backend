package official.my_map.dto.MapRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MapRequestDTO {


    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MapDTO{
        Long userId;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MapAddMarkerDTO{
        Long userId;
        Long locationId;
        Long planId;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MapDeleteMarkerDTO{
        Long userId;
        Long markerId;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GetMarkerDetailDTO{
        Long markerId;
    }



}
