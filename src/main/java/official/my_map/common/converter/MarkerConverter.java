package official.my_map.common.converter;

import java.util.ArrayList;
import java.util.List;
import official.my_map.domain.Marker;
import official.my_map.dto.MarkerRequest.MarkerResponseDTO;

public class MarkerConverter {

    public static MarkerResponseDTO.markerAddResultDTO toMarkerAddResultDTO(Marker marker){
        return MarkerResponseDTO.markerAddResultDTO.builder()
            .markerId(marker.getId())
            .createdAt(marker.getCreatedAt())
            .build();
    }


    public static MarkerResponseDTO.markerInfoDetailResultDTO toMarkerInfoDetailResultDTO(Marker marker){
        return MarkerResponseDTO.markerInfoDetailResultDTO.builder()
            .longitude(marker.getLocation().getLongitude())
            .latitude(marker.getLocation().getLatitude())
            .callNumber(marker.getLocation().getCallNumber())
            .address(marker.getLocation().getAddress())
            .imageUrl(marker.getLocation().getImageUrl())
            .name(marker.getLocation().getName())
            .user(marker.getUser())
            .build();
    }

    public static MarkerResponseDTO.markersResultDTO toMarkerInfoResultDTO(List<Marker> markers){
        List<MarkerResponseDTO.markerInfoResultDTO> markerInfoResultDTOS = new ArrayList<>();
        for (Marker marker : markers){
            MarkerResponseDTO.markerInfoResultDTO dto = MarkerResponseDTO.markerInfoResultDTO.builder()
                .latitude(marker.getLocation().getLatitude())
                .longitude(marker.getLocation().getLongitude())
                .name(marker.getLocation().getName())
                .imageUrl(marker.getLocation().getImageUrl())
                .user(marker.getUser())
                .build();
            markerInfoResultDTOS.add(dto);
        }

        return MarkerResponseDTO.markersResultDTO.builder()
            .markers(markerInfoResultDTOS)
            .totalSize(markerInfoResultDTOS.size())
            .build();
    }
}
