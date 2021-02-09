package br.com.store.library.domain.enums;

public enum BuyState {
    RECEIVED(1L,"RECEBIDO"), ORDER_COMPLETED(2L,"PEDIDO_REALIZADO"), RESERVATION_DELIVERED(3L,"RESERVA_ENTREGA_REALIZADA"),
    RESERVE_FOR_DELIVERY(4L,"RESERVA_PARA_ENTREGA_REALIZADA"),FINISHED(5L,"FINALIZADA");

    private Long status;
    private String description;

    private BuyState(Long status,String description){
        this.status=status;
        this.description=description;
    }

    public Long getStatus(){
        return status;
    }

    public String getDescription(){
        return description;
    }
}
