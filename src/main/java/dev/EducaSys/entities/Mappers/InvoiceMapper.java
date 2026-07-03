package dev.EducaSys.entities.Mappers;

import dev.EducaSys.entities.Dtos.InvoiceDto;
import dev.EducaSys.entities.Invoice;

public class InvoiceMapper {

    public Invoice map(InvoiceDto dto){
        Invoice invoice = new Invoice();

        if(dto.getId() != null){
            invoice.setId(dto.getId());
        }

        invoice.setExpeditionDate(dto.getExpeditionDate());
        invoice.setExpirationDate(dto.getExpirationDate());

        invoice.setAmount(dto.getAmount());
        invoice.setStudent(dto.getStudent());

        return invoice;
    }

    public InvoiceDto map(Invoice invoice){
        InvoiceDto dto = new InvoiceDto();

        dto.setId(invoice.getId());

        dto.setExpeditionDate(invoice.getExpeditionDate());
        dto.setExpirationDate(invoice.getExpirationDate());

        dto.setAmount(invoice.getAmount());
        dto.setStudent(invoice.getStudent());

        return dto;
    }

}
