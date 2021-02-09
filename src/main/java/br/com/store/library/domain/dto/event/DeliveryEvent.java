package br.com.store.library.domain.dto.event;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class DeliveryEvent {
    
    @JsonProperty("cdRequest")
    private Long cdRequest;
    
    @JsonProperty("timeToDelivery")
    private LocalDate timeToDelivery;

    @JsonProperty("addressFrom")
    private String addressFrom;

    @JsonProperty("addressDestine")
    private String addressDestine;
}
