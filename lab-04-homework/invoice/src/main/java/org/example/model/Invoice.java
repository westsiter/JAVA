package org.example.model;


import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {
private Person buyer;
private Person seller;
private LocalDate createdAt;
private LocalDate payedAt;
private ArrayList<InvoicePosition> positions = new ArrayList<InvoicePosition>();

    public ArrayList<InvoicePosition> getPositions() {
        return positions;
    }
    public void addPosition(InvoicePosition position){
        positions.add(position);
    }
    public Person getBuyer(){
        return buyer;
    }
    public Person getSeller(){
        return seller;
    }
    public LocalDate getCreatedAt(){
        return createdAt;
    }
    public LocalDate getPayedAt(){
        return payedAt;
    }
    private InvoicePosition positionWithProduct(Product product){
        for (InvoicePosition position: positions){
            if (position.getProduct().getCode().equals(product.getCode())){
                return position;
            }
        }
        return null;
    }
    public void addPosition(Product product){
        InvoicePosition position = positionWithProduct(product);
        if (position == null){
            addPosition(new InvoicePosition(product));
            return;
        }
        position.setCount(position.getCount()+1);
    }
}
