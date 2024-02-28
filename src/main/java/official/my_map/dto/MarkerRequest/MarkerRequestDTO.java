package official.my_map.dto.MarkerRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MarkerRequestDTO {


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
    public static class addMarkerDTO{
        Long userId;
        Long locationId;
        Long planId;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class deleteMarkerDTO{
        Long userId;
        Long markerId;
    }

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class getMarkerDetailDTO{
        Long markerId;
    }



}
