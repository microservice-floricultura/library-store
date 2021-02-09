package br.com.store.library.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.domain.AbstractAggregateRoot;

import br.com.store.library.domain.dto.event.ProviderRequestEvent;
import br.com.store.library.domain.dto.event.RequestEvent;
import br.com.store.library.domain.enums.BuyState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_COMPRA")
public class Buy extends AbstractAggregateRoot<Buy> implements Serializable {
    
   
    private static final long serialVersionUID = -358374020490925847L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_CD_COMPRA")
    @SequenceGenerator(sequenceName = "SQ_CD_COMPRA",name = "SQ_CD_COMPRA",allocationSize = 1,schema ="loja")
    @Column(name = "CD_COMPRA",nullable = false)
    private Long buyId;

    @Column(name="CD_PEDIDO",precision = 12,nullable = true)
    private Long cdRequest;

    @Column(name="TEMPO_PREPARO",nullable = true)
    private Integer timeToPrepare;

    @Column(name="DATA_ENTREGA",nullable = false)
    private LocalDate dateToDelivery;

    @Column(name="VOUCHER",precision = 12,nullable = false)
    private Long voucher;

    @Column(name="CD_STATUS",nullable = true)
    private Long state;

    public static Buy of(RequestEvent requestInfo,Long voucher){
        return Buy.builder()
        .cdRequest(requestInfo.getCdRequest())
        .timeToPrepare(requestInfo.getTimeToPrepare())
        .dateToDelivery(LocalDate.now().plusDays(requestInfo.getTimeToPrepare()))
        .state(BuyState.RECEIVED.getStatus())
        .voucher(voucher)
        .build();
    }

    public void registerNewFornecedor(String states){
        registerEvent(new ProviderRequestEvent(states));
    }
}
